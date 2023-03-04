import java.util.*;
class calc
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the range of values: ");
      int range = sc.nextInt();
      double[] ar = new double[range];
      
      // Read in the values
      for (int i = 0; i < range; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            ar[i] = sc.nextDouble();
        }
      boolean flag = true;
      System.out.println("operations performed: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Quit");
        System.out.println("select the operation: ");
      while(flag){
        
        int ch = sc.nextInt();
        double result = 0;
        switch(ch){
          case 1 : System.out.println("addition");
                   for(double j:ar){
                     result+=j;
                   }
                  System.out.println("result: "+ result);
                  break;
          case 2 : System.out.println("subtraction");
                    result = ar[0];
                    for(int k=0;k<range;k++){
                      result -=ar[k];
                    }
                   System.out.println("result: "+ result);
                    break;
          case 3 : System.out.println("multiplication");
                    result = ar[1];
                    for(double z:ar){
                      result *=z;
                    }
                   System.out.println("result: "+ result);
                    break;
          case 4 : System.out.println("Division");
                    result = ar[0];
                    for(int u=0;u<range;u++){
                      result /= ar[u];
                    }
                   System.out.println("result: "+ result);
                    break;
            default : System.out.println("invalid choice try again!!");
                      
                    break;
        }
        
        
      }
      sc.close();
    }
  }