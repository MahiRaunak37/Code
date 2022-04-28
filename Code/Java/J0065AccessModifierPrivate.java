class employee
{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    void setName(String n){
        name = n;
    }

    public void setId(int i)
    {
        id =i;
    }

    public int getId()
    {
        return id;
    }
    


}
public class J0065AccessModifierPrivate {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setName("mahi raunak");
        emp.setId(255);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
