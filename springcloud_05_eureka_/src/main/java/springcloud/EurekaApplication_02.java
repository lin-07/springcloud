package springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer   //标识为一个eureka服务注册中心
@SpringBootApplication
public class EurekaApplication_02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_02.class,args);
    }
}
