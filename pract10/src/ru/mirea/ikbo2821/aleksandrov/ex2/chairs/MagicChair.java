package ru.mirea.ikbo2821.aleksandrov.ex2.chairs;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Woooo-Hoooo, maaaaagic!");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
