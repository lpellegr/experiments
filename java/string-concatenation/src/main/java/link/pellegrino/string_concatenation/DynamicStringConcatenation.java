package link.pellegrino.string_concatenation;

public class DynamicStringConcatenation {

    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < 1e6; i++) {
            result += "some more data";
        }

        System.out.println(result);
    }

}
