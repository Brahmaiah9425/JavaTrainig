package org.example.StudentInformation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonalInfo[] personalInfos() {
        PersonalInfo[] personalInfos = new PersonalInfo[3];
        personalInfos[0] = new PersonalInfo("Brahmaiah", 22, "Nellore", "brahmaiah@gmail.com");
        personalInfos[1] = new PersonalInfo("Mahesh", 22, "Ongole", "mahesh@gmail.com");
        personalInfos[2] = new PersonalInfo("Ravi", 21, "Udayagiri", "ravi@gmail.com");
        return personalInfos;
    }

    @Bean
    public AcademicInfo[] academicInfos() {
        String[] subjects1 = {"Java", "C", "DBMS"};
        String[] subjects2 = {"Spring", "SQL", "AWS"};
        String[] subjects3 = {"Python", "Azure", "HTML"};
        
        AcademicInfo[] academicInfos = new AcademicInfo[3];
        academicInfos[0] = new AcademicInfo("Brahmaiah", "brahmaiah@gmail.com", 85, subjects1);
        academicInfos[1] = new AcademicInfo("Mahesh", "mahesh@gmail.com", 90, subjects2);
        academicInfos[2] = new AcademicInfo("Ravi", "ravi@gmail.com", 88, subjects3);
        
        return academicInfos;
    }

    @Bean
    public StudentInfo studentInfo() {
        return new StudentInfo(personalInfos(), academicInfos());
    }
}
