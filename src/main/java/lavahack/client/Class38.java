//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketCloseWindow
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.network.play.client.CPacketCloseWindow;

public class Class38
extends Class42 {
    @Class1801
    private final Class618 Field8040 = new Class618(Class38::Method282, new Predicate[0]);
    private String Field8041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class38() {
        super("XCarry", "XCarry", Class97.Field8343);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8040);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8040);
    }

    private static void Method282(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketCloseWindow)) return;
        CPacketCloseWindow cPacketCloseWindow = (CPacketCloseWindow)class805.Method982();
        if (cPacketCloseWindow.windowId != Class38.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId) return;
        class805.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 242;
            cArray2[n] = (char)(cArray[n] ^ (0x1D69 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

