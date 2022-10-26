package taskHashMap;

import java.util.Map;

import check.UserDefinedException;
import check.CheckClass;//swami - resolved

public class MapTask {
	//Ex 1 To 7
public <T, U> int mapLength(Map<T,U>map) throws UserDefinedException {
	CheckClass.checkNull(map);
	return map.size();
}
public <T> int mapStringLength(Map<String,T>map) throws UserDefinedException {
	CheckClass.checkNull(map);
	return map.size();
}
//EX 8
public boolean checkKeyContains(Map<Integer,String>map,int checkKey) throws UserDefinedException {
	CheckClass.checkNull(map);
	return map.containsKey(checkKey);
}
//EX 9
public boolean checkValueContains(Map<Integer,String>map,String inputString) throws UserDefinedException {
	CheckClass.checkNull(map);
	return map.containsValue(inputString);
}
//EX 10
public <T>Map replaceValuesinMap(Map<String,String>map,String inputString,String firstString,String secondString) throws UserDefinedException{
	CheckClass.checkNull(map);
	map.replace("first",inputString);
	map.replace("second", firstString);
	map.replace("third", secondString);
	return map;
}
//EX 11 to 12
public String getKeyValueinMap(Map<Integer,String>map,int checkKey) throws UserDefinedException {
	CheckClass.checkNull(map);
	return map.get(checkKey);
}
//EX 13
public String checkNonkeyContainValueinMap(Map<Integer,String>map,int checkKey,String checkValue) throws UserDefinedException{
	CheckClass.checkNull(map);
//	if(!checkKeyContains(map,checkKey)) {//swami - resolved
//		map.put(null,"zoho");
//	}
	return map.getOrDefault(checkKey,checkValue);
}
//Ex 14
public <T>Map removeKeyValueinMap(Map<Integer,String>map,int checkKey) throws UserDefinedException{
	CheckClass.checkNull(map);
	map.remove(checkKey);
	return map;
}
//Ex 15
public <T>Map checkKeyValueinMap(Map<Integer,String>map,int checkKey,String inputString) throws UserDefinedException {
	CheckClass.checkNull(map);
	map.remove(checkKey, inputString);
	return map;
}
//EX 16 to 17
public <T>Map replaceKeyValueinMap(Map<Integer,String>map,int checkKey,String inputString) throws UserDefinedException{
	CheckClass.checkNull(map);
	map.replace(checkKey, inputString);
	return map;
}
//EX 18
public <T>Map addMapinMap(Map<Integer,String>map,Map<Integer,String>newMap) throws UserDefinedException{
	CheckClass.checkNull(map);
	CheckClass.checkNull(newMap);
	newMap.putAll(map);
	return newMap;
}
//EX 20
public <T>Map removeMap(Map<Integer,String>map) throws UserDefinedException{
	CheckClass.checkNull(map);
	map.clear();
	return map;
}
}
