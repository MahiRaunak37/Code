class employee
{
    int id;
    String name;
    String email;
    public void printDetails()
    {
        System.out.println("id is:- "+id);
        System.out.println("Name is:- "+name);
        System.out.println("Email is:- "+email);

    }
}
public class J0063JavaOOPsClass {
    public static void main(String[] args) {
        System.out.println("Employee details of others class are:- ");
        employee emp1 = new employee();
        employee emp2 = new employee();

        emp1.id = 12222;
        emp1.name = "Raunak";
        emp1.email = "mahiraunak@gamil.com";
        emp1.printDetails();

        emp1.id = 233332;
        emp1.name = "ashish ranjan";
        emp1.email = "ashishranjan@gamil.com";
        emp1.printDetails();

    }
    
}
