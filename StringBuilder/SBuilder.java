package StringBuilder;

public class SBuilder {
    public static void main(String args[]){
        StringBuilder builder = new StringBuilder();
        builder.append("Junior");
        builder.append(" Fagundes");
        System.out.println(builder);
        int index = builder.indexOf("u");
        System.out.println(index);
    }
}
