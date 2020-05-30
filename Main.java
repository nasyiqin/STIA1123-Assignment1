public class Main {
    public static void main(String[] args){

        Face f = new Face();
        System.out.println("\nFace Makeup Brand: " +f.brand);  //overriding
        //inheritance
        f.waterproof();
        f.setCoverage("Great");
        System.out.println("Coverage: " +f.getCoverage());
        //encapsulation
        f.setTexture("Dew & Matte");
        System.out.println("Texture: " +f.getTexture());
        f.shade();
        //overloading
        f.function("natural skin tone");
        f.function("acne", "darkspots");

        Eyes e = new Eyes();
        System.out.println("\nEye Makeup Brand: " +e.brand);  //overriding
        //inheritance
        e.waterproof();
        //encapsulation
        e.setTexture("Matte");
        System.out.println("Texture: " +e.getTexture());
        //overriding
        e.shade();
        e.lashes();

        Lips l = new Lips();
        System.out.println("\nLips Makeup Brand: " +l.brand);  //overriding
        //inheritance
        l.waterproof();
        //encapsulation
        l.setTexture("Gloss & Satin");
        System.out.println("Texture: " +l.getTexture());
        //overriding
        l.shade();
        l.lipColor();

    }
}
