package org.example.StudentInfoUsingJavaBasedConfiguration;

public class AcademicInfo {

    private String name;
    private String email;
    private int marks;
    private String[] subjects;

    public AcademicInfo(String name, String email, int marks, String[] subjects) {
        this.name = name;
        this.email = email;
        this.marks = marks;
        this.subjects = subjects;
    }

    public void displayAcademicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Marks: " + marks);
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println();
    }
}
