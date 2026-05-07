package ExtentReportDemo;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

public class BasicExtentReportClass {

    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    @BeforeTest
    public void setup() {

        htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");

        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        reports.setSystemInfo("Machine", "test PC1");
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("User", "Prachi");
        reports.setSystemInfo("Browser", "Chrome");

        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Automation Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
    }

    @Test
    public void LaunchBrowserAndOpenURL() {
        test = reports.createTest("Launch browser and open URL");
        Assert.assertTrue(true);
    }

    @Test
    public void VerifyTitle() {
        test = reports.createTest("Verify Title");
        Assert.assertTrue(false);
    }

    @Test
    public void VerifyLogo() {
        test = reports.createTest("Verify Logo");
        Assert.assertTrue(true);
    }

    @Test
    public void VerifyEmail() {
        test = reports.createTest("Verify Email");
        throw new SkipException("Skipping test");
    }

    @Test
    public void VerifyUserName() {
        test = reports.createTest("Verify Username");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void getTestResult(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL,
                    MarkupHelper.createLabel(result.getName() + " FAIL", ExtentColor.RED));
        }

        else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS,
                    MarkupHelper.createLabel(result.getName() + " PASS", ExtentColor.GREEN));
        }

        else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP,
                    MarkupHelper.createLabel(result.getName() + " SKIPPED", ExtentColor.ORANGE));
        }
    }

    @AfterTest
    public void tearDown() {
        reports.flush();
    }
}