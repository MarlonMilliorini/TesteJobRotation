
package testejob;

/**
 *
 * @author Marlon Milliorini
 */
public class teste02 {
    public static void main(String[] args) {
        
        int num = 13; // número a ser verificado
        int fib1 = 0;
        int fib2 = 1;
        boolean encontrado = false;

        while (fib2 <= num) {
            if (fib2 == num) {
                encontrado = true;
                break;
            }
            int proximo = fib1 + fib2;
            fib1 = fib2;
            fib2 = proximo;
        }

        if (encontrado) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
