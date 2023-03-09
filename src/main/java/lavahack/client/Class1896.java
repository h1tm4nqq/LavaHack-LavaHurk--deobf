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
import lavahack.client.Class1008;
import lavahack.client.Class1317;
import lavahack.client.Class1471;
import lavahack.client.Class1661;
import lavahack.client.Class1763;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

enum Class1896 {
    Field16720(Class1317.Method5351().Method7663((Class1471)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(Class424), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)())),
    Field16721(Class1317.Method5351().Method7663(class424 -> {
        if (((Boolean)class424.Method2054(1)).booleanValue()) {
            return null;
        }
        Class1008.Method4118().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class1008.Method4119().player.inventory.currentItem = (Integer)class424.Method2054(0);
        return null;
    })),
    Field16722(Class1317.Method5351().Method7663(class424 -> {
        Class1008.Method4116().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        if ((Boolean)class424.Method2054(1) == false) return null;
        Class1008.Method4117().playerController.updateController();
        return null;
    })),
    Field16723(Class1317.Method5351().Method7663(class424 -> {
        Class1008.Method4113().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class1008.Method4114().player.inventory.currentItem = (Integer)class424.Method2054(0);
        if ((Boolean)class424.Method2054(1) == false) return null;
        Class1008.Method4115().playerController.updateController();
        return null;
    }));

    private final Class1763 Field16724;
    private int Field16726;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1896() {
        void var3_1;
        this.Field16724 = var3_1;
    }

    public void Method7027(int n, boolean bl, Class1661 class1661) {
        if (Class1008.Method4111(Class1008.Field12376).Method341() != class1661) {
            return;
        }
        if (Class1008.Method4112().player.inventory.currentItem == n) {
            return;
        }
        this.Field16724.Method1726(n, bl);
    }

    private static String Method7031(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 10;
            cArray2[n] = (char)(cArray[n] ^ (0x619E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

