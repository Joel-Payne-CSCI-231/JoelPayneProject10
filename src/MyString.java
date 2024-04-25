public class MyString {
    private final char[] data;

    MyString(char[] chars) {
        this.data = chars;
    }

    public char charAt(int index) {
        return data[index];
    }

    public int length() {
        return data.length;
    }

    public MyString substring(int begin, int end) {
        char[] subData = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subData[i - begin] = data[i];
        }
        return new MyString(subData);
    }

    public MyString toLowerCase() {
        char[] lowerData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            lowerData[i] = Character.toLowerCase(data[i]);
        }
        return new MyString(lowerData);
    }

    public boolean equals(MyString s) {
        if (data.length != s.length()) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public MyString valueOf(int i) {
        return new MyString(String.valueOf(i).toCharArray());
    }
}
