package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

/**
 * @author Ajeet Vishwakarma
 * @Date 03/02/2023 - 1:49 PM
 */
public class ReportSetup implements ITestListener {

    private static ExtentReports extentReports;
    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();


    public void onTestStart(ITestResult result) {
        ExtentTest test = extentReports.createTest("Test Name: "+result.getMethod().getMethodName());
        extentTest.set(test);
    }

    public void onStart(ITestContext context) {
        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
        String reportPath = System.getProperty("user.dir") + "\\ApiReports\\" + fileName;
        extentReports = ExtentReportManager.createInstance(reportPath,"API Automation Report","Piramal_iLMS Report");
    }

    public void onFinish(ITestContext context) {
        if (extentReports != null)
            extentReports.flush();
    }

    public void onTestFailure(ITestResult result) {
        ExtentReportManager.logFailDetails(result.getThrowable().getMessage());
        String errorLogs = Arrays.toString(result.getThrowable().getStackTrace());
        errorLogs = errorLogs.replaceAll(",","<br>");

        String formattedLogs = "<details>\n" +
                "  <summary>See Error Logs</summary>\n" +
                "  <p>"+errorLogs+"</p>\n" +
                "</details>";

        ExtentReportManager.logErrorDetails(formattedLogs);
    }

}
