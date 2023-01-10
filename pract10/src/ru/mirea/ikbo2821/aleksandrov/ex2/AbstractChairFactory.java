package ru.mirea.ikbo2821.aleksandrov.ex2;

import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.FunctionalChair;
import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.MagicChair;
import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.VictorianChair;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair();

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
