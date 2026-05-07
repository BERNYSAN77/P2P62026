package examen;

import java.util.Scanner;

public class MainArreglos {
    public static void main(String[] args) {
        String regla;
        int puerto, opc;
        int indice=0;
        final int MAX =50;
      //  Firewall fi1 = null;
        Firewall seguridad[] = new Firewall[MAX];
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    int cantidad;
                    System.out.print("Cuantas reglas desea ingresar: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    if(cantidad+indice <MAX){
                        int i;
                        for (i=indice; i<MAX; i++){
                        System.out.print("Ingrese el nombre de la regla: ");
                        regla = sc.nextLine();
                        System.out.print("Ingrese el puerto: ");
                        puerto = Integer.parseInt(sc.nextLine());
                        seguridad[i] = new Firewall(regla,puerto);}
                        indice = i;
                    }else{
                        System.out.println("No existe memoria suficiente");
                    }


                }break;
               case 2:{
                    if(indice > 0){
                        System.out.print("Ingrese la regla a activar: ");
                        regla = sc.nextLine();
                        boolean encontro = false;
                        for(int i = 0; i < indice; i++){
                            if(seguridad[i].getRegla().equals(regla)){
                                seguridad[i].activar();
                                encontro = true;
                                break;
                            }
                        }
                        if(!encontro)
                            System.out.println("No existe la regla");
                    }

                    else
                        System.out.println("No existen reglas creadas");
                }break;
                case 3:{
                    if(fi1 != null)
                        fi1.desactivar();
                    else
                        System.out.println("No existen reglas creadas");

                }break;
                case 4:{
                    if(fi1 != null){
                        System.out.print("Ingrese el puerto: ");
                        puerto = Integer.parseInt(sc.nextLine());
                        fi1.bloquearIntento(puerto);
                    }else
                        System.out.println("No existen reglas creadas");

                }
                case 5:{
                    if(fi1 != null)
                        fi1.mostrarDatos();
                    else
                        System.out.println("No existen reglas creadas");

                }break;
                case 6:{
                    System.out.println("Gracias por usar nuestros servicios");
                }break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opc != 6);
    }
    public static void menu(){
        System.out.println("********Menú********");
        System.out.println("1. Crear firewall");
        System.out.println("2. Activar firewall");
        System.out.println("3. Desactivar firewall");
        System.out.println("4. Intentar ingreso");
        System.out.println("5. mostrar Firewall");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");
    }
}
