/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field9318 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Closest", (int)((long)821675799 ^ (long)821675799));
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field9319 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Health", (int)-374719791L ^ 0xE9AA3AD0);
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field9320 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Damage", (int)((long)718276447 ^ (long)718276446) << 1);
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] Field9321;
    private int Field9322;

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[])Field9321.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[(int)((long)1183431108 ^ (long)1183431111)];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)((long)1536227081 ^ (long)1536227081)] = Field9318;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)((long)0x666699A6 ^ (long)1718000039)] = Field9319;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)((long)-85902302 ^ (long)-85902301) << 1] = Field9320;
        Field9321 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray;
    }

    private static String Method1588(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-397315117L ^ 0xE85173D3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-514406190L ^ 0xE156C82D);
            int n2 = (int)((long)-1385457844 ^ (long)-1385457837);
            cArray2[n] = (char)(cArray[n] ^ ((int)-965081455L ^ 0xC67A4FB2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

