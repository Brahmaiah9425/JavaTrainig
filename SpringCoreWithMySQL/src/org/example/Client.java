package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.contex.annotation.AnnotationCongigApplicationContext;
public class Client {
    public static void main(String[] args) {
//        Traveler traveler= new Traveler(new Cycle());
//        traveler.startJourney();
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Car car=applicationContext.getBean(Car.class);
        car.move();
        Bike bike=applicationContext.getBean(Bike.class);
        bike.move();
        Traveler traveler=applicationContext.getBean(Traveler.class);
        traveler.startJourney();



    }
}
 
 