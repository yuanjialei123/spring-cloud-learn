package cn.cup.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 袁家雷
 * @Mail: yuanjialei@ibiandan.cn
 * @Date: 2021-06-26 15:28
 * @Version: 1.0
 * @Description: eureka消费者
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class);
    }
}
