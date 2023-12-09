package app.config;


import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name="cat")
    public Cat getCat() {
        return new Cat();
    }
    @Bean(name="dog")
    public Dog getDog() {
        return new Dog();
    }
    @Bean(name="timer")
    public Timer getTimer() {
        return new Timer();
    }

}
