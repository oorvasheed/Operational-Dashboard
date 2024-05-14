import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.eclipse.jdt.internal.compiler.ast.ForeachStatement
import org.openqa.selenium.Keys as Keys

public class Listers{
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("apple");
		list.add("mango");
		list.add("grape");
		System.out.println(list.size()) //finding size
		
		//before removing
		
		for(String eachFriut : list) { //enhanced for loop
			System.out.println(eachFriut)
		}
		//after removing
		list.remove("grape")
		
		for(String allFruits : list) { //enhanced for loop for(String variableName : listname)
			System.out.println(allFruits)
		}
		
		System.out.println(list.isEmpty()); //isEmpty functionality
		list.clear()						//isClear functionality
		boolean isempty = list.isEmpty();
		System.out.println("isEmpty" +isempty)
		
		boolean isAvailable = list.contains("pine"); //contains functionality
		System.out.println(isAvailable);
		
		/*//Difference between list and Set - list allows duplicates but set wont allow, in list we have get method set doesn't have get method
		
		//HashSet - values can be randomly printed
		
		Set<String> set = new HashSet<String>()
		set.add("apple")
		set.add("apple")
		set.add("grape")
		set.add("pine")
		System.out.println(set.size());
		
		//Since there's no get method we can use list and get the values from set
		
		List<String> myList = new ArrayList<String>(set);
		String valueListed = myList.get(3)
		System.out.println(myList.size())
		System.out.println("value given:"+valueListed)
		
		//TreeSet() - prints all values in asci format (Alphabetic order)
		
		Set<String> tree = new TreeSet<String>();
		
		tree.add("apple")
		tree.add("apple")
		tree.add("grape")
		tree.add("pine")
		
		for(String eachFruits : tree) {
			
			System.out.println(eachFruits)
			
		}
		
		//LinkedHashSet() - print values in same order as given in input
		
		Set<String> link = new LinkedHashSet()
		
		link.add("apple")
		link.add("apple")
		link.add("grape")
		link.add("pine")*/
		
	}
	
}