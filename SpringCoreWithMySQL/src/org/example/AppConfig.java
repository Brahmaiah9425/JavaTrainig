package org.example;
import org.springframework.context.annotation.Bean;

// Example of Java based Configuration
public class AppConfig {

    @Bean
    public Car car(){
        return new Car();
    }
    @Bean
    public  Bike bike(){
        return new Bike();
    }
    @Bean
    public Cycle cycle(){
        return new Cycle();
    }
    @Bean
    public Traveler traveler()
    {
        return new Traveler(bike());  //Dependency injection
    }
}
 
 