/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA
extends Enum {
    public static final /* enum */ E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA Field9828 = new E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA("PRE", (int)-1562037747L ^ 0xA2E5320D);
    public static final /* enum */ E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA Field9829 = new E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA("POST", (int)((long)-1601720388 ^ (long)-1601720387));
    private static final E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA[] Field9830;
    private int Field9831;

    public static E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA[] values() {
        return (E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA[])Field9830.clone();
    }

    public static E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA valueOf(String string) {
        return Enum.valueOf(E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA() {
        void var2_-1;
        void var1_-1;
    }

    static {
        E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA[] e4S5VNYqukjPxZx8pFFy9Pib2eBKO6bAArray = new E4S5VNYqukjPxZx8pFFy9Pib2eBKO6bA[((int)1208527407L ^ 0x4808AA2E) << 1];
        e4S5VNYqukjPxZx8pFFy9Pib2eBKO6bAArray[(int)((long)-1620838546 ^ (long)-1620838546)] = Field9828;
        e4S5VNYqukjPxZx8pFFy9Pib2eBKO6bAArray[(int)((long)1011002232 ^ (long)1011002233)] = Field9829;
        Field9830 = e4S5VNYqukjPxZx8pFFy9Pib2eBKO6bAArray;
    }

    private static String Method2083(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-630452344L ^ 0xDA6C0F88;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)208685569 ^ (long)208685822);
            int n2 = (int)((long)420598060 ^ (long)0x1911D119) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)2094434916L ^ 0x7CD683B5) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

