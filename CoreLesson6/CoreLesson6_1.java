package CoreLesson6;

/*
    1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
    пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
    2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий: зарегистрироваться,
    зарегистрировать тестовое приложение для получения api ключа, найдите нужный endpoint и изучите документацию.
    Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед
    (этого достаточно для выполнения д/з).

    After setting your password, you will be able to log in at https://developer.accuweather.com/user in the future using:
    username: Ekaterina / lohay57612@topyte.com

    Once you are logged in, you can create an App and get your API Key using
    these basic instructions: http://developer.accuweather.com/getting-started

 */

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.IOException;

public class CoreLesson6_1 {

    public static void main(String[] args) throws IOException {
        //String apiKey = "Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi";
        // http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true
        // ответ проверила через онлайн curl, ответ приходит (200).

        // Вариант получения JSON через RestAssured

        // взяла из видеоурока, но у меня не запускается (ошибки в конце файла)
        // файрволл пропускает, есть подозрение, что не так настроила dependency (если создаю проект maven (pom),
        // то не вижу проекты java, при попытке их как-то объединить, слетают конфигурации java (запуск main)
        // okhttp и rest assured импортировала по методичке file -> project structure -> modules -> Dependencies -> '+'

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true");
        System.out.println(response.asPrettyString());
    }
}
/*
    C:\Users\Екатерина\.jdks\openjdk-18.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=60882:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Екатерина\IdeaProjects\Lessons\out\production\Lessons;C:\Users\Екатерина\IdeaProjects\lombok-1.18.24.jar;C:\Users\Екатерина\IdeaProjects\okhttp-4.9.3.jar;C:\Users\Екатерина\IdeaProjects\rest-assured-5.0.1.jar CoreLesson6.CoreLesson6_1
    Exception in thread "main" java.lang.NoClassDefFoundError: groovy/lang/GroovyObject
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1013)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:862)
        at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:760)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:681)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:639)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        at io.restassured.RestAssured.<clinit>(RestAssured.java:355)
        at CoreLesson6.CoreLesson6_1.main(CoreLesson6_1.java:40)
    Caused by: java.lang.ClassNotFoundException: groovy.lang.GroovyObject
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 11 more
 */


