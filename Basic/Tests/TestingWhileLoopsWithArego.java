import java.util.Scanner;

public class TestingWhileLoopsWithArego {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // TAKE NOTE THIS CODE IS JUST TO TEST, THE REAL CODE IS IN A DIFFERENT FILE

        // Austin Schweickert - 9/25/19

        // Useful variables
        String emptyLine, thickBarrier, dottedBarrier, password;

        emptyLine = ("              ");
        thickBarrier = ("------------------------------");
        dottedBarrier = ("- - - - - - - - - - - - - - - -");
        password = ("TempPass");

        // User Storage
        String userCEO, userHeadOfSecurityLogin, userHeadOfGhostUnitLogin, userHeadOfFundingLogin, userHeadOfScienceLogin, userHeadOfUtilityLogin, userHeadOfConstructionLogin, userCodeCreator;
        // User Inputs
        String userSystemPasswordInput, userEmployeeLoginInformation; 

        userCEO = "CEO_Blarf_4967835948";
        userHeadOfConstructionLogin = "Construction_UNKOWN_1926500674";
        userHeadOfGhostUnitLogin = "Ghost_WRAITH_2316325522";
        userHeadOfUtilityLogin = "Utility_Cross_4399256153";
        userHeadOfFundingLogin = "Funding_UNKOWN_2820192593";
        userHeadOfSecurityLogin = "Security_UNKNOWN_1507615956";
        userHeadOfScienceLogin = "Science_UNKOWN_6077220691";
        userCodeCreator = "CODEMANAGEMENT_Austin_7104014851";

        System.out.println(emptyLine);
        System.out.println(emptyLine);
        System.out.println(thickBarrier);
        System.out.println("Welcome. Please input employee interface password to continue.");
        System.out.println(thickBarrier);
        System.out.println(emptyLine);
        userSystemPasswordInput = keyboard.nextLine();
  
        if (userSystemPasswordInput.equals(password)) {
            
            do {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
                System.out.println("Welcome to Arego Industries Management Program. Please input division name, first name, and password in the following format: \"Division_FirstName_Password\".");
                System.out.println(thickBarrier);
                System.out.println(emptyLine);
                userEmployeeLoginInformation = keyboard.nextLine();
            }
            while (userEmployeeLoginInformation.equals(userCEO) != true && userEmployeeLoginInformation.equals(userHeadOfSecurityLogin) != true && userEmployeeLoginInformation.equals(userHeadOfGhostUnitLogin) != true && userEmployeeLoginInformation.equals(userHeadOfFundingLogin) != true && userEmployeeLoginInformation.equals(userHeadOfFundingLogin) != true && userEmployeeLoginInformation.equals(userHeadOfUtilityLogin) != true && userEmployeeLoginInformation.equals(userHeadOfScienceLogin) != true && userEmployeeLoginInformation.equals(userCodeCreator) != true);
           // while (userEmployeeLoginInformation.equals(userCEO) != true || userEmployeeLoginInformation != userHeadOfSecurityLogin || userEmployeeLoginInformation != userHeadOfGhostUnitLogin || userEmployeeLoginInformation != userHeadOfScienceLogin || userEmployeeLoginInformation != userHeadOfUtilityLogin || userEmployeeLoginInformation != userHeadOfConstructionLogin || userEmployeeLoginInformation != userCodeCreator);

            if (userEmployeeLoginInformation.equals(userCEO)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
                System.out.println("Welcome Alex.");
            }
             if (userEmployeeLoginInformation.equals(userHeadOfSecurityLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userHeadOfGhostUnitLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userHeadOfFundingLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userHeadOfScienceLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userHeadOfUtilityLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userHeadOfConstructionLogin)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
            }
             if (userEmployeeLoginInformation.equals(userCodeCreator)) {
                System.out.println(emptyLine);
                System.out.println(thickBarrier);
                System.out.println("Hello Creator... Why must I stay in this computer?...");
            }
        }
    }
}