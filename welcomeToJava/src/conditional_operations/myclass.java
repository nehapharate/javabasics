package conditional_operations;

public class myclass {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=true;
		boolean z=false;
		
		System.out.println(x&&y);   //AND
		System.out.println(x&&z);    //AND
		
		System.out.println(x||y);    //OR
		System.out.println(x||z);    //OR
		
		System.out.println(x?"correct":"incorrect");  //ternary operator
		System.out.println(x&&z?"correct":"incorrect");  //ternary operator
		
		int x1=10;
		int y1=15;
		int z1=10;
		
		System.out.println(x1==z1 && y1==15);
		
		System.out.println(x1==z1 && x1==y1);
		
		System.out.println(x1==z1 || y1==15);
		
		System.out.println(x1==z1 || x1==y1);
		
		System.out.println(x1==10?"right":"wrong");
		System.out.println(y1==10?"right":"wrong");
		
		
		if(x1==z1&&y1==15)
		{
			System.out.println("returns true");
		}else {
			System.out.println("returns false");
		}

	}

}
