package template_method_pattern;

public abstract class FileProcessor {

	public final void processFile() {
		
		boolean writeToFile = false;
		
		openFile();
		
		if(writeToFile = userWantsToWrite()) {
			writeFile();
			saveFile();
		} else {
			readFile();
		}
		
		
		closeFile();
		
		
	}


	public abstract void readFile();


	public abstract void writeFile();


	private void openFile() {
		System.out.println("Opening the file ...");

	}

	private void closeFile() {
		System.out.println("Closing the file ...");

	}

	private void saveFile() {
		System.out.println("Saving the file ...");
		
	}

	private boolean userWantsToWrite() {
		return false;
	}
}
