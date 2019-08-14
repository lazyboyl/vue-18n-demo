package com.vue.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author linzf
 * @since 2019/4/25
 * 类描述：
 */
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // 它也是一个逗号分隔的字符串，表明服务器支持的所有头信息字段，也可以设置为*号支持全部
                        .allowedHeaders("*")
                        // 该字段必需，它的值是逗号分隔的一个字符串，表明服务器支持的所有跨域请求的方法。
                        .allowedMethods("*")
                        // 本次请求来自哪个源（协议 + 域名 + 端口）。服务器根据这个值，决定是否同意这次请求
                        .allowedOrigins("*")
                        // 该字段可选，用来指定本次预检请求的有效期，单位为秒
                        .maxAge(1728000);
            }
        };
    }

}
