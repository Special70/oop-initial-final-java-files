package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public interface SystemFunctions {

    // Call this to delay the execution of code by x amount
    // of seconds.
    public static void delay(int value) {
        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (Exception e) {};
    }

    // Call this to clear the screen of the console output. Will not work
    // everywhere but it will work when it does
    
    public static void clearConsole(){
        //Clears Screen in java.
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}