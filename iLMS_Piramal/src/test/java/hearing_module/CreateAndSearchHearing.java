package hearing_module;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static hearing_module.SearchHearing.searchHearingCaseId;
import static iLMSActions.casemodule.CreateCaseActions.createParentCaseWithValidData;
import static iLMSActions.hearing.CreateHearingActions.createHearingWithValidData;

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
