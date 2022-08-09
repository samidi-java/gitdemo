package strings;

public class Ex1 {

	public static void main(String[] args) {
		
		String s1=new String("welcome"); //Creates welcome object in SCP
		String s2=new String("welcome"); //it creates a new object welcome in Heap memory
		if(s1==s2)
		{
			System.out.println("s1 and s2 are same");
		}else
		{
			System.out.println("s1 and s2 are not same");
		}

	}

}
