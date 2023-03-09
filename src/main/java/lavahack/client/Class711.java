//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.Class1471;
import lavahack.client.Class1763;
import lavahack.client.Class1903;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public enum Class711 {
    Field11026(Class1903.Method7049().Method7663((Class1471)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(Class424), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)())),
    Field11027(Class1903.Method7049().Method7663(class424 -> {
        if (((Boolean)class424.Method2054(1)).booleanValue()) {
            return null;
        }
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class1903.Method7050().player.inventory.currentItem = (Integer)class424.Method2054(0);
        return null;
    })),
    Field11028(Class1903.Method7049().Method7663(class424 -> {
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class1903.Method7050().player.inventory.currentItem = (Integer)class424.Method2054(0);
        return null;
    })),
    Field11029(Class1903.Method7049().Method7663(class424 -> {
        Class1903.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        return null;
    }));

    private final Class1763 Field11030;
    private String Field11032 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class711() {
        void var3_1;
        this.Field11030 = var3_1;
    }

    public Class1763 Method2972() {
        return this.Field11030;
    }

    private static String Method2976(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 163;
            cArray2[n] = (char)(cArray[n] ^ (0x5B25 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

