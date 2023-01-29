import java.util.HashMap;

public class protacted {
    public static void main(String args[]) {
        HashMap<Character, Integer> map = new HashMap<>();
        String Sa = "AAkksahhaayyb";
        char arr[] = Sa.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(arr[i]) == 0) {
                System.out.print(arr[i]);
                break;
            } else {
                if (i == arr.length - 1)
                    System.out.println("not contains");
            }
        }
    }

}
