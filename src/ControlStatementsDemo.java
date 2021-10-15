
public class ControlStatementsDemo {

	public static String findInsurenceCatergory(int employeeSalary) {
		String insuranceCategory = "";
		if(employeeSalary >= 5000 && employeeSalary <= 7000) {
			insuranceCategory = "Class 1 Insurance";
		}else if(employeeSalary >= 7001 && employeeSalary <=9000) {
			insuranceCategory = "Class 2 Insurance";
		}else if(employeeSalary >= 9001 && employeeSalary <=11000) {
			insuranceCategory = "Class 3 Insurance";
		}else {
			insuranceCategory = "Not Eligible";
		}
		return insuranceCategory;
	}
	
	// method to find whether a number is odd or even
	public static String findOddEven(int myNumber) {
		String answer = "";
		int result = myNumber % 2;
		if(result == 0) {
			answer = "Even Number";
		} else {
			answer = "Odd Number";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int num1 = 120;
		String returnedAnswer = findOddEven(num1);
		System.out.println("The number " + num1 + " is an " + returnedAnswer);
		
		int empSalary = 4000;
		String insuranceCategory = findInsurenceCatergory(empSalary);
		System.out.println("The salary " + empSalary + " falls under " + insuranceCategory);
		
	}

}
