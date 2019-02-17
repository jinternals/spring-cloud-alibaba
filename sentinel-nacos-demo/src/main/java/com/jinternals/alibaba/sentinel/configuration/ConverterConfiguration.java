package com.jinternals.alibaba.sentinel.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.csp.sentinel.datasource.Converter;


@Configuration
public class ConverterConfiguration {

    @Bean
    public Converter myConverter() {
        return new JsonFlowRuleListConverter();
    }

}
