public class Animal {
    private String animal_type;
    private String breed;
    private String name;
    private String description;
    private double price;
    private boolean isInStock;


    public Animal() {

    }
    public Animal(String animal_type,String breed, String name,String description,double price, boolean isInStock){
        this.animal_type = animal_type;
        this.breed = breed;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public String getBreed() {

        return this.breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setName() {

        return this.name;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String setDescription() {

        return this.description;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double setPrice() {

        return this.price;
    }

    public void setInStock(boolean inStock) {

        isInStock = inStock;
    }

    public boolean isInStock() {

        return isInStock;
    }
}
