package case_module.caseData;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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


//    public CaseRequestBodyDetails getCaseBody(){
//        CaseRequestBodyDetails caseRequestBodyDetails = new CaseRequestBodyDetails();
//        caseRequestBodyDetails.setRequestInfo(getRequestInfo());
//        caseRequestBodyDetails.setCaseDetails(getCaseDetails());
//        return caseRequestBodyDetails;
//    }
//    private Case getCaseDetails(){
//        Case casee = new Case();
//        casee.setCreationReason("CREATE");
//        casee.setTenantId("mp");
//        casee.setCaseNumber("");
//        casee.setCnrNumber("");
//        casee.setParentCaseId("");
//        casee.setCaseHierarchy("");
//        casee.setCaseType("");
//        casee.setCaseCategory("");
//        casee.setCaseYear(2023);
//        casee.setFilingNumber("");
//        casee.setFilingDate(23);
//        casee.setRegistrationDate(4543);
//        casee.setCaseSummary("");
//        casee.setArisingDetails("");
//        casee.setPolicyOrNonPolicyMatter("");
//        casee.setApplicationNo("");
//        casee.setIsCaseNumberCorrect("");
//        casee.setCaseStatus("");
//        casee.setFirstHearingDate(3456);
//        casee.setPreviousHearingDate(543);
//        casee.setNextHearingDate(345);
//        casee.setCaseStage("");
//        casee.setCaseSubStage("");
//        casee.setCaseFlag("");
//        casee.setDepartmentName("");
//        casee.setRecommendOic("");
//        casee.setRemarks("");
//        casee.setAssignedOfficerId("");
//        casee.setAdditionalDetails("");
//        casee.setAct(getAct());
//        casee.setRespondent(getRespondent());
//        casee.setPetitioner(getPetitionerDetails());
//
//        return  casee;
//    }
//    private Petitioner getPetitionerDetails(){
//        Petitioner petitioner=new Petitioner();
//        petitioner.setFirstName("");
//        petitioner.setLastName("");
//        petitioner.setGender("");
//        petitioner.setPetitionerType("");
//        petitioner.setAddress("");
//        petitioner.setContactNumber("");
//        petitioner.setPetitionerAdvocate(getPetitionerAdvocate());
//
//        return petitioner;
//    }
//    private PetitionerAdvocate getPetitionerAdvocate(){
//        PetitionerAdvocate petitionerAdvocate = new PetitionerAdvocate();
//        petitionerAdvocate.setFirstName("");
//        petitionerAdvocate.setLastName("");
//        petitionerAdvocate.setContactNumber("");
//
//        return  petitionerAdvocate;
//    }
//    private Respondent getRespondent(){
//        Respondent respondent = new Respondent();
//        respondent.setFirstName("");
//        respondent.setLastName("");
//        respondent.setGender("");
//        respondent.setDepartmentName("");
//        respondent.setContactNumber("");
//        respondent.setAddress("");
//        respondent.setRespondentAdvocate(getRespondentAdvocate());
//
//        return  respondent;
//    }
//    private  RespondentAdvocate getRespondentAdvocate(){
//        RespondentAdvocate respondentAdvocate = new RespondentAdvocate();
//        respondentAdvocate.setFirstName("");
//        respondentAdvocate.setLastName("");
//        respondentAdvocate.setContactNumber("");
//
//        return  respondentAdvocate;
//    }
//    private Act getAct(){
//        Act act = new Act();
//        act.setActName("");
//        act.setSectionNumber("");
//
//        return  act;
//    }
//    private RequestInfo getRequestInfo(){
//        RequestInfo requestInfo = new RequestInfo();
//        requestInfo.setApiId("");
//        requestInfo.setVer("");
//        requestInfo.setTs("");
//        requestInfo.setResMsgId("uief87324");
//        requestInfo.setMsgId("");
//        requestInfo.setStatus("ACTIVE");
//        requestInfo.setAuthToken(authToken);
//        requestInfo.setUserInfo(getUserInfo());
//
//        return  requestInfo;
//    }
//
//    private UserInfo getUserInfo(){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setId("");
//        userInfo.setUuid("68bf2518-bdf4-4db6-8930-0571d3ed50fb");
//        userInfo.setUserName("EMP_DEC");
//        userInfo.setName("Rishav Johari");
//        userInfo.setMobileNumber("8057353933");
//        userInfo.setEmailId("rishav.johari@walkingtree.tech");
//        userInfo.setLocale(null);
//        userInfo.setType("EMPLOYEE");
//        List<Roles> roles = new ArrayList<>();
//        // roles.set(0,"");
//        userInfo.setRoles(roles);
//        userInfo.setActive("true");
//        userInfo.setTenantId("mp");
//        userInfo.setPermanentCity(null);
//
//        return  userInfo;
//    }


    public String validCaseDetails = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"case\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": null,\n" +
            "        \"caseHierarchy\": \"INDEPENDENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1671099663258,\n" +
            "        \"registrationDate\": 1671099663258,\n" +
            "        \"caseSummary\": \"features test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public String emptyCaseNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public String nullCaseNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + null + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"" + null + "\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseCategory = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseCategory = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"" + null + "\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseYear = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": " + null + ",\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyFilingNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullFilingNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"" + null + "\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullFilingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": " + null + ",\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRegistrationDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": " + null + ",\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseSummary = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseSummary = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"" + null + "\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPolicyOrNonPolicyMatter = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPolicyOrNonPolicyMatter = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"" + null + "\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullIsCaseNumberCorrect = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": " + null + ",\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String falseIsCaseNumberCorrect = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": false,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseStatus = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseStatus = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"" + null + "\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullFirstHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": " + null + ",\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String invalidFirstHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142234567,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPreviousHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String inValidPreviousHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": 16699590,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullNextHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": null,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String inValidNextHearingDate = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseStage = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseStage = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"" + null + "\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyCaseSubStage = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullCaseSubStage = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"" + null + "\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyDepartmentName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullDepartmentName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"" + null + "\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRecommendOic = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRecommendOic = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"" + null + "\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyActName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullActName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"" + null + "\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptySectionNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullSectionNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"" + null + "\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"" + null + "\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"" + null + "\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentDepartmentName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentDepartmentName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"" + null + "\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"" + null + "\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentAddress = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentAddress = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"" + null + "\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentAdvocateFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentAdvocateFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"" + null + "\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentAdvocateLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentAdvocateLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"" + null + "\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyRespondentAdvocateContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullRespondentAdvocateContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"" + null + "\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"" + null + "\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public String nullPetitionerLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"" + null + "\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"" + null + "\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerAddress = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerAddress = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"" + null + "\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"" + null + "\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerAdvocateFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerAdvocateFirstName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"" + null + "\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerAdvocateLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerAdvocateLastName = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"" + null + "\",\n" +
            "                \"contactNumber\": \"9876543210\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String emptyPetitionerAdvocateContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public String nullPetitionerAdvocateContactNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"" + authToken + "\",\n" +
            "        \"userInfo\": {\n" +
            "            \"id\": 97,\n" +
            "            \"uuid\": \"68bf2518-bdf4-4db6-8930-0571d3ed50fb\",\n" +
            "            \"userName\": \"EMP_DEC\",\n" +
            "            \"name\": \"Rishav Johari\",\n" +
            "            \"mobileNumber\": \"8057353933\",\n" +
            "            \"emailId\": \"rishav.johari@walkingtree.tech\",\n" +
            "            \"locale\": null,\n" +
            "            \"type\": \"EMPLOYEE\",\n" +
            "            \"roles\": [\n" +
            "                {\n" +
            "                    \"name\": \"Data Entry Cell\",\n" +
            "                    \"code\": \"DEC\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"Employee\",\n" +
            "                    \"code\": \"EMPLOYEE\",\n" +
            "                    \"tenantId\": \"mp\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"active\": true,\n" +
            "            \"tenantId\": \"mp\",\n" +
            "            \"permanentCity\": null\n" +
            "        }\n" +
            "    },\n" +
            "    \"ilmsCase\": {\n" +
            "        \"creationReason\": \"CREATE\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \"" + caseNo + "\",\n" +
            "        \"cnrNumber\": \"" + cnrNo + "\",\n" +
            "        \"parentCaseId\": \"\",\n" +
            "        \"caseHierarchy\": \"PARENT\",\n" +
            "        \"caseType\": \"ARB-DC\",\n" +
            "        \"caseCategory\": \"SM001\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"filing123\",\n" +
            "        \"filingDate\": 1669959086142,\n" +
            "        \"registrationDate\": 1669959086142,\n" +
            "        \"caseSummary\": \"test Case\",\n" +
            "        \"arisingDetails\": \"Case Create\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"Case12345\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"PFA001\",\n" +
            "        \"firstHearingDate\": 1669959086142,\n" +
            "        \"previousHearingDate\": null,\n" +
            "        \"nextHearingDate\": 1669959086142,\n" +
            "        \"caseStage\": \"NOP-CP\",\n" +
            "        \"caseSubStage\": \"DE-DEC\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"DP002\",\n" +
            "        \"recommendOic\": \"DPC002\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "        \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_PETITION_COPY\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\": \"ILMS_DOCS_COUNTER_AFFIDAVIT_REMINDER\",\n" +
            "                \"fileStoreId\": \"ILMS_DOC2\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"Act305\",\n" +
            "            \"sectionNumber\": \"122\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"ABC\",\n" +
            "            \"lastName\": \"SIngh\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"departmentName\": \"DP002\",\n" +
            "            \"contactNumber\": \"0987675431\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"ABC\",\n" +
            "                \"lastName\": \"Roy\",\n" +
            "                \"contactNumber\": \"8790654321\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"XYZ\",\n" +
            "            \"lastName\": \"Shah\",\n" +
            "            \"gender\": \"MALE\",\n" +
            "            \"petitionerType\": \"A001\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"8423324685\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"XYZ\",\n" +
            "                \"lastName\": \"Singh\",\n" +
            "                \"contactNumber\": \"" + null + "\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";


