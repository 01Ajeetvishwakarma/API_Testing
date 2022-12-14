package case_module;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import piramal.casemodule.CreateCaseActions;

import static case_module.CaseSearch.caseSearchByCaseNumber;


/**
 * @author Ajeet Vishwakarma
 * @created 01/12/2022 - 12:16 PM
 */
public class CaseCreate {

    @Test(description = "case creation with valid data")
    public void createParentCaseWithValidData() {
        Response createResponse = CreateCaseActions.createParentCaseWithValidData();
        createResponse.getBody().prettyPrint();

        String CaseId = createResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");
        String petitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
        String petitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
        String petitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
        String respondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
        String respondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
        String respondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
        String actName = createResponse.jsonPath().getString("caseList.act.actName[0]");
        String actAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
        String documentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");

        System.out.println("***************************************************");
        System.out.println("caseId: "+CaseId);
        System.out.println("petitionerGender: "+petitionerGender);
        System.out.println("petitionerAdvocateFirstName: "+petitionerAdvocateFirstName);
        System.out.println("petitionerAdvocateAuditDetailsCreatedTime: "+petitionerAdvocateAuditDetailsCreatedTime);
        System.out.println("respondentFirstName: "+respondentFirstName);
        System.out.println("respondentAdvocateFirstName: "+respondentAdvocateFirstName);
        System.out.println("respondentAdvocateAuditDetailsCreatedBy: "+respondentAdvocateAuditDetailsCreatedBy);
        System.out.println("actName: "+actName);
        System.out.println("actAuditDetailsLastModifiedTime: "+actAuditDetailsLastModifiedTime);
        System.out.println("documentType: "+documentType);
        System.out.println("***************************************************");

        Response searchResponse = caseSearchByCaseNumber(caseNumber);
        searchResponse.prettyPrint();

        String searchCaseId = createResponse.jsonPath().getString("caseList.id[0]");
        String searchPetitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
        String searchPetitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
        String searchPetitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
        String searchRespondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
        String searchRespondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
        String searchRespondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
        String searchActName = createResponse.jsonPath().getString("caseList.act.actName[0]");
        String searchActAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
        String searchDocumentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");

        System.out.println("***************************************************");
        System.out.println("searchCaseId: "+searchCaseId);
        System.out.println("searchPetitionerGender: "+searchPetitionerGender);
        System.out.println("searchPetitionerAdvocateFirstName: "+searchPetitionerAdvocateFirstName);
        System.out.println("searchPetitionerAdvocateAuditDetailsCreatedTime: "+searchPetitionerAdvocateAuditDetailsCreatedTime);
        System.out.println("searchRespondentFirstName: "+searchRespondentFirstName);
        System.out.println("searchRespondentAdvocateFirstName: "+searchRespondentAdvocateFirstName);
        System.out.println("searchRespondentAdvocateAuditDetailsCreatedBy: "+searchRespondentAdvocateAuditDetailsCreatedBy);
        System.out.println("searchActName: "+searchActName);
        System.out.println("searchActAuditDetailsLastModifiedTime: "+searchActAuditDetailsLastModifiedTime);
        System.out.println("searchDocumentType: "+searchDocumentType);
        System.out.println("***************************************************");

        Assert.assertEquals(CaseId,searchCaseId);
        Assert.assertEquals(petitionerGender,searchPetitionerGender);
        Assert.assertEquals(petitionerAdvocateFirstName,searchPetitionerAdvocateFirstName);
        Assert.assertEquals(petitionerAdvocateAuditDetailsCreatedTime,searchPetitionerAdvocateAuditDetailsCreatedTime);
        Assert.assertEquals(respondentFirstName,searchRespondentFirstName);
        Assert.assertEquals(respondentAdvocateFirstName,searchRespondentAdvocateFirstName);
        Assert.assertEquals(respondentAdvocateAuditDetailsCreatedBy,searchRespondentAdvocateAuditDetailsCreatedBy);
        Assert.assertEquals(actName,searchActName);
        Assert.assertEquals(actAuditDetailsLastModifiedTime,searchActAuditDetailsLastModifiedTime);
        Assert.assertEquals(documentType,searchDocumentType);
    }

