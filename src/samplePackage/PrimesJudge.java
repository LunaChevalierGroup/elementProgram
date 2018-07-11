package samplePackage;

public class PrimesJudge {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		for (int i = 1; i <= num; i++) {
			boolean isSosu = primesJudge(i);
			if (isSosu == true) {
				System.out.print(i);
				System.out.println(isSosu);
			} else if (isSosu == false) {
				System.out.print(i);
				System.out.println(isSosu);
			}
		}
	}

	static boolean primesJudge(int i) {
		boolean isSosu = true;
		if(i==1){
			isSosu=false;
		}
		
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				isSosu = false;
				break;
			}
		}
		return isSosu;
	}
}
