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

## Modo interactivo por consola

Además de las pruebas unitarias, puedes usar la calculadora de forma interactiva desde la terminal con la clase `CalculadoraConsola`.

### ¿Cómo usar la calculadora interactiva?

1. Compila el proyecto:
   ```bash
   mvn compile
   ```
2. Ejecuta la calculadora interactiva:
   ```bash
   java -cp target/classes CalculadoraConsola
   ```

### ¿Qué permite hacer?

- Elegir la operación que deseas (sumar, restar, multiplicar, dividir, porcentaje, raíz cuadrada).
- Ingresar los valores por teclado.
- Ver el resultado en pantalla.
- Manejo de errores: si ingresas valores inválidos (por ejemplo, dividir por cero o raíz de negativo), verás el mensaje de error correspondiente.

#### Ejemplo de uso

```
--- Calculadora Interactiva ---
Elige una operación:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Porcentaje
6. Raíz cuadrada
0. Salir
Opción: 2
a: 10
b: 5
Resultado: 5
```

Puedes repetir las operaciones que desees hasta elegir la opción "Salir".

* [ ] Ejemplo de ejecución de pruebas

```bash
mvn test
```

Todas las pruebas deben pasar correctamente si el código está actualizado.
