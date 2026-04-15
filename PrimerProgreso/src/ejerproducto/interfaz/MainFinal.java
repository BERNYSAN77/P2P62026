package ejerproducto.interfaz;

import ejerproducto.negocio.Producto;

import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        Producto p1 = new Producto("cartuchera",8.95,20);
        do{
            System.out.println("1. Vender");
            System.out.println("2. Comprar");
            System.out.println("3. Mostrar producto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    int cantidad;
                    System.out.print("Ingrese la cantidad a vender: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    double venta = p1.vender(cantidad);
                    if (venta > 0)
                        System.out.println("El valor a cancelar es: " + venta);
                    else
                        System.out.println("La venta no puede ser realizada.");

                }break;
                case 2:{
                    int cantidad;
                    System.out.print("Ingrese la cantidad a reabasteacer: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    p1.comprar(cantidad);
                    System.out.println("El stock actual del producto es: "+p1.getStock());

                }break;
                case 3:{
                    System.out.println("***Datos del Producto***\n" + p1);

                }break;
                case 4:{
                    System.out.print("Gracias por usar nuestros servicios!");
                }break;
                default:
                    System.out.println("Opción ingresada no es válida");

            }

        }while(opc != 4 );

    }
}
