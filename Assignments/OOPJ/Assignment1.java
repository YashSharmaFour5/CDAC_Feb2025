import java.util.Scanner;

public class assignment_1 {
    
    public void Q1(int a, int b)
    {
        System.out.printf("Before XOR [^] Swap: A: %d \t B: %b \n",a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.printf("After  XOR [^] Swap: A: %d \t B: %b \n",a,b);
    }
    
    public boolean Q2(int a)
    {
        System.out.println( ((a & 1) == 0) ? ("Number is Even.") : ("Number is Odd.") );
        return ((a & 1) == 0) ;
    }


    public int Q3(int a)
    {
        int sum_digits=0;
        while (a!=0) 
        {
            sum_digits += (a%10);
            a /= 10;     
        }
        return sum_digits;
    }

    public void Q4(int a)
    {
        if (a < 0) {
            a = -a;
        }
        
        // Base cases for recursion
        //if (a == 0) return true;
        //if (a == 1) return false;
        //if (a == 2) return false;
        
        // Count 1s at even and odd positions
        int evenBits = 0;
        int oddBits = 0;
        int position = 0;
        
        while (a > 0) 
        {
            if ((a & 1) == 1) // Check if least significant bit is 1

            {
                if ((position & 1) == 0){evenBits++;}//Even Position 
                else {oddBits++;}// Odd position
            }
            a = a >> 1;  // Right shift to examine next bit
            position++;
        }
        
        // A number is divisible by 3 if |evenBits - oddBits| is divisible by 3
        int difference = evenBits - oddBits;
        if (difference < 0){difference = -difference;}
        
        // Check if difference is 0 or 3 or 6...
        System.out.println( ( (difference == 0)||(difference == 3) ) ? ("Divisible by 3") : ("Not Divisible by 3") );
    }

    public void Q5(int x, int y)
    {
        System.out.println("Before Swapping: \nX = " + x + "\nY = " + y); 
		x += y;
		y -= x;
		y = -y;
		x -= y;
		System.out.println("After Swapping: \nX = " + x + "\nY = " + y); 
    }
    
    public int Q6(int a, int b, int c)
    {
        System.out.printf("Greatest of 3 given numbers: %d \n", ((a>b) ? ( (a>c)?(a):(c) ) : ( (b>c)?(b):(c) )) ); 
        return ( (a>b) ? ( (a>c)?(a):(c) ) : ( (b>c)?(b):(c) ) );
    }

    public boolean Q7(int year)
    {
        boolean leap_year = false;
        leap_year = (year % 4 == 0) ? ( (year % 100 == 0) ? ( (year % 400 == 0) ? true : false ) : (false) ) : (false); 
        System.out.printf( (leap_year == true) ? ("Leap Year!") : ("Not a Leap Year.") );
        return leap_year;
    }

    public void Q8(boolean a, boolean b, boolean c)
    {
        System.out.println( ((a && b) || (b && c) || (c && a)) ? ("Atleast two of the three bits are true") : ("Atleast 2 bits are false") );
    }   

    public void Q9(int a)
    {
        System.out.println( ( (a>20) && (a<50) ) ? ("Number within the range [ 20 < num < 50 ]") : ("Number out of range") );
    }

    public void Q10(char a)
    {
        System.out.println((a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || 
                           a=='A' || a=='E' || a=='I' || a=='O' || a=='U') ? 
                           "Vowel" : "Consonant");
    }

    public void Q11(int a)
    {
        a = ( (a<0) ? -a : a ) ;
        System.out.printf ( (a & (a-1))==0 ? (a + " is a power of two") : ("Oops! " + a + " is not a power of two") );
    }

    public void Q12(int a)
    {
        System.out.println("Left shift 3 times or Number * 8: " + (a << 3));
    }
    
    public void Q13(int a)
    {
        int mask = a >> 31;
        System.out.println("Absolute value of " + a + " is " + ( (a + mask) ^ mask) );
    }

    public void Q14(int a)
    {
        int count = 0;
		while(a > 0)
        {
            a = ( a & (a - 1) );
            count++;
        }
        System.out.println("Number of 1s in the binary representation of " + a + " is " + count);
    }

    public int Q15(int a)
    {
        int even_bits = (a & 0xAAAAAAAA) >> 1;
        int odd_bits = (a & 0x55555555) << 1;
        return (even_bits | odd_bits);
    }

    public void Q16(int a)
    {
        System.out.println( (a!=0) ? ((a>0) ? (a + " is positive") : (a + " is negative")) : (a + " is zero") );   
    }

    public void Q17(int a, int b, int c, int d)
    {
        System.out.println( ( (a>b) ? ((a>c) ? ((a>d) ? a : d) : ((c>d) ? c : d)) : ((b>c) ? ((b>d) ? b : d) : ((c>d) ? c : d)) ) );
    }

    public void Q18(int a)
    {
        System.out.println( (a >40) ? ("Pass") : ("Fail") );
    }
    
    public void Q19(char a)
    {
        System.out.println( ((a >= 'A' && a <= 'Z') ? ("Uppercase") : ((a >= 'a' && a <= 'z') ? ("Lowercase") : ("Invalid Character")) ) );
    }

    public void Q20(int a)
    {
        System.out.println( "Absolute value of " + a + " is " + ( (a>0) ? (a) : (-a) ) );
    }

    public void Q21(int a)  
    {
        int result = -~a;
        System.out.println("Incremented value of " + a + " is " + result);
    }                    
    
    public void Q22(Scanner keyB)
    {
        System.out.print("Enter first number: ");
        int num1 = keyB.nextInt();
        System.out.print("Enter second number: ");
        int num2 = keyB.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = keyB.next().charAt(0);
        
        switch(operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break; case '/': if(num2 != 0) { System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }
        
    }

    public void Q23(int num)
    {
        String result = (num & 1) == 0 ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }

    public void Q24()
    {
        for(int i = 1; i <= 100; i++) {
            if((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void Q25(int a)
    {
        int n = a;
        int reversed = 0;

        while(n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        
        System.out.println("Original number: " + a);
        System.out.println("Reversed number: " + reversed);
    }

    public void menu()
    {
        System.out.println("\n====================================================================================================\n");
        System.out.println("01) Q01: Swaps two numbers using XOR operations without using a temporary variable");
        System.out.println("02) Q02: Checks if a number is even or odd using bitwise AND operator");
        System.out.println("03) Q03: Calculates sum of digits in a number");
        System.out.println("04) Q04  Write a program to find whether a given number is divisible by 3 without using the modulus (%) or division (/) operators.");
        System.out.println("05) Q05: Write a Java program to swap two numbers using the += and -= operators only");
        System.out.println("06) Q06: Write a program to find the largest of three numbers using only the ternary operator");
        System.out.println("07) Q07: Implement a Java program that checks whether a given year is a leap year or not using logical (&&, ||) operators");
        System.out.println("08) Q08: Write a program that takes three boolean inputs and prints true if at least two of them are true");
        System.out.println("09) Q09: Implement a Java program that checks if a number is within a specific range (20 to 50) without using if-else");
        System.out.println("10) Q10: Write a program to determine if a character is a vowel or a consonant using the ternary operator.");
        System.out.println("11) Q11: Write a program to check if a given number is a power of 2 using bitwise operators.");
        System.out.println("12) Q12: Write a Java program to multiply a number by 8 without using * or / operators.");
        System.out.println("13) Q13: Implement a Java program to find the absolute value of an integer using bitwise operators.");
        System.out.println("14) Q14: Write a program to count the number of 1s (set bits) in a binary representation of a number using bitwise operations.");
        System.out.println("15) Q15: Implement a program to swap odd and even bits of a number using bitwise operators.");
        System.out.println("16) Q16: Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator");
        System.out.println("17) Q17: Implement a Java program that finds the minimum of four numbers using nested ternary operators.");
        System.out.println("18) Q18: Determines pass/fail based on score using ternary operator");
        System.out.println("19) Q19: Identifies if a character is uppercase, lowercase or invalid");
        System.out.println("20) Q20: Finds absolute value of a number using ternary operator");
        System.out.println("21) Q21: Increments a number using bitwise NOT operator");
        System.out.println("22) Q22: Implements a basic calculator using switch statement");
        System.out.println("23) Q23: Determines if a number is even or odd using bitwise operator");
        System.out.println("24) Q24: Prints even numbers from 1 to 100 using bitwise operator");
        System.out.println("25) Q25: Reverses digits of a number\n");
        System.out.println("00) Exit");
        System.out.println("\n====================================================================================================\n");
        System.out.println("Enter the number of the question you want to execute: ");       
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        assignment_1 obj = new assignment_1();
        Scanner keyB = new Scanner(System.in);
        
        while (true) {
            obj.menu();
            try {
                String key = keyB.nextLine();
                int choice = Integer.parseInt(key);
                
                if (choice == 0) {
                    System.out.println("Exiting the program.\n\033[H\033[2J");
                    break;
                }
                
                System.out.print("\033[H\033[2J");
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        int a = Integer.parseInt(keyB.nextLine());
                        System.out.print("Enter second number: ");
                        int b = Integer.parseInt(keyB.nextLine());
                        obj.Q1(a, b);
                        break;
                        
                    case 2:
                        System.out.print("Enter a number: ");
                        obj.Q2(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 3:
                        System.out.print("Enter a number: ");
                        System.out.println("Sum of digits: " + obj.Q3(Integer.parseInt(keyB.nextLine())));
                        break;
                        
                    case 4:
                        System.out.print("Enter a number: ");
                        obj.Q4(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 5:
                        System.out.print("Enter first number: ");
                        int x = Integer.parseInt(keyB.nextLine());
                        System.out.print("Enter second number: ");
                        int y = Integer.parseInt(keyB.nextLine());
                        obj.Q5(x, y);
                        break;
                        
                    case 6:
                        System.out.print("Enter first number: ");
                        int n1 = Integer.parseInt(keyB.nextLine());
                        System.out.print("Enter second number: ");
                        int n2 = Integer.parseInt(keyB.nextLine());
                        System.out.print("Enter third number: ");
                        int n3 = Integer.parseInt(keyB.nextLine());
                        obj.Q6(n1, n2, n3);
                        break;
                        
                    case 7:
                        System.out.print("Enter a year: ");
                        obj.Q7(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 8:
                        System.out.println("Enter three boolean values (true/false):");
                        boolean b1 = Boolean.parseBoolean(keyB.nextLine());
                        boolean b2 = Boolean.parseBoolean(keyB.nextLine());
                        boolean b3 = Boolean.parseBoolean(keyB.nextLine());
                        obj.Q8(b1, b2, b3);
                        break;
                        
                    case 9:
                        System.out.print("Enter a number: ");
                        obj.Q9(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 10:
                        System.out.print("Enter a character: ");
                        obj.Q10(keyB.nextLine().charAt(0));
                        break;
                        
                    case 11:
                        System.out.print("Enter a number: ");
                        obj.Q11(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 12:
                        System.out.print("Enter a number: ");
                        obj.Q12(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 13:
                        System.out.print("Enter a number: ");
                        obj.Q13(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 14:
                        System.out.print("Enter a number: ");
                        obj.Q14(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 15:
                        System.out.print("Enter a number: ");
                        System.out.println("Result after swapping even and odd bits: " + 
                            obj.Q15(Integer.parseInt(keyB.nextLine())));
                        break;
                        
                    case 16:
                        System.out.print("Enter a number: ");
                        obj.Q16(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 17:
                        System.out.println("Enter four numbers:");
                        int num1 = Integer.parseInt(keyB.nextLine());
                        int num2 = Integer.parseInt(keyB.nextLine());
                        int num3 = Integer.parseInt(keyB.nextLine());
                        int num4 = Integer.parseInt(keyB.nextLine());
                        obj.Q17(num1, num2, num3, num4);
                        break;
                        
                    case 18:
                        System.out.print("Enter score: ");
                        obj.Q18(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 19:
                        System.out.print("Enter a character: ");
                        obj.Q19(keyB.nextLine().charAt(0));
                        break;
                        
                    case 20:
                        System.out.print("Enter a number: ");
                        obj.Q20(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 21:
                        System.out.print("Enter a number: ");
                        obj.Q21(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 22:
                        obj.Q22(keyB);
                        break;
                        
                    case 23:
                        System.out.print("Enter a number: ");
                        obj.Q23(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    case 24:
                        obj.Q24();
                        break;
                        
                    case 25:
                        System.out.print("Enter a number: ");
                        obj.Q25(Integer.parseInt(keyB.nextLine()));
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please enter a number between 0 and 25.");
                        break;
                }
                
                System.out.println("\nPress Enter to continue...");
                keyB.nextLine();
                System.out.print("\033[H\033[2J");
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                System.out.println("\nPress Enter to continue...");
                keyB.nextLine();
                System.out.print("\033[H\033[2J");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                System.out.println("\nPress Enter to continue...");
                keyB.nextLine();
                System.out.print("\033[H\033[2J");
            }
        }
        
        keyB.close();
    }
}
