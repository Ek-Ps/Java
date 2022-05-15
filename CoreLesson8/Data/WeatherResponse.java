package CoreLesson8.Data;

import CoreLesson7.Data.Date;
import CoreLesson7.Data.Night;
import CoreLesson7.Data.Temperature;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class WeatherResponse {

    @JsonProperty(value = "Date")
    private String date;

    @JsonProperty(value = "EpochDate")
    private String epochDate;

    @JsonProperty(value = "Temperature")
    private Temperature temperature;

    @JsonProperty(value = "Day")
    private Date day;

    @JsonProperty(value = "Night")
    private Night night;

    @JsonProperty(value = "Sources")
    private String[] sources;

    @JsonProperty(value = "MobileLink")
    private String mobileLink;

    @JsonProperty(value = "Link")
    private String link;
}
