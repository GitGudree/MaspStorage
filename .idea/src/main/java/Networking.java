import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class Networking {
    private static final Logger logger = Logger.getLogger(Networking.class.getName());


    public void makeRequest() {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.com/"))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            logger.info("code:" + response.statusCode());
        } catch (IOException | InterruptedException e) {
            logger.warning(e.getMessage());
        }

    }
}
