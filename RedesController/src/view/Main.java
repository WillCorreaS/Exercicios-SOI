package view;

import java.io.IOException;
import controller.RedesController;

public class Main {
	public static void main(String args []) throws InterruptedException, IOException {
		RedesController os = new RedesController();
		//procController ping = new procController();
		//String inputText = " ";
		
		//Primeiro método
		os.os();
		
		//Segundo método
		os.ip();
		
		//Terceiro método
		os.ping();
		
	}


}
