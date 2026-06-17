package excepciones;

import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            edad = Integer.parseInt(sc.nextLine());

        }catch(ArithmeticException nfe){
            System.out.println("Debía ingresar un numero");
        }catch(Exception ex){
            System.out.println("se produjo un error inesperado");
        }finally{
            System.out.println("Liberando recursos");
        }
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Gracias por usar nuestros servicios!");
    }
}
