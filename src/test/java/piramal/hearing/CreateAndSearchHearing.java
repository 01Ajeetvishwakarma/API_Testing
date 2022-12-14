package piramal.hearing;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static hearing_module.CreateHearing.createHearingWithValidData;
import static hearing_module.SearchHearing.searchHearingCaseId;
import static piramal.casemodule.CreateCaseActions.createParentCaseWithValidData;

/**
 * @author Ajeet Vishwakarma
 * @created 14/12/2022 - 11:22 AM
 */
public class CreateAndSearchHearing {

    @Test
    public void createHearingAndSearch()
    {
        Response createCaseResponse = createParentCaseWithValidData();
        String caseId = createCaseResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createCaseResponse.jsonPath().getString("caseList.caseNumber[0]");

        createHearingWithValidData(caseId,caseNumber);

        Response searchHearingResponse = searchHearingCaseId(caseId);
        searchHearingResponse.getBody().prettyPrint();

    }

}
