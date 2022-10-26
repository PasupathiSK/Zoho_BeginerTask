package stringbuilder;
import check.UserDefinedException;
import check.CheckClass;

public class StringBuilderTask {
	
	//create a StringBuilder
	public StringBuilder getStringBuilder() {
		StringBuilder sBuilder=new StringBuilder();
		return sBuilder;
	}
	//EX1
	//find StringBuilder length
	public int findLenghtStringBuilder(StringBuilder sBuilder)throws UserDefinedException{
		CheckClass.checkNull(sBuilder);
		return sBuilder.length();
	}
	//append inputString in StringBuilder
	public StringBuilder addNStringinStringBuilder(StringBuilder sBuilder,String... inputString)throws UserDefinedException{
		//checkNull(inputString);
		CheckClass.checkNull(sBuilder);
		int length = inputString.length;
		for (int i=0; i<length; i++)
		{
		sBuilder.append(inputString[i]);
		}
		return sBuilder;
	}
	//EX2
	//add N number of string to StringBuilder and find length
	public StringBuilder stringBuilderNLength(StringBuilder sBuilder,String symbol,String... stringArray) throws UserDefinedException{
//		checkNull(stringArray);
//		checkNull(symbol);
		int length=findLenghtStringBuilder(sBuilder);
		if(length>0)
		{
			sBuilder.append(symbol);
		}
		for(int i=0;i<stringArray.length;i++) {
		sBuilder.append(stringArray[i]);
		sBuilder.append(symbol);
		}
		int newLength=sBuilder.length();
		sBuilder.deleteCharAt(newLength-1);
		return sBuilder;
	}
	//EX3
	//add N number of String to StringBuilder and add another N number of String between those two String and find length
	public StringBuilder addNStringinbetweenStringBuilderString(StringBuilder sBuilder,String symbol,String... stringSecondArray)throws UserDefinedException {
//		checkNull(stringSecondArray);
		CheckClass.checkNull(sBuilder);
//		checkNull(symbol);
		int position=0;
		int length=stringSecondArray.length;
		for(int i=0;i<length;i++) {
			position=sBuilder.lastIndexOf(symbol);//swami
			sBuilder.insert(position,stringSecondArray[i]);
			sBuilder.insert(position, symbol);
		}
		return sBuilder;
	}
	//EX4
	//find after delete first String
	public StringBuilder afterDeleteStringLength(StringBuilder sBuilder,String symbol)throws UserDefinedException {
		CheckClass.checkNull(sBuilder);
		//checkNull(symbol);
		int position=sBuilder.indexOf(symbol);//swami
		return sBuilder.delete(0,position+1);
	}
	//EX5
	//replace with particular symbol
	public StringBuilder replaceWithSymbol(StringBuilder sBuilder,String symbol) throws UserDefinedException{
		int length=findLenghtStringBuilder(sBuilder);
		char characterSymbol=symbol.charAt(0);
		for(int i=0;i<length;i++) {
			if(sBuilder.charAt(i)==characterSymbol) {
				sBuilder.replace(i, i+1,symbol);
			}
		}
		return sBuilder;
	}
	//EX6
	//reverse a string
	public StringBuilder reverseString(StringBuilder sBuilder)throws UserDefinedException {
		CheckClass.checkNull(sBuilder);
		return sBuilder.reverse();
	}
	//Ex7
	//delete a particular index to index string
	public StringBuilder indexBaseDeleteString(StringBuilder sBuilder,int startIndex,int endIndex)throws UserDefinedException {
		int length=findLenghtStringBuilder(sBuilder);
		CheckClass.checkIndex(startIndex,endIndex,length);
		return sBuilder.delete(startIndex, endIndex);
	}
	//EX8
	//replace a particular index to index string
	public StringBuilder indexBaseReplaceString(StringBuilder sBuilder,int startIndex,int endIndex,String replaceString)throws UserDefinedException {
		CheckClass.checkEmpty(replaceString);
		int length=findLenghtStringBuilder(sBuilder);
		CheckClass.checkIndex(startIndex,endIndex,length);
		return sBuilder.replace(startIndex, endIndex, replaceString);
	}
	//EX9
	//find index of symbol
	public int indexOfSymbol(StringBuilder sBuilder,String symbol)throws UserDefinedException {
		//checkNull(symbol);
		CheckClass.checkNull(sBuilder);
		return sBuilder.indexOf(symbol);
	}
	//EX10
	//find last index of symbol
	public int lastIndexOfSymbol(StringBuilder sBuilder,String symbol)throws UserDefinedException {
		//checkNull(symbol);
		CheckClass.checkNull(sBuilder);
		return sBuilder.lastIndexOf(symbol);
	}
}
