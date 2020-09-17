package edu.uml.bcabral;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Engine Interface: Sets functions for cylinderCount() and a toString();
 * Used to base a V8 Engine and Electric engine off of;
 */

public interface Engine {

    int cylinderCount();
        //declare cylinderCount(), returns number of cylinders

    String toString();
        // return string of engine type.

}
