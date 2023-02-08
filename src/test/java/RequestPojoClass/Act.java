package RequestPojoClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ajeet Vishwakarma
 * @Date 09/01/2023 - 6:29 PM
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class Act {

    @JsonProperty("actName")
    private String actName;

    @JsonProperty("sectionNumber")
    private String sectionNumber;

}
