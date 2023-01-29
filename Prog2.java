public class Prog2 {
    public static void main(String args[]) {
        String s = "Akshaysadhsahahhhhh";
        int temp = 0;
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
                ind = i;
            }
        }
        System.out.println(s.charAt(ind));

    }

}
