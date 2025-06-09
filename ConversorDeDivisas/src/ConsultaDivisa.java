import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    public Divisas buscaDivisa(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ed211dd2d8eee1847f3fd962/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}