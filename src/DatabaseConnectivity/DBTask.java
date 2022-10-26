package DatabaseConnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import check.CheckClass;
import check.UserDefinedException;

public class DBTask {
//Database Connection


// Get Prepared Statement 
	public PreparedStatement getPreparedStatement(String query)throws UserDefinedException {
		try{
			Connection con=connectionDB();
			PreparedStatement newPStatement=con.prepareStatement(query);
			return newPStatement;
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// Get Connection
	public static Connection connectionDB()throws UserDefinedException {
		String dataBase="jdbc:mysql://localhost/incubationDB";
		String uName="incubation";
		String uPassword="Pasu@143";
		Connection con=null;
		try{
			con=DriverManager.getConnection(dataBase,uName,uPassword);
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return con;
	}
	
	
// Get ArrayList
	public <T>List<T> getList(){
		List<T> list=new ArrayList<>();
		return list;
	}
	
// Get Query
	public String getQuery(int caseInt,String tName) {
		String query="";
		if(caseInt==1) {
			query="CREATE TABLE "+tName+"(EMPLOYEE_ID INTEGER NOT NULL,"+"NAME VARCHAR(50),"+"MOBILE INTEGER(10),"+"EMAIL VARCHAR(50),"
				       +"DEPARTMENT VARCHAR(50),"+"PRIMARY KEY(EMPLOYEE_ID))";
		}
		if(caseInt==9) {
			query="CREATE TABLE "+tName+"(NAME VARCHAR(50),AGE BIGINT,RELATIONSHIP VARCHAR(50),EMPLOYEE_ID INTEGER NOT NULL"
				       + ",FOREIGN KEY(EMPLOYEE_ID) REFERENCES Employee(EMPLOYEE_ID))";
		}
		return query;
	}
	
	
// EX 1  and EX 9
	public  void createTable(String tName) throws UserDefinedException{
		CheckClass.checkNull(tName);
     //   String cTable=getQuery(checkInput,tName);//swami - resolved
		try(Connection con=connectionDB();
				Statement statement=con.createStatement();){
				statement.execute(tName);
			}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 2
	public void insertValuesInTable(int id,String name,String eMail,String department,String mNumber) throws UserDefinedException {
		String statement="insert into Employee values(?,?,?,?,?)";
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.setInt(1,id);
			pStatement.setString(2, name);
			pStatement.setString(3, eMail);
			pStatement.setString(4, department);
			pStatement.setString(5, mNumber);
			pStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 3 as 5
	public List<Map> retriveDataFromTable(String name) throws UserDefinedException{
		String statement="select * from Employee where name=?";
		List<Map>list=new ArrayList<>();
		try(PreparedStatement pStatement=getPreparedStatement(statement)) {
			pStatement.setString(1, name);
			try(ResultSet resultSet=pStatement.executeQuery()){
//				Map<Object,Object>map;//swami - resolved
				ResultSetMetaData rsmData=resultSet.getMetaData();
				while(resultSet.next()) {
					Map<Object,Object>map=new HashMap<>();
					int length=rsmData.getColumnCount();
					for(int j=1;j<=length;j++) {
						String key=rsmData.getColumnLabel(j);
						Object cValue=resultSet.getObject(rsmData.getColumnLabel(j));
						map.put(key, cValue);
					}
					list.add(map);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
	
	
// EX 3 use Employee_id to retrive data
	public List<Map> rDataId(int employeeId)throws UserDefinedException{
		
		String statement="select * from Employee where employee_id=?";
		List<Map>list=getList();
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.setInt(1, employeeId);
			try(ResultSet resultSet=pStatement.executeQuery()){
				ResultSetMetaData rsmData=resultSet.getMetaData();
				while(resultSet.next()) {
					Map<Object,Object>map=new HashMap<>();
					int length=rsmData.getColumnCount();
					for(int i=1;i<=length;i++) {
						String key=rsmData.getColumnLabel(i);
						Object cValue=resultSet.getObject(key);
						map.put(key, cValue);
					}
					list.add(map);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
	
   
// EX 4
	public void mData(String cName,String cString,int inputNum) throws UserDefinedException {
		CheckClass.checkNull(cName);
		String statement="UPDATE Employee SET "+cName+"=? WHERE  employee_id=?";
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.setString(1, cString);
			pStatement.setInt(2, inputNum);
			pStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 5
	public List<Integer> topNRecords(int inputNum) throws UserDefinedException {
		String statement="select * from Employee limit ?";
		List<Integer>list=getList();
		try(PreparedStatement pStatement=getPreparedStatement(statement)) {
			pStatement.setInt(1, inputNum);
			try(ResultSet resultSet=pStatement.executeQuery()){
				while(resultSet.next()) {
					int id=resultSet.getInt("EMPLOYEE_ID");
					list.add(id);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
	
	
// EX 6
	public List<Integer> topNRecordsSortByName(int inputNum,String orderString,String cName) throws UserDefinedException{
		CheckClass.checkNull(cName);
		CheckClass.checkNull(orderString);
		String statement="select * from Employee order by "+cName+" "+orderString+" limit ?";
		List<Integer>list=getList();
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.setInt(1, inputNum);
			try(ResultSet resultSet=pStatement.executeQuery()){
				while(resultSet.next()) {
					int id=resultSet.getInt("EMPLOYEE_ID");
					list.add(id);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
	
	
// EX 7
	public void deleteByEmployeeId(int employeeId) throws UserDefinedException {
		String statement="delete from Employee where employee_id="+employeeId;
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 8 Pojo with DB
	
	
// EX 2
	public void insertValuesInTableInPojo(DbPojo pojo) throws UserDefinedException {
		CheckClass.checkNull(pojo);
		String statement="insert into Employee values(?,?,?,?,?)";
		try (PreparedStatement pStatement=getPreparedStatement(statement)){
			pStatement.setInt(1,pojo.getId());
			pStatement.setString(2, pojo.getName());
			pStatement.setString(3, pojo.getEmail());
			pStatement.setString(4, pojo.getDepartment());
			pStatement.setString(5, pojo.getMNumber());
			pStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 3
	public List<Map> retriveDataFromTableInPojo(DbPojo pojo) throws UserDefinedException {
		CheckClass.checkNull(pojo);
		String statement="select * from Employee where name=?";
		List<Map>list=new ArrayList<>();
		try(PreparedStatement pStatement=getPreparedStatement(statement)) {
			pStatement.setString(1, pojo.getName());
			try(ResultSet resultSet=pStatement.executeQuery()){
				ResultSetMetaData rsmData=resultSet.getMetaData();
				while(resultSet.next()) {
					Map<Object,Object>map=new HashMap<>();
					int length=rsmData.getColumnCount();
					for(int i=1;i<=length;i++) {
						String key=rsmData.getColumnLabel(i);
						Object cValue=resultSet.getObject(key);
						map.put(key, cValue);
					}
					list.add(map);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
	

// EX 9
	public void cDependentTable(String tName)throws UserDefinedException{
		CheckClass.checkNull(tName);
		String cTable="CREATE TABLE "+tName+"(NAME VARCHAR(50),AGE BIGINT,RELATIONSHIP VARCHAR(50),EMPLOYEE_ID INTEGER NOT NULL"
				       + ",PRIMARY KEY(EMPLOYEE_ID),FOREIGN KEY(EMPLOYEE_ID) REFERENCES Employee(EMPLOYEE_ID))";
		try (Connection con=connectionDB()){
			try(Statement statement=con.createStatement()){
				statement.executeUpdate(cTable);
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 10
	public void insertValuesInDependentTable(String name,int age,String Relationship,int id)throws UserDefinedException{
		CheckClass.checkNull(name);
		CheckClass.checkNull(Relationship);
		String statement="insert into DEmployee values(?,?,?,?)";
		try(PreparedStatement pStatement=getPreparedStatement(statement)) {
			pStatement.setString(1, name);
			pStatement.setInt(2, age);
			pStatement.setString(3, Relationship);
			pStatement.setInt(4, id);
			pStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
	}
	
	
// EX 11
	public List<Map> rDataDepenedentTable(String name,int inputNum,int choice)throws UserDefinedException{
		CheckClass.checkNull(name);
		PreparedStatement pStatement=null;
		String statement="";
		List<Map>list=getList();
		try (Connection con=connectionDB()){
			if(choice==1) {
				statement="select Employee.name,DEmployee.realation_name,DEmployee.age,DEmployee.employee_id,DEmployee.relationship from Employee"
						   + " inner join DEmployee on Employee.employee_id=DEmployee.employee_id where Employee.employee_id=?";
				pStatement=con.prepareStatement(statement);
				pStatement.setInt(1, inputNum);
			}
			if(choice==2) {
				statement="select Employee.name,DEmployee.relation_name,DEmployee.age,DEmployee.employee_id,DEmployee.relationship from Employee "
						   + "inner join DEmployee on Employee.employee_id=DEmployee.employee_id where Employee.name=?";
				pStatement=con.prepareStatement(statement);
				pStatement.setString(1, name);
			}
			try(ResultSet resultSet=pStatement.executeQuery()){
				ResultSetMetaData rsmData=resultSet.getMetaData();
				while(resultSet.next()) {
					Map<Object,Object>map=new HashMap<>();
					int length=rsmData.getColumnCount();
					for(int i=1;i<=length;i++) {
						String key=rsmData.getColumnLabel(i);
						Object cValue=resultSet.getObject(key);
						map.put(key, cValue);
					}
					list.add(map);
				}
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		finally {
			try {
				pStatement.close();
			}
			catch(SQLException ex) {
				throw new UserDefinedException("Error Occure : ",ex);
			}
		}
		return list;
	}
	
	
// EX 12
//	public List<Map> retriveTopNInDependent(int inputNum,String oString) throws UserDefinedException{
//		CheckClass.checkNull(oString);
//		String statement="select Employee.name,DEmployee.relation_name,DEmployee.age,DEmployee.employee_id,DEmployee.relationship from Employee "
//				          + "inner join DEmployee on Employee.employee_id=DEmployee.employee_id order by employee_id "+oString+" limit "+inputNum;
//		List<Map>list=getList();
//		try(PreparedStatement pStatement=getPreparedStatement(statement);
//				ResultSet resultSet=pStatement.executeQuery()){
//		      ResultSetMetaData rsmData=resultSet.getMetaData();
//			while(resultSet.next()) {
//				Map<Object,Object>map=new HashMap<>();
//				int length=rsmData.getColumnCount();
//				for(int i=1;i<=length;i++) {
//					Object cValue=resultSet.getObject(rsmData.getColumnLabel(i));
//					map.put(rsmData.getColumnLabel(i),cValue);
//				}
//				list.add(map);
//			}
//		}
//		catch(SQLException ex) {
//			throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
//		}
//		return list;
//	}
	public List<Object> retriveTopNInDependentByParentTable(int inputNum,String oString)throws UserDefinedException{
		String statement="select employee_id from Employee order by name "+oString+" limit "+inputNum;
		List<Object>eIdList=getList();
		try(PreparedStatement pStatement=getPreparedStatement(statement);ResultSet resultSet=pStatement.executeQuery()){
			while(resultSet.next()) {
				eIdList.add(resultSet.getInt("EMPLOYEE_ID"));
			}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		System.out.println(eIdList);
		return eIdList;
	}
	public List<Map> rDataIdInDependentTable(String employeeId)throws UserDefinedException{
		String statement="select Employee.name,DEmployee.relation_name,DEmployee.age,DEmployee.employee_id,DEmployee.relationship from Employee "
				+ "inner join DEmployee on Employee.employee_id=DEmployee.employee_id where Employee.employee_id in "+employeeId;
		List<Map>list=getList();
		try (PreparedStatement pStatement=getPreparedStatement(statement);ResultSet resultSet=pStatement.executeQuery()){
				ResultSetMetaData rsmData=resultSet.getMetaData();
				while(resultSet.next()) {
					Map<Object,Object>map=new HashMap<>();
					int length=rsmData.getColumnCount();
					for(int i=1;i<=length;i++) {
						String key=rsmData.getColumnLabel(i);
						Object cValue=resultSet.getObject(key);
						map.put(key, cValue);
					}
					list.add(map);
				}
		}
		catch(SQLException ex) {
			throw new UserDefinedException("Error Occure : ",ex);
		}
		return list;
	}
}
//EX 3
//	public List<Object> rData(String name) throws UserDefinedException {
//		String result="";
//		String statement="select * from Employee where name=?";
//		List<Object>list=new ArrayList<Object>();
//		try (PreparedStatement pStatement=getPreparedStatement(statement)){
//			pStatement.setString(1, name);
//			try(ResultSet resultSet=pStatement.executeQuery()){
//				while(resultSet.next()) {
//					int id=resultSet.getInt("EMPLOYEE_ID");
//					String Name=resultSet.getString("NAME");
//					String Email=resultSet.getString("EMAIL");
//					String department=resultSet.getString("DEPARTMENT");
//					String mNumber=resultSet.getString("MOBILE");
//					result=id+"\t\t"+Name+"\t\t"+Email+"\t\t"+department+"\t\t"+mNumber;
//					list.add(result);
//				}
//			}
//		}
//		catch(SQLException ex) {
//			throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
//		}
//		return list;
//	}
//	}
	
	
//EX 3 as 4
//	public Map<Object,Object> ex3Data(String name) throws UserDefinedException {
//		String statement="select * from Employee where name=?";
//		Map<Object,Object>map=new TreeMap<>((a,b)->1);
//		try (PreparedStatement pStatement=getPreparedStatement(statement)){
//			pStatement.setString(1, name);
//			try(ResultSet resultSet=pStatement.executeQuery()){
//				while(resultSet.next()) {
//					int id=resultSet.getInt("EMPLOYEE_ID");
//					String Name=resultSet.getString("NAME");
//					String Email=resultSet.getString("EMAIL");
//					String department=resultSet.getString("DEPARTMENT");
//					String mNumber=resultSet.getString("MOBILE");
//					map.put("EMPLOYEE_ID", id);
//					map.put("NAME",Name);
//					map.put("EMAIL", Email);
//					map.put("DEPARTMENT", department);
//					map.put("MOBILE", mNumber);
//				}
//			}
//		}
//		catch(SQLException ex) {
//			throw new UserDefinedException("Error Occure : "+ex.getMessage(),ex);
//		}
//		return map;
//	}
