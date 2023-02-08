package judgement_module;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 01/12/2022 - 12:17 PM
 */
public class SearchJudgement {

    @Test
    public void searchJudgement()
    {
        String jsonBody = "{\"RequestInfo\": {\n" +
                "        \"apiId\": \"string\",\n" +
                "        \"ver\": \"string\",\n" +
                "        \"ts\": 0,\n" +
                "        \"action\": \"string\",\n" +
                "        \"did\": \"string\",\n" +
                "        \"key\": \"string\",\n" +
                "        \"msgId\": \"string\",\n" +
                "        \"requesterId\": \"string\",\n" +
                "        \"authToken\": \"string\"\n" +
                "    }\n" +
                "}";

        Response response = given().contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .queryParam("caseId","CASE-2022-12-12-000105")
//                .queryParam("id","JUD-2022-12-12-000132")
                .post(PIRAMAL_BASE_URL+SEARCH_JUDGEMENT);

        response.getBody().prettyPrint();
    }

}