//    public static void validCaseBody() throws IOException {
//
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode root = mapper.readTree(new File("src\\test\\resources\\json\\caseRequestBody\\validCaseDetails.json"));
//
//
//        // Update the desired field
//        ((ObjectNode) root).put("RequestInfo.authToken", authToken);
//        ((ObjectNode) root).put("case.caseNumber", caseNo);
//        ((ObjectNode) root).put("case.cnrNumber", cnrNo);
//
//        // Write the updated JSON data back to the file
//        mapper.writeValue(new File("src\\test\\resources\\json\\caseRequestBody\\validCaseDetails.json"), root);
//    }

    public static void validCaseBody() throws IOException {

        try {
            String filePath = "src\\test\\resources\\json\\caseRequestBody\\validCaseDetails.json";
            // Read the JSON file
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject json = new JSONObject(jsonString);

            // Change the value of a field
            json.getJSONObject("RequestInfo").put("authToken", authToken);

            // Write the modified JSON object to the file
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(json.toString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("The value of the field has been changed successfully!");
        } catch (Exception e) {
            System.out.println("An error occurred while changing the value of the field: " + e.getMessage());
        }

    }

    public static void main(String[] args) throws IOException {
        validCaseBody();
    }

    public static Object getCaseRequestBody()
    {
        Map<String,Object> rolesMap1 = new LinkedHashMap<>();
        rolesMap1.put("name","Data Entry Cell");
        rolesMap1.put("code","DEC");
        rolesMap1.put("tenantId","mp");

        Map<String,Object> rolesMap2 = new LinkedHashMap<>();
        rolesMap2.put("name","Reviewing Officer ");
        rolesMap2.put("code","RO");
        rolesMap2.put("tenantId","mp");

        List<Map<String,Object>> rolesList = new ArrayList<>();
        rolesList.add(rolesMap1);
        rolesList.add(rolesMap2);

        Map<String,Object> userInfoMap = new LinkedHashMap<>();
        userInfoMap.put("id",97);
        userInfoMap.put("uuid","68bf2518-bdf4-4db6-8930-0571d3ed50fb");
        userInfoMap.put("userName","EMP_DEC");
        userInfoMap.put("name","Rishav Johari");
        userInfoMap.put("mobileNumber","8057353933");
        userInfoMap.put("emailId","rishav.johari@walkingtree.tech");
        userInfoMap.put("locale",null);
        userInfoMap.put("type","EMPLOYEE");
        userInfoMap.put("roles", rolesList);
        userInfoMap.put("active",true);
        userInfoMap.put("tenantId","mp");
        userInfoMap.put("permanentCity",null);

        Map<String,Object> requestInfoMap = new LinkedHashMap<>();
        requestInfoMap.put("apiId","");
        requestInfoMap.put("ver","");
        requestInfoMap.put("ts","");
        requestInfoMap.put("resMsgId","uief87324");
        requestInfoMap.put("msgId","");
        requestInfoMap.put("status","ACTIVE");
        requestInfoMap.put("authToken","68bf2518-bdf4-4db6-8930-0571d3ed50fb");
        requestInfoMap.put("userInfo",userInfoMap);

        Map<String,Object> actMap = new LinkedHashMap<>();
        actMap.put("actName","ACT2345");
        actMap.put("sectionNumber","345");

        Map<String,Object> respondentAdvocateMap = new LinkedHashMap<>();
        respondentAdvocateMap.put("firstName","asdfg");
        respondentAdvocateMap.put("lastName","asdfg");
        respondentAdvocateMap.put("contactNumber","345678765432");

        Map<String,Object> petitionerAdvocateMap = new LinkedHashMap<>();
        petitionerAdvocateMap.put("firstName","asdfg");
        petitionerAdvocateMap.put("lastName","asdfg");
        petitionerAdvocateMap.put("contactNumber","345678765432");

        Map<String,Object> respondentMap = new LinkedHashMap<>();
        respondentMap.put("firstName","John");
        respondentMap.put("lastName","Wick");
        respondentMap.put("gender","MALE");
        respondentMap.put("departmentName","DEVELOP");
        respondentMap.put("contactNumber","34567876543");
        respondentMap.put("address","asdfghj");
        respondentMap.put("advocate",respondentAdvocateMap);

        Map<String,Object> petitionerMap = new LinkedHashMap<>();
        petitionerMap.put("firstName","asdfgh");
        petitionerMap.put("lastName","jhgfd");
        petitionerMap.put("gender","MALE");
        petitionerMap.put("petitionerType","A001");
        petitionerMap.put("address","sdfg");
        petitionerMap.put("contactNumber","3567765432");
        petitionerMap.put("advocate",petitionerAdvocateMap);

        Map<String,Object> caseMap = new LinkedHashMap<>();
        caseMap.put("creationReason","CREATE");
        caseMap.put("tenantId","mp");
        caseMap.put("caseNumber","caseNumber");
        caseMap.put("cnrNumber","cnrNumber");
        caseMap.put("parentCaseId","");
        caseMap.put("caseHierarchy","PARENT");
        caseMap.put("caseType","ARB-DC");
        caseMap.put("caseCategory","SM001");
        caseMap.put("caseYear","2023");
        caseMap.put("filingNumber","filingNumber");
        caseMap.put("filingDate","1669959086142");
        caseMap.put("registrationDate","1669959086142");
        caseMap.put("caseSummary","test case");
        caseMap.put("arisingDetails","case create");
        caseMap.put("policyOrNonPolicyMatter","yes");
        caseMap.put("applicationNo","case23456");
        caseMap.put("isCaseNumberCorrect",true);
        caseMap.put("caseStatus","PFA001");
        caseMap.put("firstHearingDate","1669959086142");
        caseMap.put("previousHearingDate",null);
        caseMap.put("nextHearingDate","1669959086142");
        caseMap.put("caseStage","NOP-CP");
        caseMap.put("caseSubStage","DE-DEC");
        caseMap.put("caseFlag",null);
        caseMap.put("recommendOic","DPC0032");
        caseMap.put("departmentName","DP002");
        caseMap.put("remarks","asdfghjk");
        caseMap.put("assignedOfficerId","8f9-d954-4f65-affc-13034318fd2");
        caseMap.put("additionalDetails",null);
        caseMap.put("act",actMap);
        caseMap.put("respondent",respondentMap);
        caseMap.put("petitioner",petitionerMap);

        Map<String,Object> caseRequestBody = new LinkedHashMap<>();
        caseRequestBody.put("RequestInfo",requestInfoMap);
        caseRequestBody.put("case",caseMap);

        return caseRequestBody;
    }

}
