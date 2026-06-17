package ejermotor.modelo;

public class Motor {
    private boolean estado;
    private int velocidad;

   // encender(), apagar(), ajustarVelocidad(int nuevaVelocidad) y     mostrarEstado()

    public void encender() throws Exception{
        if(!estado){
            estado = true;
            throw new Exception("El motor a sido encendido");
        }

        throw new Exception("El motor ya se encuentra encendido. ");

    }
    public void apagar(){
        if(estado){
            estado = false;
            velocidad=0;
            System.out.println("El motor a sido apagado ");
        }else{
            System.out.println("El motor ya esta apagado ");
        }
    }
    public void ajustarVelocidad(int nuevaVelocidad){
        if (nuevaVelocidad<0||nuevaVelocidad>100){
            System.out.println("El valor ingresado es invalido");
        }else{
            velocidad=nuevaVelocidad;
        }
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println("El motor esta encendido y la velocida es: " +velocidad);
        }else{
            System.out.println("El motor esta apagado");
        }
    }
}
