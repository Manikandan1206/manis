import java.util.*;
public class candies {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of children:");
		int num=in.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the rating value:");
		for(int i=0;i<num;i++){
			arr[i]=in.nextInt();}
		int temp=0;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;}}}
		int rem=0;
		for(int i=1;i<=num;i++){
			rem+=i;}
		System.out.println("The Minimum number of candies is "+rem);}}
