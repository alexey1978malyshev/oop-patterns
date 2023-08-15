package ariphmeticCalc.view;

import ariphmeticCalc.model.Calc.Calculable;
import ariphmeticCalc.presenter.CalculableFactory;



import java.util.Scanner;

public class CalculatorView {

    private final CalculableFactory calculableFactory;

    public CalculatorView(CalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);

            while (true) {
                String cmd = prompt("Введите команду (*, +, /, ^, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.divide(arg);
                    continue;
                }
                if (cmd.equals("^")) {
                    int arg = promptInt("Введите значение степени: ");
                    calculator.exponent(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return Integer.parseInt(in.nextLine());
    }
}
