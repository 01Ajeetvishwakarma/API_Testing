package judgement_module;

import iLMSActions.hearing.CreateHearingActions;
import iLMSActions.judgement.createJudgementActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import iLMSActions.casemodule.CreateCaseActions;

import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;



/**
 * @author Ajeet Vishwakarma
 * @created 01/12/2022 - 12:17 PM
 */
public class CreateJudgement {




    @Test
    public void createJudgementByCaseId(){
        String jsonBody = "{\n" +
                "   \"RequestInfo\": {\n" +
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
                "    \"judgement\": {\n" +
                "        \"caseId\": \"CASE-2022-12-12-000149\",\n" +
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

        Response response = given().contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_JUDGEMENT);

        response.getBody().prettyPrint();

    }

    @Test()
    public static void createJudgementWithValidDetails() {
        Response createResponse = CreateCaseActions.createParentCaseWithValidData();

        String caseId = createResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");

        CreateHearingActions.createHearingWithValidData(caseId,caseNumber);

        Response judgementResponse = createJudgementActions.createJudgementWithValidData(caseId);
        judgementResponse.getBody().prettyPrint();
    }


}
