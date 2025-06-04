class RecursionDemo{
static boolean is Palindrome(strings,int start,int end){
if(start>==end){
return ture;
if(s.charAt(start)=s.char(end)){
return false;
}
return is Palindrome(s,start+1,end-1);
}
public static void main[String[]args){
string s="madam";
if(is Palindrome(s,0,s.length()-1)){
system.out.println(s+"is Palindrome");
} else{
system.out.println(s+"is not Palindrome");
}
}
}