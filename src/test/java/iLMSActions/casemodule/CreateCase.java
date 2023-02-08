package iLMSActions.casemodule;

import ExtentReports.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import static constants.Endpoints.CREATE_CASE;
import static constants.Endpoints.PIRAMAL_BASE_URL;

/**
 * @author Ajeet Vishwakarma
 * @Date 08/02/2023 - 1:55 PM
 */
public class CreateCase {

    private static RequestSpecification getRequestSpecification(Object jsonPayload)
    {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
                .log().all();
    }
    public static void printRequestLogReport(RequestSpecification requestSpecification)
    {
        QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestSpecification);
        ExtentReportManager.logInfoDetails("EndPoint: "+queryableRequestSpecification.getBaseUri());
        ExtentReportManager.logInfoDetails("Method name: "+queryableRequestSpecification.getMethod());
        ExtentReportManager.logInfoDetails("Request Headers: ");
        ExtentReportManager.logHeader(queryableRequestSpecification.getHeaders().asList());
        ExtentReportManager.logInfoDetails("Request body: ");
        ExtentReportManager.logJson(queryableRequestSpecification.getBody());
    }
    public static void printResponseLogReport(Response response)
    {
        ExtentReportManager.logInfoDetails("Status code: "+ response.getStatusLine());
        ExtentReportManager.logInfoDetails("Response Headers: ");
        ExtentReportManager.logHeader(response.getHeaders().asList());
        ExtentReportManager.logInfoDetails("Response body: ");
        ExtentReportManager.logJson(response.getBody().prettyPrint());
    }

    public static Response caseCreate(Object jsonPayload) {
        RequestSpecification requestSpecification = getRequestSpecification(jsonPayload);
        Response response = requestSpecification.post(PIRAMAL_BASE_URL+CREATE_CASE);
        printRequestLogReport(requestSpecification);
        printResponseLogReport(response);

        return response;
    }

}
