package com.opps.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jason on 5/5/16.
 */
@EnableZuulProxy
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class Consumer01Application {
  @Bean
  CommandLineRunner runner(DiscoveryClient dc) {
    return args -> {
      dc.getInstances("provider01")
              .forEach(si -> System.out.println(String.format(
                      "Found %s %s:%s", si.getServiceId(), si.getHost(), si.getPort())));
    };
  }

//  /**
//   * The load balanced rest template
//   */
//  @LoadBalanced
//  @Bean
//  RestTemplate loadBalanced() {
//    return new RestTemplate();
//  }
//
//  /**
//   * The normal rest template
//   */
//  @Primary
//  @Bean
//  RestTemplate restTemplate() {
//    return new RestTemplate();
//  }

  public static void main(String[] args) {
    SpringApplication.run(Consumer01Application.class, args);
  }
}
