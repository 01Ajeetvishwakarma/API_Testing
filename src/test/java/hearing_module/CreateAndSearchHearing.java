package hearing_module;


import iLMSActions.casemodule.CreateCaseActions;
import iLMSActions.hearing.CreateHearingActions;
import io.restassured.response.Response;
import org.testng.annotations.Test;






/**
 * @author Ajeet Vishwakarma
 * @created 14/12/2022 - 11:22 AM
 */
public class CreateAndSearchHearing {

    @Test
    public void createHearingAndSearch()
    {
        Response createCaseResponse = CreateCaseActions.createParentCaseWithValidData();
        String caseId = createCaseResponse.jsonPath().getString("caseList.id[0]");
        String caseNumber = createCaseResponse.jsonPath().getString("caseList.caseNumber[0]");

        CreateHearingActions.createHearingWithValidData(caseId,caseNumber);

        Response searchHearingResponse = SearchHearing.searchHearingCaseId(caseId);
        searchHearingResponse.getBody().prettyPrint();

    }

}
