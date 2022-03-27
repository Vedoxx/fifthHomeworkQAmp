import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    Scanner input = new Scanner(System.in);
    private int minimumNumber=0;
    private int maximumNUmber = 0;
    private int sum = 0;
    private int size = 0;
    private final ArrayList<Integer>arrayList=new ArrayList<>();

    public void setNumbers() {
        System.out.println("Add numbers:");
        for (int i = 0; i < size; i++) {
            this.arrayList.add(input.nextInt());
        }
    }
    public void setSize() {
        System.out.print("How many elements would you like to add:");
        size = input.nextInt();
    }

    private int minElement() {
        this.minimumNumber = arrayList.get(0);
        for(int i=0;i<this.size;i++){
            if(this.arrayList.get(i)<this.minimumNumber) this.minimumNumber=this.arrayList.get(i);
        }
        return this.minimumNumber;
    }
    private int maxElement() {
        this.maximumNUmber = arrayList.get(0);
        for (int i=0;i<this.size;i++) {
            if (this.arrayList.get(i) > this.maximumNUmber) this.maximumNUmber = this.arrayList.get(i);
        }
        return this.maximumNUmber;
    }
    private int sumOfElements() {
        for (Integer integer : this.arrayList) {
            this.sum = this.sum + integer;
        }
        return sum;
    }
   private void primeNumber(){
     for (int i=0;i<size;i++) {
         boolean primeNumber=true;
         for(int j=2;j<arrayList.get(i);j++){
             if(arrayList.get(i)%j==0){
                 primeNumber=false;
                 break;
             }
         }
         if(primeNumber) {
             System.out.println("Number "+ arrayList.get(i) +" is a prime number");
         }
         else System.out.println("Number "+ arrayList.get(i)+" is not a prime number");
     }
      }
      private int kickNonPrimeNumber() {
          int counter=0;
          for (int i = 0; i < arrayList.size(); i++) {
              boolean PrimeNumber = true;
              for (int j = 2; j < arrayList.get(i); j++) {
                  if (arrayList.get(i) % j == 0) {
                      PrimeNumber = false;
                      break;
                  }
              }
              if (!PrimeNumber) {
                  arrayList.remove(i);
                  counter++;
              }
          }
          return counter;
      }
    public void arrayInformation(){
        System.out.println("Minimum element:"+this.minElement());
        System.out.println("Maximum element:"+this.maxElement());
        System.out.println("Sum of all elements:"+this.sumOfElements());
        primeNumber();
        System.out.print("Number of removed elements from arraylist:");
        int counter=kickNonPrimeNumber();
        System.out.println(counter);
    }
}
