import java.io.IOException;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

public class AppiumServerJava {
	
	public void startServer() {
//		try {
//			System.out.println("Close old Appium session if exits");
//			stopServer();
//		} catch (Exception e1) {
//			
//			e1.printStackTrace();
//		}
		System.out.println("Start Appium Server");
		CommandLine cmd = new CommandLine("C:\\Program Files (x86)\\Appium\\node.exe");
		cmd.addArgument("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\Appium.js");
		cmd.addArgument("--address");
		cmd.addArgument("127.0.0.1");
		cmd.addArgument("--port");
		cmd.addArgument("4723");
		
		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(cmd, handler);
			Thread.sleep(10000);
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stopServer() {
		System.out.println("Stop Appium Server");
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
//	public static void main(String[] args) {
//		AppiumServerJava appiumServer = new AppiumServerJava();
//		appiumServer.startServer();
//		
//		appiumServer.stopServer();
	}
