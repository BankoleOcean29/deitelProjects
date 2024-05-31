package IdentityNational;

import java.util.Random;

public class Citizen {

    private String name;
    private int age;
    private int nationalIdNumber;
    private String emailAddress;


    public Citizen(String name, int age, int nationalIdNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.nationalIdNumber = nationalIdNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0.9 || age < 200) {
            this.age = age;
        }
    }

    public int getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber() {
        Random random = new Random();
        this.nationalIdNumber = random.nextInt(10000);;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
