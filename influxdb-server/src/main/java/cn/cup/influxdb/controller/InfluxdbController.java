package cn.cup.influxdb.controller;

import cn.cup.influxdb.service.InfluxdbService;
import com.influxdb.client.write.Point;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 袁家雷
 * @Mail: yuanjialei@ibiandan.cn
 * @Date: 2021-06-28 16:02
 * @Version: 1.0
 * @Description: influxdbController
 */
@RestController
public class InfluxdbController {

    private final InfluxdbService influxdbService;

    public InfluxdbController(InfluxdbService influxdbService) {
        this.influxdbService = influxdbService;
    }

    @PostMapping("/write")
    public void write(@RequestBody String data){
        influxdbService.writeRecord(data);
    }

    @PostMapping("/write_point")
    public void writePoint(@RequestBody Point point){
        influxdbService.writeRecord(point);
    }
}
