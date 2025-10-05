public class PrimitivosFloat {

    static float varFlotante = 45.45f;

    public static void main(String[] args) {
        float realFloat = 2120; //float al entero lo devuelvo como 2120.0
        System.out.println(realFloat);

        float realFloatconExponencial = 2.12e3f; //e podria considerarse espacioas a la derecha osea este caso es e3, osea tres a la derecha si fuese e-3 son a la izquierda
        System.out.println(realFloatconExponencial);

        //constantes del float
        System.out.println("realFloat: " + realFloat);
        System.out.println("corresponde en byte a: " + Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        double realDouble = 3.4028235e38;

        System.out.println("varFlotante: " + varFlotante);
    }
}
