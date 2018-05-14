package com.iasa.tests.service.logger;

//а вот это я не понимаю зачем и почему
import org.apache.log4j.Logger;

public class MyLogger extends Logger {

    protected MyLogger(String name) {
        super(name);
    }

    public static Logger getLOGGER(Class cl) {
        Logger LOGGER = Logger.getLogger(cl);
        return LOGGER;
    }
}
