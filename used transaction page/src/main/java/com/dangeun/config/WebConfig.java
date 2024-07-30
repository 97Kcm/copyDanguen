package com.dangeun.config;

import com.dangeun.converter.FileConverter;
import com.dangeun.converter.FilesConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new FilesConverter());
        registry.addConverter(new FileConverter());
    }


}
