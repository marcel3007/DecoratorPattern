package template_method_pattern;

public class TemplatePatternTest {

	public static void main(String[] args) {
		
		FileProcessor wordFileProcessor = new WordFileProcessor();
		wordFileProcessor.processFile();
		
		
		FileProcessor pdfFileProcessor = new PdfFileProcessor();
		pdfFileProcessor.processFile();
		
	}

}
