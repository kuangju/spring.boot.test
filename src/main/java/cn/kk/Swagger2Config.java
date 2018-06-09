package cn.kk;

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import springfox.documentation.builders.ApiInfoBuilder;  
import springfox.documentation.builders.PathSelectors;  
import springfox.documentation.builders.RequestHandlerSelectors;  
import springfox.documentation.service.ApiInfo;  
import springfox.documentation.spi.DocumentationType;  
import springfox.documentation.spring.web.plugins.Docket;  
import springfox.documentation.swagger2.annotations.EnableSwagger2;  
  
@Configuration  
//此注解是swagger2的配置

//swagger2的配置文件，在项目的启动类的同级文件建立
public class Swagger2Config {  
    /** 
     * createRestApi 
     * 
     * @return 
     */  
    @Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				 //为当前包路径
				.apis(RequestHandlerSelectors.basePackage("cn.kk"))
				.paths(PathSelectors.any())
				.build();
	}
	
  //构建 api文档的详细信息函数
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//页面标题
				.title("springboot利用swagger构建api文档")
				.description("简单优雅的restfun风格, xxx@qq.com")
				.version("1.0")
				.build();
	}
    
    
    
   
}  
