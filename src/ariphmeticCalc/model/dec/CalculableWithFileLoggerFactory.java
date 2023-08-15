package ariphmeticCalc.model.dec;


import ariphmeticCalc.model.Calc.Calculable;
import ariphmeticCalc.model.Log.impl.FileLogger;
import ariphmeticCalc.model.Calc.impl.Calculator;
import ariphmeticCalc.presenter.CalculableFactory;

public class CalculableWithFileLoggerFactory implements CalculableFactory {
    public CalculableWithFileLoggerFactory() {
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLog(new Calculator(primaryArg), new FileLogger());
    }
}
