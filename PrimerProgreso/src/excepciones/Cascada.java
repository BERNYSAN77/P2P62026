package excepciones;

public class Cascada {
    public static void main(String[] args) {
       try{
           a(58);
       }catch(Exception ex){
           ex.printStackTrace();
       }
        System.out.println("Salió");
    }
    public static void a(int num) throws Exception{
        b(num);
    }
    public static void b(int num) throws Exception{
        c(num);
    }
    public static void c(int num) throws Exception{
        if(num < 100){
            throw new Exception("saldo insuficiente");
        }
    }
}
