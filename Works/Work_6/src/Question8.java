
public class Question8 {


	public static void main (String []args) {

		int  test = 13234334;

		PutInTab(test);

		System.out.println(size(test));

		System.out.println(GreatesNumber(test));

	}


	public static int  size(int n) {
		int res = 0;

		if(n == 0) {
			return 1;
		}

		else if(n < 0)  { //si tu compte le moins dans la longueur
			++res;
		}

		while(n != 0) {
			n /= 10;
			++res;
		}

		return res;
	}



	public static int GreatesNumber(int num) {


		int numb =0;
		int trans =0;

		for (int i = 0; i < size(numb); i++) {


			trans++;


		}


		return trans;
	}


	public static int[]PutInTab(int num){

		int[] arr = new int[size(num)];

		int value = 0;

		for (int i = 1; i < arr.length; i=i*10) {

			value = num%i/i;

			System.out.println(value);

		}

		return arr;

	}
}