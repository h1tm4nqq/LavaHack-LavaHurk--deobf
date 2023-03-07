/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13712 = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Normal", (int)((long)-1084060329 ^ (long)-1084060329));
    public static final /* enum */ tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13713 = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("SwitchBack", (int)-72294719L ^ 0xFBB0DEC0);
    private static final tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field13714;
    private String Field13715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field13714.clone();
    }

    public static tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)1763654923L ^ 0x691F3D0A) << 1];
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)127897578 ^ (long)127897578)] = Field13712;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1720023257 ^ (long)1720023256)] = Field13713;
        Field13714 = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method5096(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2066137802L ^ 0x7B26C2CA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)197029095L ^ 0xBBE6C18);
            int n2 = ((int)-1509939097L ^ 0xA600285C) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1474432253L ^ 0x57E24316 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

