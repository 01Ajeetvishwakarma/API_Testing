package hearing_module;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 30/11/2022 - 2:33 PM
 */
public class UpdateHearing {

    @Test
    public void updateHearing() {

        RestAssured.baseURI = "http://14.97.12.97/ilms-services/hearing/_create";

        String payload = "{\n" +
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
                "    \"hearingDetails\": {\n" +
                "        \"courtId\": \"001\",\n" +
                "        \"caseId\": \"CASE-2022-11-28-000001\",\n" +
                "        \"judgeName\": \"sudipta\",\n" +
                "        \"hearingDate\": 1234567890,\n" +
                "        \"businessDate\": 123456789,\n" +
                "        \"hearingPurpose\": \"Claim\",\n" +
                "        \"requiredOfficer\": \"sdfgh654\",\n" +
                "        \"affidavitFilingDate\": 1234567890,\n" +
                "        \"affidavitFilingDueDate\": 123456789,\n" +
                "        \"cnrNumber\": \"cnr1\",\n" +
                "        \"oathNumber\": \"882143657890\",\n" +
                "        \"firstHearingDate\": \"992134657809\",\n" +
                "        \"previousHearingDate\": null,\n" +
                "        \"nextHearingDate\": 1112143658790,\n" +
                "        \"isPresenceRequired\": true,\n" +
                "        \"hearingType\": \"Noram\",\n" +
                "        \"departmentOfficer\": \"yes\",\n" +
                "        \"remarks\": \"claimed\",\n" +
                "        \"additionalDetails\": null,\n" +
                "        \"respondent\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"Vaibhav\",\n" +
                "                \"lastName\": \"Jain\",\n" +
                "                \"contactNumber\": \"23456\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"petitioner\": {\n" +
                "            \"advocate\": {\n" +
                "                \"firstName\": \"shiva\",\n" +
                "                \"lastName\": \"abc\",\n" +
                "                \"contactNumber\": \"fcvgbh\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"court\": {\n" +
                "            \"courtName\": \"supreme court\",\n" +
                "            \"courtNumber\": \"0001\",\n" +
                "            \"district\": \"allahabad\",\n" +
                "            \"state\": \"up\",\n" +
                "            \"bench\": \"asdff\",\n" +
                "            \"division\": \"first\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        given().contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post()
                .then()
                .log().body();

    }
}
