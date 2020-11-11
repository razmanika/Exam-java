package ge.edu.btu.currency.service;

public interface CurrencyService {
    double convert(double amount);

    int convert(int amount);

    double setExchangeRate(double value);

    int setExchangeRate(int value);
}

