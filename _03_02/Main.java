package _03_02;

public class Main {

  public static void main(String[] args) {
    GradingSystem gradingSystem = new GradingSystem();
    int percentage = 85;
    System.out.println("Percentage: " + percentage);
    System.out.println("Pass: " + gradingSystem.isAPass(percentage));
    System.out.println("Grade: " + gradingSystem.getGrade(percentage));
    System.out.println(gradingSystem.retakeMessage(percentage, true));
    
    int[] percentages = {  99,  90,  89,  80,  79,  70,  69,  60,  59 };
    String[] grades =   { "A", "A", "B", "B", "C", "C", "D", "D", "F" };

    for (int i = 0; i < grades.length; i++) { 
      System.out.println(
        "Percent: " + percentages[i] +
        " - Expect: " + grades[i] +
        " - Acutal: " + gradingSystem.getGrade(percentages[i])
      );
    }
  }

}
