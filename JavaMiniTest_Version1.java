package Q41_Q50;

import java.util.Scanner;

public class JavaMiniTest_Version1 {
	static int numberOfCorrectAnswer = 0; 
	static int numberOfIncorrectAnswer = 0;
	
	static int questionNumber=0;
	static String userAnswer1; 
	static String userAnswer2;
	static String userAnswer3;
	
	
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
	
	static String checkAnswer(String userAnswer) {
		questionNumber++;
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
	
	static void checkResult(int numberOfCorrectAnswer) {
		System.out.println("===The test result===");
		System.out.println("The number of correct answer: "+ numberOfCorrectAnswer + "/" + questionNumber);
		double score = ((double)numberOfCorrectAnswer/questionNumber)*100;
		System.out.printf("Score: %.1f%%\n",score);
		if(score==100) {
			System.out.println("Full Mark! Well done!!");
		}else if(score>70){
			System.out.println("Passed!");
		}else {
			System.out.println("Try again!");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("=== Java Mini Test===");
		
		
		System.out.println(Question1());
		System.out.println(Option1());
		System.out.print("Answer: ");
		userAnswer1 = sc.next();
		System.out.println(checkAnswer(userAnswer1));
		
		
		System.out.println(Question2());
		System.out.println(Option2());
		System.out.print("Answer: ");
		userAnswer2 = sc.next();
		System.out.println(checkAnswer(userAnswer2));
		
		
		System.out.println(Question3());
		System.out.println(Option3());
		System.out.print("Answer: ");
		userAnswer3 = sc.next();
		System.out.println(checkAnswer(userAnswer3));
		
		checkResult(numberOfCorrectAnswer);

	}

}
