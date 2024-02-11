package OOPs;
// Hierarchical inheritance
class Cat extends Animal{
    void meow(){
        System.out.println("Meow");
    }
}
public class TestHierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
