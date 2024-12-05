package PrimeraParteCurso;
public class ContandoElementos {
 public static void main(String[] args) {
    int[] numeros = new int[10];
    for (int i =0;  i< numeros.length ; i++) {
        numeros[i] = (int) (Math.random() * (100 - 0 + 1) + 0);
        
        System.out.print(numeros[i]+" ");
    }
    System.out.println(" ");
    int cont = 0;
    for (int numero : numeros) {
        if ((numero%2) == 0) {
            cont++;
        }
    }
    System.out.println("Se encontraron "+ cont + " numeros PARES.");
 }   
}
