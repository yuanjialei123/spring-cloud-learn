package cn.cup.eurekaclient.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yuanjialei
 * @Date: 2021-06-25 15:12
 * @Version: 1.0
 * @Description: 打印服务实例信息
 */
@RestController
public class DcController {

    public final DiscoveryClient discoveryClient;

    public DcController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/dc")
    public String dc(){
        String services = "Services: " + discoveryClient.getServices();
        return services;
    }
}
