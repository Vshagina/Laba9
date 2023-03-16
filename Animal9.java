package com.company;

abstract class Animal {
    public String name;
    public String type;
    public String location;
    Animal(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public abstract void makeNoise();
    public abstract void eat();
    public void sleep() {
        System.out.println(name + " " + type + " спит");
    }
}
class Dog extends Animal {
    String age;
    Dog(String name, String location, String age) {
        super(name, location);
        this.age = age;
        this.type = "породы бигль";
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " гавкает");
    }
    @Override
    public void eat() {
        System.out.println(name + " ест мясо");
    }
}
class Cat extends Animal {
    String typeOfWool;

    Cat(String name, String location, String typeOfWool) {
        super(name, location);
        this.typeOfWool = typeOfWool;
        this.type = "породы мейн-кун";
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает");
    }
    @Override
    public void eat() {
        System.out.println(name + " ест рыбу");
    }
}

class Horse extends Animal {
    int speed;
    Horse(String name, String location, int speed) {
        super(name, location);
        this.speed = speed;
        this.type = "породы пони";
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " скачет по лугу");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест сено");
    }
}
class Veterinar {
    String name;
    Veterinar(String name) {
        this.name = name;
    }
    void treatAnimal(Animal animal) {
        System.out.println(animal.name + " пришел на приём "+ ", которого привезли из " + animal.location);
    }
}
public class Animal9 {
    public static void main(String[] args) {
        Dog jack = new Dog("Джек", "улицы", "бигль");
        jack.makeNoise();
        jack.eat();
        jack.sleep();
        Cat masya = new Cat("Мася", "дом","мейн-кун");
        masya.makeNoise();
        masya.eat();
        masya.sleep();
        Horse ray = new Horse("Лучик", "конюшня", 50);
        ray.makeNoise();
        ray.sleep();
        ray.eat();
        Veterinar kolya = new Veterinar("Коля ветеринар");
        kolya.treatAnimal(jack);
    }
}
