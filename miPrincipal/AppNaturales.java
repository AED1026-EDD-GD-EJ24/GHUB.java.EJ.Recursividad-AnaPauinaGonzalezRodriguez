package miPrincipal;
import java.util.Scanner;
public class AppNaturales{
    public static void menu(){
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("NUMEROS NATURALES");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        Scanner consola = new Scanner(System.in);
        int n=0;
        System.out.println("Ingresa número: ");
        n=consola.nextInt();
        System.out.println("Versión iterativa");
        muestraNaturalesIte(n);
        System.out.println("Versión recursiva");
        muestraNaturalesRec(n);
    }

    public static void muestraNaturalesIte(int n){
    System.out.println("");
        for(int i=0; i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void muestraNaturalesRec(int n){
        if(n>0)
        muestraNaturalesRec(n-1);
        System.out.print(n+" ");

    }
}
