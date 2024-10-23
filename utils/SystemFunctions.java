package utils;

import java.util.concurrent.TimeUnit;

import utils.SystemVariables.MenuConstants;

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

    // Checks if the program is still running. returns true if program is still running
    public static boolean getProgramStatus() {
        return SystemVariables.isProgramRunning;
    }

    // Call this to shutdown the program.
    // Makes the loop at SystemCore.java cease to work.
    public static void shutDownProgram() {
        SystemVariables.isProgramRunning = false;
    }
    
    // Call this to find out the value of what menu you are at.
    // Useful for knowing which menu the user is at at the moment.
    public static MenuConstants getCurrentMenu() {
        return SystemVariables.currentMenu;
    }

    // Call this to change what menu the program would display next once the
    // current menu ends or exits
    public static void changeMenu(MenuConstants value) {
        SystemVariables.currentMenu = value;
    }
}