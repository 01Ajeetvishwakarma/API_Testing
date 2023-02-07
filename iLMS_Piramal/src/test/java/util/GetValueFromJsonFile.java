package util;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.*;

/**
 * @author Ajeet Vishwakarma
 * @Date 06/02/2023 - 12:30 PM
 */
public class GetValueFromJsonFile {

    public static void main(String[] args) {

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


//        System.out.println(caseRequestBody);

        RestAssured.given().log().all().body(caseRequestBody).get();




    }

}
