public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter= " + (decimal == caracter));
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter= " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char cosrresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char cosrresponde en bites = " + Character.SIZE);
        System.out.println("caracter min_value" + Character.MIN_VALUE);
        System.out.println("caracter max_value" + Character.MAX_VALUE);
    }
}
