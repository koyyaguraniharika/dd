class RecursionDemo{
static String reverse(String str){
if(str.isEmpty()){
return str;
}else{
return reverse(str.substring(1))+str.chartAt(0);
}
}
public static void main(String{]args){
Strings="hello";
System.out.println("Reverse string"+reverse(S));
}
}