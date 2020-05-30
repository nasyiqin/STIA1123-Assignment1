public class Face extends Makeup{ //inherit makeup class

    String brand = "Maybelline";
    private String coverage;

    //overloading
    public void function(String f1){
        System.out.println("Change " + f1);
    }

    public void function(String f2, String f3){
        System.out.println("Cover " + f2 + " & " + f3);
    }

    //encapsulation
    public void setCoverage(String newCoverage){
        coverage = newCoverage;
    }

    public String getCoverage(){
        return coverage;
    }

    @Override
    public void shade(){
        System.out.println("Different shades");
    }
}
