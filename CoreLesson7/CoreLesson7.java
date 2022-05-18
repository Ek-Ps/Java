package CoreLesson7;
/*
    1. Реализовать корректный вывод информации о текущей погоде. Создать класс WeatherResponse и десериализовать ответ сервера.
    Выводить пользователю только текстовое описание погоды и температуру в градусах Цельсия.

    2. Реализовать корректный выход из программы

    3. Реализовать вывод погоды на следующие 5 дней в формате
    | В городе CITY на дату DATE ожидается WEATHER_TEXT, температура - TEMPERATURE |
    где CITY, DATE, WEATHER_TEXT и TEMPERATURE - уникальные значения для каждого дня.
*/

import CoreLesson7.Data.WeatherResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CoreLesson7 {

    public static void main(String[] args) throws IOException {
        //String apiKey = "Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi";
        // http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true
        // в настройках accuweather уже выставлен город Санкт-Петербург и температура в градусах Цельсия

        // Получаем json через restassured
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true");
        System.out.println(response.asPrettyString());
        System.out.println("\n-------------------------------------------------------------------------------\n");

        // Обработка Json
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

        for (WeatherResponse weatherResponse : weatherResponseArrayList) {
            System.out.println("Санкт-Петербург: " + weatherResponse.getDate()
                    + ", " + weatherResponse.getDay().getIconPhrase() + ", " //IconPhrase - это описание погоды на день
                    // долго искала, как вывести в правильной кодировке. Оказалось json приходит в 1251.
                    // как преобразовать кодировку json из 1251 в utf-8 для вывода в консоль?

                    // если сохранить кодировку win-1251, то в консоли всё выводится верно,
                        // (File->Settings->Editor->File encoding) в intellij idea -> поставила всё по default 1251
                        // в правом нижнем углу возле branch -> тоже выставила windows-1251

                    // но, когда я отправляю это всё на gitHub, русская кодировка теряется. Нужен UTF-8
                    // как с этим работать правильно?
					
                    + " дневной минимум температуры " + weatherResponse.getTemperature().getMinimum().getValue()
                    + ", дневной максимум температуры " + weatherResponse.getTemperature().getMaximum().getValue()
                    + " градусов Цельсия");
        }
    }
}
