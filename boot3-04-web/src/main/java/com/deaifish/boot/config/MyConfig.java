package com.deaifish.boot.config;

import com.deaifish.boot.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description MVC配置类
 *
 * @className MyConfig
 * @author DEAiFISH
 * @date 2023/8/2 15:00
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    /**
     * @description 配置静态资源
     * @author DEAiFISH
     * @date 2023/8/2 21:10
     * @param registry
     * @return void
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //保留以前
        WebMvcConfigurer.super.addResourceHandlers(registry);

        //自己写
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/a/","classpath:/b/","classpath:/")
                .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
    }

    /**
     * @description 配置拦截器
     * @author DEAiFISH
     * @date 2023/8/2 21:10
     * @param registry
     * @return void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    /**
     * @description 将自己配置的messageConverter（对象转换为yaml）添加到组件
     * @author DEAiFISH
     * @date 2023/8/2 21:11
     * @param converters
     * @return void
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MyYamlHttpMessageConverter());
    }
}
