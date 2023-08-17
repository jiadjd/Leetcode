package OptimalPartitionOfString;

public class Main {

	public static void main(String[] args) {
		String s = "dhfudinaksebalfgdngd";
		int num = partitionString(s);
		System.out.println(num);

	}
	
	
	public static int partitionString(String s) {
        String currentstr = Character.toString(s.charAt(0));
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            if(!currentstr.contains(c)) {
                currentstr = currentstr + c;
            } else {
                count++;
                currentstr = c;
            }
        }
        return count;
    }

}
