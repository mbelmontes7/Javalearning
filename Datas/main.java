package Datas;

// class Main {
//         public static void main(String[] args) {
//          int n = 4; //initiallize 
//          System.out.println("Factorial " + Factorial(n));
//         }
//      public static long Factorial(long n) {
//         if (n == 0)
//          return 1;
//         else
//          return n * Factorial(n-1);
//      }
// }
class Main {
    public static void main(String[] args) {
     int n = 12;
     System.out.println("Fib " + Fib(n));
    }
   public static long Fib(long n) {
    if((n == 0) || (n == 1)) {
     return n;
    } else {
     return Fib(n-1) + Fib(n-2);
    }
   }
   }