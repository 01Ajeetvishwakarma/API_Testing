package iLMSActions.hearing;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 15/12/2022 - 3:56 PM
 */
public class CreateHearingActions {

    public static Response createHearing(String JsonPayload) {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(JsonPayload)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_HEARING)
                .then()
                .extract()
                .response();
        return response;
    }

    public static Response createHearingWithValidData(String caseId,String caseNumber) {

        String validHearingData = "{\n" +
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
                "    },\n" +
                "    \"hearingDetails\": {\n" +
                "        \"courtId\": \"55214365007\",\n" +
                "        \"caseId\": \""+caseId+"\",\n" +
                "        \"judgeName\": \"Avanish\",\n" +
                "        \"hearingDate\": 1669959086142,\n" +
                "        \"businessDate\": 1669959086142,\n" +
                "        \"hearingPurpose\": \"NOTHING\",\n" +
                "        \"requiredOfficer\": \"yes\",\n" +
                "        \"affidavitFilingDate\": 1669959086142,\n" +
                "        \"affidavitFilingDueDate\": 1669959086142,\n" +
                "        \"caseNumber\": \""+caseNumber+"\",\n" +
                "        \"oathNumber\": \"882143657890\",\n" +
                "        \"firstHearingDate\": 1669959086142,\n" +
                "        \"previousHearingDate\": 1669959086142,\n" +
                "        \"nextHearingDate\": 1669959086142,\n" +
                "        \"isPresenceRequired\": true,\n" +
                "        \"hearingType\": \"Noraml\",\n" +
                "        \"departmentOfficer\": \"yes\",\n" +
                "        \"remarks\": \"claimed\",\n" +
                "        \"additionalDetails\": null,\n" +
                "        \"respondent\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"DEV\",\n" +
                "                \"lastName\": \"Singh\",\n" +
                "                \"contactNumber\": \"234561789\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"petitioner\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"MAHARAJ\",\n" +
                "                \"lastName\": \"Singh\",\n" +
                "                \"contactNumber\": \"000009999\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"court\": {\n" +
                "            \"courtName\": \"DC003\",\n" +
                "            \"courtNumber\": \"0001\",\n" +
                "            \"district\": \"A001\",\n" +
                "            \"state\": \"MP\",\n" +
                "            \"bench\": \"SJB001\",\n" +
                "            \"division\": \"GWL001\"\n" +
                "        },\n" +
                "        \"payment\": {\n" +
                "            \"fineImposedDate\": 1669959086142,\n" +
                "            \"fineDueDate\": 1669959086142,\n" +
                "            \"fineAmount\": \"1000\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        return createHearing(validHearingData);
    }

}
