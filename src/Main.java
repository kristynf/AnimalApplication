import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Kristyn's Pet Rescue");

//        System.out.println("Do you have incoming animal information? y/n");
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

            }
        }

    }







}



    /*Create a project in IntelliJ called AnimalApplication.

        Create a Animal class that allows for Animal name, type , description, price and isInStock variables

        The Animal class shall contain private member variables, a default constructor, an overloaded constructor and a method called getPet() which prints the animal name, type and description.



        The application shall also contain getters and setters for each private member variable.



        Create another class called AnimalApp which contains the main method. In the main method you shall create an instance of an Animal and use User input to set the private member variables.   Save user entry in a collection and print the Animal name, Animal Type and Description.



        Publish your solution to GitHub and submit your GitHub url as the assignment.*/