import org.json.JSONObject;

public class ConversorApp {
    private final InterfazUsuario ui;
    private Conversor conversor;

    public ConversorApp() {
        this.ui = new InterfazUsuario();
    }

    public void iniciar() {
        try {
            cargarTasas();
            ejecutar();
        } catch (Exception e) {
            System.out.println("Error inicializando la aplicación: " + e.getMessage());
        } finally {
            ui.cerrar();
        }
    }

    private void cargarTasas() throws Exception {
        ApiClient apiClient = new ApiClient();
        JSONObject response = apiClient.obtenerTasasCambio();
        this.conversor = new Conversor(response);
    }

    private void ejecutar() {
        int opcion;
        do {
            ui.mostrarMenu();
            opcion = ui.obtenerOpcion();

            // Actualizar rango de opciones válidas
            if (opcion >= 1 && opcion <= 8) {  // Antes era hasta 6
                procesarOpcion(opcion);
            } else if (opcion != 9) {          // Salir ahora es 9
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);  // Condición actualizada
        System.out.println("¡Hasta luego!");
    }

    private void procesarOpcion(int opcion) {
        MapeadorConversion.Conversion conversion = MapeadorConversion.mapearOpcion(opcion);
        double cantidad = ui.obtenerCantidad();

        double resultado = conversor.convertir(
                cantidad,
                conversion.monedaOrigen(),
                conversion.monedaDestino()
        );

        ui.mostrarResultado(cantidad, conversion.monedaOrigen(), resultado, conversion.monedaDestino());
    }
}