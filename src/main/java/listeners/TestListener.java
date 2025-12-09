package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import baseTest.BaseTest;
import utils.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestListener extends BaseTest implements ITestListener {

    private static ExtentReports extent = ExtentReportManager.getReporter();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        System.out.println("🚀 Test Execution Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("🏁 Finishing Test Execution...");
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed ✔");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test Failed ❌");
        test.get().log(Status.FAIL, result.getThrowable());

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String path = "./screenshots/" + result.getName() + ".png";

            File dest = new File(path);
            FileUtils.copyFile(src, dest);

            test.get().addScreenCaptureFromPath(path);

        } catch (Exception e) {
            test.get().log(Status.WARNING, "Screenshot capture failed!");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped ⚠");
        test.get().log(Status.SKIP, result.getThrowable());
    }
}
