package cn.cup.influxdb.service.impl;

import cn.cup.influxdb.service.InfluxdbService;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.WriteApi;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: 袁家雷
 * @Mail: yuanjialei@ibiandan.cn
 * @Date: 2021-06-28 14:42
 * @Version: 1.0
 * @Description: influxdbServiceImpl
 */
@Service
public class InfluxdbServiceImpl implements InfluxdbService {

    @Value("${influxdb.bucket}")
    private String bucket;

    @Value("${influxdb.org}")
    private String org;

    private final InfluxDBClient influxDBClient;

    public InfluxdbServiceImpl(InfluxDBClient influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void writeRecord(String data) {

        try (WriteApi writeApi = influxDBClient.getWriteApi()) {
            writeApi.writeRecord(bucket, org, WritePrecision.NS, data);
        }
    }

    @Override
    public void writeRecord(Point point) {
        WriteApi writeApi = influxDBClient.getWriteApi();
        writeApi.writePoint(bucket, org, point);
    }


}
