//日四B 06122238 施佳妏
package P03_06122238;

public class P03_06122238_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Java";
		String s2 =  "Programming is fun";
		String s3 =  "Welcome to Java";
		
		System.out.println(s1 == s2); //回傳TorF，判斷字串s1是否等於字串s2
		System.out.println(s1 == s3); //回傳TorF，判斷字串s1是否等於字串s3
		System.out.println(s1.equals(s2)); //回傳TorF，判斷字串s1是否等於字串s2
		System.out.println(s1.equals(s3)); //回傳TorF，判斷字串s1是否等於字串s3
		System.out.println(s1.compareTo(s2)); //回傳0、正值或負值，將s1與s2之相同位置的字母進行順序比較
		System.out.println(s2.compareTo(s3)); //回傳0、正值或負值，將s2與s3之相同位置的字母進行順序比較
		System.out.println(s2.compareTo(s2)); //回傳0、正值或負值，將s2與s2之相同位置的字母進行順序比較
		System.out.println(s1.charAt(0)); //回傳s1字串中指定索引處(0)的字元
		System.out.println(s1.indexOf('j')); //回傳int，從前向後找到該指定字元(j)在s1字串中第一次出現處的索引
		System.out.println(s1.indexOf("to")); //回傳int，從前向後找到該指定子字串(to)在s1字串中第一次出現處的索引
		System.out.println(s1.lastIndexOf('a')); //回傳int，從後向前找到該指定字元(a)在s1字串中第一次出現處的索引
		System.out.println(s1.lastIndexOf("o", 15)); //回傳int，從指定位置處向前找指定字元(p)在在s1中第一次出現處的索引
		System.out.println(s1.length()); //回傳int，計算s1字串的長度
		System.out.println(s1.substring(5)); //回傳子字串，擷取s1字串中於指定索引處(5)開始的字元，到此字串結束
		System.out.println(s1.substring(5, 11)); //回傳子字串，擷取s1字串中於指定索引處(5)開始的的字元，到指定索引處(11)結束
		System.out.println(s1.startsWith("Wel")); //回傳TorF，判斷字串s1是否開始於指定之子字串(Wel)
		System.out.println(s1.endsWith("Java")); //回傳TorF，判斷字串s1是否結束於指定之子字串(Java)
		System.out.println(s1.toLowerCase()); //回傳一個新字串，將s1改由小寫字母輸出
		System.out.println(s1.toUpperCase()); //回傳一個新字串，將s1改由大寫字母輸出
		System.out.println(s1.concat(s2)); //回傳一個新字串，將s2字串連接於s1之後
		System.out.println(s1.contains(s2)); //回傳TorF，判斷字串s1中是否包含有字串s2
		System.out.println("\t Wel \t".trim()); //回傳一個新字串，去除字串(\t Wel \t)兩端的空白
	}

}
