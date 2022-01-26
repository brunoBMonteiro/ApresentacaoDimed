import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientStatus {
          // The example creates a GET request to the webcode.me website and retrives an http response.
    public static void main(String[] args) throws IOException, InterruptedException {

        // Request

        HttpRequest request = HttpRequest.newBuilder()
                //  https://www.panvel.com/
                .uri(URI.create("http://webcode.me"))
                .GET() // GET is default
                .build();


           // Response
        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<Void> response = client.send  (request,HttpResponse.BodyHandlers.discarding());
        System.out.println(response.statusCode());

    }
}