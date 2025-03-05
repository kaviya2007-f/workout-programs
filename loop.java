

/*class loop{
    public static void main(String [] args){
        int i = 1;
        while(i <= 10){
            System.out.println("the anwers is " +i);
            i++;
        }
    }
}*/

/*class loop{
    public static void main(String [] args){
        int n = 0;
        int sum  = 0;
        while(n <= 50){
            if(n % 2 == 0){
                sum += n;
                System.out.println("the sum of all eve numbers " +sum);
            }
            n++;
        }
    }
}*/

/*class loop{
    public static void main(String [] args){
        int num = 1234,reverse = 0,remainder;
        while(num!= 0){
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num/=10;
        }
        System.out.print("the reverse of the number " +reverse);

    }
}*/


/*import java.util.*;
class loop{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int choice;
        do { 
             System.out.println("FOOD MENU");
             System.out.println("1.chicken rice");
             System.out.println("2.kizhi parotta");
             System.out.println("3.chicken briyani");
             System.out.println("4.grilled chicken");
             System.out.println("menu exist");
             System.out.println("enter your choice");
             choice = obj.nextInt();
             switch(choice){
                case 1:
                System.out.println(" chicken rice");
                break;
                case 2:
                System.out.println("kizhi parotta");
                break;
                case 3:
                System.out.println("chicken briyani");
                break;
                case 4:
                System.out.println("grilled chicken");
                break;
                case 5:
                System.out.println("menu is existing");
                break;
                default:
                break;


             }
    }
    while(choice!= 5);
}
}*/

/*import java.util.*;
class loop{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.print("enter the number");
        num = obj.nextInt();
        if(num < 0){
            System.out.println("negative value is undefined");
        }else{
            int originalNum = num;
            do { 
                 fact = fact*num;
                 num--;   
            } 
            while(num > 0);
            System.out.println("factorial of original num " +fact);
        }
    }
}*/

/*import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter positive numbers  :");
        do {
            System.out.print("Enter a number: ");
            num = obj.nextInt(); 
            if (num >= 0) { 
                sum += num;
            }
        } while (num >= 0); 
        System.out.println("Sum of positive numbers = " + sum);
    }
}*/

/*import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();

        System.out.println("Multiplication Table of " +num);
        for (int i = 1; i <= 10; i++) { 
            int product = num * i;
            System.out.println(" multiply tables of "  + product); 
        }
    }
}*/
/*import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a=0, b=1,c;
        System.out.println("Enter a number: ");
        int n=obj.nextInt();
        System.out.print("Fibonacci Series: " + a + " " + b +" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
    
        }
    }
    }*/
    
     /** import java.util.*;
    class loop{
        public static void main(String [] args){
            Scanner obj = new Scanner(System.in);
            System.out.println("Entter a number");
            int num = obj.nextInt();
            int count=0;
    
            
            while(num != 0){
              int  rem = num % 10;
        
              count++;
                num/=10;

            }
            System.out.print("The number of digits:" +count);
        }

    }*/

/*class loop{
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}*/


/*class loop{
    public static void main(String [] args){
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                if(i == 0 || i == 3 || j == 0 || j == 3)
                System.out.print("*");
                else
                System.out.print(" ");
             
            }
            System.out.println();
            
        }
    
    }
}*/

/*class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                break; 
            }
            System.out.println(i);
        }
    }
}*/

/*class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}*/
/*class loop{
    public static void main(String [] args){
        for(int i = 1;i <= 5;i++){
            for(int j = i;j <= i;j++){
                for(int k = 1;k <= j;k++){
                    System.out.print(k+"");
                }
                
            }
            
            System.out.println();
        }
    
    }
}*/



/**import java.util.Scanner;

public class loop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();

    String result = "Prime";
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        result = "Not Prime";
        break;
      }
    }

    System.out.println(num + " is " + result);
}
}*/