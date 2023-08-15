package decorator.factory.calculator.Log.impl;


import decorator.factory.calculator.Log.Logable;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String str) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), str);
    }
}

