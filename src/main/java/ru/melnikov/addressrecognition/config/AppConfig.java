package ru.melnikov.addressrecognition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class AppConfig {

    @Bean
    public Path rootLocationPath(@Value("${storage.rootLocation}") String rootLocation){
        System.out.println(rootLocation);
       return Paths.get(rootLocation);
    }

//    @Bean
//    public ThymeleafViewResolver thymeleafViewResolver(ISpringTemplateEngine templateEngine) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine);
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }
}
