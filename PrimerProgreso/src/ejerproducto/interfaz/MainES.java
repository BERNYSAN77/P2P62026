package ejerproducto.interfaz;

import java.util.Scanner;

public class MainES {
    public static void main(String[] args) {
        String nombre, apellido, ciudadResidencia;
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese su salario: ");
        salario = sc.nextDouble();
        System.out.print("Ingrese su ciudad de residencia: ");
        ciudadResidencia = sc.nextLine();

        System.out.println("Su nombre completo es: "+nombre+" "+apellido);
        System.out.println("El salario es: "+salario);
        System.out.println("Actualmente vive en: "+ciudadResidencia);

    }
}
