package com.demo.employeeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    /**
     * Cross-Origin Resource Sharing (CORS)=kökler arası kaynak paylaşımı,
     * bir web sayfası üzerindeki bazı kaynakların, kaynağın sunulduğu alan adının
     * dışındaki bir alan adından istenebilmesine izin veren bir sistemdir.
     * localhost:8080 kökünden localhost:3000 köküne veri paylaşımı için cors
     * konfigürasyonu yapmamız şarttır
     * 
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }
}
