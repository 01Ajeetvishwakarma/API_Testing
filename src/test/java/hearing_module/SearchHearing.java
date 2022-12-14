package hearing_module;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 30/11/2022 - 12:18 PM
 */
public class SearchHearing {

    static String jsonPayload = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
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

    @BeforeClass
    public void setUp()
    {
        RestAssured.baseURI="http://14.97.12.97/ilms-services";
        RestAssured.basePath= "/hearing";
    }

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
