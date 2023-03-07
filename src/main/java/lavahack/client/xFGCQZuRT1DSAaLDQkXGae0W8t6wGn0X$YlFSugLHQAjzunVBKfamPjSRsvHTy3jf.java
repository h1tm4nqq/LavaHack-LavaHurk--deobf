/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest$Progression;", "", "(Ljava/lang/String;I)V", "Arithmetic", "Geometric", "kisman.cc"})
final class xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14062;
    public static final /* enum */ xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14063;
    private static final xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field14064;
    private String Field14065 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-1614015912 ^ (long)-1614015911) << 1];
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1890486146 ^ (long)-1890486146)] = Field14062 = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Arithmetic", (int)739518722L ^ 0x2C142902);
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)408804638 ^ (long)408804639)] = Field14063 = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Geometric", (int)((long)909614325 ^ (long)909614324));
        Field14064 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    public static xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14064.clone();
    }

    public static xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    private static String Method5361(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1303180925 ^ (long)-1303180925);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)324545147 ^ (long)324545156);
            int n2 = ((int)-192037701L ^ 0xF48DBCA8) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-630050243L ^ 0xDA72323A) << 11 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

