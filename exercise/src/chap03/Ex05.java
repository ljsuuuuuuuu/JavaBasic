package chap03;

public class Ex05 {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i += 1) {
			for(int j = 1; j <= 20; j += 1) {
				for(int k = 1; k <= 20; k += 1) {
					if(k+j+i <= 20) {
						if(k*k + j*j == i*i) {
							System.out.printf("%d, %d, %d", k, j, i);
							System.out.println();
						}					
					}
				}
			}
		}
	}
}
