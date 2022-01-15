package restClient.dto;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import view.ClientApplication;

import java.io.IOException;

public class HotelServiceRestClient {
    public static final String URL = "http://localhost:8081/api";

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();
    ObjectMapper objectMapper = new ObjectMapper();

    public HotelDto getMovies() throws IOException {

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Request request = new Request.Builder()
                .url(URL + "/movie")
                .header("Authorization", "Bearer " + ClientApplication.getInstance().getToken())
                .get()
                .build();

        Call call = client.newCall(request);

        Response response = call.execute();

        if (response.code() == 200) {
            String json = response.body().string();

            return objectMapper.readValue(json, HotelDto.class);
        }

        throw new RuntimeException();
    }
}
