package ejerproducto.interfaz;

import javax.swing.*;
import java.util.Scanner;

public class MainSB {
    public static void main(String[] args) {
        String nombre, apellido, ciudadResidencia;
        double salario;

        Scanner sc = new Scanner(System.in);

        //System.out.print("Ingrese el nombre: ");
        //nombre = sc.nextLine();

        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese su salario: ");
        salario = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese su ciudad de residencia: ");
        ciudadResidencia = sc.nextLine();

       /* System.out.println("Su nombre completo es: "+nombre+" "+apellido);
        System.out.println("El salario es: "+salario);
        System.out.println("Actualmente vive en: "+ciudadResidencia);*/
        JOptionPane.showMessageDialog(null,"Su nombre completo es: "+nombre+" "+"+apellido+" +
                "\nEl salario es: "+salario+"\nActualmente vive en: "+ciudadResidencia);

    }
}
