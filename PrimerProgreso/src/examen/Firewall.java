package examen;

public class Firewall {
    private String regla;
    private int puerto;
    private boolean estado;
    private int intentosBloqueo;

    public Firewall(String regla, int puerto) {
        this.regla = regla;
        setPuerto(puerto);
    }

    public String getRegla() {
        return regla;
    }

    public int getPuerto() {
        return puerto;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getIntentosBloqueo() {
        return intentosBloqueo;
    }

    public void setRegla(String regla) {
        this.regla = regla;
    }

    public void setPuerto(int puerto) {
        if(puerto >= 1 && puerto <= 65535)
            this.puerto = puerto;
    }

    public void activar(){
        if(!estado)
            estado = true;
        else
            System.out.println("Regla ya se encuentra activa");
    }
    public void desactivar(){
        if(estado)
            estado = false;
        else
            System.out.println("La regla esta desactiva");
    }

    public void bloquearIntento(int puertoIntento){
        if(estado)
            if(puerto==puertoIntento)
                intentosBloqueo++;
            else
                System.out.println("El puerto no coincide");
        else
            System.out.println("La regla no esta activa");
    }
    public void mostrarDatos(){
        String estadoS = estado?"Activa":"Desactiva";
        System.out.println("Regla: "+regla);
        System.out.println("Estado: "+estadoS);
        System.out.println("Intentos Bloqueo: "+intentosBloqueo);
    }

}
