package Advanced_Java.GenericsInJava;

public class DualGenericHolder <T , U> {
    T obj1;
    U obj2;

    public DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void display(){
        System.out.println("obj1 is : "+ obj1 + "Belongs to class - > "+ obj1.getClass());
        System.out.println("obj2 is : "+ obj2 + "Belongs to class - > "+ obj2.getClass());
    }
    public static void main(String[] args) {
        DualGenericHolder<String , Integer > obj = new DualGenericHolder<>("Ajinkya",3);
        obj.display();
    }

}
