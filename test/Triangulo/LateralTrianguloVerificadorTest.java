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
public class LateralTrianguloVerificadorTest {

    private final int a = 3;
    private final int b = 4;
    private final int c = 5;
    private final int d = 7;

    private Triangulo trianguloEquilatero;
    private Triangulo trianguloEscaleno;
    private Triangulo trianguloIsoceles;
    private Triangulo trianguloInvalido;
    private LateralTrianguloVerificador verificador;

    public LateralTrianguloVerificadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.trianguloEquilatero = new Triangulo(a, a, a);
        this.trianguloIsoceles   = new Triangulo(a, b, b);
        this.trianguloEscaleno   = new Triangulo(a, b, c);
        this.trianguloInvalido   = new Triangulo(a, b, d);
        this.verificador         = new LateralTrianguloVerificador();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsTrianguloValido() {
        assertTrue(verificador.isTrianguloValido(trianguloEquilatero));
        assertTrue(verificador.isTrianguloValido(trianguloEscaleno));
        assertTrue(verificador.isTrianguloValido(trianguloIsoceles));

        assertFalse(verificador.isTrianguloValido(trianguloInvalido));
    }

    @Test
    public void testIsTrianguloIsInvalido() {
        assertTrue(!verificador.isTrianguloValido(trianguloInvalido));

        assertFalse(!verificador.isTrianguloValido(trianguloEquilatero));
        assertFalse(!verificador.isTrianguloValido(trianguloEscaleno));
        assertFalse(!verificador.isTrianguloValido(trianguloIsoceles));
    }

    @Test
    public void testIsTrianguloEquilatero() {
        assertTrue(verificador.isEquilatero(trianguloEquilatero));

        assertFalse(verificador.isEquilatero(trianguloInvalido));
        assertFalse(verificador.isEquilatero(trianguloEscaleno));
        assertFalse(verificador.isEquilatero(trianguloIsoceles));
    }

    @Test
    public void testIsTrianguloEscaleno() {
        assertTrue(verificador.isEscaleno(trianguloEscaleno));

        assertFalse(verificador.isEscaleno(trianguloInvalido));
        assertFalse(verificador.isEscaleno(trianguloEquilatero));
        assertFalse(verificador.isEscaleno(trianguloIsoceles));
    }

    @Test
    public void testIsTrianguloIsoceles() {
        assertTrue(verificador.isIsoceles(trianguloIsoceles));

        assertFalse(verificador.isIsoceles(trianguloInvalido));
        assertFalse(verificador.isIsoceles(trianguloEquilatero));
        assertFalse(verificador.isIsoceles(trianguloEscaleno));
    }
}
