import java.util.Scanner;
public class EvenOrOddClass {
    String answer = "";

    static void MainFunctionToRun(){
        while(true) {
            int evenOrOddNum = 0;
            Scanner input = new Scanner(System.in);
            EvenOrOddClass FEOD = new EvenOrOddClass();

            System.out.print("Enter a number: ");
            while(true) {
                try {
                    evenOrOddNum = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("Numbers only");
                    System.out.println();
                    System.out.print("Num:? ");
                    input.nextLine();
                }
            }
            System.out.println();
            String endResult = FEOD.OddOrEven(evenOrOddNum);

            System.out.println(endResult);
            System.out.println();

            FEOD.ClearAnswer();

            System.out.print("Would you like to end this program? 0 or 1: ");
            int closeAnswer = input.nextInt();
            System.out.println();

            if (closeAnswer == 1) {
                input.close();
                break;
            }
        }

    }
    //To store value into class variable
    String OddOrEven(int FirstNumber){
        //Find even or odd.
        if(FirstNumber % 2 == 0) {
            answer = "Even";

        } else {
            answer = "Odd";
        }
        return answer;
    }

    void ClearAnswer(){answer = "";}

}
