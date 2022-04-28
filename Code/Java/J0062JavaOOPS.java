public class J0062JavaOOPS {
    String name;
    int rollNo;
    String email;

    static void func()
    {
        System.out.println("Hello students wlcome to the OOPs programming in Java");
    }


public static void main(String[] args) {
    J0062JavaOOPS J0062 = new J0062JavaOOPS();
    J0062JavaOOPS J0062a = new J0062JavaOOPS();

    J0062.name = "mahi raunak";
    J0062.rollNo = 9;
    J0062.email = "MahiRaunak3747@gmail.com";

    J0062a.name = "Ashish Ranjan";
    J0062a.rollNo = 46;
    J0062a.email = "mahiraunak@gmail.com";

    System.out.println(J0062.name);
    System.out.println(J0062.rollNo);
    System.out.println(J0062.email);

    System.out.println(J0062a.name);
    System.out.println(J0062a.rollNo);
    System.out.println(J0062a.email);
 }
}
