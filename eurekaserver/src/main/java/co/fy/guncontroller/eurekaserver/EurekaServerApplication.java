package co.fy.guncontroller.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * CREATED IN  2017-11-21 下午1:16
 *
 * @AUTHOR: 姜坤
 **/
@EnableEurekaServer     // Eureka Server 标识
@SpringBootApplication  // Spring Boot 应用标识
@EnableConfigServer
public class EurekaServerApplication {
    public  static void  main(String[] args){
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
