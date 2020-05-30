//superclass
public class Makeup {

    private String texture;

    //inheritance
    public void waterproof(){
        System.out.println("Waterproof makeup");
    }

    public void shade(){
        System.out.println("Pigmented shades");
    }

    //encapsulation
    public void setTexture(String newTexture){
        texture = newTexture;
    }

    public String getTexture(){
        return texture;
    }
}
