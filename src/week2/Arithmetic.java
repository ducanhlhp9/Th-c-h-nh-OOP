package week2;

public class Arithmetic {
	public static void main(String[] args) {
		int sum = 0;
	 int data[]= {78, 65, 78, 21, 93, 45,33, 55, 22, 81};
	 for(int i = 0; i< data.length; i++ ) {
		 
		 sum = sum + data[i];
	 }
	 System.out.printf("tong : %d",sum);
	 float TB;
	 TB =(float) sum/10.f;
	 System.out.printf("TB: %f",TB);
	 int max=data[0];
	 int min= data[0];
	 for(int i =0; i <data.length;i++) {
		 if(data[i]<min) {
			 min = data[i];
		 }
		 if(data[i] >max) {
			 max=data[i];
		 }
	 }
	 System.out.println("Max: " + max );
	 System.out.println("min: " + min);
	}
}
