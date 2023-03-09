/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class100;
import lavahack.client.Class101;
import lavahack.client.Class98;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import net.minecraft.util.math.AxisAlignedBB;

public abstract class Class450
extends Enum {
    public static final /* enum */ Class450 Field9873 = new Class98();
    public static final /* enum */ Class450 Field9874 = new Class100();
    public static final /* enum */ Class450 Field9875 = new Class101();
    private static final Class450[] Field9876 = new Class450[]{Field9873, Field9874, Field9875};
    private int Field9877;

    public static Class450[] values() {
        return (exalTBqSufwHR1VdwyK23X5QNwSlzh5j.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9876.clone();
    }

    public static Class450 valueOf(String string) {
        return Enum.valueOf(Class450.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class450() {
        void var2_-1;
        void var1_-1;
    }

    abstract void Method809(AxisAlignedBB var1, Color var2, Color var3, boolean var4, Object ... var5);

    public void Method810(AxisAlignedBB axisAlignedBB, Color color, Object ... objectArray) {
        this.Method809(axisAlignedBB, color, color, false, objectArray);
    }

    public void Method811(AxisAlignedBB axisAlignedBB, Color color, Color color2, Object ... objectArray) {
        this.Method809(axisAlignedBB, color, color2, true, objectArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    Class450() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    private static String Method812(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x2D84 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

