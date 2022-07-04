import java.util.Objects;
import java.util.Scanner;
public class ProjectOptionClass {
    ProjectOptionClass() {
        while (true) {
            Scanner optionsInput = new Scanner(System.in);
            System.out.print("Options are: Password checker, Even or odd teller. ");
            String optionInput = optionsInput.nextLine();
            System.out.println();

            if (Objects.equals(optionInput, "Password checker")) {
                PassComplexity.MainPassComplexity();
            } else if (Objects.equals(optionInput, "Even or odd teller")) {
                EvenOrOddClass.MainEvenOrOdd();
            }
            System.out.println("Would you like to pick another program?: y or n");
            String restartOptionInput = optionsInput.nextLine();
            if (Objects.equals(restartOptionInput, "y")){
                continue;
            }
            else if (Objects.equals(restartOptionInput, "n")){
                optionsInput.close();
                break;
            }
        }
    }
}