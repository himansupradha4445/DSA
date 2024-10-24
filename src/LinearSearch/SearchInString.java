package LinearSearch;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		String name="hsjhh";
		char target='o';
		//System.out.println(searchChar(name,target));
		//System.out.println("Hello");
		System.out.println(Arrays.toString(name.toCharArray()));

	}
	static boolean searchChar(String name,char target)
	{
		if(name.length()==0)
		{
			return false;
		}
		for(char c:name.toCharArray())
		{
			if(c==target)
			{
				return true;
			}
		}
		return false;
	}

}
