package iLMSActions.casemodule;

import case_module.caseData.ParentCaseData;
import io.restassured.response.Response;

import static case_module.caseData.ParentCaseData.*;
import static iLMSActions.casemodule.CreateCase.caseCreate;

/**
 * @author Ajeet Vishwakarma
 * @created 02/12/2022 - 11:55 AM
 */

public class CreateCaseActions {

    static ParentCaseData caseData = new ParentCaseData();

    /*private static RequestSpecification getRequestSpecification(Object jsonPayload)
    {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
                .log().all();
    }
    public static Response caseCreate(Object jsonPayload) {
        RequestSpecification requestSpecification = getRequestSpecification(jsonPayload);
        Response response = requestSpecification.post(PIRAMAL_BASE_URL+CREATE_CASE);
        printRequestLogReport(requestSpecification);
        printResponseLogReport(response);

        return response;
    }*/
    /*public static Response createTheCase(Object jsonPayload) {
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
    }*/


    public static Response createParentCaseWithValidData() {
//        return caseCreate(caseData.validCaseDetails);
//        return caseCreate(caseData.validCaseDetails);
//        return caseCreate(caseData.getCaseBody().toString());
        return null;
    }




    public static Response caseWithValidData() {
        return caseCreate(validCaseRequestBody());
    }
    public static Response emptyCaseNumber() {
        return caseCreate(caseNumberEmpty());
    }
    public static Response nullCaseNumber() {
        return caseCreate(caseNumberNull());
    }
    public static Response emptyCaseType() {
        return caseCreate(caseTypeEmpty());
    }
    public static Response nullCaseType() {
        return caseCreate(caseTypeNull());
    }
    public static Response emptyCaseCategory() {
        return caseCreate(caseCategoryEmpty());
    }
    public static Response nullCaseCategory() {
        return caseCreate(caseCategoryNull());
    }
    public static Response nullCaseYear() {
        return caseCreate(caseYearNull());
    }
    public static Response emptyFilingNumber() {
        return caseCreate(filingNumberEmpty());
    }
    public static Response nullFilingNumber() {
        return caseCreate(filingNumberNull());
    }
    public static Response nullFilingDate() {
        return caseCreate(filingDateNull());
    }
    public static Response nullRegistrationDate() {
        return caseCreate(registrationDateNull());
    }
    public static Response emptyCaseSummary() {
        return caseCreate(caseSummaryEmpty());
    }
    public static Response nullCaseSummary() {
        return caseCreate(caseSummaryNull());
    }
    public static Response emptyPolicyOrNonPolicyMatter() {
        return caseCreate(policyOrNonPolicyMatterEmpty());
    }
    public static Response nullPolicyOrNonPolicyMatter() {
        return caseCreate(policyOrNonPolicyMatterNull());
    }
    public static Response nullIsCaseNumberCorrect() {
        return caseCreate(isCaseNumberCorrectNull());
    }
    public static Response falseIsCaseNumberCorrect() {
        return caseCreate(isCaseNumberCorrect());
    }
    public static Response emptyCaseStatus() {
        return caseCreate(caseStatusEmpty());
    }
    public static Response nullCaseStatus() {
        return caseCreate(caseStatusNull());
    }
    public static Response nullFirstHearingDate() {
        return caseCreate(firstHearingDateNull());
    }
    public static Response invalidFirstHearingDate() {
        return caseCreate(firstHearingDateInvalid());
    }
    public static Response nullPreviousHearingDate() {
        return caseCreate(previousHearingDateNull());
    }
    public static Response inValidPreviousHearingDate() {
        return caseCreate(previousHearingDateInvalid());
    }
    public static Response nullNextHearingDate() {
        return caseCreate(nextHearingDateNull());
    }
    public static Response inValidNextHearingDate() {
        return caseCreate(nextHearingDateInvalid());
    }
    public static Response emptyCaseStage() {
        return caseCreate(caseStageEmpty());
    }
    public static Response nullCaseStage() {
        return caseCreate(caseStageNull());
    }
    public static Response emptyCaseSubStage() {
        return caseCreate(caseSubStageEmpty());
    }
    public static Response nullCaseSubStage() {
        return caseCreate(caseSubStageNull());
    }
    public static Response emptyDepartmentName() {
        return caseCreate(departmentNameEmpty());
    }
    public static Response nullDepartmentName() {
        return caseCreate(departmentNameNull());
    }
    public static Response emptyRecommendOic() {
        return caseCreate(recommendOicEmpty());
    }
    public static Response nullRecommendOic() {
        return caseCreate(recommendOicNull());
    }
    public static Response emptyActName() {
        return caseCreate(actNameEmpty());
    }
    public static Response nullActName() {
        return caseCreate(actNameNull());
    }
    public static Response emptySectionNumber() {
        return caseCreate(sectionNumberEmpty());
    }
    public static Response nullSectionNumber() {
        return caseCreate(sectionNumberNull());
    }
    public static Response emptyRespondentFirstName() {
        return caseCreate(respondentFirstNameEmpty());
    }
    public static Response nullRespondentFirstName() {
        return caseCreate(respondentFirstNameNull());
    }
    public static Response emptyRespondentLastName() {
        return caseCreate(respondentLastNameEmpty());
    }
    public static Response nullRespondentLastName() {
        return caseCreate(respondentLastNameNull());
    }
    public static Response emptyRespondentDepartmentName() {
        return caseCreate(respondentDepartmentNameEmpty());
    }
    public static Response nullRespondentDepartmentName() {
        return caseCreate(respondentDepartmentNameNull());
    }
    public static Response emptyRespondentContactNumber() {
        return caseCreate(respondentContactNumberEmpty());
    }
    public static Response nullRespondentContactNumber() {
        return caseCreate(respondentContactNumberNull());
    }
    public static Response emptyRespondentAddress() {
        return caseCreate(respondentAddressEmpty());
    }
    public static Response nullRespondentAddress() {
        return caseCreate(respondentAddressNull());
    }
    public static Response emptyRespondentAdvocateFirstName() {
        return caseCreate(respondentAdvocateFirstNameEmpty());
    }
    public static Response nullRespondentAdvocateFirstName() {
        return caseCreate(respondentAdvocateFirstNameNull());
    }
    public static Response emptyRespondentAdvocateLastName() {
        return caseCreate(respondentAdvocateLastNameEmpty());
    }
    public static Response nullRespondentAdvocateLastName() {
        return caseCreate(respondentAdvocateLastNameNull());
    }
    public static Response emptyRespondentAdvocateContactNumber() {
        return caseCreate(respondentAdvocateContactNumberEmpty());
    }
    public static Response nullRespondentAdvocateContactNumber() {
        return caseCreate(respondentAdvocateContactNumberNull());
    }
    public static Response emptyPetitionerFirstName() {
        return caseCreate(petitionerFirstNameEmpty());
    }
    public static Response nullPetitionerFirstName() {
        return caseCreate(petitionerFirstNameNull());
    }
    public static Response nullPetitionerLastName() {
        return caseCreate(petitionerLastNameNull());
    }
    public static Response emptyPetitionerType() {
        return caseCreate(petitionerTypeEmpty());
    }
    public static Response nullPetitionerType() {
        return caseCreate(petitionerTypeNull());
    }
    public static Response emptyPetitionerAddress() {
        return caseCreate(petitionerAddressEmpty());
    }
    public static Response nullPetitionerAddress() {
        return caseCreate(petitionerAddressNull());
    }
    public static Response emptyPetitionerContactNumber() {
        return caseCreate(petitionerContactNumberEmpty());
    }
    public static Response nullPetitionerContactNumber() {
        return caseCreate(petitionerContactNumberNull());
    }
    public static Response emptyPetitionerAdvocateFirstName() {
        return caseCreate(emptyPetitionerAdvocateFirstNameEmpty());
    }
    public static Response nullPetitionerAdvocateFirstName() {
        return caseCreate(petitionerAdvocateFirstNameNull());
    }
    public static Response emptyPetitionerAdvocateLastName() {
        return caseCreate(petitionerAdvocateLastNameEmpty());
    }
    public static Response nullPetitionerAdvocateLastName() {
        return caseCreate(petitionerAdvocateLastNameNull());
    }
    public static Response emptyPetitionerAdvocateContactNumber() {
        return caseCreate(petitionerAdvocateContactNumberEmpty());
    }
    public static Response nullPetitionerAdvocateContactNumber() {
        return caseCreate(petitionerAdvocateContactNumberNull());
    }



}
