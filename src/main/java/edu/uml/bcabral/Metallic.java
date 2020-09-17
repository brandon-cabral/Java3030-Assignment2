package edu.uml.bcabral;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Class Metallic that implements PaintJob. Meant to signify a
 * Metallic PaintJob. Has private ColorType ct to assign it the
 * Metallic constant value for the getColorType function.
 *
 * Includes functions:
 *          getColorType
 *          toString
 *
 */

public class Metallic implements  PaintJob {

    //assign ct constant value of Metallic
    private ColorType colorType = ColorType.Metallic;

    //Override getColorType to return constant value ct which is Metallic
    @Override
    public ColorType getColorType() {
        return this.colorType;
    }

    //Override toString to return String "Metallic Paint Job"
    @Override public String toString(){
        String message = "Metallic Paint Job";
        return message;
    }
}
