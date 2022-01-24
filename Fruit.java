package ru.geekbrains;

public class Fruit {
    public int amount;
    public float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
