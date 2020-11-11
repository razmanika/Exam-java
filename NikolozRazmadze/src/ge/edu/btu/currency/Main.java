package ge.edu.btu.currency;

import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    final static Logger logger=Logger.getLogger(Main.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        CurrencyServiceImpl currencyService =new CurrencyServiceImpl();

        //currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(12));
        System.out.println(currencyService.convert(122.3));




        logger.info("პროგრამა წარმატებით დასრულდა...");
    }


}
