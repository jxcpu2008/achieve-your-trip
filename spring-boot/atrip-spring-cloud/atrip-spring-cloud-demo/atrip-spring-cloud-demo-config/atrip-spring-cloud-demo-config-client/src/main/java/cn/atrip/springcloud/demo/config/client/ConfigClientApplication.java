package cn.atrip.springcloud.demo.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@Value("${foo}")
    String foo;
    @RequestMapping(value = "/hello")
    public String hello(){
        return foo;
    }

}
