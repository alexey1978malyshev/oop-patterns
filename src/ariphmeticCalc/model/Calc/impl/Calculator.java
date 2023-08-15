package ariphmeticCalc.model.Calc.impl;


import ariphmeticCalc.model.Calc.Calculable;

public final class Calculator implements Calculable {

    private int primaryArg;


    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable divide(int arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public Calculable exponent(int arg) {
        primaryArg = (int) Math.pow(primaryArg, arg);
        return this;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }


}