package createCaseHearingJudgement;

import io.restassured.response.Response;
import judgement_module.CreateJudgement;
import org.testng.annotations.Test;
import piramal.casemodule.CreateCaseActions;

import static hearing_module.CreateHearing.createHearingWithValidData;

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

        Response createJudgement = CreateJudgement.createJudgement(caseId);
        createJudgement.getBody().prettyPrint();
    }

}
