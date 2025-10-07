public class EjemploString {

    public static void main(String[] args) {
        String curso = "programacion JAVA";
        String curso2 = new String("programacion JAVA");

        boolean esIgual = curso == curso2;
        System.out.println(esIgual); // da false porque son dos objetos diferentes, no es lo mismo new que ""

        esIgual = curso.equals(curso2);
        System.out.println(esIgual); // da true porque tienen el mismo contenido. Compara el contenido no la referencia

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println(esIgual); // da true porque tienen el mismo contenido ignorando mayusculas y minusculas

        String curso3 = "programacion JAVA";
        esIgual = curso == curso3;
        System.out.println(esIgual); // da true porque son el mismo objeto en memoria. No se creo con new

        //Concatenar
        System.out.println("==========Ejemplos de concatenacion==========");

        String nuevoCurso = "Spring Framework ";
        String profesor = "John Doe";
        String detalle = nuevoCurso + "con " + profesor;
        System.out.println(detalle); // Spring Framework con John Doe

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + " " + (numeroA + numeroB)); // Spring Framework con John Doe 15. () suma los numeros
        System.out.println(detalle + " " + numeroA + numeroB); // Spring Framework con John Doe 105 (no suma los numeros, los concatena)

        System.out.println(numeroA + numeroB + " " + detalle); // 15 Spring Framework con John Doe (suma los numeros porque van antes de la cadena)

        String detalle2 = curso.concat(profesor); // concatena sin espacio
        System.out.println(detalle2); // programacion JAVAJohn Doe
        String detalle3 = curso.concat(" con ").concat(profesor); // concatena con espacio
        System.out.println(detalle3); // programacion JAVA con John Doe

    }
}
