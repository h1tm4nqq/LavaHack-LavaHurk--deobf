//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;

public class Class858 extends Class42
{
    @Class1801
    private final Class618 Field11627;
    private String Field11628 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class858() {
        super("AntiLogger", "Log4j protect", Class97.Field8344);
        this.Field11627 = new Class618(Class858::Method3607, new Predicate[0]);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field11627);
    }
    
    public void Method39() {
        Class1796.Field16242.Method706(this.Field11627);
    }
    
    private static void Method3607(final Class544 class544) {
        if (class544.Method982() instanceof SPacketChat && ((SPacketChat)class544.Method982()).getChatComponent().getUnformattedText().contains("jndi")) {
            class544.Method158();
            Class1393.Method5504().Method1886("Removed Log4j exploit message");
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x70A0 ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
