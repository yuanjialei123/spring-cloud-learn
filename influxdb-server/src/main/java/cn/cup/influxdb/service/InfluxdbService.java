package cn.cup.influxdb.service;

import com.influxdb.client.write.Point;

/**
 * @Author: yuanjialei
 * @Date: 2021-06-28 14:42
 * @Version: 1.0
 * @Description: InfluxDB Service
 */
public interface InfluxdbService {

    void writeRecord(String data);

    /**
     * 通过 point对象写入一条数据
     * @param point 点位对象
     */
    void writeRecord(Point point);

}
