package ariphmeticCalc.model.dec;


import ariphmeticCalc.model.Calc.Calculable;
import ariphmeticCalc.model.Log.Logable;


public class CalculatorLog implements Calculable {
    private  Calculable calculator;
    private Logable logger;


    public CalculatorLog(Calculable calculator, Logable logger) {
        this.calculator = calculator;
        this.logger = logger;

    }

    @Override
    public Calculable exponent(int arg) {
        logger.logToFile(String.format("Вычисляем возведение числа %d в степень %d: ", calculator.getResult(), arg));

        return calculator.exponent(arg);

    }

    @Override
    public Calculable sum(int arg) {
        logger.logToFile(String.format("Вычисляем сумму чисел:  %d + %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.logToFile(String.format("Вычисляем произведение чисел:  %d * %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public Calculable divide(int arg) {
        logger.logToFile(String.format("Делим числа:  %d / %d", calculator.getResult(), arg));
        return  calculator.divide(arg);
    }

    @Override
    public int getResult() {
        logger.addToFile(String.format("Результат = %d", calculator.getResult()));
        return calculator.getResult();
    }
}
