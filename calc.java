import java.util.*;
class calc
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      boolean flag = true;
      while(flag){
        System.out.println("please select the operation");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square root");
        System.out.println("6. N-th root");
        System.out.println("0 exit");

        int choice = sc.nextInt();
        if(choice == 0){
          System.out.println("Thank you for using the calci");
          flag = false;
        }
        double result = 0;
        
        switch(choice){
          case 1:
            result = addition(sc);
            break;

          case 2:
            result = subtraction(sc);
            break;

          case 3:
            result = multiplication(sc);
            break;

          case 4:
            result = division(sc);
            break;

          case 5:
            result = squareroot(sc);
            break;

          case 6:
            result = nroot(sc);
            break;

          default: System.out.println("invalid choice try again");
            continue;
        }
        System.out.println("Result: "+ result);
        
      }
      sc.close();
    }

    private static double addition(Scanner sc){
      System.out.println("enter the values by giving spaces");
      double sum = 0;
      while(sc.hasNext()){
        if(sc.hasNextDouble()){
          sum += sc.nextDouble();
        }
        else{
          String input=sc.next();
          if(input.equals("stop")){
            break;
          }
          else{
            System.out.println("invalid choice try again!!");
          }
        }
      }
      return sum;
    }

    private static double subtraction(Scanner sc){
      System.out.println("enter the values by spacing");
      double subt = sc.nextDouble();
      while(sc.hasNext()){
        if(sc.hasNextDouble()){
          subt -=sc.nextDouble();
        }
        else{
          String input = sc.next();
          if(input.equals("stop")){
            break;
          }
          else{
            System.out.println("invalid entry!!");
          }
        }
      }
      return subt;
    }

    private static double multiplication(Scanner sc){
      System.out.println("multiply values by giving spacing");
      double res = 1;
      while(sc.hasNext()){
        if(sc.hasNextDouble()){
          res *=sc.nextDouble();
        }
        else{
          String input = sc.next();
          if(input.equals("stop")){
            break;
          }
          else{
            System.out.println("invalid entry!!");
          }
        }
      }
      return res;
    }

    private static double division(Scanner sc){
      System.out.println("enter the dividend");
      double dividend = sc.nextDouble();
      System.out.println("enter the divisor");
      double divisor = sc.nextDouble();
      double resu = dividend/divisor; 
      return resu;
    }

    private static double squareroot(Scanner sc){
      System.out.print("enter the number to find the square root: ");
      double value = sc.nextDouble();
      return Math.sqrt(value);
    }

    private static double nroot(Scanner sc){
      System.out.print("Enter the  value of n: ");
      double n = sc.nextDouble();
      System.out.print("enter the number to find " + n + " root: ");
      double number = sc.nextDouble();

      return Math.pow(number, 1.0/n);
    }
  }