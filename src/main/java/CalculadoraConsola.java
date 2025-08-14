import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Calculadora Interactiva ---");
            System.out.println("Elige una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Porcentaje");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            if (opcion == 0) break;
            try {
                switch (opcion) {
                    case 1:
                        System.out.print("a: "); int a1 = sc.nextInt();
                        System.out.print("b: "); int b1 = sc.nextInt();
                        System.out.println("Resultado: " + calc.sumar(a1, b1));
                        break;
                    case 2:
                        System.out.print("a: "); int a2 = sc.nextInt();
                        System.out.print("b: "); int b2 = sc.nextInt();
                        System.out.println("Resultado: " + calc.restar(a2, b2));
                        break;
                    case 3:
                        System.out.print("a: "); int a3 = sc.nextInt();
                        System.out.print("b: "); int b3 = sc.nextInt();
                        System.out.println("Resultado: " + calc.multiplicar(a3, b3));
                        break;
                    case 4:
                        System.out.print("a: "); int a4 = sc.nextInt();
                        System.out.print("b: "); int b4 = sc.nextInt();
                        System.out.println("Resultado: " + calc.dividir(a4, b4));
                        break;
                    case 5:
                        System.out.print("Parte: "); int parte = sc.nextInt();
                        System.out.print("Total: "); int total = sc.nextInt();
                        System.out.println("Resultado: " + calc.porcentaje(parte, total) + "%");
                        break;
                    case 6:
                        System.out.print("x: "); double x = sc.nextDouble();
                        System.out.println("Resultado: " + calc.raizCuadrada(x));
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("¡Hasta luego!");
        sc.close();
    }
}
