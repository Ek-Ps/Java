package CoreLesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class CoreLesson6_2 {
    public static void main(String[] args) throws IOException {
        // Вариант получения JSON через OkHttpClient
        // взяла из методички, но у меня не запускается (ошибки в конце файла)
        // файрволл пропускает, есть подозрение, что не так настроила dependency (если создаю проект maven,
        // то не вижу проекты java, при попытке их как-то объединить, слетают конфигурации java (запуск main)
        // okhttp и rest assured импортировала по методичке file -> project structure -> modules -> Dependencies -> '+'

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=Wd0awaiGsTkVlEF3Qs8V3TWOClW2SiYi&language=ru-ru&metric=true")
                .build();

        Response response = client.newCall(request).execute();

        String body = response.body().string();
        System.out.println(response.code());

    }
}

/*
    C:\Users\Екатерина\.jdks\openjdk-18.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=60876:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Екатерина\IdeaProjects\Lessons\out\production\Lessons;C:\Users\Екатерина\IdeaProjects\lombok-1.18.24.jar;C:\Users\Екатерина\IdeaProjects\okhttp-4.9.3.jar;C:\Users\Екатерина\IdeaProjects\rest-assured-5.0.1.jar CoreLesson6.CoreLesson6_2
    Exception in thread "main" java.lang.NoClassDefFoundError: kotlin/jvm/internal/markers/KMappedMarker
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1013)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:862)
        at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:760)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:681)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:639)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        at okhttp3.internal.Util.<clinit>(Util.kt:62)
        at okhttp3.OkHttpClient.<clinit>(OkHttpClient.kt:1073)
        at CoreLesson6.CoreLesson6_2.main(CoreLesson6_2.java:15)
    Caused by: java.lang.ClassNotFoundException: kotlin.jvm.internal.markers.KMappedMarker
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 12 more
 */



