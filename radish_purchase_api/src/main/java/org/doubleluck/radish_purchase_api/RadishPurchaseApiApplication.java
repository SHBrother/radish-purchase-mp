package org.doubleluck.radish_purchase_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("org.doubleluck.radish_purchase_api.repository")
@ServletComponentScan
public class RadishPurchaseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadishPurchaseApiApplication.class, args);
    }
}
