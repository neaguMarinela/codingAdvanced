package exercise.caesarCipher_done;

class Solution {

    static String rotate(String data, int key) {

        String str = "";
        for (int i = 0; i < data.length(); i++) {
            char temp = (char) (data.charAt(i) + key);
            if (temp > 'z') {
                str += (char) (data.charAt(i) - (26 - key));
            } else {
                str += (char) (data.charAt(i) + key);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(rotate("testz", 23));
    }

}