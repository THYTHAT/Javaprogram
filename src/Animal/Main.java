package Animal;

public class Main {
    public static void main(String[] args) {
        Animal  animal=new Animal("pheakdy");
        System.out.println(animal.toString());

        Mammal mammal=new Mammal("Chanrith");
        System.out.println(mammal.toString());

        Cat cat=new Cat("chomnab");
        System.out.println(cat.toString());

        Dog dog=new Dog("wooof");
        System.out.println(dog.toString());
    }
}
