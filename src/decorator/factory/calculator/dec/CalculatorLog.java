package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.Log.Logable;

public class CalculatorLog implements Calculable {
    private Calculable calculator;
    private Logable logger;

    public CalculatorLog(Calculable calculator, Logable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Вычисляем сумму чисел:  %d + %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Вычисляем произведение чисел:  %d * %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Результат = %d", calculator.getResult()));

        return calculator.getResult();
    }
}
