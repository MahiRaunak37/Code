class cellphone
{
    public void ringing()
    {
        System.out.println("Phone is ready to ring");
    }

    public void vibrating()
    {
        System.out.println("Phone id vibrating");
    }

    public void calling()
    {
        System.out.println("Phone is calling ");
    }
    public void openCamera()
    {
        System.out.println("Open camera");
    }
    public void moveCoursor()
    {
        System.out.println("mover coursor");
    }

    public void select()
    {
        System.out.println("Item is selected");
    }
}

public class J0064Mobilecontrol {
    public static void main(String[] args) {
        cellphone cell = new cellphone();
        cell.ringing();
        cell.vibrating();
        cell.calling();
        cell.openCamera();
        cell.moveCoursor();
        cell.select();        
    }
}
