public class Leet {
    public static String[] allToLeet (String[] normals) {
        String[] newStringArray = new String[normals.length];
        for(int i = 0; i < normals.length; i++) {
            newStringArray[i] = toLeet(normals[i]);
        }
        return newStringArray;
    }
    
    public static String toLeet (String normal) {
            normal = normal.replace("elite", "1337");
            normal = normal.replace("cool",	"k3wl");
            normal = normal.replace("!", "!!!11");
            normal = normal.replace("ck", "xx");
            normal = normal.replace("ers", "0rz");
            normal = normal.replace("er", "0rz");
            normal = normal.replace("en", "n");
            normal = normal.replace("e", "3");
            normal = normal.replace("t", "7");
            normal = normal.replace("o", "0");
            normal = normal.replace("a", "@");
        return normal;
    }
}