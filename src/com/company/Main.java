package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        System.out.println("Checking methods: ");
        System.out.println(animals[0] instanceof Shark);
        System.out.println(animals[1] instanceof Turtle);
        System.out.println(animals[2] instanceof Eagle);

        System.out.println("\n Checking methods what class they belong to: ");
        System.out.println(animals[0].getClass());
        System.out.println(animals[1].getClass());
        System.out.println(animals[2].getClass());

        Shark[] sharks = new Shark[2];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        for(int i = 0; i< animals.length; i++){
            animals[0] = new Shark();
            animals[1] = new Turtle();
            animals[2] = new Eagle();

            System.out.println(Arrays.toString(new Animal[]{animals[i]}));
        }
    }
}

