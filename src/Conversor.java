import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

public class Conversor {
    public Moeda converter(double valor, String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        String uri = "https://v6.exchangerate-api.com/v6/49edbfce5a09e3de91638aa7/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moeda.class);
    }
}