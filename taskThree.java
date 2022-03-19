import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) throws InterruptedException {
        Scanner object=new Scanner(System.in);
        CoffeeMachine coffeeMachine=new CoffeeMachine();
        int userPick;
        char continueOption;
        do {
            System.out.println("-----CoffeeMachine--------");
            System.out.println("1-Single shot of coffee-espresso");
            System.out.println("2-Double shot (coffee doppio)");
            System.out.println("3-Italian lungo");
            System.out.println("4-Macchiato");
            System.out.println("5-Cappuccino");
            System.out.println("6-EXIT");
            System.out.print("Your pick:");
            userPick = object.nextInt();
             if(userPick==1){
                     coffeeMachine.EspressoSingleShot();
             }
             if(userPick==2){
                 coffeeMachine.DoubleShotDoppio();
             }
             if(userPick==3){
                  coffeeMachine.Lungo();
             }
             if(userPick==4){
                 coffeeMachine.Macchiato();
             }
             if(userPick==5){
             coffeeMachine.Cappuccino();
             }
            if (userPick == 6) {
                System.exit(0);
            }
            System.out.println("Would you like to continue(y/n):");
            continueOption = object.next().charAt(0);
        }while(continueOption=='Y' || continueOption=='y');
    }

}
