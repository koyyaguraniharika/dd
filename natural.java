class RecursionDemo{
static int sum(int n){
if(n=1){
return 1;
} 
else{
return+sumNaturalNumbers(n-1);
}
}
public static void main[string[]args){
int number=10;
int result=sumNaturalNumbers(number);
system.out.println("sum of first"+number+"Naturalnumber is"+result);
}
}


