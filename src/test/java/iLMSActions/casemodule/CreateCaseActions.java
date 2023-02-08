package iLMSActions.casemodule;

import case_module.caseData.ParentCaseData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import ExtentReports.ExtentReportManager;

import static case_module.caseData.ParentCaseData.*;
import static constants.Endpoints.*;
import static iLMSActions.casemodule.CreateCase.caseCreate;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 02/12/2022 - 11:55 AM
 */

public class CreateCaseActions {

    static ParentCaseData caseData = new ParentCaseData();


    private static RequestSpecification getRequestSpecification(Object jsonPayload)
    {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
                .log().all();
    }
    public static Response createCase(Object jsonPayload) {
        RequestSpecification requestSpecification = getRequestSpecification(jsonPayload);
        Response response = requestSpecification.post(PIRAMAL_BASE_URL+CREATE_CASE);
        printRequestLogReport(requestSpecification);
        printResponseLogReport(response);

        return response;
    }





    public static Response createTheCase(Object jsonPayload) {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_CASE)
                .then()
                .extract()
                .response();
        return response;
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


    public static Response createParentCaseWithValidData() {
//        return createCase(caseData.validCaseDetails);
        return createCase(caseData.validCaseDetails);
//        return createCase(caseData.getCaseBody().toString());
    }





    public static Response emptyCaseNumber() {
        return caseCreate(caseNumberEmpty());
    }
    public static Response nullCaseNumber() {
        return caseCreate(caseNumberNull());
    }



    public static Response nullCaseNumber1() {
        return createCase(validCaseRequestBody());
    }
//    public static Response nullCaseNumber2() {
//        return createCaseUsingPojo(validCaseRequestBody());
//    }



