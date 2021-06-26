package cn.cup.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 袁家雷
 * @Mail: yuanjialei@ibiandan.cn
 * @Date: 2021-06-25 15:08
 * @Version: 1.0
 * @Description: eureka-lient
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class);
    }
}
