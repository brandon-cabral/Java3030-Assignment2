package edu.uml.bcabral;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Class Iridescent that implements PaintJob. Meant to signify an
 * Iridescent Paint Job. Has private ColorType ct to assign it the
 * Iridescent value in the getColorType function.
 *
 * Includes functions:
 *          getColorType
 *          toString
 */


public class Iridescent implements PaintJob {

    //assign ct constant value of Iridescent
    private ColorType ct = ColorType.Iridescent; //assign ct constant value of Iridescent


    //Override getColorType to return constant value ct which is Iridescent
    @Override
    public ColorType getColorType() {
        return this.ct;
    }

    //Override toString to return String "Iridescent Paint Job"
    @Override public String toString(){
        String message = "Iridescent Paint Job";
        return message;
    }


}
