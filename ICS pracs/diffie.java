import java.util.*;

class Diffie_hellman{
	
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter modulo p");
int p = sc.nextInt();
System.out.println("Enter primitive root of "+p);
int g = sc.nextInt();
System.out.println("Enter first secret");
int a = sc.nextInt();
System.out.println("Enter second secret");
int b = sc.nextInt();

int A=(int) Math.pow(g,a)%p;
int B=(int) Math.pow(g,b)%p;

int S_A=(int) Math.pow(B,a)%p;
int S_B=(int) Math.pow(A,b)%p;

if (S_A==S_B){
System.out.println("Connected with secret:"+S_A);
}
else{
System.out.println("Not Connected ");
}
}


}
