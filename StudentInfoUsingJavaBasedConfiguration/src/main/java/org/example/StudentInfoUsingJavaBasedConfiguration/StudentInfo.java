package org.example.StudentInfoUsingJavaBasedConfiguration;

public class StudentInfo {

    private PersonalInfo[] personalInfos;
    private AcademicInfo[] academicInfos;

    public StudentInfo(PersonalInfo[] personalInfos, AcademicInfo[] academicInfos) {
        this.personalInfos = personalInfos;
        this.academicInfos = academicInfos;
    }

    public void displayInfo(String type) {
        if ("personal".equalsIgnoreCase(type)) {
            for (PersonalInfo personalInfo : personalInfos) {
                personalInfo.displayPersonalInfo();
                System.out.println("-----");
            }
        } else if ("academic".equalsIgnoreCase(type)) {
            for (AcademicInfo academicInfo : academicInfos) {
                academicInfo.displayAcademicInfo();
                System.out.println("-----");
            }
        } else {
            System.out.println("Invalid type specified.");
        }
    }
}
