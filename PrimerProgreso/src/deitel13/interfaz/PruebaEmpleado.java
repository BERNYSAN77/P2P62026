package deitel13.interfaz;

import deitel13.negocio.Empleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nombre, apellido;
        double salario;
        double nuevoSalario;
        Scanner sc = new Scanner(System.in);
        Empleado em1 = null;
        Empleado em2 = null;

        System.out.println("El salario anual es: " + em1.getSalario()*12);
        nuevoSalario = em1.getSalario()*1.10;
        em1.setSalario(nuevoSalario);
        System.out.println("El nuevo salario anual es:" + em1.getSalario()*12);
        em2.setSalario(em2.getSalario()*1.10);
}
}