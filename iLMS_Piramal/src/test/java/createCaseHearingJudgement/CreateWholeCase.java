package createCaseHearingJudgement;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import iLMSActions.casemodule.CreateCaseActions;

import static iLMSActions.hearing.CreateHearingActions.createHearingWithValidData;
import static iLMSActions.judgement.createJudgementActions.createJudgementWithValidData;


/**
 * @author Ajeet Vishwakarma
 * @created 06/12/2022 - 7:30 PM
 */
public class CreateWholeCase {

    @Test
    public void createWholeCase()
    {
        Response createCase = CreateCaseActions.createParentCaseWithValidData();

        String caseId = createCase.jsonPath().getString("caseList.id[0]");
        String caseNumber = createCase.jsonPath().getString("caseList.caseNumber[0]");

        createHearingWithValidData(caseId,caseNumber);

        Response createJudgement = createJudgementWithValidData(caseId);
        createJudgement.getBody().prettyPrint();
    }

}
