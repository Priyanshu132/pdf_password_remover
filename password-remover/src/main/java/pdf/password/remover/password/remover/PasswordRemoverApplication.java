package pdf.password.remover.password.remover;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class PasswordRemoverApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PasswordRemoverApplication.class, args);

		// select a file for Decryption operation
		File file = new File("/home/priyanshu/Downloads/Mutual_Funds_ELSS_Statement_01-04-2023_31-03-2024 (1).pdf");

		// Load the PDF file
		PDDocument pdd = PDDocument.load(file, "JCZPS2910B");

		// removing all security from PDF file
		pdd.setAllSecurityToBeRemoved(true);

		// Save the PDF file
		pdd.save(file);
		// Close the PDF file
		pdd.close();
		System.out.println("Decryption Done...");
	}

}
