public class JoelPayneProj10 {
    public static void main(String[] args) {
        MyString s1 = new MyString("Hello World!".toCharArray());
        MyString s2 = new MyString("Hello World!".toCharArray());
        MyString s3 = new MyString("Hello".toCharArray());
        MyString s4 = new MyString("hello".toCharArray());

        System.out.println("Checking if length of s1 is 12: " + (s1.length() == 12)); // true

        System.out.println("Checking if first character of s1 is 'H': " + (s1.charAt(0) == 'H')); // true

        System.out.println("Checking if s1 is equal to s2: " + (s1.equals(s2))); // true
        System.out.println("Checking if s1 is equal to s3: " + (s1.equals(s3))); // false
        System.out.println("Checking if s1 is equal to s4: " + (s1.equals(s4))); // false

        System.out.println("Checking if substring of s1 (0 to 5) is equal to s3: " + (s1.substring(0, 5)
                .equals(s3))); // true
        System.out.println("Checking if substring of s1 (0 to 5) is equal to s4: " + (s1.substring(0, 5)
                .equals(s4))); // false

        System.out.println("Checking if s3 in lowercase is equal to s4: " + (s3.toLowerCase().equals(s4))); // true

        System.out.println("Checking if value of 123 in s1 equals to new MyString object created with '123': " + (s1.valueOf(
                123).equals(new MyString("123".toCharArray())))); // true
    }
}
