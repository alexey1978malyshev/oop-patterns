package ariphmeticCalc.model.Log.impl;


import ariphmeticCalc.model.Log.Logable;
import ariphmeticCalc.model.dec.CalculatorLog;

import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger implements Logable {
    private Logger logger = Logger.getLogger(FileLogger.class.getName());
    @Override
    public void logToFile(String str) {
        //System.err.printf("%n%s : %s%n", LocalDateTime.now(), str);

        try {
            FileHandler fh = new FileHandler("CalculatorLog.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.addHandler(fh);
            logger.log(Level.INFO,str);

        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    @Override
    public void addToFile(String str) {
        logger.log(Level.INFO,str);
    }
}

