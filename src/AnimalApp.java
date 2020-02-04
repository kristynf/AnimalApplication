public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.setAnimal_type("Dog");
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
        d.setInStock(true);
    }
}
