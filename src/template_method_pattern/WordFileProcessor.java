package template_method_pattern;

public class WordFileProcessor extends FileProcessor {

	@Override
	public void readFile() {
		System.out.println("Reading from a Word file ...");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing to a Word file ...");
	}

}
