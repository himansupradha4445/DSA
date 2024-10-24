package StringProblem;

import java.util.Scanner;

// https://leetcode.com/problems/excel-sheet-column-number/?envType=problem-list-v2&envId=string&difficulty=EASY

public class ExcelSheetColumnTitle {
	
	public static int titleToNumber(String columnTitle) {
        int cn=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char letter=columnTitle.charAt(i);
            int value=letter-'A'+1;
            cn=cn*26+value;

        }
        return cn;
    }

	public static String converToTitle(int cn)
	{
		StringBuilder sb=new StringBuilder();
		while(cn>0)
		{
			cn--;
			int rem=cn%26;
			char letter=(char)(rem+'A');
			sb.insert(0, letter);
			cn/=26;
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Column number to display column title");
		int columnNumber=sc.nextInt();
		System.out.println("Enter column title to display column number");
		String title=sc.next();
		System.out.println(converToTitle(columnNumber));
		System.out.println(titleToNumber(title));

	}

}
