import java.util.Objects;
import java.util.Scanner;
public class PassComplexity {
    static String password = "";

    static void MainPassComplexity(){
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a password: ");
            getPassword();
            String innerPassword = getPassword();
            System.out.println();

            if (CheckPasswordFunction(innerPassword)) {
                System.out.println("Password " + innerPassword + " is good to use!");
                System.out.print("Would you like to check another password?: y or n");
                String restart = input.nextLine();
                if (Objects.equals(restart, "y")) {
                    FreeUpVars();
                } else if (Objects.equals(restart, "n")){
                    FreeUpVars();
                    input.close();
                    break;
                }
            } else System.out.println("Please try again");
        }
    }

    static String getPassword(){
        Scanner passInput = new Scanner(System.in);
        return passInput.nextLine();
    }
    static boolean CheckPasswordFunction(String Password){
        if (Password.length() < 6){
            return false;
        }
        else return true;
    }

    static void FreeUpVars(){password = "";}
}
