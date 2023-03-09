/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lavahack.client.Class450;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;

public enum Class2008 {
    Field17211(false, new Class450[]{Class450.Field9874}),
    Field17212(false, new Class450[]{Class450.Field9873}),
    Field17213(false, new Class450[]{Class450.Field9875}),
    Field17214(false, new Class450[]{Class450.Field9873, Class450.Field9874}),
    Field17215(false, new Class450[]{Class450.Field9873, Class450.Field9875}),
    Field17216(false, new Class450[]{Class450.Field9874, Class450.Field9875}),
    Field17217(false, new Class450[]{Class450.Field9873, Class450.Field9874, Class450.Field9875}),
    Field17218(true, new Class450[]{Class450.Field9875}),
    Field17219(true, new Class450[]{Class450.Field9873}),
    Field17220(true, new Class450[]{Class450.Field9874}),
    Field17221(true, new Class450[]{Class450.Field9873, Class450.Field9874}),
    Field17222(true, new Class450[]{Class450.Field9873, Class450.Field9875}),
    Field17223(true, new Class450[]{Class450.Field9874, Class450.Field9875}),
    Field17224(true, new Class450[]{Class450.Field9873, Class450.Field9874, Class450.Field9875, Class450.Field9873});

    public final ArrayList Field17225;
    public final boolean Field17226;
    private String Field17228 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - void declaration
     */
    private Class2008() {
        void var4_2;
        void var3_1;
        this.Field17226 = var3_1;
        this.Field17225 = new ArrayList(Arrays.asList(var4_2));
    }

    public void Method7456(AxisAlignedBB axisAlignedBB, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, boolean bl, Object ... objectArray) {
        Iterator iterator = this.Field17225.iterator();
        while (iterator.hasNext()) {
            Class450 class450 = (Class450)((Object)iterator.next());
            if (class450 == Class450.Field9875) {
                class450.Method809(axisAlignedBB, color5, color6, this.Field17226, objectArray);
                continue;
            }
            Class815.Method3432(bl);
            if (this.Field17226) {
                Class815.Method3440();
            }
            if (class450 == Class450.Field9873) {
                class450.Method809(axisAlignedBB, color, color2, this.Field17226, objectArray);
            } else if (class450 == Class450.Field9874) {
                class450.Method809(axisAlignedBB, color3, color4, this.Field17226, objectArray);
            }
            if (this.Field17226) {
                Class815.Method3441();
            }
            Class815.Method3435(bl);
        }
    }

    private static String Method7457(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 239;
            cArray2[n] = (char)(cArray[n] ^ (0xCF5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

