package org.example;

public class Main {
    public static void main(String[] args) {

        Man firstMan = new Man("Alex", "Nikishyn", 45, "Anna Nikishyn");
        Man secondMan = new Man("Anton", "Rymar", 67, "Daria Rymar");
        Man thirdMan = new Man("Roman", "Olli", 66, "Olesia Olli");


        Woman firstWoman = new Woman("Anna", "Lebed", 35, "Alex Nikishyn" );
        Woman secondWoman = new Woman("Daria", "Bilyk", 63, "Anton Rymar");
        Woman thirdWoman = new Woman("Olesia", "Sydorchuk", 61, "Roman Olli");

        System.out.println("Is " + firstMan.getFirstName() +  " retired? - " + firstMan.isRetired());
        System.out.println("Is " + secondMan.getFirstName() + " retired? - " + secondMan.isRetired());
        System.out.println("Is " + thirdMan.getFirstName() +  " retired? - " + thirdMan.isRetired());
        System.out.println("Is " + firstWoman.getFirstName() + " retired? - " + firstWoman.isRetired());
        System.out.println("Is " + secondWoman.getFirstName() + " retired? - " + secondWoman.isRetired());
        System.out.println("Is " + thirdWoman.getFirstName() + " retired? - " + thirdWoman.isRetired());


        firstWoman.registerPartnership("Nikishyn");
        secondWoman.registerPartnership("Rymar");
        thirdWoman.registerPartnership("Olli");

        System.out.println("Last name after registration partnership is " + firstWoman.getLastName());
        System.out.println("Last name after registration partnership is " + secondWoman.getLastName());
        System.out.println("Last name after registration partnership is " + thirdWoman.getLastName());

        secondWoman.deregisterPartnership(true);
        System.out.println("Last name after deregistration partnership is " + secondWoman.getLastName());
    }
}