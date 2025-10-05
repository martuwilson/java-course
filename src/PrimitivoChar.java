public class PrimitivoChar {
    public static void main(String[] args) {
        char caracter = '\u0040'; //unicode table de @
        char decimal = 64;

        var decimal2 = 64;
        System.out.println(decimal2);
        System.out.println("Caracter: " + caracter);
        System.out.println("decimal: " + decimal);
        System.out.println("deciaml = caracter : " + (decimal == caracter));

        char simbolo = '@';
        System.out.println(simbolo);
    }
}
