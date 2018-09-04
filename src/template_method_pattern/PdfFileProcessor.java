package template_method_pattern;

public class PdfFileProcessor extends FileProcessor {

	@Override
	public void readFile() {
		System.out.println("Reading from a PDF file ...");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing to a PDF file ...");
	}

}
