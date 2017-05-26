
import java.io.IOException;
 
public class Emulator {
	
	public void startEmulator() {
		System.out.println("Start Emulator");
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("cmd.exe /c start cmd.exe /k \"C:\\ProgramData\\BlueStacksGameManager\\BlueStacks.exe");
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stopEmulator() {
		System.out.println("close Emulator");
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM BlueStacks.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		Emulator emulator = new Emulator();
//		
//		emulator.startEmulator();
// 
//		emulator.stopEmulator();
//	}
}