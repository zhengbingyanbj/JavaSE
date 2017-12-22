package level03_04;

/*
 * 将50元兑换成5元,2元和1元.每种面额的钱不能为0张.共有几种兑换方法.每种兑换方法的钱是怎么样的?
 */
public class Test04 {
	public static void main(String[] args) {
		// 假设i是5元的,j是2元的,k是1元的
		for (int i = 1; i < 10; i++) {	// 5元的
			
			for (int j = 1; j < 25; j++) { // 2元的
				for (int k = 1; k < 50; k++) { // 1元的
					if (i * 5 + j * 2 + k == 50) {
						System.out.println("5元的 " + i + " 张,2元的 " + j + " 张,1元的 " + k + " 张");
					}
				}
			}
		}
	}
}