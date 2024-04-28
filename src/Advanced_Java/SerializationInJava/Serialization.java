package Advanced_Java.SerializationInJava;

import java.io.Serializable;

public class Serialization implements Serializable {
    /*
Serialization is a mechanism of converting the state of an object into a byte stream.
Deserialization is the reverse process where the byte stream is used to recreate the
actual Java object in memory. This mechanism is used to persist the object.*/
    // It implement Serializable interface

    private static final long serialVersionUid = 1L; // java can uniquelly identified object when it is serialized or deseralized
    // this count get increased by one for new creating object
    private String name ;
    private  int age;
    private String address;

    // if you do not want to serialized or deserialized you can use transient keyword

    transient int x;

    public Serialization(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString(){
        return ("Student Name: "+this.getName()+", Age is "+this.age+" , Student Address "+ this.getAddress());
    }
}
