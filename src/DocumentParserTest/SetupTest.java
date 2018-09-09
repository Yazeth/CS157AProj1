package DocumentParserTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.util.ArrayList;

import DocumentParser.*;
import org.junit.jupiter.api.Test;

class SetupTest {

	@Test
	void GetDocumentsReturnsArrayOfFiles() {
		File[] documents = Setup.GetDocuments();
		assertEquals(1, documents.length);
	}
//	
//	@Test
//	void ReadFromDocumentTest() {
//		ArrayList<String> result = Setup.ReadDocument(new File("Documents/Document1.txt"));
//		for(String s: result)
//		{
//			System.out.println(s);
//		}
//	}
	
	@Test
	void SpecialCharacterTest() {
		ArrayList<String> result = Setup.ReadDocument(new File("Documents/Document1.txt"));
	}

}
