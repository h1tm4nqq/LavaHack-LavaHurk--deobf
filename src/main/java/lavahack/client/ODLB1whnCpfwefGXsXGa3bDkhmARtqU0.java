/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package lavahack.client;

import java.util.Map;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.xHWd8D7xG18N1hbeN9rG86kvTEGkugI4;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;

public class ODLB1whnCpfwefGXsXGa3bDkhmARtqU0
extends Event {
    private final Map Field8042;
    public final meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Field8043;
    public final NBTTagCompound Field8044;
    private int Field8045;

    @Deprecated
    @Deprecated
    public ODLB1whnCpfwefGXsXGa3bDkhmARtqU0(Map map) {
        this(null, map);
    }

    public ODLB1whnCpfwefGXsXGa3bDkhmARtqU0(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, Map map) {
        this.Field8043 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2;
        this.Field8042 = map;
        this.Field8044 = new NBTTagCompound();
    }

    public boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string, String string2) throws xHWd8D7xG18N1hbeN9rG86kvTEGkugI4 {
        if (this.Field8042.containsKey(string2)) {
            Object[] objectArray = new Object[(int)((long)904167318 ^ (long)904167319) << 1];
            objectArray[(int)949108025L ^ 0x38923D39] = string;
            objectArray[(int)((long)861010882 ^ (long)861010883)] = string2;
            throw new xHWd8D7xG18N1hbeN9rG86kvTEGkugI4(String.format("Could not replace block type %s, the block type %s already exists in the schematic.", objectArray));
        }
        Short s = (Short)this.Field8042.get(string);
        if (s == null) return ((int)1051051301L ^ 0x3EA5C525) != 0;
        this.Field8042.remove(string);
        this.Field8042.put(string2, s);
        return (int)((long)556738065 ^ (long)556738064) != 0;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-109484987L ^ 0xF9796445;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1695438581 ^ (long)1695438346);
            int n2 = (int)((long)1652644582 ^ (long)1652644581) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1667539283 ^ (long)-1667541636) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

