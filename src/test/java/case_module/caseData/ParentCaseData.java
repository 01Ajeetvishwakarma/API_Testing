package case_module.caseData;

import RequestPojoClass.*;

import java.util.*;

/**
 * @author Ajeet Vishwakarma
 * @created 02/12/2022 - 4:57 PM
 */
public class ParentCaseData {

    static Random random = new Random();
    static int randomNumber = random.nextInt(100000);
    static String caseNo = "ILMS_CASE_" + randomNumber;
    static String cnrNo = "ILMS_CNR_" + randomNumber;
    static String authToken = "ac4c25c7-087c-4235-bb79-d581bb8864ae";


    public static CaseRequestBodyDetails validCaseRequestBody()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseTypeEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseTypeNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseCategoryEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseYearNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory("");
        cases.setCaseYear(2);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails filingNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory("");
        cases.setCaseYear(2);
        cases.setFilingNumber("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseCategoryNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails filingNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
        //request info
        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        //user info
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        //roles
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails filingDateNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails registrationDateNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseSummaryEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseSummaryNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails policyOrNonPolicyMatterEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter("");
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails policyOrNonPolicyMatterNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails isCaseNumberCorrectNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(null);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseStatusEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseStatusNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails firstHearingDateNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails firstHearingDateInvalid()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails previousHearingDateNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails previousHearingDateInvalid()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails nextHearingDateNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails nextHearingDateInvalid()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseStageEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseStageNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseSubStageEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails caseSubStageNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails departmentNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails departmentNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails recommendOicEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails recommendOicNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails actNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails actNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails sectionNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails sectionNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentFirstNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentFirstNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentLastNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentLastNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentDepartmentNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentDepartmentNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentContactNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentContactNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAddressEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAddressNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateFirstNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateFirstNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateLastNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateLastNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateContactNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails respondentAdvocateContactNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails petitionerFirstNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails petitionerFirstNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails petitionerLastNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails petitionerTypeEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }

    public static CaseRequestBodyDetails isCaseNumberCorrect()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerTypeNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAddressEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAddressNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerContactNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerContactNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails emptyPetitionerAdvocateFirstNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAdvocateFirstNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAdvocateLastNameEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAdvocateLastNameNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAdvocateContactNumberEmpty()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }
    public static CaseRequestBodyDetails petitionerAdvocateContactNumberNull()
    {
        CaseRequestBodyDetails requestBodyDetails = new CaseRequestBodyDetails();
        RequestInfo requestInfo = new RequestInfo();
        UserInfo userInfo = new UserInfo();
        Roles roles1 = new Roles();
        Roles roles2 = new Roles();
        List<Roles> rolesList = new ArrayList<>();
        Case cases = new Case();
        Act act = new Act();
        Respondent respondent = new Respondent();
        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
        Petitioner petitioner = new Petitioner();
        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();

        requestInfo.setApiId("");
        requestInfo.setVer("");
        requestInfo.setTs("");
        requestInfo.setResMsgId("uief87324");
        requestInfo.setMsgId("");
        requestInfo.setStatus("ACTIVE");
        requestInfo.setAuthToken("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setId(76);
        userInfo.setUuid("bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfo.setUserName("EMP-DEC");
        userInfo.setName("john Wick");
        userInfo.setMobileNumber("09876543456");
        userInfo.setEmailId("gsf@gmail.com");
        userInfo.setLocale(null);
        userInfo.setType("EMPLOYEE");
        roles1.setName("Data Entry Cell");
        roles1.setCode("DEC");
        roles1.setTenantId("mp");
        roles2.setName("Reviewing Officer");
        roles2.setCode("RO");
        roles2.setTenantId("mp");
        rolesList.add(roles1);
        rolesList.add(roles2);
        userInfo.setRoles(rolesList);
        userInfo.setActive(true);
        userInfo.setTenantId("mp");
        userInfo.setPermanentCity(null);
        requestInfo.setUserInfo(userInfo);
        //case info
        cases.setCreationReason("CREATE");
        cases.setTenantId("mp");
        cases.setCaseNumber(null);
        cases.setCnrNumber("jhgfds34567");
        cases.setParentCaseId("");
        cases.setCaseHierarchy("PARENT");
        cases.setCaseType(null);
        cases.setCaseCategory(null);
        cases.setCaseYear(2);
        cases.setFilingNumber(null);
        cases.setFilingDate(null);
        cases.setRegistrationDate(null);
        cases.setCaseSummary(null);
        cases.setArisingDetails("case creation");
        cases.setPolicyOrNonPolicyMatter(null);
        cases.setApplicationNo("case34567");
        cases.setCaseNumberCorrect(false);
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
        //act details
        act.setActName("ACT098765");
        act.setSectionNumber("098765");
        cases.setAct(act);
        //respondent info
        respondent.setFirstName("RAJ");
        respondent.setLastName("KUMAR");
        respondent.setGender("MALE");
        respondent.setDepartmentName("jbhry9ued");
        respondent.setContactNumber("9876543");
        respondent.setAddress("xcghetf");
        // respondentAdvocate info
        respondentAdvocate.setFirstName("dfgedsf");
        respondentAdvocate.setLastName("hgfds");
        respondentAdvocate.setContactNumber("987654");
        respondent.setRespondentAdvocate(respondentAdvocate);
        cases.setRespondent(respondent);
        // petitioner info
        petitioner.setFirstName("jhgfd");
        petitioner.setLastName("jhgfd");
        petitioner.setGender("MALE");
        petitioner.setPetitionerType("A002");
        petitioner.setAddress("sdfghj");
        petitioner.setContactNumber("98765432");
        // petitionerAdvocate info
        petitionerAdvocate.setFirstName("sdfghj");
        petitionerAdvocate.setLastName("sdfghgfd");
        petitionerAdvocate.setContactNumber("9876543");
        petitioner.setPetitionerAdvocate(petitionerAdvocate);
        cases.setPetitioner(petitioner);
        //request body
        requestBodyDetails.setRequestInfo(requestInfo);
        requestBodyDetails.setCaseDetails(cases);

        return requestBodyDetails;
    }



}
