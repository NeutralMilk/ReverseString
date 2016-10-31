import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        String input = new String();

        //new scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");

        //if it's an integer add it to the list
        if(scanner.hasNextLine())
        {
            input = scanner.nextLine();
        }

        String reverse = reverseIteratively(input);
        System.out.println("Iteratively: " + reverse);

        reverse = reverseRecursively(input);
        System.out.println("Recursively: " + reverse);
    }//end main

    //iteratively
    public static String reverseIteratively(String input)
    {

        //make a character array the same length as the input
        int l = input.length();
        char[] c = new char[l];
        int j = 0;

        //for loop to work backwards from the end of the input string
        for(int i = l-1; i > -1; i--)
        {
            //make the first character in c the last character of the input
            c[j] = input.charAt(i);

            //move up one character and the for loop will move back one
            j++;
        }
        String s = new String(c);
        return(s);
    }

    //recursively
    public static String reverseRecursively(String input)
    {
        int l = input.length();
        //make c the last character of the input
        char c = input.charAt(l-1);


        //if the base case is reached then end
        if(l == 1)
        {
            return Character.toString(c);
        }//end if

        //return last character of the input string and call the function again
        //the first time this runs if the input was 'hello' would be like
        //return o + hell
        return c + reverseRecursively(input.substring(0, l-1));
    }
}
