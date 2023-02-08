package RequestPojoClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Ajeet Vishwakarma
 * @Date 09/01/2023 - 6:07 PM
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CaseRequestBodyDetails {

    @JsonProperty("RequestInfo")
    private RequestInfo requestInfo;

    @JsonProperty("case")
    private Case caseDetails;





}
