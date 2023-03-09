//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.Class1471;
import lavahack.client.Class1540;
import lavahack.client.Class1763;
import lavahack.client.Class775;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public enum Class616 {
    Field10627(Class775.Method3228().Method7663((Class1471)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(Class424), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)())),
    Field10628(Class775.Method3228().Method7663(class424 -> {
        Class1540.Method6095().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6094().player, CPacketEntityAction.Action.START_SNEAKING));
        Class1540.Method6097().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6096().player, CPacketEntityAction.Action.STOP_SNEAKING));
        return null;
    })),
    Field10629(Class775.Method3228().Method7663(class424 -> {
        Class1540.Method6089().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6088().player, CPacketEntityAction.Action.START_SNEAKING));
        Class1540.Method6090().player.setSneaking(true);
        Class1540.Method6092().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1540.Method6091().player, CPacketEntityAction.Action.STOP_SNEAKING));
        Class1540.Method6093().player.setSneaking(false);
        return null;
    }));

    private final Class1763 Field10630;
    private String Field10632 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class616() {
        void var3_1;
        this.Field10630 = var3_1;
    }

    public Class1763 Method2647() {
        return this.Field10630;
    }

    private static String Method2650(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x389E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

