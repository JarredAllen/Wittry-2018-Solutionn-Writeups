import java.util.Arrays;
/**
 * @author Don Allen
 * @author Alexander Tsao
 * @author Jarred Allen
 * @version 2018 Wittry Contest
 */
public class Switches {
    private int[] s;

    /**
     * Constructor for objects of class Swiches
     */
    public Switches(int[] temp) {
        s = temp;
    }

    public int size() {
        return s.length;
    }

    public int[] getSwitch() {
        return s;
    }

    /**
     * preCondition   0 <= numDoor < size()
     */
    public int get(int numDoor) {
        return s[numDoor];
    }

    public int hashCode() {
        return Arrays.hashCode(s);
    }

    public boolean equals(Object obj) {
        Switches temp = (Switches)obj;
        if (size() != temp.size()) {
            return false;
        }

        for (int m = 0; m < size(); m++) {
            if (get(m) != temp.get(m)) {
                return false;
            }
        }

        return true;
    }
}