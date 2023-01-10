package ru.mirea.ikbo2821.aleksandrov.exceptons;

import ru.mirea.ikbo2821.aleksandrov.customers.Customer;
import ru.mirea.ikbo2821.aleksandrov.menu.Drink;

public class CustomerChangedToNotMatureException extends AlcoholForNotMatureCustomerException{

    public CustomerChangedToNotMatureException(Customer c, Drink[] alcoholables) {
        super(c, alcoholables);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"Вся алкогольная продукция удалена из заказа.";
    }
}
