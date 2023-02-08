package RequestPojoClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Ajeet Vishwakarma
 * @Date 09/01/2023 - 6:35 PM
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class Petitioner {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("petitionerType")
    private String petitionerType;

    @JsonProperty("address")
    private String address;

    @JsonProperty("contactNumber")
    private String contactNumber;

    @JsonProperty("advocate")
    private PetitionerAdvocate petitionerAdvocate;


}
