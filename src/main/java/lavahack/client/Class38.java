//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.client.*;

public class Class38 extends Class42
{
    @Class1801
    private final Class618 Field8040;
    private String Field8041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class38() {
        super("XCarry", "XCarry", Class97.Field8343);
        this.Field8040 = new Class618(Class38::Method282, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8040);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8040);
    }
    
    private static void Method282(final Class805 class805) {
        if (class805.Method982() instanceof CPacketCloseWindow && ((CPacketCloseWindow)class805.Method982()).windowId == Class38.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId) {
            class805.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D69 ^ 0xF2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
