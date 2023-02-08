package case_module;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 01/12/2022 - 12:17 PM
 */
public class CaseSearch {

    /*@BeforeClass
    public void setUp(){
        RestAssured.baseURI="http://14.97.12.97/ilms-services";
        RestAssured.basePath="/case";
    }*/

    static String bodyPayload = "{\n" +
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


    public Response caseSearchByCaseId(String id)
    {
        Response response = given().contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("id", id)
                .post(PIRAMAL_BASE_URL+SEARCH_CASE)
                ;
        return response;
    }

    public static Response caseSearchByCaseNumber(String caseNumber)
    {
        Response response = given().contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("caseNumber",caseNumber)
                .post(PIRAMAL_BASE_URL+SEARCH_CASE);
        return response;
    }

    public Response caseSearchByCnrNumber(String cnrNumber)
    {
        Response response = given().contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("cnrNumber",cnrNumber)
                .post(PIRAMAL_BASE_URL+SEARCH_CASE);
        return response;
    }

    public Response caseSearch(String id,String cnrNumber,String caseNumber)
    {
        Response response = given().contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("id",id)
                .queryParam("cnrNumber",cnrNumber)
                .queryParam("caseNumber",caseNumber)
                .post(PIRAMAL_BASE_URL+SEARCH_CASE);
        return response;
    }

    @Test
    public void caseSearchByCaseNo()
    {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("caseNumber","ILMS-CASE-03")
                .post(PIRAMAL_BASE_URL+SEARCH_CASE);
        response.getBody().prettyPrint();
    }

}
