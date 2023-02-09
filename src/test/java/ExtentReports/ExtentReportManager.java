package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.restassured.http.Header;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Ajeet Vishwakarma
 * @Date 03/02/2023 - 1:31 PM
 */
public class ExtentReportManager {

    public static ExtentReports extentReports;

    public static ExtentReports createInstance(String fileName, String reportName, String documentTitle)
    {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(fileName);
        extentSparkReporter.config().setReportName(reportName);
        extentSparkReporter.config().setDocumentTitle(documentTitle);
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("utf-8");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        return extentReports;
    }

    public static String getReportNameWithTimeStamp()
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MMM_yyyy_HH_mm_ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = dateTimeFormatter.format(localDateTime);
        String reportName = "AutomationReport_"+formattedTime+".html";

        return  reportName;
    }

    public static void logPassDetails(String log)
    {
        ReportSetup.extentTest.get().pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));
    }
    public static void logFailDetails(String log)
    {
        ReportSetup.extentTest.get().fail(MarkupHelper.createLabel(log, ExtentColor.RED));
    }
    public static void logErrorDetails(String log)
    {
        ReportSetup.extentTest.get().fail(log);
    }
    public static void logInfoDetails(String log)
    {
        ReportSetup.extentTest.get().info(MarkupHelper.createLabel(log, ExtentColor.GREY));
    }
    public static void logWarningDetails(String log)
    {
        ReportSetup.extentTest.get().warning(MarkupHelper.createLabel(log, ExtentColor.YELLOW));
    }

    public static void logJson(String json)
    {
        ReportSetup.extentTest.get().warning(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }

    public static void logHeader(List<Header> headersList)
    {
        String[][] arrayHeader = headersList.stream().map(headers -> new String[] {headers.getName(), headers.getValue()}).toArray(String[][] :: new);

        ReportSetup.extentTest.get().warning(MarkupHelper.createTable(arrayHeader));
    }

}
