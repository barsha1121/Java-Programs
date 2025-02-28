import java.util.Scanner;
public class ArrCls{
	public static void main(String args[]){
		int arr[], i, size, OddSum=0, EvenSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter elements:");
		for (i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		for(i=0;i<size;i++){
			if(arr[i]%2==0){
				EvenSum+=arr[i];
			} else {
				OddSum+=arr[i];
			}
		}
		System.out.println("Sum of Even elements: "+EvenSum);
		System.out.println("Sum of Odd elements: "+OddSum);
	}
}