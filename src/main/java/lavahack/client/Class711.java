//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public enum Class711
{
    Field11026("None", 0, Class1903.Method7049().Method7663(Class711::lambda$static$0)), 
    Field11027("Normal", 1, Class1903.Method7049().Method7663(class424 -> {
        if (class424.Method2054(1)) {
            return null;
        }
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class1903.Method7050().player.inventory.currentItem = (int)class424.Method2054(0);
        return null;
    })), 
    Field11028("Silent", 2, Class1903.Method7049().Method7663(class424 -> {
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class1903.Method7050().player.inventory.currentItem = (int)class424.Method2054(0);
        return null;
    })), 
    Field11029("Packet", 3, Class1903.Method7049().Method7663(class424 -> {
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        return null;
    }));
    
    private final Class1763 Field11030;
    private static final Class711[] Field11031;
    private String Field11032 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class711(final String name, final int ordinal, final Class1763 field11030) {
        this.Field11030 = field11030;
    }
    
    public Class1763 Method2972() {
        return this.Field11030;
    }
    
    static {
        Field11031 = new Class711[] { Class711.Field11026, Class711.Field11027, Class711.Field11028, Class711.Field11029 };
    }
    
    private static String Method2976(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B25 ^ 0xA3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