    @Test()
    public void emptyCaseNumber() {
        Response createResponse = CreateCaseActions.createCaseWithEmptyCaseNumber();
        createResponse.getBody().prettyPrint();
        Assert.assertEquals(createResponse.getStatusCode(), HttpStatus.SC_OK);
    }
    @Test()
    public void createCaseEmptyCaseType() {
        Response createResponse = CreateCaseActions.emptyCaseType();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCnrNumber() {
        Response createResponse = CreateCaseActions.emptyCnrNumber();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyParentCaseNumber() {
        Response createResponse = CreateCaseActions.emptyParentCaseNumber();
        createResponse.getBody().prettyPrint();
    }
    /*@Test()
    public void invalidIsParentCase() {
        Response createResponse = CreateCaseActions.invalidIsParentCase();
        createResponse.getBody().prettyPrint();
    }*/
    @Test()
    public void emptyCaseCategory() {
        Response createResponse = CreateCaseActions.emptyCaseCategory();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidCaseYear() {
        Response createResponse = CreateCaseActions.invalidCaseYear();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyFilingNumber() {
        Response createResponse = CreateCaseActions.emptyFilingNumber();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidFilingDate() {
        Response createResponse = CreateCaseActions.invalidFilingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidRegistrationDate() {
        Response createResponse = CreateCaseActions.invalidRegistrationDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseSummary() {
        Response createResponse = CreateCaseActions.emptyCaseSummary();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyArisingDetails() {
        Response createResponse = CreateCaseActions.emptyArisingDetails();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyPolicyOrNonPolicyMatter() {
        Response createResponse = CreateCaseActions.emptyPolicyOrNonPolicyMatter();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyApplicationNo() {
        Response createResponse = CreateCaseActions.emptyApplicationNo();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidIsCaseNumberCorrect() {
        Response createResponse = CreateCaseActions.invalidIsCaseNumberCorrect();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseStatus() {
        Response createResponse = CreateCaseActions.emptyCaseStatus();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidFirstHearingDate() {
        Response createResponse = CreateCaseActions.invalidFirstHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidPreviousHearingDate() {
        Response createResponse = CreateCaseActions.invalidPreviousHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void invalidNextHearingDate() {
        Response createResponse = CreateCaseActions.invalidNextHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseStage() {
        Response createResponse = CreateCaseActions.emptyCaseStage();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseSubStage() {
        Response createResponse = CreateCaseActions.emptyCaseSubStage();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseFlag() {
        Response createResponse = CreateCaseActions.emptyCaseFlag();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyDepartmentName() {
        Response createResponse = CreateCaseActions.emptyDepartmentName();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyRecommendOic() {
        Response createResponse = CreateCaseActions.emptyRecommendOic();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyRemarks() {
        Response createResponse = CreateCaseActions.emptyRemarks();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyAssignedOfficerId() {
        Response createResponse = CreateCaseActions.emptyAssignedOfficerId();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullAdditionalDetails() {
        Response createResponse = CreateCaseActions.nullAdditionalDetails();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyDocumentType() {
        Response createResponse = CreateCaseActions.emptyDocumentType();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyFileStoreId() {
        Response createResponse = CreateCaseActions.emptyFileStoreId();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyActName() {
        Response createResponse = CreateCaseActions.emptyActName();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptySectionNumber() {
        Response createResponse = CreateCaseActions.emptySectionNumber();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyRespondentFirstName() {
        Response createResponse = CreateCaseActions.emptyRespondentFirstName();
        createResponse.getBody().prettyPrint();
    }


    @Test(description = "case creation with valid data")
    public void createChildCaseWithValidData() {
        Response createResponse = CreateCaseActions.createChildCaseWithValidData();
        createResponse.getBody().prettyPrint();

        String CaseId = createResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");
        String petitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
        String petitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
        String petitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
        String respondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
        String respondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
        String respondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
        String actName = createResponse.jsonPath().getString("caseList.act.actName[0]");
        String actAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
        String documentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");

        System.out.println("***************************************************");
        System.out.println("caseId: "+CaseId);
        System.out.println("petitionerGender: "+petitionerGender);
        System.out.println("petitionerAdvocateFirstName: "+petitionerAdvocateFirstName);
        System.out.println("petitionerAdvocateAuditDetailsCreatedTime: "+petitionerAdvocateAuditDetailsCreatedTime);
        System.out.println("respondentFirstName: "+respondentFirstName);
        System.out.println("respondentAdvocateFirstName: "+respondentAdvocateFirstName);
        System.out.println("respondentAdvocateAuditDetailsCreatedBy: "+respondentAdvocateAuditDetailsCreatedBy);
        System.out.println("actName: "+actName);
        System.out.println("actAuditDetailsLastModifiedTime: "+actAuditDetailsLastModifiedTime);
        System.out.println("documentType: "+documentType);
        System.out.println("***************************************************");

        Response searchResponse = caseSearchByCaseNumber(caseNumber);
        searchResponse.prettyPrint();

        String searchCaseId = createResponse.jsonPath().getString("caseList.id[0]");
        String searchPetitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
        String searchPetitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
        String searchPetitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
        String searchRespondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
        String searchRespondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
        String searchRespondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
        String searchActName = createResponse.jsonPath().getString("caseList.act.actName[0]");
        String searchActAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
        String searchDocumentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");

        System.out.println("***************************************************");
        System.out.println("searchCaseId: "+searchCaseId);
        System.out.println("searchPetitionerGender: "+searchPetitionerGender);
        System.out.println("searchPetitionerAdvocateFirstName: "+searchPetitionerAdvocateFirstName);
        System.out.println("searchPetitionerAdvocateAuditDetailsCreatedTime: "+searchPetitionerAdvocateAuditDetailsCreatedTime);
        System.out.println("searchRespondentFirstName: "+searchRespondentFirstName);
        System.out.println("searchRespondentAdvocateFirstName: "+searchRespondentAdvocateFirstName);
        System.out.println("searchRespondentAdvocateAuditDetailsCreatedBy: "+searchRespondentAdvocateAuditDetailsCreatedBy);
        System.out.println("searchActName: "+searchActName);
        System.out.println("searchActAuditDetailsLastModifiedTime: "+searchActAuditDetailsLastModifiedTime);
        System.out.println("searchDocumentType: "+searchDocumentType);
        System.out.println("***************************************************");

        Assert.assertEquals(CaseId,searchCaseId);
        Assert.assertEquals(petitionerGender,searchPetitionerGender);
        Assert.assertEquals(petitionerAdvocateFirstName,searchPetitionerAdvocateFirstName);
        Assert.assertEquals(petitionerAdvocateAuditDetailsCreatedTime,searchPetitionerAdvocateAuditDetailsCreatedTime);
        Assert.assertEquals(respondentFirstName,searchRespondentFirstName);
        Assert.assertEquals(respondentAdvocateFirstName,searchRespondentAdvocateFirstName);
        Assert.assertEquals(respondentAdvocateAuditDetailsCreatedBy,searchRespondentAdvocateAuditDetailsCreatedBy);
        Assert.assertEquals(actName,searchActName);
        Assert.assertEquals(actAuditDetailsLastModifiedTime,searchActAuditDetailsLastModifiedTime);
        Assert.assertEquals(documentType,searchDocumentType);
    }

}
