public class VariablesPrimitivas {
    public static void main(String[] args) {
    // Enteros
        // “Uso byte si quiero ahorrar espacio; uso int si quiero olvidarme del límite.”

        byte numeroByte = 7; //maximo valor -128 a 127 almacenables en 8bits
        System.out.println("Numero byte: " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32676;
        System.out.println("Numero short: " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 326788;
        System.out.println("Numero int: " + numeroInt);
        System.out.println("Tipo Integer corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo Integer corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un Integer: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Integer: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L; //puede usarse L en minuscula pero puede verse como un 1 y da confusion
        System.out.println("Numero Long: "+ numeroLong);
        System.out.println("Tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);

        //Puede usarse var tambien pero:
        //Lo que hace el compilador es inferir el tipo automáticamente según el valor que le asignes.
        //Es decir, “var” se convierte en un tipo fijo en tiempo de compilación.
        //Después de eso, ya no cambia nunca más. Ej: Si var numero fue un int al inicio, no puede pasar a ser long ni double después.

        //CUANDO USARLO?
        //1- Para Evitar escribir tipos largos o repetitivos: var lista = new ArrayList<String>(); en lugar de ==> ArrayList<String> lista = new ArrayList<String>();
        //2- Cuando el tipo es obvio por el contexto.var nombre = "Martín"; se entiende que es String

    }
}
