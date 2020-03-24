
package u04e30;

import java.util.Scanner;

public class U04E30 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num1, num2;
        String a="Ingrese el", b=" numero: ";
        System.out.print(a+" primer"+b);
        num1=entrada.nextInt();
        do{
            System.out.print(a+" segundo"+b);
            num2=entrada.nextInt();
                if((num2)==0){
                     System.out.println("Ingrese un numero distinto de 0");
                }
        }while(num2==0);
        System.out.print("La division entre ambos numeros es igual a: "+(num1/num2));
    }
}
