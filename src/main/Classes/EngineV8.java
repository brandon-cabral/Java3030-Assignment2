package main.Classes;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Class EngineV8 that implements Engine. Used to simulate a V8 engine
 * which has 8 cylinders.
 *
 * Includes functions:
 *          cylinderCount
 *          toString
 */

public class EngineV8 implements main.Interfaces.Engine {

    //Overrides the cylinderCount function to return , V8 engines have 8 cylinders.
    @Override
    public int cylinderCount() {
        return 8;
    }

    //Overrides toString to return String "V8 Powered Engine"
    @Override public String toString(){
        String engineType = "V8 powered engine";
        return engineType;
    }
}
