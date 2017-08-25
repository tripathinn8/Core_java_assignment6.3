import java.util.*;
public class MySearch {

	public static void main(String[] args) {
		
		int[] myArr= {2,6,3,0,8,5,4};
		
		Arrays.sort(myArr);
	for (Integer number: myArr)
	{System.out.println("The sorted values are:"+ number);}
	System.out.println();
	Scanner digi= new Scanner(System.in);
	System.out.println("Enter the number to be searched");
	int num=digi.nextInt();
int	x=Arrays.binarySearch(myArr, num);
System.out.println("The searched value is: "+ num + " at the index position: "
		+ x);
	}
}
