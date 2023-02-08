package case_module;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 01/12/2022 - 12:16 PM
 */
public class CaseUpdate {

    @Test
    public void caseUpdate()
    {
        RestAssured.baseURI="http://14.97.12.97/ilms-services";
        RestAssured.basePath="/case";

        String bodyPayload = "{\n" +
                "    \"RequestInfo\": {\n" +
                "        \"apiId\": \"\",\n" +
                "        \"ver\": \"\",\n" +
                "        \"ts\": null,\n" +
                "        \"resMsgId\": \"uief87324\",\n" +
                "        \"msgId\": \"\",\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"userInfo\": {\n" +
                "            \"userName\": \"Vaibhav\"\n" +
                "        }\n" +
                "    },\n" +
                "   \n" +
                "    \"ilmsCase\": {\n" +
                "        \"tenantId\": \"pb\",\n" +
                "        \"caseNumber\": \"case0000004\",\n" +
                "        \"cnrNumber\": \"cnr0000004\",\n" +
                "        \"parentCaseNumber\": \"dcfvgh\",\n" +
                "        \"isParentCase\": false,\n" +
                "        \"caseType\": \"normal\",\n" +
                "        \"caseCategory\": \"robery\",\n" +
                "        \"caseYear\": 2022,\n" +
                "        \"filingNumber\": \"asdfgh\",\n" +
                "        \"filingDate\": 1669887369473,\n" +
                "        \"registrationDate\": 1669887369473,\n" +
                "        \"caseSummary\": \"Murder\",\n" +
                "        \"arisingDetails\": \"nothing\",\n" +
                "        \"policyOrNonPolicyMatter\": \"no\",\n" +
                "        \"applicationNo\": \"case123\",\n" +
                "        \"isCaseNumberCorrect\": true,\n" +
                "        \"caseStatus\": \"ongoing\",\n" +
                "        \"firstHearingDate\": 1669887369473,\n" +
                "        \"previousHearingDate\": 1669887369473,\n" +
                "        \"nextHearingDate\": 1669887369473,\n" +
                "        \"caseStage\": \"Registerd\",\n" +
                "        \"caseSubStage\": \"yes\",\n" +
                "        \"caseFlag\": \"case\",\n" +
                "        \"departmentName\": \"education\",\n" +
                "        \"recommendOic\": \"IOC\",\n" +
                "        \"remarks\": \"nothing\",\n" +
                "        \"assignedOfficerId\": \"1\",\n" +
                "        \"additionalDetails\": null,\n" +
                "         \"documents\": [\n" +
                "            {\n" +
                "                \"documentType\":\"Aadhaar\",\n" +
                "                \"fileStoreId\":\"sdfgh\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"documentType\":\"PAN\",\n" +
                "                \"fileStoreId\":\"dfgh\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"act\": {\n" +
                "            \"actName\": \"Test act\",\n" +
                "            \"sectionNumber\": \"777\"\n" +
                "        },\n" +
                "        \"respondent\": {\n" +
                "            \"firstName\": \"shiva\",\n" +
                "            \"lastName\": \"amoria\",\n" +
                "            \"gender\": \"female\",\n" +
                "            \"departmentName\": \"asdf\",\n" +
                "            \"contactNumber\": \"234567\",\n" +
                "            \"address\": \"Agra\",\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"vaibhav\",\n" +
                "                \"lastName\": \"jain\",\n" +
                "                \"contactNumber\": \"7654wq\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"petitioner\": {\n" +
                "            \"firstName\": \"avanish\",\n" +
                "            \"lastName\": \"singh\",\n" +
                "            \"gender\": \"male\",\n" +
                "            \"petitionerType\": \"retirement\",\n" +
                "            \"address\": \"agra\",\n" +
                "            \"contactNumber\": \"sdf\",\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"manmohan\",\n" +
                "                \"lastName\": \"singh\",\n" +
                "                \"contactNumber\": \"fcvgbh\"\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "}";

        given().contentType(ContentType.JSON)
                .body(bodyPayload)
                .when()
                .queryParam("id","CASE-2022-12-01-002093")
                .post(PIRAMAL_BASE_URL+UPDATE_CASE)
                .then()
                .log().body();
    }

}
