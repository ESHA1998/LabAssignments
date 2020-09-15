package Day1;

public class Ques1 {

	public static void main(String[] args) {
		int[] fibonacci=new int[20];
		fibonacci[0]=1;
		fibonacci[1]=1;
		for(int i=2;i<20;i++) {
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		int sum=0;
		for(int i=0;i<20;i++) {
			System.out.print(fibonacci[i]+ " ");
			sum+=fibonacci[i];
		}
		System.out.println();
		float average=sum/20f;
		System.out.println(average);
	}

}
