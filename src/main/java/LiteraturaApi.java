import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LiteraturaApi {
     String uid = "*****"; //meu usuarioId
     String tokenid = "********"; //minha tokenId
//    private String term;

    LiteraturaDto literaturaDto = new LiteraturaDto();

    public LiteraturaDto getTerm(String term) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.stands4.com/services/v2/literature.php?uid=" + uid + "&tokenid="+ tokenid + "&term=" + term + "&format=json"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            literaturaDto = mapper.readValue(response.body(), LiteraturaDto.class);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return literaturaDto;
    }







}
