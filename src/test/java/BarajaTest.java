package test.java;

import java.util.ArrayList;
import java.util.Random;

import junit.framework.TestCase;
import main.java.ejercicios.baraja.Baraja;
import main.java.ejercicios.baraja.Carta;



public class BarajaTest extends TestCase {
    
    public BarajaTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    /**
     * Test of sacar method, of class Baraja.
     */
    public void testSacar_int() {
        System.out.println("sacar varias");
        Random gen = new Random();
        int n = gen.nextInt(52);
        Baraja instance = new Baraja();       
        instance.barajar();
        ArrayList result = instance.sacar(n);

        assertEquals(n, result.size());
        System.out.println(result);
        assertEquals(52-n, instance.getCartas().size());
    
    }

    /**
     * Test of sacar method, of class Baraja.
     */
    public void testSacar_0args() {
        System.out.println("sacar una");
        Baraja instance = new Baraja();
        Carta expResult = null;
        instance.barajar();
        Carta result = instance.sacar();
        assertEquals(52-1, instance.getCartas().size());
        System.out.println(result);
    
    }

    
}
