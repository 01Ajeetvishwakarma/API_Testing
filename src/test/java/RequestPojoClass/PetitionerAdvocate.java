package RequestPojoClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ajeet Vishwakarma
 * @Date 09/01/2023 - 6:37 PM
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class PetitionerAdvocate {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("contactNumber")
    private String contactNumber;

}
