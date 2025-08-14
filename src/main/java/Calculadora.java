
public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Método sumar() llamado con a = " + a + ", b = " + b);
        int resultado = a + b;
        System.out.println("Resultado de sumar: " + resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        System.out.println("Método dividir() llamado con a = " + a + ", b = " + b);
        if (b == 0) {
            System.out.println("⚠️ Error: intento de división por cero.");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int resultado = a / b;
        System.out.println("Resultado de dividir: " + resultado);
        return resultado;
    }
        public int restar(int a, int b) {
            return a - b;
        }

        public int multiplicar(int a, int b) {
            return a * b;
        }

        public int porcentaje(int parte, int total) {
            if (total == 0) {
                throw new ArithmeticException("El total no puede ser cero");
            }
            return (parte * 100) / total;
        }

        public double raizCuadrada(double x) {
            if (x < 0) {
                throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
            }
            return Math.sqrt(x);
        }

}