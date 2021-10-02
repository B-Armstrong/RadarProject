import java.io.*;
import java.util.*;
/*
 * Open.java
 *
 * Created on February 10, 2004, 5:16 PM
 */

/**
 *
 * @author  Ben Armstrong
 */
public class Open 
{
    
    private static String dataRead;
    private static String tempData;
    //private static int size;
    /** Creates a new instance of OpenFile */
    public static void  openFile(String fName) throws IOException
    {
       
       
                RandomAccessFile fileInput = new RandomAccessFile(fName, "r");
                dataRead = fileInput.readLine();
               	while ((tempData = fileInput.readLine()) != null)
                {
                	
                	dataRead = dataRead + tempData + fileInput.readLine();
                	
         	}
               
    }
    
    public static String getData()
    {
        return  dataRead;
    }
}
