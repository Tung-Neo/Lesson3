package Day3;

public class NestedIfvsSequentialf {
    public static void main(String[] args) {
        int mark = 81;
        char grade;
        if (mark > 80){
            grade = 'A';
        }
        if (mark > 65 && mark <= 80){
            grade = 'B';
        }
        if (mark >=50 && mark <= 65){
            grade = 'C';
        }
        if (mark < 50){
            grade = 'F';
        }

        //
        if (mark > 80){
            grade = 'A';
        }else if (mark > 65 && mark <= 80){
            grade = 'B';
        }else  if (mark >= 50 && mark <= 65){
            grade = 'C';
        }else {
            grade = 'F';
        }

        //
        if (mark > 80){
            grade = 'A';
        }else if (mark > 65){
            grade = 'B';
        }else if (mark >= 50){
            grade = 'C';
        }else {
            grade = 'F';
        }
    }
}
