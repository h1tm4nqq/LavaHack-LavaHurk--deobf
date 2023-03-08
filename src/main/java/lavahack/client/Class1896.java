//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

enum Class1896
{
    Field16720("None", 0, Class1317.Method5351().Method7663(Class1896::lambda$static$0)), 
    Field16721("Vanilla", 1, Class1317.Method5351().Method7663(class424 -> {
        if (class424.Method2054(1)) {
            return null;
        }
        Class1008.Method4118().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class1008.Method4119().player.inventory.currentItem = (int)class424.Method2054(0);
        return null;
    })), 
    Field16722("Packet", 2, Class1317.Method5351().Method7663(class424 -> {
        Class1008.Method4116().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        if (class424.Method2054(1)) {
            Class1008.Method4117().playerController.updateController();
        }
        return null;
    })), 
    Field16723("Silent", 3, Class1317.Method5351().Method7663(class424 -> {
        Class1008.Method4113().player.connection.sendPacket((Packet)new CPacketHeldItemChange((int)class424.Method2054(0)));
        Class1008.Method4114().player.inventory.currentItem = (int)class424.Method2054(0);
        if (class424.Method2054(1)) {
            Class1008.Method4115().playerController.updateController();
        }
        return null;
    }));
    
    private final Class1763 Field16724;
    private static final Class1896[] Field16725;
    private int Field16726;
    
    private Class1896(final String name, final int ordinal, final Class1763 field16724) {
        this.Field16724 = field16724;
    }
    
    public void Method7027(final int i, final boolean b, final Class1661 class1661) {
        if (Class1008.Method4111(Class1008.Field12376).Method341() != class1661) {
            return;
        }
        if (Class1008.Method4112().player.inventory.currentItem == i) {
            return;
        }
        this.Field16724.Method1726(new Object[] { i, b });
    }
    
    static {
        Field16725 = new Class1896[] { Class1896.Field16720, Class1896.Field16721, Class1896.Field16722, Class1896.Field16723 };
    }
    
    private static String Method7031(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x619E ^ 0xA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
