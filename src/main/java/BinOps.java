public class BinOps {
    public String sum(String a, String b) {
        int intStr = Integer.parseInt(a, 2);
        int intStr_2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(intStr + intStr_2);
    }

    public String mult(String a, String b) {
        int intStr = Integer.parseInt(a, 2);
        int intStr_2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(intStr * intStr_2);
    }
}
