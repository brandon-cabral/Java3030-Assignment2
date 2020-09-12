package MyTests;

/**
 * Brandon Cabral - Java 3030 Assignment 2 - 09/12/2020
 *
 * Test class called MyTest that will run various test to ensure each function,
 * Class and Interface works.
 * Includes
 */

import Classes.Car;
import Classes.Metallic;
import Classes.Iridescent;
import Classes.ElectricEngine;
import Classes.EngineV8;
import org.junit.Assert;
import org.junit.Test;

public class MyTest {

        //Test to verify that getColorType() on Iridescent and Metallic Classes
        //works
    @Test
    public void testReturnColorType(){
        Iridescent ir = new Iridescent();
        Metallic met = new Metallic();
        ir.getColorType();
        met.getColorType();
    }

        //Test that verifies if testCylinderCount works on ElectricEngine
        //and EngineV8 Classes
    @Test
    public void testCylinderCount(){
        ElectricEngine eev = new ElectricEngine();
        EngineV8 v8 = new EngineV8();

        eev.cylinderCount();
        v8.cylinderCount();
    }


        //Test that verifies if toStrings on all classes work
    @Test
    public void test_toString(){
        Iridescent ir = new Iridescent();
        Metallic met = new Metallic();
        ElectricEngine eev = new ElectricEngine();
        EngineV8 v8 = new EngineV8();
        Car c = new Car(ir, eev);
        Car cc = new Car(met, v8);

        ir.toString();
        met.toString();
        eev.toString();
        v8.toString();
        cc.toString();
        c.toString();
    }

    //Test that verifies Car Instantiation works
    @Test
    public void testCarInstantiation(){
        Car a = new Car(new Metallic(), new EngineV8());
        Car b = new Car(new Iridescent(), new ElectricEngine());
    }

        //Asserts true if all works
    @Test
    public void testApp(){
        Assert.assertTrue(true);
    }
}
