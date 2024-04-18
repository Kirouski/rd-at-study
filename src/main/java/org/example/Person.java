package org.example;

public class Person {

    private int id;
    private static int nextId;
    private String name;

    {
        id = nextId;
        nextId++;
    }


    public Person (){
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(int id){
        this("Person " + id, id);
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getNextId(){
        return nextId;
    }
}

class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(1000);
        System.out.println(person.getId());
        Person person2 = new Person(1001);
        System.out.println(person2.getName());
        System.out.println(person2.getId());
        System.out.println(person2.getNextId());
        Person person3 = new Person();
        System.out.println(person3.getId());
        System.out.println(person3.getNextId());
    }
}
