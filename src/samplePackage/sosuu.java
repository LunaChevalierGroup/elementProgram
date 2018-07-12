package samplePackage;

public class sosuu {
	public static void main(String[] args) {

		int n = 0;
		int num = Integer.parseInt(args[0]);

		for (n = 1; n <= num  ; n++) {
        if( n == 1){
        	System.out.println( n + "は素数ではありません");
        }else if(n == 2){
        System.out.println(n+ "は素数です");
        }else if ( n  % 2   == 0) {
				System.out.println(n + "は素数ではありません");
        }else if ( n % 3 == 0){
        	System.out.println(n + "は素数ではありません");

        }else{
				System.out.println( n + "は素数です。");
			 }
			 }

		}

	}


