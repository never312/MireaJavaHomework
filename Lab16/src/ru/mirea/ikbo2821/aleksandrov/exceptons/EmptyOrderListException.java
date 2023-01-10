package ru.mirea.ikbo2821.aleksandrov.exceptons;

public class EmptyOrderListException extends NullPointerException {
    public EmptyOrderListException(){
        super("Нет ни одного заказа!");
    }
}
