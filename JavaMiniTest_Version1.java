import java.util.Scanner;

public class JavaMiniTest_Version1 {
	// Track the total number of correct and incorrect answers
	static int numberOfCorrectAnswer = 0; 
	static int numberOfIncorrectAnswer = 0;
	
	// Keep track of the current question being asked
	static int questionNumber=0;
	
	//Variables to store user inputs for each question
	static String userAnswer1; 
	static String userAnswer2;
	static String userAnswer3;
	
	// Qustion text  and options 1 to 3
	static String Question1() {
		return "< Question:1 >\nWhich is the entry point method is Java?";
	}
	static String Option1() {
		return "A:start B:main C:run D:init";
	}
	static String Question2() {
		return "< Question:2 >\n Which is default value of int?";
	}
	static String Option2() {
		return "A:null B:1 C:0 D:-1";
	}
	static String Question3() {
		return "< Question:3 >\nWhat is the property to get trhe number of elements in an array?";
	}
	static String Option3() {
		return "A:size B:count C:length D:total";
	}
	
	// Method to check the user's answer and return the result string
	static String checkAnswer(String userAnswer) {
		questionNumber++;
		
		//check if the answer matches the correct choice for each specific question number
		if(questionNumber ==1 && userAnswer.equalsIgnoreCase("B")) {
			numberOfCorrectAnswer++;
			return "==Correct!==";
		}else if(questionNumber == 2 && userAnswer.equalsIgnoreCase("C")) {
			numberOfCorrectAnswer++;
			return "==Correct!==";
		}else if(questionNumber ==3 && userAnswer.equalsIgnoreCase("C")){
			numberOfCorrectAnswer++;
			return "==Correct!==";
		}else {
			numberOfIncorrectAnswer++;
			return "==Incorrect!==";
		}			
	}
	
	//Method to calculate and display the final score and performance message
	static void checkResult(int numberOfCorrectAnswer) {
		System.out.println("===The test result===");
		System.out.println("The number of correct answer: "+ numberOfCorrectAnswer + "/" + questionNumber);
		
		// calculate percentage using double division to avoid integer truncation
		double score = ((double)numberOfCorrectAnswer/questionNumber)*100;
		System.out.printf("Score: %.1f%%\n",score);
		
		//display feedback based on the final score
		if(score==100) {
			System.out.println("Full Mark! Well done!!");
		}else if(score>70){
			System.out.println("Passed!");
		}else {
			System.out.println("Try again!");
		}
	}
	
	
	//main method to run the quiz 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("=== Java Mini Test===");
		
		//question1 flow
		System.out.println(Question1());
		System.out.println(Option1());
		System.out.print("Answer: ");
		userAnswer1 = sc.next();
		System.out.println(checkAnswer(userAnswer1));
		
		//question2 flow
		System.out.println(Question2());
		System.out.println(Option2());
		System.out.print("Answer: ");
		userAnswer2 = sc.next();
		System.out.println(checkAnswer(userAnswer2));
		
		//question3 flow
		System.out.println(Question3());
		System.out.println(Option3());
		System.out.print("Answer: ");
		userAnswer3 = sc.next();
		System.out.println(checkAnswer(userAnswer3));
		
		//show final result
		checkResult(numberOfCorrectAnswer);

		sc.close();
	}

}
