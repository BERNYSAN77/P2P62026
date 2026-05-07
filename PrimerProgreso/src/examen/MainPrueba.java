package examen;

import java.util.Scanner;

public class MainPrueba {

    public static void main(String[] args) {
        String regla;
        int puerto, opc;

        final int MAX =3;
        Firewall seguridad[] = new Firewall[MAX];
        Scanner sc = new Scanner(System.in);
        //1 llenar todo el arreglo y mostrar

        for(int i = 0; i < seguridad.length; i++){
            System.out.print("Ingrese el nombre de la regla: ");
            regla = sc.nextLine();
            System.out.print("Ingrese el puerto: ");
            puerto = Integer.parseInt(sc.nextLine());
            seguridad[i] = new Firewall(regla,puerto);
        }
        for(int i = 0; i < seguridad.length;i++){
            seguridad[i].mostrarDatos();
        }

        //ingreso de 1 en 1
        int indice = 0;
        //aqui va el menú con el do while
        if(indice < MAX){
            System.out.print("Ingrese el nombre de la regla: ");
            regla = sc.nextLine();
            System.out.print("Ingrese el puerto: ");
            puerto = Integer.parseInt(sc.nextLine());
            seguridad[indice++]=  new Firewall(regla,puerto);

        }else
            System.out.println("No hay más memoria");

        //ingresa un x cantidad
        int indice1 = 0;
        //menu
        //case
        int cantidad;
        System.out.print("Cuantas reglas desea ingresar: ");
        cantidad = Integer.parseInt(sc.nextLine());
        if((indice1+cantidad) <= MAX){
            //dos caminos con for o con while
            //con while
            int contador = 0;

            while(contador < cantidad){
                System.out.print("Ingrese el nombre de la regla: ");
                regla = sc.nextLine();
                System.out.print("Ingrese el puerto: ");
                puerto = Integer.parseInt(sc.nextLine());
                seguridad[indice++]=  new Firewall(regla,puerto);
                contador++;

            }

        }else
            System.out.println("No hay espacio");

    }
}
