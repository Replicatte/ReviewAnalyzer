package com.upv.alumn.ReviewAnalyzer;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class CustomConfig {

    @Bean
    public ClassLoaderTemplateResolver yourTemplateResolver() {
        //TODO : What can we configure?
        ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
        configurer.setPrefix("customLocation/");
        configurer.setSuffix(".html");
        configurer.setTemplateMode(TemplateMode.HTML);
        configurer.setCharacterEncoding("UTF-8");
        configurer.setOrder(0);  // this is important. This way spring //boot will listen to both places 0 and 1
        configurer.setCheckExistence(true);
        return configurer;
    }


}
