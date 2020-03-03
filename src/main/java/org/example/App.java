package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Father father = new Father("Soeker");
        //encapsulation
        Child child = new Child(father.getSurname(), "Yusrah", 20);

        System.out.println(father.toString());
        //polymorphism
        father.bloodType();
        System.out.println(child.toString());
        child.bloodType();
    }
}
