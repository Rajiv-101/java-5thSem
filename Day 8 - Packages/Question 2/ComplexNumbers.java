import mypack1.*;
class ComplexNumbers
{
	public static void main(String args[])
	{
		System.out.print("First Complex Number=");
		ComplexNumber a=new ComplexNumber(5,10);
		a.display();
		System.out.print("\nSecond Complex Number=");
		ComplexNumber b=new ComplexNumber(10,15);
		b.display();
		System.out.print("\nSum of Complex Numbers=");
		b=b.addComplex(a);
		b.display();

	}

}
