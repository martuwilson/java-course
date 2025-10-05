import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaConsolaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //ingreso de datos
        System.out.println("Ingrese numero entero");
        String numeroString = scanner.nextLine();
        int numeroDecimal = 0;
        //System.out.println(numeroDecimal);

        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            System.out.println("Error: hay un error en el dato ingresado");
            main(args); // invocamos el main de forma directa para reiniciar nuevamente luego del error
            System.exit(0);
        }

        /*String mensajeDialogo = ("Numero ingresado fue: " + numeroDecimal);
        mensajeDialogo += "\ngracias por usar el dialogo";
        JOptionPane.showMessageDialog(null, mensajeDialogo);*/
    }

}
