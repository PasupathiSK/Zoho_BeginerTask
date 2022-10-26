package inheritancetask;
import java.util.Scanner;
public class TestRunner {
	static Scanner input=new Scanner(System.in);
	Car car=new Car();
	static TestRunner testrunner=new TestRunner();
	Swift swift=new Swift();
	Xuv xuv=new Xuv();
	Xuv xuv1=new Xuv();
	SCross scross=new SCross();
	public static int getInt(int inputNum) {
		boolean flag=false;
		while(!flag) {
			if(input.hasNextInt()) {
				inputNum=input.nextInt();
				flag=true;
			}
			else {
				System.out.println("Enter a valid integer...");
			}
		}
		return inputNum;
	}
	public static String getString(String inputString) {
		boolean flag=false;
		while(!flag){
		if(input.hasNext()){
		inputString=input.next();
		flag=true;
		}
		else{
		System.out.println("Enter a valid Stirng...");
		}
		}
		return inputString;
	}
	public static void carObject(Car car) {
		//Car car=new Car();
		//Swift swift=new Swift();
		int yearOfMake=0;
		String engineNumber="",type="";
		System.out.println("Enter a which year of make: ");
		yearOfMake=getInt(yearOfMake);
		System.out.println("Enter a engine Number: ");
		engineNumber=getString(engineNumber);
		System.out.println("Enter a type: ");
		type=getString(type);
		car.setValue(yearOfMake, engineNumber, type);
		System.out.println("Year Of Make : "+car.getYearOfMake(yearOfMake));
		System.out.println("Engine Number : "+car.getengineNumber(engineNumber));
		System.out.println("Type : "+car.getType(type));
		if(car instanceof Xuv) {
			System.out.println("Result is: \nSUV...");
		}
		else if(car instanceof Swift) {
			System.out.println("Result is: \nHatch...");
		}
		else if(car instanceof SCross){
			System.out.println("Result is: \nSedan...");
		}
	}
	public static void swiftObject(Swift swift) {
		int seats=0,airbags=0;
		String model="",color="";
	   System.out.println("Enter a seats :");
	   seats=getInt(seats);
	   System.out.println("Enter a airbags :");
	   airbags=getInt(airbags);
	   System.out.println("Enter a model :");
	   model=getString(model);
	   System.out.println("Enter a color :");
	   color=getString(color);
	   testrunner.swift.setValue(seats, airbags, color, model);
	   System.out.println("Result is: ");
		System.out.println("Seats : "+testrunner.swift.getSeats(seats));
		System.out.println("Air Bags : "+testrunner.swift.getAirBags(airbags));
		System.out.println("Model : "+testrunner.swift.getModel(model));
		System.out.println("Color : "+testrunner.swift.getColor(color));
	}
public static void main(String args[]) {
	int choice=-1,yearOfMake=0,seats=0,airbags=0;
	String inputString="",engineNumber="",type="",model="",color="";
	//TestRunner testrunner=new TestRunner();
	System.out.println("if you want to stop just enter 0...");
	while(choice!=0) {
		System.out.println("Enter your choice: ");
		choice=getInt(choice);
		switch(choice){
			case 2:
			{
				System.out.println("Swift car call...");
				System.out.println("Enter a how many seats you want: ");
				seats=getInt(seats);
				System.out.println("Enter a how many airbags you want: ");
				airbags=getInt(airbags);
				System.out.println("Enter a which model you want: ");
				model=getString(model);
				System.out.println("Enter a which color you want: ");
				color=getString(color);
				testrunner.swift.setValue(seats, airbags, color, model);
				System.out.println("Result is: ");
				System.out.println("Seats : "+testrunner.swift.getSeats(seats));
				System.out.println("Air Bags : "+testrunner.swift.getAirBags(airbags));
				System.out.println("Model : "+testrunner.swift.getModel(model));
				System.out.println("Color : "+testrunner.swift.getColor(color));
				break;
			}
			case 3:
			{
				System.out.println("SCross car call...");
				System.out.println("Enter a how many seats you want: ");
				seats=getInt(seats);
				System.out.println("Enter a how many airbags you want: ");
				airbags=getInt(airbags);
				System.out.println("Enter a which model you want: ");
				model=getString(model);
				System.out.println("Enter a which color you want: ");
				color=getString(color);
				System.out.println("Enter a which year of make: ");
				yearOfMake=getInt(yearOfMake);
				System.out.println("Enter a engine Number: ");
				engineNumber=getString(engineNumber);
				System.out.println("Enter a type: ");
				type=getString(type);
				testrunner.scross.setValue(seats, airbags, color, model);
				testrunner.scross.setValue(yearOfMake, engineNumber, type);
				System.out.println("Result is: ");
				System.out.println("Seats : "+testrunner.scross.getSeats(seats));
				System.out.println("Air Bags : "+testrunner.scross.getAirBags(airbags));
				System.out.println("Model : "+testrunner.scross.getModel(model));
				System.out.println("Color : "+testrunner.scross.getColor(color));
				System.out.println("Year Of Make : "+testrunner.scross.getSeats(seats));
				System.out.println("Engine Number : "+testrunner.scross.getengineNumber(engineNumber));
				System.out.println("Type : "+testrunner.scross.getType(type));
				break;
			}
			case 4:
			{
				System.out.println("XUV car call...");
				carObject(testrunner.xuv);
				System.out.println("Swift car call...");
				carObject(testrunner.swift);
				System.out.println("SCross car call...");
				carObject(testrunner.scross);
				break;
			}
			case 5:
			{
				//System.out.println("XUV car call...");
				carObject(testrunner.xuv);
				//System.out.println("Swift car call...");
				//carObject(testrunner.swift);
				//System.out.println("SCross car call...");
				//carObject(testrunner.scross);
				break;
			}
			case 6:
			{
				//swiftObject(testrunner.swift);
				//swiftObject(testrunner.car);
				//swiftObject(testrunner.scross);
				//swiftObject(testrunner.xuv);
				break;
			}
			case 7:
			{
				Car carobject=new SCross();
				System.out.println("SCross car call...");
				System.out.println("Result is: ");
				testrunner.scross.maintanence();
				carobject.maintanence();
				testrunner.swift.maintanence();
				break;
			}
			case 8:
			{
				System.out.println("XUV car call...");
				Check check=new Check();
				break;
			}
			case 9:
			{
				System.out.println("Bird class call...");
				//BirdAbstract birdabstract=new BirdAbstract();
				ParrotMod parrotmod=new ParrotMod();
				parrotmod.fly();
				parrotmod.speak();
				break;
			}
			case 10:
			{
				System.out.println("Bird and Duck class call...");
				Duck duck=new Duck();
				duck.fly();
				duck.speak();
				break;
			}
			case 0:
			{
				System.out.println("exit");
				break;
			}
			default: 
			{
				System.out.println("Invalid choice...");
			}
		}
	}
}
}
