package test.java;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;
import main.java.ejercicios.baraja.Carta;


public class CartaTest extends TestCase {
    
    public CartaTest(String testName) {
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
     * Test of toString method, of class Carta.
     */
    public static void testToString() {
        System.out.println("toString");
        Carta[] instances = {new Carta(Carta.palos[0], 11),
                             new Carta(Carta.palos[0], 12),
                             new Carta(Carta.palos[0], 13),
                             new Carta(Carta.palos[0], 1),
                             new Carta(Carta.palos[0], 5),
        };
        String[] expResults = {"sota de "+Carta.palos[0],
                               "reina de "+Carta.palos[0],
                               "rey de "+Carta.palos[0],
                               "as de "+Carta.palos[0],
                               "5 de "+Carta.palos[0],
        };
        for(int i=0; i < instances.length; i++)
            assertEquals(instances[i].toString(), expResults[i]);
               
    }

    /**
     * Test of equals method, of class Carta.
     */
    public static void testEquals() {
        System.out.println("equals");
        Carta otra = new Carta(Carta.palos[1], 11);
        Carta otra2 = new Carta(Carta.palos[1], 12);
        Carta otra3 = new Carta(Carta.palos[2], 11);
        Carta instance = new Carta(Carta.palos[1], 11);

        assertTrue(instance.equals(otra));
        assertFalse(instance.equals(otra2));
        assertFalse(instance.equals(otra3));
   }

    /**
     * Test of getSerie method, of class Carta.
     */
    public static void testGetSerie() {
        System.out.println("getSerie");
        ArrayList<Carta> manoMismoPalo = new ArrayList<Carta>();
        ArrayList<Carta> manoPoker = new ArrayList<Carta>();
        ArrayList<Carta> manoNil = new ArrayList<Carta>();

        //llenar el mismoPalo:
        manoMismoPalo.add(new Carta(Carta.palos[0], 1));
        manoMismoPalo.add(new Carta(Carta.palos[0], 9));
        manoMismoPalo.add(new Carta(Carta.palos[0], 10));
        manoMismoPalo.add(new Carta(Carta.palos[0], 12));
        manoMismoPalo.add(new Carta(Carta.palos[0], 11));
        Collections.shuffle(manoMismoPalo);

        //poker:
        manoPoker.add(new Carta(Carta.palos[0], 1));
        manoPoker.add(new Carta(Carta.palos[2], 1));
        manoPoker.add(new Carta(Carta.palos[1], 1));
        manoPoker.add(new Carta(Carta.palos[3], 1));
        manoPoker.add(new Carta(Carta.palos[0], 12));
        Collections.shuffle(manoMismoPalo);

        //esta mano no es ni poker ni mismoPalo
        manoNil.add(new Carta(Carta.palos[1], 1));
        manoNil.add(new Carta(Carta.palos[2], 1));
        manoNil.add(new Carta(Carta.palos[3], 1));
        manoNil.add(new Carta(Carta.palos[0], 1));
        manoNil.add(new Carta(Carta.palos[1], 1));
        Collections.shuffle(manoNil);

        assertEquals("mismoPalo", Carta.getSerie(manoMismoPalo));
        assertEquals("poker", Carta.getSerie(manoPoker));
        assertEquals("ninguna", Carta.getSerie(manoNil));

    }

    /**
     * Test of getCuenta method, of class Carta.
     */
    public static void testGetCuenta() {
        System.out.println("getCuenta");
        ArrayList<Carta> manoSinAs = new ArrayList<Carta>();
        ArrayList<Carta> mano = new ArrayList<Carta>();
        //una mano con un as que la hace pasarse de 21:
        mano.add(new Carta(Carta.palos[1], 11));
        mano.add(new Carta(Carta.palos[1], 1));

        //una mano normal
        manoSinAs.add(new Carta(Carta.palos[1], 12));
        manoSinAs.add(new Carta(Carta.palos[1], 13));
        manoSinAs.add(new Carta(Carta.palos[1], 7));

        assertEquals(11, Carta.getCuenta(mano));
        assertEquals(27, Carta.getCuenta(manoSinAs));
        
    }

}