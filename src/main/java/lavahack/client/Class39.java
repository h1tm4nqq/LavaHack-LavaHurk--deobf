//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraft.nbt.*;

public class Class39 extends Event
{
    private final Map Field8042;
    public final Class686 Field8043;
    public final NBTTagCompound Field8044;
    private int Field8045;
    
    @Deprecated
    @Deprecated
    public Class39(final Map map) {
        this(null, map);
    }
    
    public Class39(final Class686 field8043, final Map field8044) {
        this.Field8043 = field8043;
        this.Field8042 = field8044;
        this.Field8044 = new NBTTagCompound();
    }
    
    public boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final String s, final String s2) throws Class468 {
        if (this.Field8042.containsKey(s2)) {
            throw new Class468(String.format("Could not replace block type %s, the block type %s already exists in the schematic.", s, s2));
        }
        final Short n = this.Field8042.get(s);
        if (n != null) {
            this.Field8042.remove(s);
            this.Field8042.put(s2, n);
            return true;
        }
        return false;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5E88 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
