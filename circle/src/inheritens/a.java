package inheritens;

public class a {

	int A=10;
	
}

class b extends a {
	
	int B=10;
	
	void a1()
	{
		System.out.println(A+B);
	}
	public static void main(String arc[])
	{
		b ob=new b();
        ob.a1();  	
	}
}
