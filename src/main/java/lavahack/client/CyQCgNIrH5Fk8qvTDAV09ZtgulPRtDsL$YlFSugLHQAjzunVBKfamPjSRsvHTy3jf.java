/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14681 = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Normal", (int)((long)2011755452 ^ (long)2011755452));
    public static final /* enum */ CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14682 = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Silent", (int)((long)884954032 ^ (long)884954033));
    private static final CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field14683;
    private int Field14684;

    public static CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14683.clone();
    }

    public static CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)1719067242L ^ 0x6676E26B) << 1];
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)2111652852L ^ 0x7DDD43F4] = Field14681;
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)227116748L ^ 0xD8986CD] = Field14682;
        Field14683 = cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method5717(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)529513440L ^ 0x1F8FBBE0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)196174330L ^ 0xBB16105);
            int n2 = ((int)1604285793L ^ 0x5F9F7564) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)841116853L ^ 0x322245FE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

