package ejerproducto.negocio;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio,int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto(){
    /*
    se puede dejar vacio o
    1. colocar los valores por defecto de Java de forma expresa
    2. colocar valores personalizados por defecto
     */
    }
    /*
    metodos get()
    siempre hay tipo de retorno, generalmente es del mismo tipo del atributos
    no reciben parámetros
    va a sacar los atributos
     */

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }
    /*
    metodos set (asignar valor-reemplazar)
    generalmente es void
    siempre recibe parámetro -> generalmente será del mismo tipo del atributo
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /*
    modificar de void a boolean para avisar si fue posible o no
    el cambio
     */
    public boolean setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
            return true;
        }
        return false;
    }

    public void setStock(int stock){
        if (stock < 0 )
        stock = 0;
        this.stock = stock;

    }



    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nPrecio : $"+precio+"\nStock: "+stock;
    }


}
