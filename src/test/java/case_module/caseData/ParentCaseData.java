package case_module.caseData;

import java.util.Random;

/**
 * @author Ajeet Vishwakarma
 * @created 02/12/2022 - 4:57 PM
 */
public class ParentCaseData {
    static Random random = new Random();
    static int randomNumber = random.nextInt(100000);
    static String caseNo = "ILMS-CASE-"+randomNumber;
    static String cnrNo = "ILMS-CNR-"+randomNumber;


    public static String emptyCaseNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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
    public static String emptyCnrNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \"\",\n" +
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
    public static String emptyCaseType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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

    public static String inValidParentCaseNumber = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseId\": \"CASE-2022-12-12-000001\",\n" +
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

    public static String inValidCaseType = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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

    public static String emptyCreationReason = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"creationReason\": \"\",\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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

    public static String emptyCaseCategory = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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

    public static String invalidCaseYear = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyFilingNumber = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidFilingDate = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 2022,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidRegistrationDate = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 2022,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyCaseSummary = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyArisingDetails = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyPolicyOrNonPolicyMatter = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyApplicationNo = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidIsCaseNumberCorrect = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": xyz,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyCaseStatus = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidFirstHearingDate = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 2022,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidPreviousHearingDate = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 2023,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String invalidNextHearingDate = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 2023,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyCaseStage = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyCaseSubStage = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyCaseFlag = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyDepartmentName = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyRecommendOic = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyRemarks = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyAssignedOfficerId = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String nullAdditionalDetails = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"1\",\n" +
            "        \"additionalDetails\":"+ null+",\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyDocumentType = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"\",\n" +
            "                \"fileStoreId\":\"sdfgh\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyFileStoreId = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyActName = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"asdf\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptySectionNumber = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"asdf\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"shiva\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String emptyRespondentFirstName = "{\n" +
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
            "   \n" +
            "    \"ilmsCase\": {\n" +
            "        \"tenantId\": \"mp\",\n" +
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseNumber\": \"dcfvgh\",\n" +
            "        \"isParentCase\": false,\n" +
            "        \"caseType\": \"normal\",\n" +
            "        \"caseCategory\": \"robery\",\n" +
            "        \"caseYear\": 2022,\n" +
            "        \"filingNumber\": \"asdfgh\",\n" +
            "        \"filingDate\": 1669887369473,\n" +
            "        \"registrationDate\": 1669887369473,\n" +
            "        \"caseSummary\": \"bank robery\",\n" +
            "        \"arisingDetails\": \"nothing\",\n" +
            "        \"policyOrNonPolicyMatter\": \"no\",\n" +
            "        \"applicationNo\": \"case123\",\n" +
            "        \"isCaseNumberCorrect\": true,\n" +
            "        \"caseStatus\": \"ongoing\",\n" +
            "        \"firstHearingDate\": 1669887369473,\n" +
            "        \"previousHearingDate\": 1669887369473,\n" +
            "        \"nextHearingDate\": 1669887369473,\n" +
            "        \"caseStage\": \"Registerd\",\n" +
            "        \"caseSubStage\": \"yes\",\n" +
            "        \"caseFlag\": \"case\",\n" +
            "        \"departmentName\": \"education\",\n" +
            "        \"recommendOic\": \"IOC\",\n" +
            "        \"remarks\": \"nothing\",\n" +
            "        \"assignedOfficerId\": \"\",\n" +
            "        \"additionalDetails\": null,\n" +
            "         \"documents\": [\n" +
            "            {\n" +
            "                \"documentType\":\"Aadhaar\",\n" +
            "                \"fileStoreId\":\"asdf\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"documentType\":\"PAN\",\n" +
            "                \"fileStoreId\":\"dfgh\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"act\": {\n" +
            "            \"actName\": \"test act\",\n" +
            "            \"sectionNumber\": \"47\"\n" +
            "        },\n" +
            "        \"respondent\": {\n" +
            "            \"firstName\": \"\",\n" +
            "            \"lastName\": \"amoria\",\n" +
            "            \"gender\": \"female\",\n" +
            "            \"departmentName\": \"asdf\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"address\": \"Agra\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"vaibhav\",\n" +
            "                \"lastName\": \"jain\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"petitioner\": {\n" +
            "            \"firstName\": \"avanish\",\n" +
            "            \"lastName\": \"singh\",\n" +
            "            \"gender\": \"male\",\n" +
            "            \"petitionerType\": \"retirement\",\n" +
            "            \"address\": \"agra\",\n" +
            "            \"contactNumber\": \"sdf\",\n" +
            "            \"advocate\": {\n" +
            "                \"firstName\": \"manmohan\",\n" +
            "                \"lastName\": \"singh\",\n" +
            "                \"contactNumber\": \"fcvgbh\"\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";

    public static String validJsonPayload = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
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

    public static String validJsonPayloadForChild = "{\n" +
            "    \"RequestInfo\": {\n" +
            "        \"apiId\": \"\",\n" +
            "        \"ver\": \"\",\n" +
            "        \"ts\": \"\",\n" +
            "        \"resMsgId\": \"uief87324\",\n" +
            "        \"msgId\": \"\",\n" +
            "        \"status\": \"ACTIVE\",\n" +
            "        \"authToken\": \"e44b14ef-0393-46bb-9314-460aa9aa5bb6\",\n" +
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
            "        \"caseNumber\": \""+caseNo+"\",\n" +
            "        \"cnrNumber\": \""+cnrNo+"\",\n" +
            "        \"parentCaseId\": \"CASE-2022-12-14-000056\",\n" +
            "        \"caseHierarchy\": \"CHILD\",\n" +
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

}
