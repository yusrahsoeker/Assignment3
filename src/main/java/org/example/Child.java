package org.example;

public class Child extends Father implements BloodType {
    private String firstName;
    private int age;
    
    @Override
    public String role(){
        return "I am a father";
    }
    public Child(String surname, String firstName, int age) {
        super(surname);
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child \n" + "First Name: " + firstName + " Surname: " + getSurname() + " Age: " + age;
    }

    @Override
    public void bloodType() {
        System.out.println("Blood Type: O");
    }
}
