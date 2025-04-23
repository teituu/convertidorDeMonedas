import java.util.Scanner;
import java.text.DecimalFormat;

public class InterfazUsuario {
    private final Scanner scanner;
    private final DecimalFormat formateador;

    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
        this.formateador = new DecimalFormat("#,##0.00");
    }

    public void mostrarMenu() {
        System.out.println("*******************************************************");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileño");
        System.out.println("4) Real brasileño => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Dólar => Peso mexicano");
        System.out.println("8) Peso mexicano => Dólar");
        System.out.println("9) Salir");
        System.out.println("*******************************************************");
        System.out.print("Elija una opción válida: ");
    }

    public int obtenerOpcion() {
        return scanner.nextInt();
    }

    public double obtenerCantidad() {
        System.out.print("Ingrese la cantidad a convertir: ");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double cantidad, String monedaOrigen, double resultado, String monedaDestino) {
        System.out.println("\nResultado: " + formateador.format(cantidad) + " " + monedaOrigen +
                " = " + formateador.format(resultado) + " " + monedaDestino + "\n");
    }

    public void cerrar() {
        scanner.close();
    }
}