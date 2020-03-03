package org.example;

public class Father implements BloodType {
    private String surname;

    public String role(){
        return "I am a father";
    }

    public Father(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Father \n" + "Surname: " + surname;
    }

    @Override
    public void bloodType() {
        System.out.println("Blood Type: O");
    }
}
