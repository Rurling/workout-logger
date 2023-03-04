package se.rurling.workoutLogger;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class LoggerController {
    private LoggerApplication application;
    public LoggerController() {
        try {
            SwingUtilities.invokeAndWait(() -> application = new LoggerApplication());
        } catch (InterruptedException e) {
            throw new RuntimeException("Couldn't create GUI: " + e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Couldn't create GUI: " + e);
        }

    }
}
