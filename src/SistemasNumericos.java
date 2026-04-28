import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {



        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un número entero");
        int numeroDecimal = 0;
        try {
        numeroDecimal = Integer.parseInt(numeroStr);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"ocurrio un error, solo valores numericos");
            main(args);
            System.exit(0);
        }

        String numeroBi = "numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(numeroBi);


        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(numeroOctal);


        String numeroHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(numeroHexadecimal);


        String mensaje = numeroBi;
        mensaje += "\n" + numeroOctal;
        mensaje += "\n" + numeroHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
