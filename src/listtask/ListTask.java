package listtask;

import java.util.List;



import java.util.ArrayList;
import check.CheckClass;
import check.UserDefinedException;

public class ListTask   {
	//find length of string array list
public int lengthNList(List<String>list)throws UserDefinedException{
	CheckClass.checkNull(list);
	return list.size();
}
//find length of integer array list
public int lengthNIntList(List<Integer>list)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.size();
}
//find length of float array list
public int lengthNFloatList(List<Float>list)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.size();
}
//find length of long array list
public long lengthNLongList(List<Long>list) throws UserDefinedException{
	CheckClass.checkNull(list);
	return list.size();
}
//Array List
public static <T>List getList(){
	List <T> list=new ArrayList<T>();
	return list;
}
//add N string in array list
public List<String> addList(String stringArray[])throws UserDefinedException{ 
	CheckClass.checkNull(stringArray);
	int length=stringArray.length;
	List<String>list=new ArrayList<String>();
	for(int i=0;i<length;i++ ){
		list.add(stringArray[i]);
	}
	return list;
}
//add N int in array list
public List<Integer> addNIntList(int inputArray[])throws UserDefinedException{ 
	CheckClass.checkNull(inputArray);
	int length=inputArray.length;
	List<Integer>list=new ArrayList<Integer>(length);
	for(int i=0;i<length;i++) {
		list.add(inputArray[i]);
	}
	return list;
}
//object length
public int lengthObjectList(List<Object>list)throws UserDefinedException{
	CheckClass.checkNull(list);
	return list.size();
}
//add all in List
public List<Object> addAllList(int inputArray[],String stringArray[],Object... object)throws UserDefinedException{
	CheckClass.checkNull(inputArray);
	CheckClass.checkNull(stringArray);
	CheckClass.checkNull(object);
	List<Object>list=new ArrayList<Object>();
	for(int i=0;i<inputArray.length;i++) {
		list.add(inputArray[i]);
	}
	for(int i=0;i<stringArray.length;i++) {
		list.add(stringArray[i]);
	}
	int length=object.length;
	for(int i=0;i<length;i++) {
	list.add(object[i]);
	}
	return list;
}
//find the index of any string
public int indeoxOfList(List<String>list,String inputString)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.indexOf(inputString);
}
//find string in array list
public String indexOfStringinList(List<String>list,int index)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.get(index);
}
public int lastIndexOfStringinList(List<String>list,String inputString)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.lastIndexOf(inputString);
}
//add string in N position
public List<String> addStringNPostioninList(List<String>list,String inputString,int position)throws UserDefinedException{
	CheckClass.checkNull(list);
	list.add(position,inputString);
	return list;
}
public List<String> addListAtPosition(List<String>list,List<String>newList,int startPosition)throws UserDefinedException{
	CheckClass.checkNull(list);
	CheckClass.checkNull(newList);
	newList.addAll(startPosition,list);
	return newList;
}
//add all array list
public List<String> addAllArrayList(List<String>firstList,List<String>secondList,List<String>thirdList)throws UserDefinedException{
	CheckClass.checkNull(firstList);
	CheckClass.checkNull(secondList);
	CheckClass.checkNull(thirdList);
	thirdList.addAll(firstList);
	thirdList.addAll(secondList);
	return thirdList;
}
//add decimal in array list 
public List<Float>addNDecimalinList(float floatArray[])throws UserDefinedException{
	CheckClass.checkNull(floatArray);
	int length=floatArray.length;
	List<Float>list=getList();
	for(int i=0;i<length;i++) {
		list.add(floatArray[i]);
	}
	return list;
}
//remove decimal element from the array list
public List<Float> particularDecimalRemoveinList(List<Float>list,float inputNum)throws UserDefinedException{
	CheckClass.checkNull(list);
	list.remove(inputNum);
	return list;
}
//remove element from the list at particular position
public List<Float>particularPositionRemoveinList(List<Float>list,int position)throws UserDefinedException{
	CheckClass.checkNull(list);
	list.remove(position);
	return list;
}
//add long decimal in array list
public List<Long>addNLongDecimalinList(long longArray[])throws UserDefinedException{
	CheckClass.checkNull(longArray);
	int length=longArray.length;
	List<Long>list=getList();
	for(int i=0;i<length;i++) {
		list.add(longArray[i]);
	}
	return list;
}
//remove particulat index to index in array list
public List<Long>particularIndext0RemoveinList(List<Long>list,int startIndex,int endIndex)throws UserDefinedException{
	CheckClass.checkNull(list);
	list.subList(startIndex, endIndex).clear();
	return list;
}
//add two array list
public List<String>addListinList(List<String>firstList,List<String>secondList,int inputNum)throws UserDefinedException{
	CheckClass.checkNull(firstList);
	CheckClass.checkNull(secondList);
	List<String>list=firstList.subList(0,inputNum);
	secondList.addAll(list);
	List<String>List=getList();
	List.addAll(list);
	return List;
}
public List<String>ListinList(List<String>firstList,List<String>secondList,int inputNum)throws UserDefinedException{
	CheckClass.checkNull(firstList);
	CheckClass.checkNull(secondList);
	List<String>firstlist=firstList.subList(inputNum,firstList.size());
	List<String>list=getList();
	list.addAll(firstlist);
	return list;
}
//remove all
public List<Long>removeAllinList(List<Long>newList)throws UserDefinedException{
	CheckClass.checkNull(newList);
	List<Long>list=getList();
	list.removeAll(newList);
	return list;
}
public boolean checkStirngPresentinList(List<String>list,String inputString)throws UserDefinedException {
	CheckClass.checkNull(list);
	return list.contains(inputString);
}

}
