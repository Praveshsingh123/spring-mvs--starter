//package com.oracle.config;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@ComponentScan(basePackages = "com.oracle")
//@EnableWebMvc
//
//
//
//public class WebAppConfig implements WebMvcConfigurer  {
//	@Override
//   public void configureViewResolvers(ViewResolverRegistry registry) {
//		//JSP view resolver setup 
//		// if controller return customer----/WEB_INF/views/customer.jsp
//		registry.jsp("/WEB_INF/views/",".jsp");
//	}
//}






package com.oracle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.oracle")
public class WebAppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); // Must match your folder
        resolver.setSuffix(".jsp");            // Appends .jsp
        return resolver;
    }
}





