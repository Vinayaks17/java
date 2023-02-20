// import java.util.Scanner;

// // Boilerplate code


// public class javabasics {
//     public static void main(String args[]) {

//     }
// }




            // // Output in java 

// System.out.print("Hello world");


  // //ex


// public class javabasics {
//     public static void main(String args[]) {
//         System.out.println("Hello World!");
//         System.out.println("Hello World!");
//         System.out.print("Hello World!\nvinayak singh\n you are great");
//     }
// }

  


              // // Print a pattern

// public class javabasics {
//     public static void main(String args[]) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");

//     }
// }
 



//                // Variables in java


// public class javabasics {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Tony Stark";
//         System.out.println(name);

//         a = 50;
//         System.out.println(a);
//     }
// }

 

// //                Data types in java


// public class javabasics {
//     public static void main(String args[]) {
//         byte b = 8;
//         char ch = "a";
//         boolean var = false;
//         float price = 10.5;
//         int number = 25;
//         long bignumber = 7548329298;
//         double bigdecimalno = 02948.98490284;
//         short n = 240;
//     }
// }


// //               Q sum of a and b


// public class javabasics {
//     public static void main(String args[]) {
//         int a = 17;
//         int b = 9;
//         int sum = a+b;
//         System.out.println(sum);

//     }
// }


// //            Input in java


// // import java.util.*;

// public class javabasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String input = sc.next();             // .next() is used to print single words, it does not count spaces 
//         // System.out.println(input);

//         // String name = sc.nextLine();           // .nextline() is used to print whole sentance, it counts spaces 
//         // System.out.println(name);    
        
//         int number = sc.nextInt();
//         System.out.println(number);

//         float price = sc.nextFloat();
//         System.out.println(price);


//     }
// }




// //             Q sum of a and b ? (taking user input)

// import java.util.*;

// public class javabasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }


// //             Q product of a and b ?

// import java.util.*;

// public class javabasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a*b;
//         System.out.println(sum);
//     }
// }


// //           Q Area of a circle? 

// import java.util.*;

// public class javabasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         double area = 3.14*r*r;
//         System.out.println(area);
//     }
// }




// //            Type Conversion 

// // byte > short > int > float > long > double
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      float num = sc.nextInt();
      System.out.println(num);
    }
}




// //         Type casting
// public class javabasics {
//     public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       float a = 23.76f;
//       // int b = a;     //this will not work because of loss of data
//       int b = (int) a;
//       System.out.println(b);
//     }
// }



// //         Type promotion 

// public class javabasics {
//     public static void main(String args[]) {
//       char a = 'a';
//       char b = 'b';
//       System.out.println((int)(b));
//       System.out.println((int)(a));
//       System.out.println(b-a);             //here java automatically converts a and b to int and then perform the operation
//     }
// }



// public class javabasics {
//     public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       String x = sc.nextLine();
//       System.out.println(x);
//     }
// }



// public class javabasics {
//   public static void main(String args[]) {
//     int a = 10;
//     float b = 25.25f;
//     long c = 25;
//     double d = 30;
//     double x = a+b+c+d;              // answer will apper only when the x has been typecasted to biggest possible variable
//     System.out.println(x);
//   }
// }




//       questions 

//Q1

// public class javabasics{
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     int y = sc.nextInt();
//     int z = sc.nextInt();
//     int q = ((x+y+z)/3);
//     System.out.println(q);

//   }
// }


//Q2
// public class javabasics{
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     int y = (x*x);
//     System.out.println(y);
//   }
// }

//Q3

// public class javabasics{
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     float p = sc.nextFloat();
//     float y = sc.nextFloat();
//     float z = sc.nextFloat();
//     float t = (p+y+z);
//     float q = (t/100)*18;     //18%gst
//     System.out.println(t+q);
//   }
// }

