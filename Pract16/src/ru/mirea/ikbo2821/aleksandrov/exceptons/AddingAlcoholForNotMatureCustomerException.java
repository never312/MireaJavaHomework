package ru.mirea.ikbo2821.aleksandrov.exceptons;

import ru.mirea.ikbo2821.aleksandrov.customers.Customer;
import ru.mirea.ikbo2821.aleksandrov.menu.Drink;

public class AddingAlcoholForNotMatureCustomerException extends AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
