package it.linksmt.teamshare.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSecurityConfig implements WebMvcConfigurer  {
	
    @Override
    public void addCorsMappings( CorsRegistry registry ) {
        registry
				.addMapping( "/**" )
				.allowedMethods( "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH" );
    }
}