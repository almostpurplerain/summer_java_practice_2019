public class Ahocortest {
    public static void main(String[] args) {
        String str = "she he her it his";
        String text = "herithishe";
        Bohr testBohr = new Bohr();
        testBohr.stringToBohr(str);
        AhoCor test1 = new AhoCor();
        test1.processText(text, testBohr);
        test1.answer.forEach((key, value) -> {

            System.out.print("text position: "+ key);

            System.out.println(", template: "+ value);

        });
    }
}
