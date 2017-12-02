import java.util.Scanner;

public class programa {

    public void numeropar(){
        Scanner t = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un numero: ");
        numero = t.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }



    }
}
