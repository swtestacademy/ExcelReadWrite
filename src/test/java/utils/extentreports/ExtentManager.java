package utils.extentreports;

import com.relevantcodes.extentreports.ExtentReports;

//OB: extentreports extent instance created here. That instance can be reachable by getReporter() method.

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir+"\\extentreports\\ExtentReportResults.html", true);
        }
        return extent;
    }
}
