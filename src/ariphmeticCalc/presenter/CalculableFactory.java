package ariphmeticCalc.presenter;


import ariphmeticCalc.model.Calc.Calculable;

public interface CalculableFactory {
    Calculable create(int primaryArg);
}
