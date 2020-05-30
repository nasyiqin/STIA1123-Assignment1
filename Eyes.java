public class Eyes extends Makeup{//inherit makeup class

    String brand = "Urban Decay";

    public void lashes(){
        System.out.println("Make eyes stand out");
    }

    @Override
    public void shade(){
        System.out.println("Different shades");
    }
}
