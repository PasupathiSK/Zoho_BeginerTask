package regularexpression;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexTask {
// EX 1
	public boolean mobileNumberValidation(String inputString) {
		return Pattern.matches("^[789][0-9]{9}", inputString);
	}
// EX 2
	public boolean alphaNumericValidation(String inputString) {
		return Pattern.matches("[a-zA-Z0-9]*", inputString);
	}
// EX 3
	public boolean twoStringMatchingValidation(String inputString, String checkString, int inputNum) {
		
		return (inputNum==1)?Pattern.matches("^["+inputString+"]*", checkString):
			(inputNum==2)?Pattern.matches("["+inputString+"]+", checkString):
				(inputNum==3)?Pattern.matches(".["+inputString+"]", checkString):
					(inputNum==4)?Pattern.matches(inputString, checkString):false;
	}
// EX 4
	public boolean checkStringCaseSensitiveValidation(String inputString, String checkString) {
		return Pattern.compile(checkString,Pattern.CASE_INSENSITIVE).matcher(inputString).matches();
	}
// EX 5
	public boolean emailValidation(String inputString) {
		return Pattern.matches("^[a-zA-Z].[\\w]*.@.[a-zA-Z]*.[.].[a-zA-Z]*", inputString);
	}
// EX 6
	public boolean lengthValidation(String inputString, int minLength, int newLength) {
		return Pattern.matches("\\w{"+minLength+","+newLength+"}",inputString);
	}
// EX 7
	public String rMap(List<String> fList, List<String> sList) {
		Map<String,Integer>map;
		List<Map>list=new ArrayList<Map>();
		int length=fList.size();
		int newLength=sList.size();
		for(int i=0;i<newLength;i++) {
			for(int j=0;j<length;j++) {
				map=new HashMap<String,Integer>();
				if(Pattern.matches(sList.get(i),fList.get(j))) {
					map.put(sList.get(i),j);
					list.add(map);
				}
			}
		}
		return list.toString();
	}
// EX 8
	public String getTagOfString(String inputString) {
		String result="";
		Pattern pattern=Pattern.compile("</?\\w*>");
		Matcher matcher=pattern.matcher(inputString);
		while(matcher.find()) {
			result=result+matcher.group(0)+" ";
		}
		return result;
	}

}
