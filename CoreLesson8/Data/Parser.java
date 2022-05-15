package CoreLesson8.Data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Parser {
    private Response response;

    public void ParseResponse() {
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true");
        System.out.println(response);
    }

    @SneakyThrows
    public List<WeatherResponse> getDailyWeather() {
        ObjectMapper objectMapper = new ObjectMapper();


            JsonNode jsonNode = objectMapper
                    .readTree(response.asPrettyString())
                    .at("/DailyForecasts");

        List<WeatherResponse> weatherResponseArrayList = new ArrayList<>();

        if (jsonNode.isArray()) {
            for (JsonNode arrayItem : jsonNode) {
                weatherResponseArrayList.add(objectMapper.convertValue(arrayItem, WeatherResponse.class));
            }
        }
        return weatherResponseArrayList;
    }
}
