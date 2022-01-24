package ru.geekbrains;

import java.util.ArrayList;

public class Box<A> {

    private double weightFruit = 0.0;
    ArrayList<A> fruits = new ArrayList();

    public <A> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(A fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<A> boxFruit){
        System.out.println("Before in first box: " + fruits.size());
        System.out.println("Before in the second box: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("After in first box: " + fruits.size());
        System.out.println("After in the second box: " + boxFruit.fruits.size());
    }

}
