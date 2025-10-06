import java.util.Scanner;

public class FacturaCompra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // ingreso de pantalla para datos

        double totalCompra = 0;

        System.out.println("Cuantos productos desea ingresar?");
        int cantidadProductos = scan.nextInt();
        scan.nextLine(); // limpiar el buffer

        System.out.println("\n===INGRESO DE PRODUCTOS===");

        for (int i = 1; i <= cantidadProductos; i++){
            System.out.println("\nProducto: " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = scan.nextInt();

            System.out.print("Precio unitario: ");
            double precio = scan.nextDouble();

            scan.nextLine(); //limpiar buffer

            double totalProducto = cantidad * precio;
            totalCompra += totalProducto;

            System.out.printf("Total de %s: $%.2f%n", nombre, totalProducto);
        }

        System.out.println("\b======================");
        System.out.printf("TOTAL GENERAL DE LA COMPRA: $%.2f%n", totalCompra);
        System.out.println("=======================");
    }
}
