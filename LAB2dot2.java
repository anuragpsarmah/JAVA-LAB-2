public class LAB2dot2{
    public static void main(String[] args) {
   
        StringBuffer stringBuffer = new StringBuffer("New, ");
    
        stringBuffer.append("York");
        System.out.println("Append(): " + stringBuffer);

        stringBuffer.insert(9, ", USA ");
        System.out.println("After insert(): " + stringBuffer);

        // replace() method
        stringBuffer.replace(11, 14, "North America");
        System.out.println("After replace(): " + stringBuffer);

        // delete() method
        stringBuffer.delete(11, 24);
        System.out.println("After delete(): " + stringBuffer);

        // charAt() method
        char ch = stringBuffer.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // setCharAt() method
        stringBuffer.setCharAt(0, 'H');
        System.out.println("After setCharAt(): " + stringBuffer);

        // length() method
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        // capacity() method
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of the StringBuffer: " + capacity);

        // ensureCapacity() method
        stringBuffer.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(): " + stringBuffer.capacity());

        // toString() method
        String str = stringBuffer.toString();
        System.out.println("String representation: " + str);

        // substring(int start) method
        String subStr1 = stringBuffer.substring(5);
        System.out.println("Substring from index 5: " + subStr1);

        // substring(int start, int end) method
        String subStr2 = stringBuffer.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2);
    }
}