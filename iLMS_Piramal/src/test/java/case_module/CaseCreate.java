package case_module;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import iLMSActions.casemodule.CreateCaseActions;

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
        Response createResponse = CreateCaseActions.emptyCaseNumber();
        createResponse.getBody().prettyPrint();
//        Assert.assertEquals(createResponse.getStatusCode(), HttpStatus.SC_OK);
    }
//    @Test()
//    public void nullCaseNumber() {
//        Response createResponse = CreateCaseActions.nullCaseNumber();
//        createResponse.getBody().prettyPrint();
//    }
    @Test()
    public void nullCaseNumber() {
        Response createResponse = CreateCaseActions.nullCaseNumber1();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void createCaseEmptyCaseType() {
        Response createResponse = CreateCaseActions.emptyCaseType();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseType() {
        Response createResponse = CreateCaseActions.emptyCaseType();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullCaseType() {
        Response createResponse = CreateCaseActions.nullCaseType();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseCategory() {
        Response createResponse = CreateCaseActions.emptyCaseCategory();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullCaseYear() {
        Response createResponse = CreateCaseActions.nullCaseYear();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyFilingNumber() {
        Response createResponse = CreateCaseActions.emptyFilingNumber();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullCaseCategory() {
        Response createResponse = CreateCaseActions.nullCaseCategory();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullFilingNumber() {
        Response createResponse = CreateCaseActions.nullFilingNumber();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyCaseSummary() {
        Response createResponse = CreateCaseActions.emptyCaseSummary();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullFilingDate() {
        Response createResponse = CreateCaseActions.nullFilingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void emptyPolicyOrNonPolicyMatter() {
        Response createResponse = CreateCaseActions.emptyPolicyOrNonPolicyMatter();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullRegistrationDate() {
        Response createResponse = CreateCaseActions.nullRegistrationDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullCaseSummary() {
        Response createResponse = CreateCaseActions.nullCaseSummary();
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
    public void nullPolicyOrNonPolicyMatter() {
        Response createResponse = CreateCaseActions.nullPolicyOrNonPolicyMatter();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullIsCaseNumberCorrect() {
        Response createResponse = CreateCaseActions.nullIsCaseNumberCorrect();
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
    public void falseIsCaseNumberCorrect() {
        Response createResponse = CreateCaseActions.falseIsCaseNumberCorrect();
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
    public void nullRecommendOic() {
        Response createResponse = CreateCaseActions.nullRecommendOic();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullCaseStatus() {
        Response createResponse = CreateCaseActions.nullCaseStatus();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullFirstHearingDate() {
        Response createResponse = CreateCaseActions.nullFirstHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullPreviousHearingDate() {
        Response createResponse = CreateCaseActions.nullPreviousHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void inValidPreviousHearingDate() {
        Response createResponse = CreateCaseActions.inValidPreviousHearingDate();
        createResponse.getBody().prettyPrint();
    }
    @Test()
    public void nullNextHearingDate() {
        Response createResponse = CreateCaseActions.nullNextHearingDate();
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

    @Test()
    public void inValidNextHearingDate() {
        Response createResponse = CreateCaseActions.inValidNextHearingDate();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullCaseStage() {
        Response createResponse = CreateCaseActions.nullCaseStage();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullCaseSubStage() {
        Response createResponse = CreateCaseActions.nullCaseSubStage();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullDepartmentName() {
        Response createResponse = CreateCaseActions.nullDepartmentName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullActName() {
        Response createResponse = CreateCaseActions.nullActName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullSectionNumber() {
        Response createResponse = CreateCaseActions.nullSectionNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentFirstName() {
        Response createResponse = CreateCaseActions.nullRespondentFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentLastName() {
        Response createResponse = CreateCaseActions.emptyRespondentLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentLastName() {
        Response createResponse = CreateCaseActions.nullRespondentLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentDepartmentName() {
        Response createResponse = CreateCaseActions.emptyRespondentDepartmentName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentDepartmentName() {
        Response createResponse = CreateCaseActions.nullRespondentDepartmentName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentContactNumber() {
        Response createResponse = CreateCaseActions.emptyRespondentContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentContactNumber() {
        Response createResponse = CreateCaseActions.nullRespondentContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentAddress() {
        Response createResponse = CreateCaseActions.emptyRespondentAddress();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentAddress() {
        Response createResponse = CreateCaseActions.nullRespondentAddress();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentAdvocateFirstName() {
        Response createResponse = CreateCaseActions.emptyRespondentAdvocateFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentAdvocateFirstName() {
        Response createResponse = CreateCaseActions.nullRespondentAdvocateFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentAdvocateLastName() {
        Response createResponse = CreateCaseActions.emptyRespondentAdvocateLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentAdvocateLastName() {
        Response createResponse = CreateCaseActions.nullRespondentAdvocateLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyRespondentAdvocateContactNumber() {
        Response createResponse = CreateCaseActions.emptyRespondentAdvocateContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullRespondentAdvocateContactNumber() {
        Response createResponse = CreateCaseActions.nullRespondentAdvocateContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerFirstName() {
        Response createResponse = CreateCaseActions.emptyPetitionerFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerFirstName() {
        Response createResponse = CreateCaseActions.nullPetitionerFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerLastName() {
        Response createResponse = CreateCaseActions.nullPetitionerLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerType() {
        Response createResponse = CreateCaseActions.emptyPetitionerType();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerType() {
        Response createResponse = CreateCaseActions.nullPetitionerType();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerAddress() {
        Response createResponse = CreateCaseActions.emptyPetitionerAddress();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerAddress() {
        Response createResponse = CreateCaseActions.nullPetitionerAddress();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerContactNumber() {
        Response createResponse = CreateCaseActions.emptyPetitionerContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerContactNumber() {
        Response createResponse = CreateCaseActions.nullPetitionerContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerAdvocateFirstName() {
        Response createResponse = CreateCaseActions.emptyPetitionerAdvocateFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerAdvocateFirstName() {
        Response createResponse = CreateCaseActions.nullPetitionerAdvocateFirstName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerAdvocateLastName() {
        Response createResponse = CreateCaseActions.emptyPetitionerAdvocateLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerAdvocateLastName() {
        Response createResponse = CreateCaseActions.nullPetitionerAdvocateLastName();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void emptyPetitionerAdvocateContactNumber() {
        Response createResponse = CreateCaseActions.emptyPetitionerAdvocateContactNumber();
        createResponse.getBody().prettyPrint();
    }

    @Test()
    public void nullPetitionerAdvocateContactNumber() {
        Response createResponse = CreateCaseActions.nullPetitionerAdvocateContactNumber();
        createResponse.getBody().prettyPrint();
    }


//    @Test(description = "case creation with valid data")
//    public void createChildCaseWithValidData() {
//        Response createResponse = CreateCaseActions.createChildCaseWithValidData();
//        createResponse.getBody().prettyPrint();
//
//        String CaseId = createResponse.jsonPath().getString("caseList.id[0]");
//        String caseNumber = createResponse.jsonPath().getString("caseList.caseNumber[0]");
//        String petitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
//        String petitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
//        String petitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
//        String respondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
//        String respondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
//        String respondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
//        String actName = createResponse.jsonPath().getString("caseList.act.actName[0]");
//        String actAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
//        String documentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");
//
//        System.out.println("***************************************************");
//        System.out.println("caseId: "+CaseId);
//        System.out.println("petitionerGender: "+petitionerGender);
//        System.out.println("petitionerAdvocateFirstName: "+petitionerAdvocateFirstName);
//        System.out.println("petitionerAdvocateAuditDetailsCreatedTime: "+petitionerAdvocateAuditDetailsCreatedTime);
//        System.out.println("respondentFirstName: "+respondentFirstName);
//        System.out.println("respondentAdvocateFirstName: "+respondentAdvocateFirstName);
//        System.out.println("respondentAdvocateAuditDetailsCreatedBy: "+respondentAdvocateAuditDetailsCreatedBy);
//        System.out.println("actName: "+actName);
//        System.out.println("actAuditDetailsLastModifiedTime: "+actAuditDetailsLastModifiedTime);
//        System.out.println("documentType: "+documentType);
//        System.out.println("***************************************************");
//
//        Response searchResponse = caseSearchByCaseNumber(caseNumber);
//        searchResponse.prettyPrint();
//
//        String searchCaseId = createResponse.jsonPath().getString("caseList.id[0]");
//        String searchPetitionerGender = createResponse.jsonPath().getString("caseList.petitioner.gender[0]");
//        String searchPetitionerAdvocateFirstName = createResponse.jsonPath().getString("caseList.petitioner.advocate.firstName[0]");
//        String searchPetitionerAdvocateAuditDetailsCreatedTime = createResponse.jsonPath().getString("caseList.petitioner.advocate.auditDetails.createdTime[0]");
//        String searchRespondentFirstName = createResponse.jsonPath().getString("caseList.respondent.firstName[0]");
//        String searchRespondentAdvocateFirstName = createResponse.jsonPath().getString("caseList.respondent.advocate.firstName[0]");
//        String searchRespondentAdvocateAuditDetailsCreatedBy = createResponse.jsonPath().getString("caseList.respondent.advocate.auditDetails.createdBy[0]");
//        String searchActName = createResponse.jsonPath().getString("caseList.act.actName[0]");
//        String searchActAuditDetailsLastModifiedTime = createResponse.jsonPath().getString("caseList.act.auditDetails.lastModifiedTime[0]");
//        String searchDocumentType = createResponse.jsonPath().getString("caseList.documents.documentType[0]");
//
//        System.out.println("***************************************************");
//        System.out.println("searchCaseId: "+searchCaseId);
//        System.out.println("searchPetitionerGender: "+searchPetitionerGender);
//        System.out.println("searchPetitionerAdvocateFirstName: "+searchPetitionerAdvocateFirstName);
//        System.out.println("searchPetitionerAdvocateAuditDetailsCreatedTime: "+searchPetitionerAdvocateAuditDetailsCreatedTime);
//        System.out.println("searchRespondentFirstName: "+searchRespondentFirstName);
//        System.out.println("searchRespondentAdvocateFirstName: "+searchRespondentAdvocateFirstName);
//        System.out.println("searchRespondentAdvocateAuditDetailsCreatedBy: "+searchRespondentAdvocateAuditDetailsCreatedBy);
//        System.out.println("searchActName: "+searchActName);
//        System.out.println("searchActAuditDetailsLastModifiedTime: "+searchActAuditDetailsLastModifiedTime);
//        System.out.println("searchDocumentType: "+searchDocumentType);
//        System.out.println("***************************************************");
//
//        Assert.assertEquals(CaseId,searchCaseId);
//        Assert.assertEquals(petitionerGender,searchPetitionerGender);
//        Assert.assertEquals(petitionerAdvocateFirstName,searchPetitionerAdvocateFirstName);
//        Assert.assertEquals(petitionerAdvocateAuditDetailsCreatedTime,searchPetitionerAdvocateAuditDetailsCreatedTime);
//        Assert.assertEquals(respondentFirstName,searchRespondentFirstName);
//        Assert.assertEquals(respondentAdvocateFirstName,searchRespondentAdvocateFirstName);
//        Assert.assertEquals(respondentAdvocateAuditDetailsCreatedBy,searchRespondentAdvocateAuditDetailsCreatedBy);
//        Assert.assertEquals(actName,searchActName);
//        Assert.assertEquals(actAuditDetailsLastModifiedTime,searchActAuditDetailsLastModifiedTime);
//        Assert.assertEquals(documentType,searchDocumentType);
//    }

}
