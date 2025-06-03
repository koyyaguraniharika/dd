 import java.util.Scanner;
class Main
{
//function to check if a string is palindrome
public static int isPalindrome(String s)
{ 
int left=0;
int right=s.length()-1;
//continue looping while the two pointers
// have not Crossed
while(left<right){
//if the characters at the current position
//are not equal
if(s.charAt(left)!=s.charAt(right))
return 0;
//Move the left pointer to the left
//the rightpointer to the left
left++;
right--;
}
//If np mismatch is found,return 1(palindrome)
return 1;
}
public static void main(String[]args)
{
String s="abc";
System.out.println(isPalindrome(s));
}
}