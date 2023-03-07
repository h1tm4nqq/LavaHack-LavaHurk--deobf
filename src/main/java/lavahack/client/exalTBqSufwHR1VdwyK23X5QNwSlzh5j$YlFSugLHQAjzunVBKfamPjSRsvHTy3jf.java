/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$1;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$2;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$3;
import net.minecraft.util.math.AxisAlignedBB;

public abstract class exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9873 = new exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$1();
    public static final /* enum */ exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9874 = new exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$2();
    public static final /* enum */ exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9875 = new exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$3();
    private static final exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9876;
    private int Field9877;

    public static exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9876.clone();
    }

    public static exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    abstract void Method809(AxisAlignedBB var1, Color var2, Color var3, boolean var4, Object ... var5);

    public void Method810(AxisAlignedBB axisAlignedBB, Color color, Object ... objectArray) {
        this.Method809(axisAlignedBB, color, color, (boolean)((long)-2027706173 ^ (long)-2027706173), objectArray);
    }

    public void Method811(AxisAlignedBB axisAlignedBB, Color color, Color color2, Object ... objectArray) {
        this.Method809(axisAlignedBB, color, color2, ((int)1071166436L ^ 0x3FD8B3E5) != 0, objectArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)41560184 ^ (long)41560187)];
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)709511186 ^ (long)709511186)] = Field9873;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)152134474 ^ (long)152134475)] = Field9874;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-1533083647L ^ 0xA49F0000) << 1] = Field9875;
        Field9876 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method812(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)656165943 ^ (long)656165943);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1664351961 ^ (long)-1664351784);
            int n2 = (int)((long)1585351298 ^ (long)1585351313) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)444000267L ^ 0x1A76E36A) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

