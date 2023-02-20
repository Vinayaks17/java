// // while loop printing hello world 10 times
// import java.util.*;

// public class javabascis3 {
//     public static void main(String[] args){
//         int i = 0;
//         while (i<10) {
//             System.out.println("Hello World");
//             i++;
//         }
//     }
// }

// // printing 10 numbers
// import java.util.*;
// public class javabascis3 {
//     public static void main(String[] args){
//         int i = 1;
//         while (i<10){
//             System.out.println(i);
//             i++;
//         }
//     }
//  }
 

// // printing number n number of times

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int i = 0;
//         while (i <= a) {
//             System.out.println(i);
//             i++;
//         }
//         System.out.println("Printed number a no of times");
//     }
// }



// // Sum of first N numbers 

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while (i <= a){
//             sum = sum+i;                   //sum+=i
//             System.out.println(sum);         // to print sum at each step
//             i++;
//         }
//         System.out.println(sum);             // to print total sum of all elements 
//     }
// }


// // FOR LOOP 

// import java.util.*;
// public class javabascis3{
//     public static void main(String[] args){
//         for( int i = 1; i<=10; i++){
//             System.out.println("Hello world");
//         }
//     }
// }



// // priting a square pattern useing FOR loop and WHILE loop 

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
// // pattern printing using for loop

//         for(int i = 1; i<=4; i++){
//             System.out.println("****");
//         }

// // pattern printing using while loop 
//         int i = 1;
//         while(i<=4){
//             System.out.println("****");
//             i++;
//         }
//     }
// }


// // PRINTING REVERse of A NUMBER 

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         int n = 10899;

//         while ( n>0 ) {
//             int lastdigit = n%10;
//             System.out.print(lastdigit);
//             n = n/10;        // n/=10
//         }
//     }
// }


// // reverse a given no 

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         int n = 10899;
//         int rev = 0;

//         while ( n>0 ) {
//             int lastdigit = n%10;
//             rev = (rev*10) + lastdigit;
//             n = n/10;        // n/=10
//         }

//         System.out.println(rev);
//     }
// }


// // DO WHILE LOOP 

// import java.util.*;
// public class javabascis3{
//     public static void main(String[] args){
//         int i = 1;
//         do{
//             System.out.println("Hello World");
//             i++;
//         } while ( i<=10 );
//     }
// }


// // Break Statement 
// import java.util.*;
// public class javabascis3{
//     public static void main(String[] args){
//         for(int i=1; i<=5; i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//     }
// }



// // Printing a number till multiple of 10 is entered         NICE ONE

// import java.util.*;
// class javabascis2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         do{
//             System.out.println("Enter your number: ");

//             int x = sc.nextInt();

//             if(x%10==0){
//                 break;
//             }
//             System.out.println(x);
//         } while(true);
//     }
// }



// // CONTINUE STATEMENT
// import java.util.*;
// public class javabascis3{
//     public static void main(String[] args){
//         for(int i=1; i<=5; i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//         System.out.println("the number 3 is not included");
//     }
// }


// // Display all numbers entered by user except multiple of 10

// import java.util.*;
// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("Enter your number: ");
//             int a = sc.nextInt();

//             if(a%10==0){
//                 continue;
//             }
//             System.out.println("Number was: "+a);
//         }while(true);

//     }
// }


// // Check if a number is prime or not

// // METHOD 1
// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if(n==2){
//             System.out.println("It is a prime number");
//         }

//         else{
//             boolean isPrime = true;
//             for (int i=2; i<=n-1; i++){
//                 if(n%i==0){
//                     isPrime = false;
//                 }

//             }
//             if(isPrime==true){
//                 System.out.println("It is a prime number");
//             }
//             else{
//                 System.out.println("It is not a prime number");
//             }
//         }
//     }
// }

// // METHOD 2

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if(n==2){
//             System.out.println("It is a prime number");
//         }

//         else{
//             boolean isPrime = true;
//             for (int i=2; i<=Math.sqrt(n); i++){                      // change in this method is only that we have replaced n-1 with (n)^1/2 because it reduces the number of times the loop runs which saves time
//                 if(n%i==0){
//                     isPrime = false;
//                 }

//             }
//             if(isPrime==true){
//                 System.out.println("It is a prime number");
//             }
//             else{
//                 System.out.println("It is not a prime number");
//             }
//         }
//     }
// }



// Q 2

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int sumodd = 0;
//         int sumeven = 0;
//         for(i=1; i<=x; i++){
//             if (x%2==0){
//                 sumeven = sumeven + i;
//                 System.out.println(sumeven);
//             }
//             else{
//                 sumodd = sumodd +i;
//                 System.out.println(sumodd);
//             }
            
            
//         }
       
//     }
// }


// // Q3

// import java.util.*;

// public class javabascis3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         int multi = 1;
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             multi = multi*i;

//         }
//         System.out.println(multi);


//     }
// }


// // Q4


// public class javabascis3{
//     public static void main(int number){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=1; i<=10; i++){
//             System.out.println(n+ "*" +i=n*i);
//         }
        
//     }
// }