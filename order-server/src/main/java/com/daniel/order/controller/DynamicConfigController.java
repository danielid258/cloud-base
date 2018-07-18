package com.daniel.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Daniel on 2018/7/18.
 */
@RestController
@RequestMapping("config/dynamic")
@RefreshScope   //dynamically refresh configuration  when config-server's /actuator/bus-refresh is called
public class DynamicConfigController {
    //get config data from git repository
    @Value("${env}")
    private String env;

    @GetMapping("/profile")
    public String printProfile() {
        return env;
    }
}
