package org.example.singleton_pattern;

public class SingletonExample
{
    public static void main(String[] args) {
        Singleton object1=Singleton.getInstance();
        object1.setMessage("Hello");
        Singleton object2=Singleton.getInstance();
        object2.display();
    }
}
