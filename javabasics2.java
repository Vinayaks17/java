
// // //     IF  ELSE statements 


// import java.util.*;

// public class javabasics2 {
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if (a>=18){
//             System.out.println("adult");
//         }

//         else{
//             System.out.println("Not adult");
//         }
//     }
// }    





// // greatest of two numbers 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a>b) {
//             System.out.println("a is greater");
//         }

//         if (a==b) {
//             System.out.println("a and b are equal");
//         }

//         else {
//             System.out.println("b is greater");
//         }
//     }
// }


// // check whether a number is even or odd     //doubt

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int x = sc.nextInt();

//         if (x%2!=0) {
//             System.out.println("The number is odd");
//         }
//         else if (x%2==0 && x!=0) {
//             System.out.println("The number is even");
//         } 
//         else {
//             System.out.println("The number is zero");
//         }

//     }
// }


// // Income tax calculator 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);

//         int x = sc.nextInt();

//         if (x<500000) {
//             System.out.println("Income tax is: 0");
//         }
//         else if (x>500000 && x<=1000000) {
//             System.out.println("Income tax is: "+ x*0.2);
//         }
//         else {
//             System.out.println("Income tax is: "+ x*0.3);
//         }
//     }
// }


// //largest of three numbers 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a>b && a>c) {
//             System.out.println("a is the largest");
//         }
//         else if (b>c) {
//             System.out.println("b is the largest");
//         }
//         else {
//             System.out.println("c is the largest");
//         }
        
//     }
// }


// // Ternary operators 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int x = sc.nextInt();

//         String y =((x%2)==0) ? "Even" : "Odd";

//         System.out.println(y);
//     }
// }


// // pass fail question 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int marks = sc.nextInt();

//         String status=(marks>=33) ? "PASS" : "FAIL";

//         System.out.println(status);
//     }
// }


// //  SWITCHES 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int x = sc.nextInt();                           // we can even use char and string in place of int
        
//         switch(x){
//             case 1 : System.out.println("India");
//                     break;
//             case 2 : System.out.println("USA");
//                     break;
//             case 3 : System.out.println("Russia");
//                     break;
//             case 4 : System.out.println("China");
//                     break;        
//             default : System.out.println("No country");                       
//         }
//     }
// }



// // MAKING a CALCUlATOR 

// import java.util.*;

// public class javabasics2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a:");
//         int a = sc.nextInt();
//         System.out.println("Enter b:");
//         int b = sc.nextInt();

//         System.out.println("Enter the operator:");

//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+' : System.out.println(a+b);
//                     break;
//             case '-' : System.out.println(a-b);
//                     break;
//             case '*' : System.out.println(a*b);
//                     break;
//             case '/' : System.out.println(a/b);
//                     break;
//             case '%' : System.out.println(a%b);
//                     break;
//             default : System.out.println("Calulator not that advance");                     
//         } 
//     }

// }


// // Q1 

// import java.util.*;

// public class javabasics2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         int x = sc.nextInt();
//         if (x>0) {
//             System.out.println("The number is positive");
//         }
//         else{
//             System.out.println("The number is negative");
//         }
//     }
// }


// // Q2
// import java.util.*;

// public class javabasics2{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         float x = sc.nextFloat();
//         if (x>=100) {
//             System.out.println("You have fever");
//         }
//         else {
//             System.out.println("You dont have fever");
//         }
//     }
// }


// // Q3

// import java.util.*;
// public class javabasics2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int weekno = sc.nextInt();

//         switch (weekno){
//             case 1 : System.out.println("Monday");
//                     break;
//             case 2 : System.out.println("Tuesday");
//                     break;
//             case 3 : System.out.println("Wednesday");
//                     break;
//             case 4 : System.out.println("Thursday");
//                     break;
//             case 5 : System.out.println("Friday");
//                     break;
//             case 6 : System.out.println("Saturday");
//                     break;
//             default : System.out.println("Sunday");      
//         }
//     }
// }


// import java.util.*;

// public class javabasics2{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int y = s.nextInt();
//         int i =0;
//         while (i<y)
//          {
//             Scanner sc = new Scanner(System.in);
//             int x = sc.nextInt();

//             if (x<=70) {
//                 System.out.println("No fine");
//             }
//             else if (x>70 && x<=100){
//                 int a = 500*y;
//                 System.out.println("Fine is:"+a);
//             }
//             else {
//                 int b = 2000*y;
//                 System.out.println("Fine is:"+b);
//             }
//         }
//     }
// }








