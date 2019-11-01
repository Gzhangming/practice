package com.gzhangming.apartment.practice.business.commonality.swagger2;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;

import java.util.List;

/**
 * @author wangsai
 * Created by sai on 2018/6/5.
 */
@Configuration
public class Swagger2Config {

    /*http://127.0.0.1:8081/swagger-ui.html#/*/

    @Value("${swagger2.open}")
    public boolean open_swagger_2;
    @Value("${swagger2.testToken}")
    public String testToken;
    @Value("${swagger2.basePackage}")
    public String basePackage;
    @Value("${swagger2.name}")
    public String name;
    @Value("${swagger2.url}")
    public String url;
    @Value("${swagger2.email}")
    public String email;
    @Value("${swagger2.title}")
    public String title;
    @Value("${swagger2.description}")
    public String description;

    @Bean
    public Docket createRestApi() {
        if (!open_swagger_2) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("XXX.XXX.XXX"))
                    .paths(PathSelectors.any())
                    .build();
        }
        ParameterBuilder token = new ParameterBuilder();
        List<Parameter> pars = Lists.newArrayList();
        token.name("Authorization").description("Bearer token")
                .defaultValue(testToken)
                .modelRef(new ModelRef("string")).parameterType("header")
                /** header中的ticket参数非必填，传空也可以 */
                .required(false).build();
        pars.add(token.build());


        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(pars)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact(name,url,email);
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl("localhost:8080")
                .contact(contact)
                .version("1.0")
//                .license("debug")
                .build();
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(null, "list", "alpha", "schema",
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
    }


   /* //是否开启swagger，正式环境一般是需要关闭的，可根据springboot的多环境配置进行设置
    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnabled;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                // 是否开启
                .enable(swaggerEnabled).select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.jack.springboot.controller"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot-Swagger2示例")
                .description("jacking0325")
                // 作者信息
                .contact(new Contact("jacking0325", "https://blog.jack0325.cn/", "111111111@qq.com"))
                .version("1.0.0")
                .build();
    }*/

}
