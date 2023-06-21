package Animal;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greet(){
        System.out.println("Doggy");

    }

    @Override
    public String toString() {
        return "Dog{"+ super.toString() +
                '}';
    }
}
