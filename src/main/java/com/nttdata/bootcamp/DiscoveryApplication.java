package com.nttdata.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Application Eureka server.
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiscoveryApplication.class, args);
  }

}
