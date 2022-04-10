package com.lockedme.project1;

public class LockedMeMain {
	
	public static void main(String[] args) {
			
	
			FileOperations.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("LockedMe", "Priya Chougule");
			
			HandleOptions.handleWelcomeScreenInput();
		}

}
