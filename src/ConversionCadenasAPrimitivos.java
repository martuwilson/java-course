public class ConversionCadenasAPrimitivos {
    public static void main(String[] args) {
        String numeroString = "50";

        int numeroInt = Integer.parseInt(numeroString);
        System.out.println(numeroInt);

        String realString = "98765.43";
        double realDouble = Double.parseDouble(realString);
        System.out.println(realDouble);

        String logicoString = "true";
        boolean logicoBool = Boolean.parseBoolean(logicoString);
        System.out.println(logicoBool);
    }
}
