package iLMSActions.judgement;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 06/12/2022 - 7:52 PM
 */
public class createJudgementActions {

    public static Response createJudgement(String JsonPayload) {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(JsonPayload)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_JUDGEMENT)
                .then()
                .extract()
                .response();
        return response;
    }

    public static Response createJudgementWithValidData(String caseId) {

        String validHearingData = "{\n" +
                "    \"RequestInfo\": {\n" +
                "        \"apiId\": \"\",\n" +
                "        \"ver\": \"\",\n" +
                "        \"ts\": \"\",\n" +
                "        \"resMsgId\": \"uief87324\",\n" +
                "        \"msgId\": \"\",\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"authToken\": \"47f46ba8-84c8-4eac-8d0c-54161182e560\",\n" +
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
                "    \"judgement\": {\n" +
                "        \"caseId\": \""+caseId+"\",\n" +
                "        \"orderType\": \"INTO001\",\n" +
                "        \"orderDate\": 1669959086142,\n" +
                "        \"decisionStatus\": \"false\",\n" +
                "        \"complianceDate\": 1669959086142,\n" +
                "        \"revisedComplianceDate\": 1669959086142,\n" +
                "        \"orderNoOverride\": \"2022\",\n" +
                "        \"revisedComplainceReason\": \"NewJudgement\",\n" +
                "        \"complianceStatus\": \"COMP-CMPL\",\n" +
                "        \"remarks\": 20221114\n" +
                "    }\n" +
                "}";

        return createJudgement(validHearingData);
    }

}
