package assignment.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Webpagescreenshot {
	
	public static void fullscreenshot(WebDriver driver, String filetype,String Path ) throws IOException, DocumentException
	{
		
		if (filetype == "jpg"){
		Screenshot FullScreen= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(FullScreen.getImage(), filetype, new File(Path));
		System.out.println("JFG format Selected");
		}
		
		else if(filetype == "pdf"){			
		byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Document document = new Document();
		String output = Path ;
		FileOutputStream fos = new FileOutputStream(output);
		// Instantiate the PDF writer
		PdfWriter writer = PdfWriter.getInstance(document, fos);
		// open the pdf for writing
		writer.open();
		document.open();
		// process content into image
		Image im = Image.getInstance(input);
		//set the size of the image
		im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);
		// add the captured image to PDF
		document.add(im);
		document.add(new Paragraph(" "));
		//close the files and write to local system
		document.close();
		writer.close();
		System.out.println("PDF format Selected");
		}
		
		else {			
		    	System.out.println("Invalid format selected");
		}				
	}
	

	public static void main(String[] args) throws IOException, DocumentException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Java_Asssignment\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();		
		Webpagescreenshot.fullscreenshot(driver, "pdf", "D:\\Selenium\\Java_Asssignment\\Screenshot\\ElementScreenshot.pdf");
		driver.quit();
	}
}
