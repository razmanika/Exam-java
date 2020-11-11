package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    //int exchangeRate;

    @Override
    public double convert(double amount) {
        return  amount /3;
    }

    @Override
    public int convert(int amount) {

        return amount/3;

    }

    @Override
    public double setExchangeRate(double value) {
        return value/3;

    }

    @Override
    public int setExchangeRate(int value) {
        return value/3;

    }
}
