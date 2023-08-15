package ariphmeticCalc;

import ariphmeticCalc.model.dec.CalculableWithFileLoggerFactory;
import ariphmeticCalc.presenter.CalculableFactory;
import ariphmeticCalc.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculableFactory calculableFactory = new CalculableWithFileLoggerFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();

    }
}
