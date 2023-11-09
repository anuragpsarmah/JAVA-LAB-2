public class LAB2dot1 {
    public static void main(String[] args) {
        String text = "'We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative.' The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.  ";

        System.out.println("charAt(10): " + text.charAt(10));
        System.out.println("");

        System.out.println("compareTo(\"Hello\"): " + text.compareTo("Hello"));
        System.out.println("");

        System.out.println("concat(\" - TEXT FOR LAB2.\"): " + text.concat(" - TEXT FOR LAB2."));
        System.out.println("");

        System.out.println("contains(\"Tata Nano\"): " + text.contains("Tata Nano"));
        System.out.println("");

        System.out.println("endsWith(\".\"): " + text.endsWith("."));
        System.out.println("");

        System.out.println("equals(\"Different String\"): " + text.equals("Different String"));
        System.out.println("");

        System.out.println("equalsIgnoreCase(\"Some String\"): " + text.equalsIgnoreCase("Some String"));
        System.out.println("");

        System.out.println("String.format() -> " + String.format("This is string formatting: %s", text));
        System.out.println("");

        byte[] barr = text.getBytes();
        System.out.print("getBytes(): ");
        for (int i = 0; i < barr.length; i++) {
            System.out.print(barr[i]);
        }
        System.out.println("\n");

        char[] arr = new char[20];
        text.getChars(1, 17, arr, 0);
        System.out.print("getChars(): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");

        System.out.println("indexOf(\"nano\"): " + text.indexOf("Nano"));
        System.out.println("");

        String s1 = text.intern();
        System.out.println("intern(text): " + s1); //copies the string value from string pool
        System.out.println("");

        System.out.println("isEmpty(\"text\"): " + s1.isEmpty());
        System.out.println("");

        System.out.println("length(): " + text.length());
        System.out.println("");

        System.out.println("replace(\"Ratan\", \"JRD\"): " + text.replace("Ratan", "JRD"));
        System.out.println("");

        System.out.println("replaceAll(\"our\", \"their\"): " + text.replace("our", "their"));
        System.out.println("");

        System.out.println("substring(50, 100): " + text.substring(50, 100));
        System.out.println("");

        char[] ch = text.toCharArray();
        System.out.print("toCharArray(): ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("\n");

        System.out.println("toLowerCase(): " + text.toLowerCase());
        System.out.println("");

        System.out.println("toUpperCase(): " + text.toUpperCase());
        System.out.println("");

        System.out.println("trim(): " + text.trim());
        System.out.println("");

        //valueOf() converts other data types to string. Not applicable in this case
    }
}
