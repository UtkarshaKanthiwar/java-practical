package utkarsha;

public class HashCodeMethod {
	public static void main(String[] args) {
		EqualAndHashCodeMethod g1 =new EqualAndHashCodeMethod("a",1);
		EqualAndHashCodeMethod g2 =new EqualAndHashCodeMethod("b",2);
		if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. ");


	}
}
// EqualAndHashCodeMethod (using this class the prg is run ) Finding obj are equal or not