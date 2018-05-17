package Chapter3;

/**
 * Created by hasnake on 5/15/18.
 */
//The super class has the instance variables and the method.
//The TestDrive class has the main() method and its sole purpose is to create objects of your new type.
public class Student {
    //instance variables
    String[] name = {"Fred", "Sally", "Timmy", "Pat", "Phil"};
    double[] examScore = {87.9, 90.0, 12.1, 75.5, 61.8};
    char gradeLetter;
//method
    void grade(double score){
        if(score >= 90) {
            gradeLetter = 'A';
        } else if (score > 80) {
            gradeLetter = 'B';
        } else if (score > 70) {
            gradeLetter = 'C';
        } else if (score > 60) {
            gradeLetter = 'D';
        } else {
            gradeLetter = 'F';
        }
    }
}
