
package testejob;

/**
 *
 * @author Marlon Milliorini
 */
public class TesteJob {
    public static void main(String[] args) {
        
        int indice = 13;
        int soma = 0;
        int k = 0;
        
        while(k < indice ){
            k += 1;
            soma += k;
        }
        System.out.println(soma);
    }
}
