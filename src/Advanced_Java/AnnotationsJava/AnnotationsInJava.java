package Advanced_Java.AnnotationsJava;

import java.lang.reflect.Method;

public class AnnotationsInJava {
    /*Annotations in Java provide additional information to the compiler and JVM. An annotation is a tag representing metadata about classes, interfaces, variables, methods, or fields.
     Annotations do not impact the execution of the code that they annotate.*/
    // @ override annotation
    // annotation always start with @
    // @SuppressWarning(value = " uncheked ")
    // @Autor(name = "Ajinkya ")
    // marker annotation : just to provide very high level instruction
   /* ex:
    @Retention(RetentionPolicy.RUNTIME) // This processed at runtime
    @Target(ElementType.TYPE)
    public  @interface  MarkerAnnotation{

    }*/

    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("Annotation");
    }

    public static void main(String[] args) throws Exception{
        AnnotationsInJava h = new AnnotationsInJava();
        Method method = h.getClass().getMethod("sayHello"); // method called using reflection API

        MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is : "+ myCustomAnnotation.value());
    }

}
