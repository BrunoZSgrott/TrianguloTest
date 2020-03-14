/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno Zilli Sgrott
 */
public class AreaTrianguloCalculatorTest {

    private final int base = 5;
    private final int altura = 10;
    private final int areaValida = 25;
    private final int areaInvalida = 30;
    private Triangulo triangulo = new Triangulo(altura, base);
    private AreaTrianguloCalculator calculator = new AreaTrianguloCalculator();

    public AreaTrianguloCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularAreaValida() {
        assertTrue(calculator.calcularArea(triangulo) == areaValida);
    }

    @Test
    public void testCalcularAreaInValida() {
        assertTrue(calculator.calcularArea(triangulo) != areaInvalida);
    }

}
