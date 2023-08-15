package ariphmeticCalc.presenter.impl;


import ariphmeticCalc.model.Calc.Calculable;
import ariphmeticCalc.model.Calc.impl.Calculator;

public class CalculablePresenter implements ariphmeticCalc.presenter.CalculableFactory {

    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }

}
