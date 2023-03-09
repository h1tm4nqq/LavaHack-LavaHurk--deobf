/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package lavahack.client;

import java.util.Map;
import lavahack.client.Class468;
import lavahack.client.Class686;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;

public class Class39
extends Event {
    private final Map Field8042;
    public final Class686 Field8043;
    public final NBTTagCompound Field8044;
    private int Field8045;

    @Deprecated
    @Deprecated
    public Class39(Map map) {
        this(null, map);
    }

    public Class39(Class686 class686, Map map) {
        this.Field8043 = class686;
        this.Field8042 = map;
        this.Field8044 = new NBTTagCompound();
    }

    public boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string, String string2) throws Class468 {
        if (this.Field8042.containsKey(string2)) {
            throw new Class468(String.format("Could not replace block type %s, the block type %s already exists in the schematic.", string, string2));
        }
        Short s = (Short)this.Field8042.get(string);
        if (s == null) return false;
        this.Field8042.remove(string);
        this.Field8042.put(string2, s);
        return true;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 6;
            cArray2[n] = (char)(cArray[n] ^ (0x5E88 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

