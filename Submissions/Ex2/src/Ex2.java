
public class Ex2{ 

	public static void main(String[] args) {

		//int imagetest [][][] =  MyImageIO.readImageFromFile("src/test1.jpeg");
		//MyImageIO.writeImageToFile("src/floux1",rgb2gray(imagetest));



	} 

	//Function 1       (Turn in GRAY)
	public static int[][] rgb2gray(int[][][] im){

		int[][]image =new int[im[0].length][im[0][0].length];//Creat a New Tab 

		for (int i = 0; i < im[0].length; i++) {
			for (int j = 0; j < im[0][0].length; j++) {

				image[i][j]=(int)(((0.3*im[0][i][j]) +(0.59*im[1][i][j])+(0.11*im[2][i][j]))*255);
			}
		}
		return image;
	}

	//Function 2       (Turn the image 90° Right)
	public static int[][][] rotate90(int[][][] im){

		int l = im[0].length;
		int h=  im[0][0].length;

		int imgrotated [][][]=new int [3][h][l];		

		for (int k = 0; k < 3; k++) {

			for (int i = 0; i<im[0][0].length  ;i++) {
				for (int j =0; j <im[0].length ;j++) {

					imgrotated[k][i][j]=im[k][l-1-j][i];

				}

			}


		}

		return imgrotated;


	}

	//Function 3       (Smooth the Image)(Using the function SmoothSum)
	public static int [][][] Smooth(int [][][] img,int n){

		int a = img.length;       
		int l = img[0].length;     
		int h = img[0][0].length;



		int imgstd [][][]=new int [3][l][h];

		for (int k = 0; k < a; k++) {
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < h-1; j++) {


					imgstd[k][i][j]= SmoothSum(img,n,k,i,j);


				}
			}
		}

		return imgstd;

	}

	//Function 3.1     (Do the sum of the matrix with the parameter)
	public static int  SmoothSum(int[][][] img,int n,int k , int p2,int p3){
		int sum =0;
		int res =0;
		int moy=0;
		int counter = 0;


		for (int i = p2-n; i < p2+n+1 ; i++) {


			for (int j = p3-n; j < p3+n+1; j++) {


				if (i>=0 && j>=0 && i<=img[0].length-1 && j<=img[0][0].length-1) {

					res=img[k][i][j];

					counter++;
				}

				else {

					res=0;


				}  


				sum= res+sum;	
			} 

		}

		if (counter==0 ) {

			return 0;
		}
		else {
			moy = sum/counter ;

			return moy;

		}

	}

	//Function 4       (Scale the image with the parameter)
	public static int[][] scaleup(double factor_h, double factor_w, int[][] im){

		int l=im.length; 
		int h=im[0].length; 

		int [][] imgscalped =new int [(int)(l*factor_w)][(int)(h*factor_h)];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < h; j++) {

				for (int fw = 0; fw < factor_w; fw++) {
					for (int fh = 0; fh < factor_h; fh++) {
						if ((int)(i*factor_w)+fw<(int)(l*factor_w)&&(int)(j*factor_h)+fh<(int)(h*factor_h)) {
							imgscalped[(int)(i*factor_w)+fw][(int)(j*factor_h)+fh]=im[i][j];
						}

					}
				}




			}
		}


		return imgscalped;
	}



}
