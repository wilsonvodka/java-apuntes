import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");

        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
        numeroDecimal = scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println("ocurrio un error, solo valores numericos");
            main(args);
            System.exit(0);
        }

        String numeroBi = "numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);



        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);



        String numeroHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);



        String mensaje = numeroBi;
        mensaje += "\n" + numeroOctal;
        mensaje += "\n" + numeroHexadecimal;

        System.out.println(mensaje);

    }
}
