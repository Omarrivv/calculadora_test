import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

        @Test
        public void testRestarPositivos() {
            System.out.println("Probando restar positivos: 10 - 5");
            int esperado = 5;
            int obtenido = calc.restar(10, 5);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido);
        }

        @Test
        public void testRestarNegativos() {
            System.out.println("Probando restar negativos: -3 - (-7)");
            int esperado = 4;
            int obtenido = calc.restar(-3, -7);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido);
        }

        @Test
        public void testMultiplicarPorCero() {
            System.out.println("Probando multiplicar por cero: 0 * 8");
            int esperado = 0;
            int obtenido = calc.multiplicar(0, 8);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido);
        }

        @Test
        public void testMultiplicarNegativos() {
            System.out.println("Probando multiplicar negativos: -4 * 3");
            int esperado = -12;
            int obtenido = calc.multiplicar(-4, 3);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido);
        }

        @Test
        public void testPorcentajeNormal() {
            System.out.println("Probando porcentaje normal: 25 de 200");
            int esperado = 12;
            int obtenido = calc.porcentaje(25, 200);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido);
        }

        @Test
        public void testPorcentajeTotalCero() {
            System.out.println("Probando porcentaje con total = 0 (debe lanzar excepción)");
            assertThrows(ArithmeticException.class, () -> calc.porcentaje(10, 0));
        }

        @Test
        public void testRaizCuadradaNormal() {
            System.out.println("Probando raizCuadrada de 16");
            double esperado = 4.0;
            double obtenido = calc.raizCuadrada(16);
            System.out.println("Esperado: " + esperado + ", Obtenido: " + obtenido);
            assertEquals(esperado, obtenido, 0.0001);
        }

        @Test
        public void testRaizCuadradaNegativo() {
            System.out.println("Probando raizCuadrada de -9 (debe lanzar excepción)");
            assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-9));
        }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    // Prueba unitaria para el método sumar
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // Prueba unitaria para el método dividir
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }
}
