package ru.mirea.ikbo2821.aleksandrov.orders.managers;

import ru.mirea.ikbo2821.aleksandrov.menu.MenuItem;
import ru.mirea.ikbo2821.aleksandrov.orders.Order;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
