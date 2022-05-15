package CoreLesson7.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter

public class Date {
    @JsonProperty(value = "Icon")
    private int icon;
	
    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;
	
    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;

     public Date(int icon, String iconPhrase, boolean hasPrecipitation) {
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
    }
}
