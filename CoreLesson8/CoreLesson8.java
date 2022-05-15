package CoreLesson8;

import CoreLesson8.Data.Parser;
import CoreLesson8.Data.SQLConnect;
import CoreLesson8.Data.WeatherResponse;

/*
    1. Добавить поддержку SQLite в проект.
    2. Создать класс-репозиторий, отвечающий за взаимодействие с базой данных.
    3. Организовать запись данных в базу при каждом успешном API запросе. Формат - String city, String localDate, String weatherText, Double temperature.
    4. Организовать чтение из базы всех данных по пункту меню
    5. Учесть, что соединение всегда нужно закрывать
*/
public class CoreLesson8 {

    public static void main(String[] args) {

        SQLConnect sqlConnect = new SQLConnect();
        Parser parseResponse = new Parser();

        for (WeatherResponse dailyForecast : parseResponse.getDailyWeather()) {
            sqlConnect.insertValue("St. Petersburg",
            dailyForecast.getDate(),
            dailyForecast.getDay().getIconPhrase(),
            Double.parseDouble(dailyForecast.getTemperature().getMinimum().getValue()));
        }

        System.out.println(sqlConnect.getValue("localDate", "temperature", 11.0));

    }
}
