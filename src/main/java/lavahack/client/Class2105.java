/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 */
package lavahack.client;

import lavahack.client.Class153;
import lavahack.client.Class686;
import net.minecraft.nbt.NBTTagCompound;

public class Class2105
extends Class153 {
    private String Field17586 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Class686 Method990(NBTTagCompound nBTTagCompound) {
        return null;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, Class686 class686) {
        return false;
    }

    @Override
    public String Method992() {
        return "schematica.format.classic";
    }

    @Override
    public String Method993() {
        return ".schematic";
    }

    private static String Method1001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 130;
            cArray2[n] = (char)(cArray[n] ^ (0x5000 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

