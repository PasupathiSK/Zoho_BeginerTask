package reflectiontask;



import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Logger;

import check.UserDefinedException;

public class ReflectionTestRunner {
public static  Logger logger=Logger.getLogger(ReflectionTestRunner.class.getName());
	public static void main(String args[]) throws UserDefinedException {
		String inputString="";
		int length=0;
		Scanner input=new Scanner(System.in);
		logger.info("Enter a value: ");
		inputString=input.next();
		logger.info("Enter a length: ");
		length=input.nextInt();
	   try {
		String path="taskbasicprogram.PojoNewCustome";
		TaskReflection task=new TaskReflection();
		Class cObject=task.getClassObject(path);
		Constructor constructor=task.getDefaultConstructorObject(cObject);
		Object object=task.getObjectInstance(constructor);
		Class[] cArray= {String.class,int.class};
		constructor=task.getOverloadedConstructorObject(cObject, cArray);
		object=task.getOverloadedObjectInstance(constructor, inputString, length);
		Method[]method=task.getArrayOfMethods(cObject);
		Method nMethod=null;
		String result="";
		int mLength=method.length;
	    nMethod=task.getMethodObject(cObject,"getString");
	    logger.info(""+task.getInvokeObject(nMethod, object));
	    nMethod=task.getMethodObject(cObject, "getInt");
	    logger.info(""+task.getInvokeObject(nMethod, object));
		}
		catch(UserDefinedException ex) {
			ex.printStackTrace();
		}
	}
	}
