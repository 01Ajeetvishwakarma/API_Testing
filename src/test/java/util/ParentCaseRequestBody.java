package util;

import RequestPojoClass.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajeet Vishwakarma
 * @Date 08/02/2023 - 12:15 PM
 */
public class ParentCaseRequestBody {
    public static void main(String[] args) {

        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");

        UserInfo userInfo = new UserInfo();
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");

        Roles roles1 = new Roles();
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        Roles roles2 = new Roles();
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");

        List<Roles> rolesList = new ArrayList<>();
        rolesList.add(roles1);
        rolesList.add(roles2);

        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);

        requestInfo.setUserInfo(userInfo);

        Case cases = new Case();
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber("sdfgh76");
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType("ARB-DC");
        cases.setCaseCategory("SM001");
        cases.setCaseYear(3456);
        cases.setFilingNumber("fgikhhf456");
        cases.setFilingDate("45678987654");
        cases.setRegistrationDate("3456776543");
        cases.setCaseSummary("test case");
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter("yes");
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(true);
        cases.setCaseStatus("PA0002");
        cases.setFirstHearingDate("1669959086142");
        cases.setPreviousHearingDate("1669959086142");
        cases.setNextHearingDate("1669959086142");
        cases.setCaseStage("NOP-CP");
        cases.setCaseSubStage("DC-DEC");
        cases.setCaseFlag(null);
        cases.setDepartmentName("DP002");
        cases.setRecommendOic("DPC003");
        cases.setRemarks("nothing");
        cases.setAssignedOfficerId("7f9eb8f9-d954-4f65-affc-13034318fd2a");
        cases.setAdditionalDetails(null);

        Act act = new Act();
        act.setActName("ACT098765");
        act.setSectionNumber("098765");

        cases.setAct(act);

        Respondent respondent = new Respondent();
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");

        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");

        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);

        Petitioner petitioner = new Petitioner();
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");

        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");

        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);


        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);


        Response response = RestAssured.given().log().all().body(requestBodyDetails).get();
        response.prettyPrint();


    }




}
