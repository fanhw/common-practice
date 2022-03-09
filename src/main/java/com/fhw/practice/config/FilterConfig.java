package com.fhw.practice.config;

import com.fhw.practice.filter.LogCostFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-10 00:08
 */

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogCostFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("LogCostFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
