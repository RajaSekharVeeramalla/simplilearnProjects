package dataTypeExamples;

public class Typecast {
public static void main(String[] args ) {
	System.out.println("Implicit Type catsing");
	char a='A';
	System.out.println("value of a:" +a);
	int b=a;
	System.out.println("value of a:" +b);
	
	float c=a;
	System.out.println("value of a:" +c);
	long d=a;
	System.out.println("value of a:" +d);
	double e=a;
	System.out.println("value of a:" +e);
	System.out.println("Explicit typecasting");
	double x=45.5;
	int y=(int)x;
	System.out.println("value of x:" +x );
	System.out.println("value of y:" +y );
	
}
}

