package examen;

import java.util.Scanner;

public class MainFirewall {
    public static void main(String[] args) {
        String regla;
        int puerto, opc;
        Firewall fi1 = null;
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    System.out.print("Ingrese el nombre de la regla: ");
                    regla = sc.nextLine();
                    System.out.print("Ingrese el puerto: ");
                    puerto = Integer.parseInt(sc.nextLine());
                    fi1 = new Firewall(regla,puerto);

                }break;
                case 2:{
                    if(fi1 != null)
                        fi1.activar();
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
