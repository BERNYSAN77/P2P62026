package herencia.herpersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        //uso del polimorfismo, crea una lista de Persona
        List<Persona> listado = new ArrayList<Persona>();
        String cedula, nombre, universidad, carrera, especialidad;
        cedula = null;
        nombre = null;
        universidad = null;
        carrera = null;
        especialidad = null;
        int hora, opc;
        hora = 0;
        double valorHora;
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    //pida el ingresa de datos
                    listado.add(new AlumnoPregrado(cedula,nombre,universidad,carrera));
                    break;
                }
                case 4:{
                    for(Persona p: listado){
                        System.out.println(p);
                    }
                }break;
            }

        }while(opc != 7);


    }

    public static void menu(){
        System.out.println("1. Ingresar Alumno pregrado");
        System.out.println("2. Ingresar Alumno magister");
        System.out.println("3. Ingresar profesor hora");
        System.out.println("4. Imprimir todos");
        System.out.println("5. Imprimir alumnos pregrado");
        System.out.println("6. Imprimir alumnos magister");
        System.out.println("5. Imprimir profesores hora");
        System.out.println("6. Pagar nómina profesores");
        System.out.println("7. Salir");
    }
}
