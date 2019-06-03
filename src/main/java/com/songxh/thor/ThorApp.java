package com.songxh.thor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * app starter
 *
 * @author hexiaosong
 * @date 2019-04-21
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class ThorApp {

    public static void main(String[] args) {
        SpringApplication.run(ThorApp.class, args);
    }
}
