import java.util.Arrays;
public class J0018ArraysEqual
{
 public static void main(String[] args)
 {
  int array1[] = {1,2,3,4,5,6};
  int array2[] = {7,8,9,10,11,12};
  int array3[] = {1,2,3,4,5,6};

	if(Arrays.equals(array1, array2))
		System.out.println("Array1 and Array2 are Equals");
	else if(Arrays.equals(array2, array3))
		System.out.println("Array2 and Array3 are Equals");
	else if(Arrays.equals(array3, array1))
		System.out.println("Array3 and Array1 are Equals");
	else
		System.out.println("All of these array are different");
 }
}
