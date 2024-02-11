package OOPs;

class  BabyDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class TestMultilevelInheritance {
    public static void main(String[] args) {
      BabyDog babyDog = new BabyDog();
      babyDog.eat();
      babyDog.bark();
      babyDog.weep();
    }
}
