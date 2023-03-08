//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;

public enum Class616
{
    Field10627("Off", 0, Class775.Method3228().Method7663(Class616::lambda$static$0)), 
    Field10628("Packet", 1, Class775.Method3228().Method7663(class424 -> {
        Class1540.Method6095().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6094().player, CPacketEntityAction$Action.START_SNEAKING));
        Class1540.Method6097().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6096().player, CPacketEntityAction$Action.STOP_SNEAKING));
        return null;
    })), 
    Field10629("Vanilla", 2, Class775.Method3228().Method7663(class424 -> {
        Class1540.Method6089().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6088().player, CPacketEntityAction$Action.START_SNEAKING));
        Class1540.Method6090().player.setSneaking(true);
        Class1540.Method6092().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6091().player, CPacketEntityAction$Action.STOP_SNEAKING));
        Class1540.Method6093().player.setSneaking(false);
        return null;
    }));
    
    private final Class1763 Field10630;
    private static final Class616[] Field10631;
    private String Field10632 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class616(final String name, final int ordinal, final Class1763 field10630) {
        this.Field10630 = field10630;
    }
    
    public Class1763 Method2647() {
        return this.Field10630;
    }
    
    static {
        Field10631 = new Class616[] { Class616.Field10627, Class616.Field10628, Class616.Field10629 };
    }
    
    private static String Method2650(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x389E ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
