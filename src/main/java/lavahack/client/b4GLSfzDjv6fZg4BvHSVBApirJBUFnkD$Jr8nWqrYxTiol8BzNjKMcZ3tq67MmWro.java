/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro Field15814 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro("PlaceBreak", (int)((long)-1222541288 ^ (long)-1222541288));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro Field15815 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro("BreakPlace", (int)1685423028L ^ 0x647583B5);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro[] Field15816;
    private int Field15817;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro[])Field15816.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWroArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro[((int)1728637523L ^ 0x6708EA52) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWroArray[(int)((long)1168814636 ^ (long)1168814636)] = Field15814;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWroArray[(int)((long)830869828 ^ (long)830869829)] = Field15815;
        Field15816 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWroArray;
    }

    private static String Method6470(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)403465752 ^ (long)403465752);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-347187860 ^ (long)-347187821);
            int n2 = (int)((long)1557782393 ^ (long)1557782496);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1034786894 ^ (long)1034788531) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

