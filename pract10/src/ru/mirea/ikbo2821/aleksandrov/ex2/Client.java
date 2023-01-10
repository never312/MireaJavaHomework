package ru.mirea.ikbo2821.aleksandrov.ex2;

import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.Chair;

public class Client {
    private Chair chair;

    public Client(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sitting on " + (chair != null ? chair : "the floor"));
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
