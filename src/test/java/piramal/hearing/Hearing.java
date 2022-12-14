package piramal.hearing;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static constants.Endpoints.CREATE_HEARING;
import static constants.Endpoints.PIRAMAL_BASE_URL;
import static hearing_module.CreateHearing.createHearingWithValidData;
import static io.restassured.RestAssured.given;
import static piramal.casemodule.CreateCaseActions.createParentCaseWithValidData;

/**
 * @author Ajeet Vishwakarma
 * @created 06/12/2022 - 7:39 PM
 */
public class Hearing {

    @Test
    public void createHearing()
    {
        String JsonPayload = "{\n" +
                "    \"RequestInfo\": {\n" +
                "        \"apiId\": \"\",\n" +
                "        \"ver\": \"\",\n" +
                "        \"ts\": null,\n" +
                "        \"resMsgId\": \"uief87324\",\n" +
                "        \"msgId\": \"\",\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"userInfo\": {\n" +
                "            \"userName\": \"Avanish\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"hearingDetails\": {\n" +
                "        \"courtId\": \"55214365007\",\n" +
                "        \"caseId\": \"CASE-2022-12-12-000315\",\n" +
                "        \"judgeName\": \"JUDGE\",\n" +
                "        \"hearingDate\": 1669959086142,\n" +
                "        \"businessDate\": 1669959086142,\n" +
                "        \"hearingPurpose\": \"NOTHING\",\n" +
                "        \"requiredOfficer\": \"yes\",\n" +
                "        \"affidavitFilingDate\": 1669959086142,\n" +
                "        \"affidavitFilingDueDate\": 1669959086142,\n" +
                "        \"caseNumber\": \"ILMS-CASE-99630\",\n" +
                "        \"oathNumber\": \"882143657890\",\n" +
                "        \"firstHearingDate\": 1669959086142,\n" +
                "        \"previousHearingDate\": null,\n" +
                "        \"nextHearingDate\": 1669959086142,\n" +
                "        \"isPresenceRequired\": true,\n" +
                "        \"hearingType\": \"Noraml\",\n" +
                "        \"departmentOfficer\": \"yes\",\n" +
                "        \"remarks\": \"claimed\",\n" +
                "        \"additionalDetails\": null,\n" +
                "        \"respondent\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"Suraj\",\n" +
                "                \"lastName\": \"Singh\",\n" +
                "                \"contactNumber\": \"9823456178\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"petitioner\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"Chandra\",\n" +
                "                \"lastName\": \"Singh\",\n" +
                "                \"contactNumber\": \"098769999\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"court\": {\n" +
                "            \"courtName\": \"DC003\",\n" +
                "            \"courtNumber\": \"0001\",\n" +
                "            \"district\": \"A001\",\n" +
                "            \"state\": \"MP\",\n" +
                "            \"bench\": \"SJB001\",\n" +
                "            \"division\": \"GWL001\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(JsonPayload)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_HEARING)
                .then()
                .extract()
                .response();

        response.getBody().prettyPrint();
    }


    @Test
    public void createCaseAndHearing()
    {
        Response createResponse = createParentCaseWithValidData();
        String caseId = createResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");

        Response createHearingResponse = createHearingWithValidData(caseId,caseNumber);
        createHearingResponse.getBody().prettyPrint();

    }


}
