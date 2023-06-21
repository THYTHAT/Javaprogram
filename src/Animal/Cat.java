package Animal;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name.toString());
    }
    public void greets(){
        System.out.println("Moew");
    }
    @Override
    public String toString() {
        return "Cat{"  + super.toString() +  '}';
    }
}
