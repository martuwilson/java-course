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
    }
}
