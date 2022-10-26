package reflectiontask;

import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import check.UserDefinedException;
import check.CheckClass;

public class TaskReflection {
// EX 1
public Class getClassObject(String iString) throws UserDefinedException{
	CheckClass.checkNull(iString);
	Class cObject=null;
	try {
		cObject = Class.forName(iString);
	} catch (ClassNotFoundException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return cObject;
}
// EX 2
public Constructor getDefaultConstructorObject(Class object)throws UserDefinedException {
	CheckClass.checkNull(object);
	Constructor constructor=null;
	try {
		constructor=object.getConstructor();
	} catch (NoSuchMethodException | SecurityException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return constructor;
}
// EX 3
public Object getObjectInstance(Constructor cObject)throws UserDefinedException{
	CheckClass.checkNull(cObject);
	Object object=null;
	try {
		object=cObject.newInstance();
	} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return object;
}
//
public Object getOverloadedObjectInstance(Constructor cObject,String inputString,int inputNum) throws UserDefinedException{
	CheckClass.checkNull(cObject);
	inputString=null;
	Object object=null;
	try {
		object=cObject.newInstance(inputString,inputNum);
	} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return object;
}
// EX 4
public Constructor getOverloadedConstructorObject(Class object,Class[]inputString) throws UserDefinedException{
	CheckClass.checkNull(inputString);
	CheckClass.checkNull(object);
	int length=inputString.length;
	Class [] constructorClass=new Class[length];
	for(int i=0;i<length;i++) {
		constructorClass[i]=inputString[i];
	}
	Constructor constructor=null;
	try {
		 constructor=object.getConstructor(constructorClass);
	} catch (NoSuchMethodException | SecurityException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return constructor;
}
// EX 5
public Method[] getArrayOfMethods(Class cObject)throws UserDefinedException {
	CheckClass.checkNull(cObject);
	Method[]method=cObject.getDeclaredMethods();
	return method;
}
// EX 6 
public Method getMethodObject(Class object,String mString)throws UserDefinedException {
	CheckClass.checkNull(object);
	CheckClass.checkNull(mString);
	Method method=null;
		try {
			method=object.getDeclaredMethod(mString);
		} catch (NoSuchMethodException | SecurityException ex) {
			throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
		}
	return method;
}
// EX 7
public Object getInvokeObject(Method method,Object object,Object...input)throws UserDefinedException {
	CheckClass.checkNull(object);
	CheckClass.checkNull(method);
	Object result=null;
	try {
		result=method.invoke(object,input);
	} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
		throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
	}
	return result;
}
}
