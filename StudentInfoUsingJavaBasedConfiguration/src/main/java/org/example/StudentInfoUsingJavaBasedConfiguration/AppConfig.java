package org.example.StudentInfoUsingJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonalInfo[] personalInfos() {
        return new PersonalInfo[]{
            new PersonalInfo("Brahmaiah", 22, "Nellore", "brahmaiah@gmail.com"),
            new PersonalInfo("Mahesh", 22, "Ongole", "mahesh@gmail.com"),
            new PersonalInfo("Ravi", 21, "Udayagiri", "ravi@gmail.com")
        };
    }

    @Bean
    public AcademicInfo[] academicInfos() {
        return new AcademicInfo[]{
            new AcademicInfo("Brahmaiah", "brahmaiah@gmail.com", 85, new String[]{"Java", "C", "DBMS"}),
            new AcademicInfo("Mahesh", "mahesh@gmail.com", 90, new String[]{"Spring", "SQL", "AWS"}),
            new AcademicInfo("Ravi", "ravi@gmail.com", 88, new String[]{"Python", "Azure", "HTML"})
        };
    }

    @Bean
    public StudentInfo studentInfo() {
        return new StudentInfo(personalInfos(), academicInfos());
    }
}
