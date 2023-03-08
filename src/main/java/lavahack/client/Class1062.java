//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public enum Class1062
{
    Field12685("Vanilla", 0, Class1775.Method6740().Method7663(class424 -> {
        if (class424.Method2054(1)) {
            return null;
        }
        Class132.Method909().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class132.Method910().player.inventory.currentItem = (int)class424.Method2054(0);
        return null;
    })), 
    Field12686("Silent", 1, Class1775.Method6740().Method7663(class424 -> {
        Class132.Method908().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        return null;
    })), 
    Field12687("Packet", 2, Class1775.Method6740().Method7663(class424 -> {
        Class132.Method906().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class132.Method907().player.inventory.currentItem = (int)class424.Method2054(0);
        return null;
    }));
    
    private final Class1763 Field12688;
    private static final Class1062[] Field12689;
    private int Field12690;
    
    private Class1062(final String name, final int ordinal, final Class1763 field12688) {
        this.Field12688 = field12688;
    }
    
    public Class1763 Method4316() {
        return this.Field12688;
    }
    
    static {
        Field12689 = new Class1062[] { Class1062.Field12685, Class1062.Field12686, Class1062.Field12687 };
    }
    
    private static String Method4320(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3AF2 ^ 0x3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
