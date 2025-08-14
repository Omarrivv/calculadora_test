# calculadoraTest

## Métodos implementados

La clase `Calculadora` ahora incluye los siguientes métodos:

- `sumar(int a, int b)`: Suma dos números.
- `dividir(int a, int b)`: Divide dos números. Lanza `ArithmeticException` si el divisor es cero.
- `restar(int a, int b)`: Resta dos números.
- `multiplicar(int a, int b)`: Multiplica dos números.
- `porcentaje(int parte, int total)`: Calcula el porcentaje que representa `parte` sobre `total`. Lanza `ArithmeticException` si el total es cero.
- `raizCuadrada(double x)`: Devuelve la raíz cuadrada de `x`. Lanza `IllegalArgumentException` si `x` es negativo.

Pruebas unitarias

En `CalculadoraTest` se incluyen pruebas para cada método, cubriendo:

- Casos normales y límites (valores positivos, negativos, cero, etc).
- Validación de excepciones con `assertThrows`.
- Impresión en consola del caso probado y resultados esperados vs. obtenidos.

### Ejemplo de ejecución de pruebas

```bash
mvn test
```

Todas las pruebas deben pasar correctamente si el código está actualizado.
