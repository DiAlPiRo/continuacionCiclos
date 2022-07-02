public class cicloWhile {
    public static void main(String args[]) {
        boolean noHaTerminado = true;
        int numero = 1;
        while (noHaTerminado){
            System.out.println("numero: "+numero);
            numero = numero + 1;
            if (numero > 10){
                noHaTerminado = false;

            }
        }
    }
}
