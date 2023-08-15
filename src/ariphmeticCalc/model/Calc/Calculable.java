package ariphmeticCalc.model.Calc;

public interface Calculable {
    Calculable exponent(int arg);
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable divide(int arg);
    int getResult();
}
