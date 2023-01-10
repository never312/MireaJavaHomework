package ru.mirea.ikbo2821.aleksandrov.exceptons;

import ru.mirea.ikbo2821.aleksandrov.customers.Address;

public class OrderOnAddressAlreadyExistsException extends IllegalArgumentException {
    Address address;
    public OrderOnAddressAlreadyExistsException(Address address) {
        super("Заказ на адрес "+address.toString()+" уже обрабатывается!");
    }
}
