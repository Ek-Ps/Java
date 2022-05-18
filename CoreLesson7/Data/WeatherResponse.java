package CoreLesson7.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
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
        private String [] sources;

        @JsonProperty(value = "MobileLink")
        private String mobileLink;

        @JsonProperty(value = "Link")
        private String link;
}
