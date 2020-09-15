package Day1;

public class Ques4 {

	public static int[] copyOf(int[] array) {
		int[] a=new int[array.length];
		for(int i=0;i<array.length;i++) {
			a[i]=array[i];
		}
		return a;
		
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] res=new int[a.length];
		res=Ques4.copyOf(a);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]+" ");
		}
	}
}
