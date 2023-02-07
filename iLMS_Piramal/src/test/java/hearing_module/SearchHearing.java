package hearing_module;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import util.Base;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 30/11/2022 - 12:18 PM
 */
public class SearchHearing extends Base {
    static String authToken = "14d16228-4dd4-4e31-8701-3a5250bd7117";

    static String jsonPayload = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \""+authToken+"\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 98,\n" +
            "            \"uuid\": \"7f9eb8f9-d954-4f65-affc-13034318fd2a\",\n" +
            "            \"userName\": \"EMP_RO\",\n" +
            "            \"name\": \"Shreyash\",\n" +
            "            \"mobileNumber\": \"9045430375\",\n" +
            "            \"emailId\": \"shreyash.chaturvedi@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Reviewing Officer\",\n" +
            "                    \"code\": \"RO\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    }\n" +
            "}";

    @Test
    public static void searchHearingByHearingId() {
        Response response = given().contentType(ContentType.JSON)
                .body(jsonPayload)
                .when()
                .queryParam("id","HEARING-2022-12-12-000115")
                .post(PIRAMAL_BASE_URL+SEARCH_HEARING);
        response.prettyPrint();
    }

    @Test
    public static void searchHearingByCaseId() {
        Response response = given().contentType(ContentType.JSON)
                .body(jsonPayload)
                .when()
                .queryParam("caseId","CASE-2022-12-12-000133")
                .post(PIRAMAL_BASE_URL+SEARCH_HEARING);
        response.prettyPrint();

    }


    public static Response searchHearingCaseId(String caseId)
    {
        Response response = given().contentType(ContentType.JSON)
                .body(jsonPayload)
                .when()
                .queryParam("caseId",caseId)
                .post(PIRAMAL_BASE_URL+SEARCH_HEARING);

        return response;
    }
}
