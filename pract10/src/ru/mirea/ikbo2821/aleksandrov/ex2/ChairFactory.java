package ru.mirea.ikbo2821.aleksandrov.ex2;

import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.FunctionalChair;
import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.MagicChair;
import ru.mirea.ikbo2821.aleksandrov.ex2.chairs.VictorianChair;

public class ChairFactory implements AbstractChairFactory {


    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(999);
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
