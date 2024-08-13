package org.example.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class Singleton
{
    private static Singleton instance;
    private String message;
    private Singleton(){}

    synchronized public static Singleton getInstance()
    {
        if(instance==null)
            instance= new Singleton();
        return instance;
    }
    public void setMessage(String message)
    {
        this.message=message;
    }

    void display()
    {
        System.out.println(message);
    }
}
