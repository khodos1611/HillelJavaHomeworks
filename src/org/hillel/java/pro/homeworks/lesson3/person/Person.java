package org.hillel.java.pro.homeworks.lesson3.person;

public class Person {

    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private int age;

    public Person() {
        this.fullName = "";
        this.jobTitle = "";
        this.email = "";
        this.phone = "";
        this.age = 0;
    }

    public Person setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Person setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public Person setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
