public class MapeadorConversion {
    public static Conversion mapearOpcion(int opcion) {
        return switch (opcion) {
            case 1 -> new Conversion("USD", "ARS");
            case 2 -> new Conversion("ARS", "USD");
            case 3 -> new Conversion("USD", "BRL");
            case 4 -> new Conversion("BRL", "USD");
            case 5 -> new Conversion("USD", "COP");
            case 6 -> new Conversion("COP", "USD");
            case 7 -> new Conversion("USD", "MXN");
            case 8 -> new Conversion("MXN", "USD");
            default -> throw new IllegalArgumentException("Opción inválida");
        };
    }

    public record Conversion(String monedaOrigen, String monedaDestino) {}
}