package org.ace.spring.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration()
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class Distribution {

    @RequestMapping(value = "/real-time", method = RequestMethod.POST)
    public ResponseEntity home(@RequestBody RealTimeData realTimeData) {
        System.out.println("received " + realTimeData.getContent());
        return ResponseEntity.ok().build();
    }

    public static void main(String[] args) {
        SpringApplication.run(Distribution.class, args);
    }

}