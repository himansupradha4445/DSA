package StringProblem;

public class Isomorphic {

	public static boolean isIsomorphic(String s,String t)
	{
		while(s.length()!=t.length())
		{
			char fst=s.charAt(0);
			char Send=t.charAt(0);
			s=s.replace(fst, Send);
			if(s==null & t==null)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		String s="paper";
		String t="title";
		System.out.println(isIsomorphic(s,t));

	}

}
