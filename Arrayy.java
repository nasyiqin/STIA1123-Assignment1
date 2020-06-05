import java.util.ArrayList;
import java.util.LinkedList;

public class Arrayy {

    public static void main(String[] args) {

        //array
        String[] makeup = new String[3];
        makeup[0] = "Face Makeup";
        makeup[1] = "Eye Makeup";
        makeup[2] = "Lip Makeup";
        System.out.println(makeup[0]);

        //array list
        ArrayList brandList = new ArrayList();
        brandList.add("Colourpop");
        brandList.add("Wet & Wild");
        brandList.add("Tarte");
        brandList.add("Jeffree Star");
        brandList.remove("Wet & Wild");

        System.out.print("\nMakeup brand: ");
        System.out.println(brandList);

        //linked list
        LinkedList Arrayy = new LinkedList();
        Arrayy.add("Watsons");
        Arrayy.add("Guardian");
        Arrayy.add("Sephora");

        System.out.print("\nDrugstore to buy makeup: ");
        System.out.print(Arrayy);
    }
}
