package cn.cup.influxdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 袁家雷
 * @Mail: yuanjialei@ibiandan.cn
 * @Date: 2021-06-28 13:54
 * @Version: 1.0
 * @Description: InfluxDb服务项目主类
 */
@SpringBootApplication
@EnableEurekaClient
public class InfluxdbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfluxdbServerApplication.class);
    }

}
