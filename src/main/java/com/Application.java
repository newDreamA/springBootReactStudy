package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tangxiewen on 2016/2/14.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public ViewResolver reactViewResolver() {
//        ScriptTemplateViewResolver viewResolver = new ScriptTemplateViewResolver();
//        viewResolver.setPrefix("static/templates/");
//        viewResolver.setSuffix(".ejs");
//        return viewResolver;
//    }

//    @Bean
//    public ScriptTemplateConfigurer reactConfigurer() {
//        ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
//        configurer.setEngineName("nashorn");
//        configurer.setScripts("static/polyfill.js",
//                "static/lib/js/ejs.min.js",
//                "static/render.js");
//        configurer.setRenderFunction("render");
//        configurer.setSharedEngine(false);
//        return configurer;
//    }
}
