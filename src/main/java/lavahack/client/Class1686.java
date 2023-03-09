//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
 *  net.minecraft.util.text.ChatType
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.ChatType;

public class Class1686
extends Class42 {
    private Class44 Field15833 = new Class44("Name", this, "Kisman", "Kisman", true);
    public static Class1686 Field15834;
    @Class1801
    private final Class618 Field15835 = new Class618(this::Method6491, new Predicate[0]);
    private String Field15836 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1686() {
        super("NameProtect", "NameProtect", Class97.Field8343);
        Field15834 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15833);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field15835);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field15835);
    }

    private boolean Method6490(String string) {
        if (Class1686.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return false;
        }
        String string2 = string;
        string2 = string2.replace(Class1686.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName(), this.Field15833.Method359());
        Class1393.Method5508(string2);
        return true;
    }

    private void Method6491(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketChat)) return;
        SPacketChat sPacketChat = (SPacketChat)class544.Method982();
        if (sPacketChat.getType() == ChatType.GAME_INFO) return;
        if (!this.Method6490(sPacketChat.getChatComponent().getFormattedText())) return;
        class544.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 70;
            cArray2[n] = (char)(cArray[n] ^ (0x607C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

