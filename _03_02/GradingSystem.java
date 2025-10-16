package _03_02;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    // Return true if the percentage is higher than or equal to 60.
    // Otherwise return false.
    if (percentage >= 60) {
      return true;
    }
    else {
      return false;
    }
  }

  public char getGrade(int percentage) {
    // If the percentage is 90 or above, return 'A'.
    // If it's 80-89, return 'B'.
    // If it's 70-79, return 'C'.
    // If it's 60-69, return 'D'.
    // If it's less than 60, return 'F'.
    char grade;
    if (percentage >= 90) {
      grade = 'A';
    }
    else if (percentage < 90 && percentage >= 80) {
      grade = 'B';
    }
    else if (percentage < 80 && percentage >= 70) {
      grade = 'C';
    }
    else if (percentage < 70 && percentage >= 60) {
      grade = 'D';
    }
    else {
      grade = 'F';
    }
    
    return grade;
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {

    String message = "A retake is not required.";
  
    // If percentage is less than 60 and allowedToRetake is true, return a String
    // that says "The student has been entered for a retake."
    if (percentage < 60 & allowedToRetake == true) {
      message = "The student has been entered for a retake.";
    }

    // If percentage is less than 60 and allowedToRetake is false, return a String
    // that says "The student is not allowed to retake this exam."
    else if (percentage < 60 & allowedToRetake == false) {
      message = "The student is not allowed to retake this exam.";
    }

    if (percentage >= 60) {
    // If percentage is 60 or higher, return a String that says "A retake is not
    // required."
      message = "A retake is not required.";
    }

    return message;
  }

}
