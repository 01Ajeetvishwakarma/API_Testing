package hearing_module;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import iLMSActions.casemodule.CreateCaseActions;

import static constants.Endpoints.CREATE_HEARING;
import static constants.Endpoints.PIRAMAL_BASE_URL;
import static io.restassured.RestAssured.given;
import static iLMSActions.hearing.CreateHearingActions.createHearingWithValidData;


/**
 * @author Ajeet Vishwakarma
 * @created 29/11/2022 - 6:42 PM
 */
public class CreateHearing {

//    public static Response createHearing(String caseId,String caseNumber) {
//
//        String payload = "{\n" +
//                "    \"RequestInfo\": {\n" +
//                "        \"apiId\": \"\",\n" +
//                "        \"ver\": \"\",\n" +
//                "        \"ts\": \"\",\n" +
//                "        \"resMsgId\": \"uief87324\",\n" +
//                "        \"msgId\": \"\",\n" +
//                "        \"status\": \"ACTIVE\",\n" +
//                "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
//                "        \"userInfo\": {\n" +
//                "            \"id\": 97,\n" +
//                "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
//                "            \"userName\": \"EMP_DEC\",\n" +
//                "            \"name\": \"Rishav Johari\",\n" +
//                "            \"mobileNumber\": \"8057353933\",\n" +
//                "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
//                "            \"locale\": null,\n" +
//                "            \"type\": \"EMPLOYEE\",\n" +
//                "            \"roles\": [\n" +
//                "                {\n" +
//                "                    \"name\": \"Data Entry Cell\",\n" +
//                "                    \"code\": \"DEC\",\n" +
//                "                    \"tenantId\": \"mp\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"name\": \"Employee\",\n" +
//                "                    \"code\": \"EMPLOYEE\",\n" +
//                "                    \"tenantId\": \"mp\"\n" +
//                "                }\n" +
//                "            ],\n" +
//                "            \"active\": true,\n" +
//                "            \"tenantId\": \"mp\",\n" +
//                "            \"permanentCity\": null\n" +
//                "        }\n" +
//                "    },\n" +
//                "    \"hearingDetails\": {\n" +
//                "        \"courtId\": \"55214365007\",\n" +
//                "        \"caseId\": \""+caseId+"\",\n" +
//                "        \"judgeName\": \"Avanish\",\n" +
//                "        \"hearingDate\": 1669959086142,\n" +
//                "        \"businessDate\": 1669959086142,\n" +
//                "        \"hearingPurpose\": \"NOTHING\",\n" +
//                "        \"requiredOfficer\": \"yes\",\n" +
//                "        \"affidavitFilingDate\": 1669959086142,\n" +
//                "        \"affidavitFilingDueDate\": 1669959086142,\n" +
//                "        \"caseNumber\": \""+caseNumber+"\",\n" +
//                "        \"oathNumber\": \"882143657890\",\n" +
//                "        \"firstHearingDate\": 1669959086142,\n" +
//                "        \"previousHearingDate\": 1669959086142,\n" +
//                "        \"nextHearingDate\": 1669959086142,\n" +
//                "        \"isPresenceRequired\": true,\n" +
//                "        \"hearingType\": \"Noraml\",\n" +
//                "        \"departmentOfficer\": \"yes\",\n" +
//                "        \"remarks\": \"claimed\",\n" +
//                "        \"additionalDetails\": null,\n" +
//                "        \"respondent\": {\n" +
//                "            \"advocate\": {\n" +
//                "                \"firstName\": \"DEV\",\n" +
//                "                \"lastName\": \"Singh\",\n" +
//                "                \"contactNumber\": \"234561789\"\n" +
//                "            }\n" +
//                "        },\n" +
//                "        \"petitioner\": {\n" +
//                "            \"advocate\": {\n" +
//                "                \"firstName\": \"MAHARAJ\",\n" +
//                "                \"lastName\": \"Singh\",\n" +
//                "                \"contactNumber\": \"000009999\"\n" +
//                "            }\n" +
//                "        },\n" +
//                "        \"court\": {\n" +
//                "            \"courtName\": \"DC003\",\n" +
//                "            \"courtNumber\": \"0001\",\n" +
//                "            \"district\": \"A001\",\n" +
//                "            \"state\": \"MP\",\n" +
//                "            \"bench\": \"SJB001\",\n" +
//                "            \"division\": \"GWL001\"\n" +
//                "        },\n" +
//                "        \"payment\": {\n" +
//                "            \"fineImposedDate\": 1669959086142,\n" +
//                "            \"fineDueDate\": 1669959086142,\n" +
//                "            \"fineAmount\": \"1000\"\n" +
//                "        }\n" +
//                "    }\n" +
//                "}";
//
//        Response response = given()
//                .contentType(ContentType.JSON)
//                .body(payload)
//                .when()
//                .post(PIRAMAL_BASE_URL+CREATE_HEARING);
//
//        return response;
//    }


    @Test()
    public void createValidHearing() {
        Response createResponse = CreateCaseActions.createParentCaseWithValidData();

        String CaseId = createResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");

        Response hearingResponse = createHearingWithValidData(CaseId,caseNumber);
        hearingResponse.getBody().prettyPrint();
    }


    @Test
    public void createCaseAndHearing()
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

}
