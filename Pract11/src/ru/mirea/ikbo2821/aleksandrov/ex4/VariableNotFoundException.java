package ru.mirea.ikbo2821.aleksandrov.ex4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}