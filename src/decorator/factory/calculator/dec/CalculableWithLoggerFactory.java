package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.ICalculableFactory;
import decorator.factory.calculator.Log.impl.ConsoleLogger;

public class CalculableWithLoggerFactory implements ICalculableFactory {
    public CalculableWithLoggerFactory() {
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLog(new Calculator(primaryArg), new ConsoleLogger());
    }
}
