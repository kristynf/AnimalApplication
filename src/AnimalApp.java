import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();
        Animal b = new Animal();
        Animal c = new Animal("dog","Schnauzer", "Max", "cute dog", 20.00, true);
            System.out.println("What is the first animal's name? ");
            a.setName(sc.nextLine());
            System.out.println("What is the first animal's type (cat/dog)? ");
            a.setAnimal_type(sc.nextLine());
            System.out.println("What is the first animal's description? ");
            a.setDescription(sc.nextLine());
            System.out.println("What is the second animal's name? ");
            b.setName(sc.nextLine());
            System.out.println("What is the second animal's type (cat/dog)? ");
            b.setAnimal_type(sc.nextLine());
            System.out.println("What is the second animal's description? ");
            b.setDescription(sc.nextLine());
            System.out.println(a.getPet());
            System.out.println(b.getPet());

       /* a.setAnimal_type("Dog");
        a.setBreed("Border Collie");
        a.setName("Echo");
        a.setDescription("Energetic 6y/o male");
        a.setPrice(65.00);
        a.setInStock(true);
        Animal b = new Animal();
        b.setAnimal_type("Dog");
        b.setBreed("Golden Retriever");
        b.setName("Charlie");
        b.setDescription("3 y/o female");
        b.setPrice(65.00);
        b.setInStock(true);
        Animal c = new Animal();
        c.setAnimal_type("Cat");
        c.setBreed("Persian");
        c.setName("KittyFace");
        c.setDescription("2 y/o female floof");
        c.setPrice(50.50);
        c.setInStock(true);
        Animal d = new Animal();
        d.setAnimal_type("cat");
        d.setBreed("siamese");
        d.setName("Gringita");
        d.setDescription("1 y/o fiesty feline, female");
        d.setPrice(45.00);
        d.setInStock(true);*/












}}
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Kristyn's Pet Rescue");

        System.out.println("Please Enter This Animal's Type: ");
        String type = sc.nextLine();
        a.setBreed(type);
        System.out.println("Please Enter This Animal's Breed: ");
        String breed = sc.nextLine();
        a.setBreed(breed);
        System.out.println("Please Enter This Animal's Name: ");
        String name = sc.nextLine();
        a.setName(name);
        System.out.println("Please Enter This Animal's Description: ");
        String description = sc.nextLine();
        a.setDescription(description);
        System.out.println("Please Enter This Animal's Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        a.setPrice(price);
        System.out.println("Please Enter If This Animal Is Available y/n: ");
        String input = sc.next();
        sc.nextLine();
        if(input.equals("y")) {
            a.setInStock(true);
        }
            else{
                a.setInStock(false);

            }*/
  /*Create a project in IntelliJ called AnimalApplication.

        Create a Animal class that allows for Animal name, type , description, price and isInStock variables

        The Animal class shall contain private member variables, a default constructor, an overloaded constructor and a method called getPet() which prints the animal name, type and description.



        The application shall also contain getters and setters for each private member variable.



        Create another class called AnimalApp which contains the main method. In the main method you shall create an instance of an Animal and use User input to set the private member variables.   Save user entry in a collection and print the Animal name, Animal Type and Description.



        Publish your solution to GitHub and submit your GitHub url as the assignment.*/