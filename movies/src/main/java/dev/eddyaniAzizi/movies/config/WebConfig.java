package dev.eddyaniAzizi.movies.config;

      import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.config.annotation.CorsRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // Adjust this if your React app is hosted elsewhere
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
