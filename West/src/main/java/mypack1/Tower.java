package mypack1;
/*
 * 打印金字塔
 */
public class Tower {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>n-i&&j<n+i) {
					System.out.print("^");
				}else {
					System.out.print(" ");
				}
				//System.out.print("\n");
			}
			System.out.println("\n");
		}
		//System.out.println("\n");

	}

}
