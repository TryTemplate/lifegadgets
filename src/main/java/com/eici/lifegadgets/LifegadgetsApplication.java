package com.eici.lifegadgets;

import com.eici.lifegadgets.utils.ConfigureProperties;
import com.google.common.base.Predicates;
import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Arrays;


@EnableTransactionManagement
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.eici.lifegadgets"})
@MapperScan("com.eici.lifegadgets.dao")
public class LifegadgetsApplication {

    private Logger LOG = org.apache.log4j.Logger.getLogger(LifegadgetsApplication.class);

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LifegadgetsApplication.class, args);
    }



    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            LOG.info("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                LOG.info("---------- spring load bean :\t" + beanName);
            }

        };
    }

    @Bean
    public Docket webAPI() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(ConfigureProperties.isShowSwaggerUi)
//                .host(ConfigureProperties.isTest.equals(0) ? ConfigureProperties.swaggerHost : ConfigureProperties.swaggerTestHost)
                .host(ConfigureProperties.swaggerHost)
            .groupName("Tester demo")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eici.lifegadgets.controller"))
                .paths(PathSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();
    }

    private ApiInfo apiInfo() {
        String  hj =  ConfigureProperties.isTest.equals(0) ? "Produce" : "Test";
        return new ApiInfoBuilder()
                .title("Eici Api")
                .termsOfServiceUrl("http://localhost/")
                .contact("Eici Team")
                .version("1.0.1")
                .description("Eici team, If you have any questions, please call 17683905405.")
                .build();
    }
}

