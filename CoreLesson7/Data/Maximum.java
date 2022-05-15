package CoreLesson7.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Maximum {

    @JsonProperty(value = "Value")
    private String value;

    @JsonProperty(value = "Unit")
    private String unit;

    @JsonProperty(value = "UnitType")
    private String unitType;

}