    public static Response emptyCaseType() {
        return caseCreate(caseTypeEmpty());
    }
    public static Response nullCaseType() {
        return createCase(caseData.nullCaseType);
    }
    public static Response emptyCaseCategory() {
        return createCase(caseData.emptyCaseCategory);
    }
    public static Response nullCaseCategory() {
        return createCase(caseData.nullCaseCategory);
    }
    public static Response nullCaseYear() {
        return createCase(caseData.nullCaseYear);
    }
    public static Response emptyFilingNumber() {
        return createCase(caseData.emptyFilingNumber);
    }
    public static Response nullFilingNumber() {
        return createCase(caseData.nullFilingNumber);
    }
    public static Response nullFilingDate() {
        return createCase(caseData.nullFilingDate);
    }
    public static Response nullRegistrationDate() {
        return createCase(caseData.nullRegistrationDate);
    }
    public static Response emptyCaseSummary() {
        return createCase(caseData.emptyCaseSummary);
    }
    public static Response nullCaseSummary() {
        return createCase(caseData.nullCaseSummary);
    }
    public static Response emptyPolicyOrNonPolicyMatter() {
        return createCase(caseData.emptyPolicyOrNonPolicyMatter);
    }
    public static Response nullPolicyOrNonPolicyMatter() {
        return createCase(caseData.nullPolicyOrNonPolicyMatter);
    }
    public static Response nullIsCaseNumberCorrect() {
        return createCase(caseData.nullIsCaseNumberCorrect);
    }
    public static Response falseIsCaseNumberCorrect() {
        return createCase(caseData.falseIsCaseNumberCorrect);
    }
    public static Response emptyCaseStatus() {
        return createCase(caseData.emptyCaseStatus);
    }
    public static Response nullCaseStatus() {
        return createCase(caseData.nullCaseStatus);
    }
    public static Response nullFirstHearingDate() {
        return createCase(caseData.nullFirstHearingDate);
    }
    public static Response invalidFirstHearingDate() {
        return createCase(caseData.invalidFirstHearingDate);
    }
    public static Response nullPreviousHearingDate() {
        return createCase(caseData.nullPreviousHearingDate);
    }
    public static Response inValidPreviousHearingDate() {
        return createCase(caseData.inValidPreviousHearingDate);
    }
    public static Response nullNextHearingDate() {
        return createCase(caseData.nullNextHearingDate);
    }
    public static Response inValidNextHearingDate() {
        return createCase(caseData.inValidNextHearingDate);
    }
    public static Response emptyCaseStage() {
        return createCase(caseData.emptyCaseStage);
    }
    public static Response nullCaseStage() {
        return createCase(caseData.nullCaseStage);
    }
    public static Response emptyCaseSubStage() {
        return createCase(caseData.emptyCaseSubStage);
    }
    public static Response nullCaseSubStage() {
        return createCase(caseData.nullCaseSubStage);
    }
    public static Response emptyDepartmentName() {
        return createCase(caseData.emptyDepartmentName);
    }
    public static Response nullDepartmentName() {
        return createCase(caseData.nullDepartmentName);
    }
    public static Response emptyRecommendOic() {
        return createCase(caseData.emptyRecommendOic);
    }
    public static Response nullRecommendOic() {
        return createCase(caseData.nullRecommendOic);
    }
    public static Response emptyActName() {
        return createCase(caseData.emptyActName);
    }
    public static Response nullActName() {
        return createCase(caseData.nullActName);
    }
    public static Response emptySectionNumber() {
        return createCase(caseData.emptySectionNumber);
    }
    public static Response nullSectionNumber() {
        return createCase(caseData.nullSectionNumber);
    }
    public static Response emptyRespondentFirstName() {
        return createCase(caseData.emptyRespondentFirstName);
    }
    public static Response nullRespondentFirstName() {
        return createCase(caseData.nullRespondentFirstName);
    }
    public static Response emptyRespondentLastName() {
        return createCase(caseData.emptyRespondentLastName);
    }
    public static Response nullRespondentLastName() {
        return createCase(caseData.nullRespondentLastName);
    }
    public static Response emptyRespondentDepartmentName() {
        return createCase(caseData.emptyRespondentDepartmentName);
    }
    public static Response nullRespondentDepartmentName() {
        return createCase(caseData.nullRespondentDepartmentName);
    }
    public static Response emptyRespondentContactNumber() {
        return createCase(caseData.emptyRespondentContactNumber);
    }
    public static Response nullRespondentContactNumber() {
        return createCase(caseData.nullRespondentContactNumber);
    }
    public static Response emptyRespondentAddress() {
        return createCase(caseData.emptyRespondentAddress);
    }
    public static Response nullRespondentAddress() {
        return createCase(caseData.nullRespondentAddress);
    }
    public static Response emptyRespondentAdvocateFirstName() {
        return createCase(caseData.emptyRespondentAdvocateFirstName);
    }
    public static Response nullRespondentAdvocateFirstName() {
        return createCase(caseData.nullRespondentAdvocateFirstName);
    }
    public static Response emptyRespondentAdvocateLastName() {
        return createCase(caseData.emptyRespondentAdvocateLastName);
    }
    public static Response nullRespondentAdvocateLastName() {
        return createCase(caseData.nullRespondentAdvocateLastName);
    }
    public static Response emptyRespondentAdvocateContactNumber() {
        return createCase(caseData.emptyRespondentAdvocateContactNumber);
    }
    public static Response nullRespondentAdvocateContactNumber() {
        return createCase(caseData.nullRespondentAdvocateContactNumber);
    }
    public static Response emptyPetitionerFirstName() {
        return createCase(caseData.emptyPetitionerFirstName);
    }
    public static Response nullPetitionerFirstName() {
        return createCase(caseData.nullPetitionerFirstName);
    }
    public static Response nullPetitionerLastName() {
        return createCase(caseData.nullPetitionerLastName);
    }
    public static Response emptyPetitionerType() {
        return createCase(caseData.emptyPetitionerType);
    }
    public static Response nullPetitionerType() {
        return createCase(caseData.nullPetitionerType);
    }
    public static Response emptyPetitionerAddress() {
        return createCase(caseData.emptyPetitionerAddress);
    }
    public static Response nullPetitionerAddress() {
        return createCase(caseData.nullPetitionerAddress);
    }
    public static Response emptyPetitionerContactNumber() {
        return createCase(caseData.emptyPetitionerContactNumber);
    }
    public static Response nullPetitionerContactNumber() {
        return createCase(caseData.nullPetitionerContactNumber);
    }
    public static Response emptyPetitionerAdvocateFirstName() {
        return createCase(caseData.emptyPetitionerAdvocateFirstName);
    }
    public static Response nullPetitionerAdvocateFirstName() {
        return createCase(caseData.nullPetitionerAdvocateFirstName);
    }
    public static Response emptyPetitionerAdvocateLastName() {
        return createCase(caseData.emptyPetitionerAdvocateLastName);
    }
    public static Response nullPetitionerAdvocateLastName() {
        return createCase(caseData.nullPetitionerAdvocateLastName);
    }
    public static Response emptyPetitionerAdvocateContactNumber() {
        return createCase(caseData.emptyPetitionerAdvocateContactNumber);
    }
    public static Response nullPetitionerAdvocateContactNumber() {
        return createCase(caseData.nullPetitionerAdvocateContactNumber);
    }



}
