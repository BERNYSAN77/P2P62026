package ejermotor.interfaz;

import ejermotor.modelo.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.mostrarEstado();
        motor1.encender();
        motor1.encender();
        motor1.ajustarVelocidad(60);
        motor1.mostrarEstado();
        motor1.ajustarVelocidad(160);
        motor1.apagar();
        motor1.ajustarVelocidad(96);
        motor1.encender();
        motor1.mostrarEstado();
    }
}