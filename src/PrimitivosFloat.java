import javax.lang.model.SourceVersion;

public class PrimitivosFloat {
    public static void main(String[] args) {
        //float realFloat = 2.12e3F;
        float realFloat = 1.5e-10F;
        System.out.println("realFloat = " + realFloat);
        System.out.println(" flat correspondiente en byte a = " + Float.BYTES);
        System.out.println(" flat correspondiente en bites a = " + Float.SIZE);
        System.out.println(" maximo valor para float = " + Float.MAX_VALUE);
        System.out.println(" minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println(" double correspondiente en byte a = " +Double.BYTES );
        System.out.println(" double correspondiente en bites a = " +Double.SIZE );
        System.out.println(" maximo valor para double = " +Double.MAX_VALUE );
        System.out.println(" minimo valor para double = " +Double.MIN_VALUE );

        float varFlotante = 3.1426F;
        System.out.println("varFlotante = " + varFlotante);

    }
}
