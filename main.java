import java.util.HashMap;

public class main {

    public static void main(String[] args) {
	try {
	    System.out.println(hasOneToOneMapping(args[0], args[1]));
	}
	catch (ArrayIndexOutOfBoundsException e) {
	    // if args[0] and args[1] not entered into command line, print false
	    System.out.println(false);
	}
    }

    public static boolean hasOneToOneMapping(String s1, String s2) {

	// if the strings have different lengths, return false
	if (s1.length() != s2.length()) {
	    return false;
	}

	// instantiate HashMap object
	HashMap<String, String> hashMap = new HashMap<>();

	for (int i = 0; i < s1.length(); ++i) {
	    String key = s1.substring(i,i+1);
	    String val = s2.substring(i,i+1);
	    // if the hash map has the key in it already and it's value doesn't equal the current val, return false
	    if (hashMap.get(key) != null && !hashMap.get(key).equals(val)) {
		return false;
	    }
	    // add key and value to the hash map
		hashMap.put(key, val);
	    }

	return true;
    }
}
