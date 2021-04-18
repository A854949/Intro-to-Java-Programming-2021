package CH05;

import java.util.Scanner;

public class CH05_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//請使用者輸入兩個字串
		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();
		
		String common = ""; //設common為兩字串共同的部分
		int length = str2.length(); //設length為str2的字串長度
		
		if (str1.length() < str2.length()) //若str2長度>str1
			length = str1.length(); //則length為str1的字串長度
		
		for (int i = 0; i < length; i++) //設迴圈起始i=0; 當length>i會執行; 執行完後i++
		{
			if (str1.charAt(i) == str2.charAt(i)) //若str1索引位置i回傳的字元=str2索引位置i回傳的字元
				common += str1.charAt(i);
		}
		
		if (common == "") //若為空字串
            System.out.println(str1 + " and " + str2 + "have no common prefix");
        else
            System.out.println("The common prefix is " + common);
	}

}
