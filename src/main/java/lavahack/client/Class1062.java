//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import lavahack.client.Class132;
import lavahack.client.Class1763;
import lavahack.client.Class1775;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public enum Class1062 {
    Field12685(Class1775.Method6740().Method7663(class424 -> {
        if (((Boolean)class424.Method2054(1)).booleanValue()) {
            return null;
        }
        Class132.Method909().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class132.Method910().player.inventory.currentItem = (Integer)class424.Method2054(0);
        return null;
    })),
    Field12686(Class1775.Method6740().Method7663(class424 -> {
        Class132.Method908().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        return null;
    })),
    Field12687(Class1775.Method6740().Method7663(class424 -> {
        Class132.Method906().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)class424.Method2054(0)).intValue()));
        Class132.Method907().player.inventory.currentItem = (Integer)class424.Method2054(0);
        return null;
    }));

    private final Class1763 Field12688;
    private int Field12690;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1062() {
        void var3_1;
        this.Field12688 = var3_1;
    }

    public Class1763 Method4316() {
        return this.Field12688;
    }

    private static String Method4320(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 3;
            cArray2[n] = (char)(cArray[n] ^ (0x3AF2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

