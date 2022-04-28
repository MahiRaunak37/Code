import java.util.Arrays;	//importing arrays

public class J0017Arrays
{
 public static void main(String[] arg)
 {
  int marks[] = {2,7,4,6,3};			//creating an arrays
  int marksCopy[], marksCopyRange[];		//creating a arrays with  variable side

  marksCopy = Arrays.copyOf(marks,8);		//copy the element of marks arrays in marksCopy (markscopy with side 8)
  marksCopyRange = Arrays.copyOfRange(marks,1,4); //copy the element of marks arrays with range of the system

  String mStrRange = Arrays.toString(marksCopyRange);
  System.out.println(mStrRange);

  String mStr = Arrays.toString(marksCopy);	//converting the array markscopy in the string
  System.out.println(mStr);
 }
}
