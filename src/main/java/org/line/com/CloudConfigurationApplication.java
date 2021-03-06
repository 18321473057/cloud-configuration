package org.line.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CloudConfigurationApplication
{
    public static void main( String[] args )
        {
        SpringApplication.run(CloudConfigurationApplication.class);
    }
}
