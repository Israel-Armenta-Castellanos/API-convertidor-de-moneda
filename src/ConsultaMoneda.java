import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Monedas convertirMoneda () {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8cf09531bb3ebb6205fac9ee/latest/USD");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            Monedas monedas = gson.fromJson(conversionRates, Monedas.class);
            return monedas;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
