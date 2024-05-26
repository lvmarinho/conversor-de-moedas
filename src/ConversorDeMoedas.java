import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorDeMoedas {
    private static final String URL_API = "https://api.exchangerate-api.com/v4/latest/";

    public static Moeda obterTaxaDeCambio(String moedaOrigem, String moedaDestino) throws Exception {
        String urlStr = URL_API + moedaOrigem;
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(new URI(urlStr))
                .build();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        JsonObject jsonResposta = JsonParser.parseString(resposta.body()).getAsJsonObject();

        double taxa = jsonResposta.getAsJsonObject("rates").get(moedaDestino).getAsDouble();
        return new Moeda(moedaDestino, taxa);
    }
}
