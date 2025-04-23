import org.json.JSONObject;

public class Conversor {
    private final JSONObject tasas;

    public Conversor(JSONObject apiResponse) {
        this.tasas = apiResponse.getJSONObject("conversion_rates");
    }

    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        double tasaOrigen = tasas.getDouble(monedaOrigen);
        double tasaDestino = tasas.getDouble(monedaDestino);
        return (cantidad / tasaOrigen) * tasaDestino;
    }
}