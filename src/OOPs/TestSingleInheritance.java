package OOPs;
// single level inheritance
class Animal{
    protected void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    protected void bark(){
        System.out.println("Barking");
    }
}
public class TestSingleInheritance {


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Animal animal = new Animal();
        animal.eat();
    }

}
