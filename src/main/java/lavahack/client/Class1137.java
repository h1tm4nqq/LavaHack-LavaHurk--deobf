/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketUnloadChunk
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class937;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUnloadChunk;

public class Class1137
extends Class42 {
    private final Class44 Field13150 = this.Method23(new Class44("PacketsPerTicks", (Class42)this, Double.longBitsToDouble((long)712003171 ^ 0x401400002A704E63L), 1.0, Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field13151 = this.Method23(new Class44("Unlimited", (Class42)this, false));
    public List Field13152 = new Vector();
    @Class1801
    private final Class618 Field13153 = new Class618(this::Method4630, new Predicate[0]);
    private int Field13154;

    public Class1137() {
        super("NoChunkUnload", Class97.Field8340, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field13152.clear();
    }

    @Override
    public void Method39() {
        super.Method39();
        Iterator iterator = this.Field13152.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field13152.clear();
                return;
            }
            SPacketUnloadChunk sPacketUnloadChunk = (SPacketUnloadChunk)iterator.next();
            Class937.Method3872((Packet)sPacketUnloadChunk);
        }
    }

    private void Method4630(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketUnloadChunk)) {
            return;
        }
        SPacketUnloadChunk sPacketUnloadChunk = (SPacketUnloadChunk)class544.Method982();
        this.Field13152.add(sPacketUnloadChunk);
        class544.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 8;
            cArray2[n] = (char)(cArray[n] ^ (0x2775 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

