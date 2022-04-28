public class J0026functions
{
 public void nonStaticTest()
 {
  System.out.println("Non static method");
 }
 public static void staticTest()
 {
  System.out.println("Static method");
 }

 public static void main(String[] args)
  {
    System.out.println("Hello World");
    J0026functions J0026functionsObject = new J0026functions();
    J0026functionsObject.nonStaticTest();
    staticTest();
   }
}
