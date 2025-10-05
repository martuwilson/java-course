import javax.swing.*;

public class SistemasNumericosEntradaVentana {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "Ingrese numero entero");
        int numeroDecimal = 0;
        //System.out.println(numeroDecimal);

        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: hay un error en el dato ingresado");
            main(args); // invocamos el main de forma directa para reiniciar nuevamente luego del error
            System.exit(0);
        }

        String mensajeDialogo = ("Numero ingresado fue: " + numeroDecimal);
        mensajeDialogo += "\ngracias por usar el dialogo";
        JOptionPane.showMessageDialog(null, mensajeDialogo);
    }

}
