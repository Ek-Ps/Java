package CoreLesson8;

import CoreLesson8.Data.Parser;
import CoreLesson8.Data.SQLConnect;
import CoreLesson8.Data.WeatherResponse;

/*
    1. �������� ��������� SQLite � ������.
    2. ������� �����-�����������, ���������� �� �������������� � ����� ������.
    3. ������������ ������ ������ � ���� ��� ������ �������� API �������. ������ - String city, String localDate, String weatherText, Double temperature.
    4. ������������ ������ �� ���� ���� ������ �� ������ ����
    5. ������, ��� ���������� ������ ����� ���������
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
