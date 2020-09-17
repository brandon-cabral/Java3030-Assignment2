package main.Interfaces;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * PaintJob Interfaces. Sets functions for getColorType() and a toString().
 * Used to base Iridescent and Metallic Paint Jobs off of.
 */

import main.Classes.ColorType;

public interface PaintJob {

    ColorType getColorType();

    String toString();

}
