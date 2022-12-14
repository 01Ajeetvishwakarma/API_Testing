package piramal.casemodule;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static case_module.caseData.ParentCaseData.*;
import static constants.Endpoints.*;
import static io.restassured.RestAssured.given;

/**
 * @author Ajeet Vishwakarma
 * @created 02/12/2022 - 11:55 AM
 */

public class CreateCaseActions {

    public static Response createCase(String JsonPayload) {
        /*RestAssured.baseURI="http://14.97.12.97/ilms-services";
        RestAssured.basePath="/case";*/
        Response response = given()
                .contentType(ContentType.JSON)
                .body(JsonPayload)
                .when()
                .post(PIRAMAL_BASE_URL+CREATE_CASE)
                .then()
                .extract()
                .response();
        return response;
    }

    public static Response createParentCaseWithValidData() {
        return createCase(validJsonPayload);
    }
    public static Response createCaseWithEmptyCaseNumber() {
        return createCase(emptyCaseNumber);
    }
    public static Response emptyCaseType() {
        return createCase(emptyCaseType);
    }
    public static Response emptyCnrNumber() {
        return createCase(emptyCnrNumber);
    }
    public static Response emptyParentCaseNumber() {
        return createCase(inValidParentCaseNumber);
    }
    /*public static Response invalidIsParentCase() {
        return createCase(invalidIsParentCase);
    }*/
    public static Response emptyCreationReason() {
        return createCase(emptyCreationReason);
    }
    public static Response emptyCaseCategory() {
        return createCase(emptyCaseCategory);
    }
    public static Response invalidCaseYear() {
        return createCase(invalidCaseYear);
    }
    public static Response emptyFilingNumber() {
        return createCase(emptyFilingNumber);
    }
    public static Response invalidFilingDate() {
        return createCase(invalidFilingDate);
    }
    public static Response invalidRegistrationDate() {
        return createCase(invalidRegistrationDate);
    }
    public static Response emptyCaseSummary() {
        return createCase(emptyCaseSummary);
    }
    public static Response emptyArisingDetails() {
        return createCase(emptyArisingDetails);
    }
    public static Response emptyPolicyOrNonPolicyMatter() {
        return createCase(emptyPolicyOrNonPolicyMatter);
    }
    public static Response emptyApplicationNo() {
        return createCase(emptyApplicationNo);
    }
    public static Response invalidIsCaseNumberCorrect() {
        return createCase(invalidIsCaseNumberCorrect);
    }
    public static Response emptyCaseStatus() {
        return createCase(emptyCaseStatus);
    }
    public static Response invalidFirstHearingDate() {
        return createCase(invalidFirstHearingDate);
    }
    public static Response invalidPreviousHearingDate() {
        return createCase(invalidPreviousHearingDate);
    }
    public static Response invalidNextHearingDate() {
        return createCase(invalidNextHearingDate);
    }
    public static Response emptyCaseStage() {
        return createCase(emptyCaseStage);
    }
    public static Response emptyCaseSubStage() {
        return createCase(emptyCaseSubStage);
    }
    public static Response emptyCaseFlag() {
        return createCase(emptyCaseFlag);
    }
    public static Response emptyDepartmentName() {
        return createCase(emptyDepartmentName);
    }
    public static Response emptyRecommendOic() {
        return createCase(emptyRecommendOic);
    }
    public static Response emptyRemarks() {
        return createCase(emptyRemarks);
    }
    public static Response emptyAssignedOfficerId() {
        return createCase(emptyAssignedOfficerId);
    }
    public static Response nullAdditionalDetails() {
        return createCase(nullAdditionalDetails);
    }
    public static Response emptyDocumentType() {
        return createCase(emptyDocumentType);
    }
    public static Response emptyFileStoreId() {
        return createCase(emptyFileStoreId);
    }
    public static Response emptyActName() {
        return createCase(emptyActName);
    }
    public static Response emptySectionNumber() {
        return createCase(emptySectionNumber);
    }
    public static Response emptyRespondentFirstName() {
        return createCase(emptyRespondentFirstName);
    }


    public static Response createChildCaseWithValidData() {
        return createCase(validJsonPayloadForChild);
    }
}
