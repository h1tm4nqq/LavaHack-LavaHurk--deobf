//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketChat;

public class Class858
extends Class42 {
    @Class1801
    private final Class618 Field11627 = new Class618(Class858::Method3607, new Predicate[0]);
    private String Field11628 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class858() {
        super("AntiLogger", "Log4j protect", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field11627);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method706(this.Field11627);
    }

    private static void Method3607(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketChat)) return;
        String string = ((SPacketChat)class544.Method982()).getChatComponent().getUnformattedText();
        if (!string.contains("jndi")) return;
        class544.Method158();
        Class1393.Method5504().Method1886("Removed Log4j exploit message");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 205;
            cArray2[n] = (char)(cArray[n] ^ (0x70A0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

