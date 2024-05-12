package Advanced_Java.GenericsInJava;

public class SingleGenericHolder<T> {
    // refer link ;  https://www.geeksforgeeks.org/generics-in-java/
   // This used for reusability of code
    // we defined genric because we can use that part of code with other datatype
    /* Example : list<Integer> list
    - This used only for Integer datatype but
    - If you declared with generic as list<T> list
    - Here T can be replacable for all datatype like String, Integer and other
    - So we used generics for reusability of code
     */
    T obj;
    SingleGenericHolder(T obj){
        this.obj = obj ;
    }
    public T getObj(){
        return this.obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> iobj = new SingleGenericHolder<Integer>(10);
        System.out.println(iobj.getObj());

        SingleGenericHolder<String> sobj = new SingleGenericHolder<String>("AjinkyaH");
        System.out.println(sobj.getObj());
    }
}
