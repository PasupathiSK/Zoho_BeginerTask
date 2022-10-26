package taskbasicprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import check.CheckClass;
import check.UserDefinedException;

public class FileTask {
//EX 1
public void createWriteInFile(String fName,String...iString) throws  UserDefinedException{//swami - resolved
	CheckClass.checkNull(fName);
	CheckClass.checkNull(iString);
	int length=iString.length;
	try(FileOutputStream foStream=new FileOutputStream(fName,true);){
		for(int i=0;i<length;i++) {
			byte[]bArray=iString[i].getBytes();
			foStream.write(bArray);
		}
	}
	catch(IOException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
}
//EX 2
public void loadMapInProperties(String fName,Properties properties) throws UserDefinedException  {
	CheckClass.checkNull(properties);
	CheckClass.checkNull(fName);
	try (FileWriter fWriter=new FileWriter(fName,true);){
	properties.store(fWriter,"propeties keys and values: ");//swami - resolved
	}
	catch(IOException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
}
//EX 3
public void loadKeyValuesInProperties(Properties properties,String fName) throws  UserDefinedException {
	CheckClass.checkNull(properties);
	CheckClass.checkNull(fName);
	try(FileInputStream fiStream=new FileInputStream(fName);){
	properties.load(fiStream);
	}
	catch(Exception ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
}
//EX 4
public boolean createFile(String dirPath) throws UserDefinedException {
	CheckClass.checkNull(dirPath);
	File root=new File(dirPath);
	return root.mkdir();
}
}
