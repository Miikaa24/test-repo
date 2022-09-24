//import java.util.Arrays;

import java.util.Locale;

public class midTerm {

// asuult 1:
//public static void main (String []args){
//    int m = 9, n = 1, x = 0;
//     while(m > n) {
//         m--;
//         n += 2;
//         x += m + n; }
//     System.out.println(x);
//}} //36
// asuult 2:
//Using a continue in a while loop causes the loop to break the current iteration and start the next iteration of the loop.
// true


//asuult 3:

//public static void main (String []args){
//    int[] random = { 6, -4, 12, 0, -10 };
//    int x = 12;
//    int y = Arrays.binarySearch(random, x);
//    System.out.println(y);
//}} // import class // hariult n 2

//asuult 4:
//Which of the following are valid Java identifiers? (Choose all that apply)
//
//A$B
//_helloWorld
//true
// java.lang
// Public
//1980_s


// asuult 5:
//public static void main (String[]args){
//    float var1 =  (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
//
//    float var2 = var1 + 1024;
//
//    System.out.println(var2);
//
//}
//} // hariult : 13480.02

// asuult 6:
// Which of the following method signatures is a valid declaration of an entry point in a
//    Java application?
//
//    public void main(String[] args)
//    public static void main()
//    private static void start(String[] mydata)
//    public static final void main(String[] mydata)

//    Answer : [D]
//    Explanation :
//    An entry point in a Java application consists of a main() method with a single String[] argument
//    return type of void, and modifiers public and static.
//    The name of the variable in the input argument does not matter.
//    Option A is missing the static modifier, Option B is missing the String[] argument, and Option C has the wrong
//    access modifier and method name.
//    Only Option D fulfills these requirements.
//    Note that the modifier final is optional and may be added to an entry point method.

// asuult 7:
//What will the following statement return?
//
//            "hello java guru ".trim(); // hariult: "hello java guru"


// asuult 8:
//public static void main (String[] args){
//int k=0;
//for (int i=10;i>0; i--){
//while (i>3)i-=3;
//k+=1;}
//System.out.println(k);
//}} // hariult: 1

// asuult 9:

//    public static void main(String... args) {
//        String name = "Desiree";
//        int _number = 694;
//        boolean profit$$$;
//        System.out.println(name + " won. "
//                + _number + " profit " + profit$$$);
//    }} The println statement does not compile

// asuult 10:
// Which of these methods are not a part of the String class?
//
//hariult: reverse


// asuult 11:
//Which of the following is not a valid class declaration?
//class 5MainSt {}
// Java class names cannot start with numbers.

// asuult 12:
//14. Which of the following lists of primitive types are presented in order from smallest to
//largest data type?
//
//byte, char, float, double

// asuult 13:
//int [] intArr =  {8, 16, 32, 64, 128};

//    Which two code fragments, independently, print each element in this array?
//
//    A) for (int i=0 : intArr) {
//
//        System.out.print(intArr[i] + " " );
//
//        i++;
//
//    }
//    D) for (int i=0; i < intArr.length; i++)    {
//
//        System.out.print(intArr[i] + " ");
//
//    }


// asuult 14:
//public static void main (String[] args){
//    String abc = "";
//    abc.concat("abc");
//    abc.concat("def");
//    System.out.print(abc);}
//} It will print empty string (or in other words, nothing).


// asuult 15:
//public static void main (String []args){
//    String numbers = "012345678";
//    System.out.println(numbers.substring(1, 3));
//    System.out.println(numbers.substring(7, 7));
//    System.out.println(numbers.substring(7));}
//} // 12 // 78


// asuult 16:

//    What data type (or types) can you insert at blank line which will allow the following code snippet to compile? (Choose all that apply)
//
//    byte x = 5;
//    byte y = 10;
//    _____ z = x + y;
//
//
//
//    int
//    long + doubleYour selection is incorrect

// asuult 17:
//public static void main(String[] args ) {
//
//    int sum = 0;
//    for (int xVal = 1; xVal <= 5; xVal++) {
//        sum = sum + xVal;
//
//    }
//    System.out.print("The sum of " + xVal + " numbers is : " + sum);
//}} hariult: A compile time error occurs


//asuult 18:
//What is the correct character for terminating a statement in Java?
//A semicolon;



//asuult 19:
//public static void main (String []args){
//  int count = 0;
//   do {
//    do {
//      count++;
//       } while (count < 2);
//  break;
// } while (true);
//  System.out.println(count);
//}
//}// hariult: 2



//asuult 20:
//public static void main (String []args){
//int x=4;
//long y=x*4-x++;
//if (y<10)
//    System.out.println("Too low");
//else System.out.println("Just Right");
////else System.out.println("Too high");}
//}} // suuliin murnuus bolj aldaa zaana


// asuult 21:

//public static void main (String [] args){
//    String letters = "abcdef";
//    System.out.println(letters.length());
//    System.out.println(letters.charAt(3));
//    System.out.println(letters.charAt(6));}
//}
//        6
//        d
//        Exception is thrown


//asuult 22:
//public static void main (String[]args){
//    int x = 1;
//    int y = 2;
//    int z = x++;
//    int a = --y;
//    int b = z--;
//    b+= ++z;
//    int answ = x > a ? y > b ? y : b : x > z ? x : z;
//    System.out.println(answ);}
//} // hariult: 2

// asuult 23:

//    public static void main(String args []){
//        String s = "MINIMUM";
//        System.out.println(s.substring(4, 7)); //1
//        System.out.println(s.substring(5)); //2
//        System.out.println(s.substring(s.indexOf( 'I', 3))); //3
//        System.out.println(s.substring(s.indexOf('I', 4))); //4
//    }
//}
//    MUM
//    UM
//    IMUM
//        Exception in thread



// asuult 24:
//public class Highway {
//    public int drive(long car) { return 2; }
//    public int drive(double car) { return 3; }
//    public int drive(int car) { return 5; }
//    public int drive(short car) { return 3; }
//    public static void main(String[] gears) {
//        value = 5;
//        System.out.print(new Highway().drive(value));
//    }
//} // short, byte, float



// asuult 25:
//public static void main (String[]args){
//String s= "purr";
//s.toUpperCase(Locale.ROOT);
//s.trim();
//s.substring(1,3);
//s=s+" two";
//    System.out.println(s.length());}
//} // 8



//asuult 26:
//public static void main(String[] args) {
//    System.out.println(getMsg((char)10));
//}
//    public static String getMsg(char x){
//        String msg = "Input value must be";
//        msg = msg.concat("smaller than X");
//        msg.replace('X', x);
//        String rest = " and larger than 0";
//        msg.concat(rest);
//        return msg;
//    }
//} // Input value must be smaller than X


// asuult 27:
//public static void main (String[]args){
//    boolean keepGoing = true;
//   int result = 15, i = 10;
//   do {
//      i--;
//     if(i==8) keepGoing = false;
//  result -= 2;
// } while(keepGoing);
//  System.out.println(result);}
//} // 11



// asuult 28:
   // Which package is imported into every Java class by default?
//java.lang



// asuult 29:
//You have written some Java code in MyFirstClass.java file. Which of the following commands
//will you use to compile and run it. (Assume that the code has no package declaration.)

   // javac MyFirstClass.java, java MyFirstClass



// asuult 30:
//Which is the first line to trigger a compiler error?
//
//    double d1 = 5f; // p1
//
//    double d2 = 5.0; // p2
//    float f1 = 5f; // p3
//    float f2 = 5.0; // p4   // ene hariult n
