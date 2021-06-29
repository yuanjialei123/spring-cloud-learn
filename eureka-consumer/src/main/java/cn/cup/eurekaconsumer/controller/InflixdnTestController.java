package cn.cup.eurekaconsumer.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author: yuanjialei
 * @Date: 2021-06-28 16:08
 * @Version: 1.0
 * @Description: inflixdb Test controller
 */
@RestController
public class InflixdnTestController {

    private final LoadBalancerClient loadBalancerClient;

    private final RestTemplate restTemplate;

    public InflixdnTestController(LoadBalancerClient loadBalancerClient, RestTemplate restTemplate) {
        this.loadBalancerClient = loadBalancerClient;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/write")
    private void getWriteApi(String data){
        ServiceInstance serviceInstance = loadBalancerClient.choose("influxdb-server");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/write";
        System.out.println(url);
        restTemplate.postForLocation(url, data);
    }

    @GetMapping("/write_point")
    private void getWriteApi(Map<String,String> data){
        ServiceInstance serviceInstance = loadBalancerClient.choose("influxdb-server");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/write";
        System.out.println(url);
        restTemplate.postForLocation(url, data);
    }

}
