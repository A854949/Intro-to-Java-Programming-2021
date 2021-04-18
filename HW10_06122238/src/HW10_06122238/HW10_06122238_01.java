//日四B 06122238 施佳妏
package HW10_06122238;

public class HW10_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //設sum加總骰子點數
		int count = 0; //設count計算三顆骰子加總出現9的情況有幾組
		String[] ans = new String[216]; //設陣列ans存骰子組合
		for (int i = 1; i <= 6; i++) { //第一顆骰子
            for (int j = 1; j <= 6; j++) { //第二顆骰子
                for (int k = 1; k <= 6; k++) { //第三顆骰子
                	sum = i + j + k; //加總三顆骰子點數
                	if(sum == 38 % 7 + 6) { //若為9
    					ans[count] = i + " " + j + " " + k; //將三個點數存進ans
    					count++;
                    }
                }
            }
        }
		for (int i = 0; i < count; i++) { //印出所有可能的組合
			System.out.println(ans[i]);
		}
				
	}
}
	
