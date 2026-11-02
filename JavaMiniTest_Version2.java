import java.util.Scanner;

public class JavaMiniTest_Version2 {
	
	static String[] questions = {
		"Which is the entry point method is Java?",
		"Which is default value of int?",
		"What is the property to get the number of elements in an array?",
	};
	
	static String[][] choices = {
		{"start","main","run","init"},
		{"null","1","0","-1"},
		{"size","count","length","total"}
	};
	
	static String answers[] = {
			"B",
			"C",
			"C"
	};
	
	static int numberOfCorrect = 0;
	static int totalQuestions = questions.length;
	
	static void runQuiz(Scanner sc, int index) {
		System.out.println("【Question: "+ (index+1) + "】 " + questions[index]);
		
		for(int i = 0; i < choices[index].length ; i++) {
			if(i == 0) {
				System.out.print("A:" + choices[index][i] +"  ");
			}else if(i == 1) {
				System.out.print("B:"+ choices[index][i]+"  ");
			}else if(i==2) {
				System.out.print("C:" +choices[index][i]+"  ");
			}else if(i==3) {
				System.out.println("D:"+ choices[index][i]);
			}//end of if loop
		}// end of for loop
		System.out.println("Please type your answer (A,B,C,D): ");
		String userAnswer = sc.next();
		
		if(userAnswer.equalsIgnoreCase(answers[index])) {
			numberOfCorrect ++;
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
	}//end of runQuiz method
	
	static void checkResult(int numberOfCorrectAnswer) {
		System.out.println("===The test result===");
		System.out.println("The number of correct answer: "+ numberOfCorrectAnswer + "/" + totalQuestions);
		double score = ((double)numberOfCorrectAnswer/totalQuestions)*100;
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
	
	System.out.println("=====Java Mini Quiz!!=====");
	
	for(int i=0 ; i < totalQuestions; i++) {
		runQuiz(sc,i);
	}
	
	checkResult(numberOfCorrect);
} 
}
