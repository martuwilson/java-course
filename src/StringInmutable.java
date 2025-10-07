public class StringInmutable {
    public static void main(String[] args) {
        // Las cadenas de texto en Java son inmutables, es decir, no se pueden modificar una vez creadas.
        String curso = "programacion JAVA";
        String profresor = "John Doe";
        curso.concat(" con Spring Framework"); // concatena pero no modifica la cadena original
        System.out.println(curso); // sigue siendo "programacion JAVA"

        //Como debe ser: 
        String nuevoCurso = curso.concat(" con Spring Framework");
        System.out.println(nuevoCurso); // ahora es "programacion JAVA con Spring Framework"

        System.out.println(curso == nuevoCurso); // false, son dos objetos diferentes en memoria

        // TRANSFORM
        curso.transform(c ->{ //c es la cadena original. Es el nombre que le damos a la cadena original dentro del lambda
            return c + " con " + profresor;
        });

        System.out.println(curso); // sigue siendo "programacion JAVA" porque no se modifico la cadena original

        //como se modificaria con transform:
        String nuevoCurso2 = curso.transform(c ->{
            return c + " con " + profresor;
        });
        System.out.println(nuevoCurso2); // ahora es "programacion JAVA con John Doe"

        //Replace

        //como NO se modifica la cadena original
        curso.replace("JAVA", "JavaScript");
        System.out.println(curso); // sigue siendo programacion JAVA

        //como SI se modifica la cadena original
        String cursoReemplazado = curso.replace("JAVA", "JavaScript");
        System.out.println(cursoReemplazado); // programacion JavaScript
        System.out.println(curso); // sigue siendo programacion JAVA
    }
}
