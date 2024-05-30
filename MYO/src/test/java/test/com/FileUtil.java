/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author User
 */
public class FileUtil {
    
    public static Contact getData() throws Exception {

            //read excel file

     FileInputStream inputStream = new FileInputStream(new File("c:\\data\\contact1.xlsx"));

         

        Workbook workbook = new XSSFWorkbook(inputStream);


        //getting first worksheet

        Sheet firstSheet = workbook.getSheetAt(0);

        

       //get first row

        Row r =  firstSheet.getRow(0);  //first row

        Cell c = r.getCell(1); //username value

        String firstname = c.getStringCellValue();

        

        

        r =  firstSheet.getRow(1);  //second row 

        c = r.getCell(1); //password value

        String lastname = c.getStringCellValue();

        

        

        
        
        
        
        r =  firstSheet.getRow(3);  //third row 

        c = r.getCell(1); //email value

        String email = c.getStringCellValue();
        
        
        r =  firstSheet.getRow(4);  //third row 

        c = r.getCell(1); //email value

        String massage = c.getStringCellValue();

        

        //Populate POJO

        Contact contact  = new Contact (firstname, lastname,email, massage);

        

        System.out.println(contact);

        inputStream.close();

        return contact;

    }
    
}
