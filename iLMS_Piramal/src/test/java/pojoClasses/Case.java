//package pojoClasses;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.*;
//import lombok.extern.slf4j.Slf4j;
//
///**
// * @author Ajeet Vishwakarma
// * @Date 09/01/2023 - 6:23 PM
// */
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@Slf4j
//public class Case {
//
//    @JsonProperty("creationReason")
//    private String creationReason;
//
//    @JsonProperty("tenantId")
//    private String tenantId;
//
//    @JsonProperty("caseNumber")
//    private String caseNumber;
//
//    @JsonProperty("cnrNumber")
//    private String cnrNumber;
//
//    @JsonProperty("parentCaseId")
//    private String parentCaseId;
//
//    @JsonProperty("caseHierarchy")
//    private String caseHierarchy;
//
//    @JsonProperty("caseType")
//    private String caseType;
//
//    @JsonProperty("caseCategory")
//    private String caseCategory;
//
//    @JsonProperty("caseYear")
//    private int caseYear;
//
//    @JsonProperty("filingNumber")
//    private String filingNumber;
//
//    @JsonProperty("filingDate")
//    private int filingDate;
//
//    @JsonProperty("registrationDate")
//    private int registrationDate;
//
//    @JsonProperty("caseSummary")
//    private String caseSummary;
//
//    @JsonProperty("arisingDetails")
//    private String arisingDetails;
//
//    @JsonProperty("policyOrNonPolicyMatter")
//    private String policyOrNonPolicyMatter;
//
//    @JsonProperty("applicationNo")
//    private String applicationNo;
//
//    @JsonProperty("isCaseNumberCorrect")
//    private String isCaseNumberCorrect;
//
//    @JsonProperty("caseStatus")
//    private String caseStatus;
//
//    @JsonProperty("firstHearingDate")
//    private int firstHearingDate;
//
//    @JsonProperty("previousHearingDate")
//    private int previousHearingDate;
//
//    @JsonProperty("nextHearingDate")
//    private int nextHearingDate;
//
//    @JsonProperty("caseStage")
//    private String caseStage;
//
//    @JsonProperty("caseSubStage")
//    private String caseSubStage;
//
//    @JsonProperty("caseFlag")
//    private String caseFlag;
//
//    @JsonProperty("departmentName")
//    private String departmentName;
//
//    @JsonProperty("recommendOic")
//    private String recommendOic;
//
//    @JsonProperty("remarks")
//    private String remarks;
//
//    @JsonProperty("assignedOfficerId")
//    private String assignedOfficerId;
//
//    @JsonProperty("additionalDetails")
//    private String additionalDetails;
//
//    @JsonProperty("act")
//    private Act act;
//
//    @JsonProperty("respondent")
//    private Respondent respondent;
//
//    @JsonProperty("petitioner")
//    private Petitioner petitioner;
//
//}
