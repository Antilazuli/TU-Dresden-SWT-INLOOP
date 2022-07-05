public class Translator {
    public static void main (String[] args) {
        String[] myArray = {"We are elite hackers!", "Informatiker machen coole Sachen!"};
        String newMyArray[] = Leet.allToLeet(myArray);
        for(String i : newMyArray) {
            System.out.println(i);
        }
    }
}