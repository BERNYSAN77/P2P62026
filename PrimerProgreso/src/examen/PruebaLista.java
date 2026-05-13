package examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PruebaLista {
    public static void main(String[] args) {
        String regla;
        int puerto;
        Scanner sc = new Scanner(System.in);
        List<Firewall> lista = new ArrayList<Firewall>();
        //adicionar elementos a la lista
        System.out.print("Ingrese el nombre de la regla: ");
        regla = sc.nextLine();
        System.out.print("Ingrese el puerto: ");
        puerto = Integer.parseInt(sc.nextLine());
        lista.add(new Firewall(regla,puerto));

        //imprimir for colección
        for(Firewall fi: lista){
            fi.mostrarDatos();
        }
        //for normal
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).mostrarDatos();
        }
        //iterator
        Iterator<Firewall> it = lista.iterator();
        while(it.hasNext()){
            it.next().mostrarDatos();
        }
    }
}
