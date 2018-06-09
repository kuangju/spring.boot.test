package cn.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication // Sprnig Boot项目的核心注解，主要目的是开启自动配置
@EnableSwagger2 //表示项目启动的时候启动swagger2
public class Application {

	// main方法，主要作用是作为项目启动的入口
	public static void main(String[] args) {
		//starting Spring,  starts the auto-configured Tomcat web server
		SpringApplication.run(Application.class, args);
	}

}
