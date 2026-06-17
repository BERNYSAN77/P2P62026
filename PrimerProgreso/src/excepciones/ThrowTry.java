package excepciones;

import java.util.Scanner;

public class ThrowTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adivina;
        try{
            System.out.print("Ingrese un numero entre 1 y 10: ");
            adivina = Integer.parseInt(sc.nextLine());
            try{
                if(adivina == 7){
                 //  throw new NullPointerException("Ingresó el número prohibido");
                   throw new ArithmeticException("Ingresó el número prohibido");
                }
            }catch(ArithmeticException ae){
                //ae.printStackTrace();
                System.out.println(ae.getMessage());
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }

        System.out.println("Gracias!");
    }
}
