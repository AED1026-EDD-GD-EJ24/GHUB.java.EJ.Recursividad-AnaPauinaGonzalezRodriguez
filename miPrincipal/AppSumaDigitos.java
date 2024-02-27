package miPrincipal; 

import java.util.Scanner;
public class AppSumaDigitos {

    public static void menu(){
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("SUMA DIGITOS");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        Scanner consola = new Scanner(System.in);
        int n=0;
        System.out.println("Ingresa número: ");
        n=consola.nextInt();
        System.out.println("Versión iterativa");
        System.out.println("Suma digitos: "+sumaDigitosIte(n));
        System.out.println("Versión recursiva");
        System.out.println("Suma digitos: "+sumaDigitosRec(n));    
    }

    public static int sumaDigitosIte(int n){
        int suma=0;
        while (n>0) {
            suma+=n%10;
            n/=10;
            
        }
        return (suma+n);
    } 
    public static int sumaDigitosRec(int n){
        if (n<=9) 
            return n;
        else
            return sumaDigitosRec(n/10)+n%10;
    } 
}