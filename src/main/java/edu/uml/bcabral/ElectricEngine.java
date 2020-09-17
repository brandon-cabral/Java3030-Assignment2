package edu.uml.bcabral;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Class ElectricEngine that implements Engine. Used to simulate an Electric engine
 * which has no cylinders.
 *
 * Includes functions:
 *          cylinderCount
 *          toString
 */

public class ElectricEngine implements Engine {

    //Overrides the cylinderCount function to return 0, Electric engines have no cylinders.
    @Override
    public int cylinderCount() {
        return 0;
    }

    //Overrides toString to return String "Electric Powered Engine"
    @Override public String toString(){
        String engineType = "Electric powered engine";
        return engineType;
    }
}
