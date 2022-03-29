import java.util.Scanner;

public class CoffeeMachine {
    Scanner object = new Scanner(System.in);
    private int espressoSingleShot = 0;
    private int DoubleShotDoppio = 0;
    private int Lungo = 0;
    private int Macchiato = 0;
    private int Cappuccino = 0;
    private int coldWater;
    private int coffeeGrounds;

    public void espressoSingleShot() throws InterruptedException {
        System.out.println("Would you like to add cold water(y/n)?");
        char answer = object.next().charAt(0);
        if (addWater(answer)) {
            this.coldWater = 5; //golden ratio (zbog toga je hardcodirano)
            System.out.println("Added " + this.coldWater + " ounces of cold water");
        }
        System.out.print("Put coffeeGrounds:");
        this.coffeeGrounds = object.nextInt();
        if (makeEspressoSingleShot(this.coffeeGrounds)) {
            System.out.println("Your coffee is done");
            this.espressoSingleShot++;
            System.out.println("You made " + this.espressoSingleShot + " single shots so far!.");
        } else {
            System.out.println("Not the right amount of coffee grounds");
        }
    }

    private boolean makeEspressoSingleShot(int coffeeGrounds) throws InterruptedException {
        if (coffeeGrounds >= 6 && coffeeGrounds <= 8) {
            System.out.print("Brewing time(WAIT):");
            Thread.sleep(20000);
            return true;
        } else return false;
    }

    public void doubleShotDoppio() throws InterruptedException {
        System.out.println("Would you like to add cold water(y/n)?");
        char answer = object.next().charAt(0);
        if (addWater(answer)) {
            this.coldWater = 5;
            System.out.println("Added " + this.coldWater + " ounces of cold water");
        }
        System.out.print("Put coffeeGrounds:");
        this.coffeeGrounds = object.nextInt();
        if (makeDoubleShotDoppio(this.coffeeGrounds)) {
            System.out.println("Your coffee is done");
            this.DoubleShotDoppio++;
            System.out.println("You made " + this.DoubleShotDoppio + " double shots so far!");
        } else {
            System.out.println("Not the right amount of coffee grounds");
        }
    }

    private boolean makeDoubleShotDoppio(int coffeeGrounds) throws InterruptedException {
        if (coffeeGrounds >= 18 && coffeeGrounds <= 21) {
            System.out.print("Brewing time(WAIT):");
            Thread.sleep(20000);
            return true;
        } else return false;
    }

    public void lungo() throws InterruptedException {
        System.out.println("Would you like to add cold water(y/n)?");
        char answer = object.next().charAt(0);
        if (addWater(answer)) {
            this.coldWater = 6;
            System.out.println("Added " + this.coldWater + " ounces of cold water");
        }
        System.out.print("Put coffeeGrounds:");
        this.coffeeGrounds = object.nextInt();
        if (makeLungo(this.coffeeGrounds)) {
            System.out.println("Your coffee is done");
            this.Lungo++;
            System.out.println("You made " + this.Lungo + " lungo so far!.");
        } else {
            System.out.println("Not the right amount of coffee grounds");
        }
    }

    private boolean makeLungo(int coffeeGrounds) throws InterruptedException {
        if (coffeeGrounds >= 18 && coffeeGrounds <= 21) {
            System.out.print("Brewing time(WAIT):");
            Thread.sleep(20000);
            return true;
        } else return false;
    }

    public void Macchiato() throws InterruptedException {
        if (addSteamedMilk()) {
            System.out.println("Milk is  steamed!");
        }
        System.out.print("Put coffeeGrounds:");
        this.coffeeGrounds = object.nextInt();
        if (makeLungo(this.coffeeGrounds)) {  //ista funkcija jer treba ista kolicina vremena
            System.out.println("Your coffee is done");
            this.Macchiato++;
            System.out.println("You made " + this.Macchiato + " macchiato so far!");
        } else {
            System.out.println("Not the right amount of coffee grounds");
        }
    }

    public void Cappuccino() throws InterruptedException {
        if (addSteamedMilk()) {
            System.out.println("Milk is  steamed!");
        }
        if (addFoamedMilk()) {
            System.out.println("Milk is foamed");
        }
        System.out.print("Put coffeeGrounds:");
        this.coffeeGrounds = object.nextInt();
        if (makeLungo(this.coffeeGrounds)) {  //ista funkcija jer treba ista kolicina vremena
            System.out.println("Your coffee is done");
            this.Cappuccino++;
            System.out.println("You made " + this.Cappuccino + " capuccino so far!");
        } else {
            System.out.println("Not the right amount of coffee grounds");
        }
    }

    private boolean addSteamedMilk() throws InterruptedException {
        System.out.println("Do you have milk (y/n)?");
        char answer = object.next().charAt(0);
        if (answer == 'y' || answer == 'Y') {
            System.out.print("Steaming milk (Wait)");
            Thread.sleep(5000);
            return true;
        } else return false;
    }

    private boolean addFoamedMilk() throws InterruptedException {
        System.out.println("Do you have milk (y/n)?");
        char answer = object.next().charAt(0);
        if (answer == 'y' || answer == 'Y') {
            System.out.print("Foaming milk (Wait)");
            Thread.sleep(20000);
            return true;
        } else return false;

    }

    private boolean addWater(char answer) {
        if (answer == 'y' || answer == 'Y') {
            return true;
        } else return false;
    }

}
