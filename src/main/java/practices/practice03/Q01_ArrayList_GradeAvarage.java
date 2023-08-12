package practices.practice03;

import java.util.ArrayList;
import java.util.Scanner;

class Q01_ArrayList_GradeAverage {
    // Get as many grades as a teacher wants to enter, and find the number of students who pass the average.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> examGradeList = new ArrayList<>();

        do {
            System.out.println("Enter exam grade:");
            examGradeList.add(scanner.nextInt());
            System.out.println("Continue: Y/N");
            String condition = scanner.next();

            if (condition.equalsIgnoreCase("N")){
                break;//==> breaks the loop under this condition
            }
        }while (true);//while (true) ==> Infinite loop
        //As long as we do not use break code, this loop will keep repaiting.

        System.out.println("examGradeList = " + examGradeList);

        //Calculate the average
        double sum = 0;
        for(int w : examGradeList){
            sum += w;// sum = sum + w;
        }
        double average = sum/examGradeList.size();
        System.out.println("average = " + average);

        //Calculate how many students are above average
        int numOfStdAboveAverage = 0;

        for(int w : examGradeList){
            if(w>average){
                numOfStdAboveAverage++;
            }
        }

        System.out.println("numOfStdAboveAverage = " + numOfStdAboveAverage);

    }
}