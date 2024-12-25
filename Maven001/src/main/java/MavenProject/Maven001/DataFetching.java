package MavenProject.Maven001;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
public class DataFetching 
{
	static String username;
	static  String password;
	  static	public void TestData() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\DataSheet\\DDTSheet.xlsx");
        Workbook w1=WorkbookFactory.create(f1);
         username= NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
        password=  w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
	}

}
