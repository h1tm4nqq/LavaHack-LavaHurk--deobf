/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 */
package lavahack.client;

import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import net.minecraft.nbt.NBTTagCompound;

public class Gncf9AHWffi9Dj352VvjL6AaR4qyzq9J
extends MWKsjf2F7eDKYSgsSUOF8imukA0mof8z {
    private String Field17586 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method990(NBTTagCompound nBTTagCompound) {
        return null;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        return (int)((long)1352829537 ^ (long)1352829537) != 0;
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
        int n = (int)-217689840L ^ 0xF3065110;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1713706789L ^ 0x99DAE824);
            int n2 = ((int)-1075222729L ^ 0xBFE96776) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1031795949 ^ (long)1031795944) << 12 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

