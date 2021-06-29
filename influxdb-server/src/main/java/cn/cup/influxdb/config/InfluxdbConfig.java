package cn.cup.influxdb.config;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yuanjialei
 * @Date: 2021-06-28 14:19
 * @Version: 1.0
 * @Description: InfluxDb配置文件
 */
@Configuration
public class InfluxdbConfig {

    @Value("${influxdb.url}")
    private String url;
    @Value("${influxdb.token}")
    private String token;
    @Bean
    public InfluxDBClient influxDBClient(){
        char[] tokenArray = token.toCharArray();
        InfluxDBClient influxDBClient = InfluxDBClientFactory.create(url, tokenArray);
            return influxDBClient;
    }

}
