package main.Classes;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Car class that has constructor which takes two interfaces as arguments;
 * Direct Injection;
 */

import main.Interfaces.PaintJob;
import main.Interfaces.Engine;

public class Car {

    private PaintJob paintJob;  // declare interfaces
    private Engine engine;      //declare interfaces

    public Car(PaintJob paintJob, Engine engine) {
        this.paintJob = paintJob;   //assign this.paintJob with the passed interface arg paintJob
        this.engine = engine;       //assign this.engine with the passed interface arg engine
    }

    public String toString(){
        String message = this.paintJob.toString() + " with a " + this.engine.toString();
        return message; // assign message that combines both toStrings to return
                        // a message (blank) Paint Job with a (blank) engine.
    }
}
