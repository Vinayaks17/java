// // Module 10    Patterns

// // pattern printing star

// import java.util.*; 
// public class javabasics4{
//     public static void main(String[] args){
//         for(int line=1; line<=4; line++){
//             for(int star=1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();     // this the code to give space of 1 line
//         }
//     }
// }


// // inverted star pattern

// import java.util.*; 
// public class javabasics4{
//     public static void main(String[] args){
//         int n=4;
//         for(int line=1; line<=n; line++){
//             for(int star=1; star<=n-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// // Half pyramid pattern

// import java.util.*;
// public class javabasics4{
//     public static void main(String[] args){
//         int n =4;
//         for(int line=1; line<=n; line++){
//             for(int number=1; number<=line; number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }


// // Print Character pattern

// import java.util.*;
// public class javabasics4{
//     public static void main(String[] args){
//         int n = 4;
//         char ch = 'A';

//         //outer loop 
//         for(int line=1; line<=n; line++){
//             // inner loop
//             for(int chars=1; chars<=line; chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }





// // //        MODULE 11         FUNCTIONS AND METHODS 


// // Basic function syntax and use

// import java.util.*;

// public class javabasics4{

//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         return;
//     }
//     public static void main(String[] args){
//         printHelloWorld();                        // here we have called the function and the function has been executed by the program
//     }
// }


// // Synatx with parameters

// // TRADITIONAL MATHOD;-
import java.util.*;
public class javabasics4{
    public static void calculatesum(){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is :"+sum);

    }

    public static void main(String[] args){
        calculatesum();
    }

}


// // NEW METHOD
// import java.util.*;
// public class javabasics4{

//     public static void calculatesum(int num1, int num2){                // here we have givin parameters which give input to the function
//         int sum = num1+num2;
//         System.out.println("Sum is :"+sum);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculatesum(a, b);
//     }

// }

// // NEW METHOD 2

// using int return type

// import java.util.*;
// public class javabasics4{

//     public static int calculatesum(int num1, int num2){                // difference
//         int sum = num1+num2;
//         return sum;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum =calculatesum(a, b);                         //difference
//         System.out.println("Sum is :"+sum);
//     }

// }


// // SWAP   (CALL BY VALUE)


// // AAAAAAAAAAAAAAAAAAAAAAAA

// // there is some diference between AAAAAAAAAAAAA and BBBBBBBBBB

// import java.util.*;
// public class javabasics4{

//     public static void swap(int a, int b){               
//         // swap
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//     }

//     public static void main(String[] args){
//         int a = 5;
//         int b = 10;
//         swap(a, b);
//     }

// }

// // BBBBBBBBBBBBBBBBB

// import java.util.*;
// public class javabasics4{

//     public static void swap(int a, int b){               
//         // swap
//         int temp = a;
//         a = b;
//         b = temp;
//     }

//     public static void main(String[] args){
//         int a = 5;
//         int b = 10;
//         swap(a, b);
        
//         System.out.println("a = "+a);                                  // now swap does not work because we have defined changes in the swap function so values will stay there only
//         System.out.println("b = "+b);                  
//     }

// }


// // FIND PRODUCT OF A AND B

// import java.util.*;

// public class javabasics4{

//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;

//     }
//     public static void main(String[] args){
//         int a = 13;
//         int b = 2;
//         int prod = multiply(a, b);
//         System.out.println("a * b = "+prod);

//         // the value can be further updated like
//         prod = multiply(23, 45);
//         System.out.println("a * b = "+prod);

//     }
// }


// // FACTORIAL OF A NUMBER N


// import java.util.*;

// public class javabasics4{

//     public static int factorial(int n){
//         int f = 1;
//         for(int i =1; i<=n; i++){
//             f = f * i;
//         }
//         return f;                  // factorial of n
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(factorial(n));

//     }
// }

//