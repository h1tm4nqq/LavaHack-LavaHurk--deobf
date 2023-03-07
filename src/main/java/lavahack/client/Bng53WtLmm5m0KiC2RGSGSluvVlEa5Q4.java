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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.G4ig1RJMVjZjD0pdA3DeU9nMcDsyiD84;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUnloadChunk;

public class Bng53WtLmm5m0KiC2RGSGSluvVlEa5Q4
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13150 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PacketsPerTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)712003171 ^ 0x401400002A704E63L), 1.0, Double.longBitsToDouble(0x7D6B172050F5C419L ^ 0x3D22172050F5C419L), (boolean)((long)-1496248359 ^ (long)-1496248360)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13151 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Unlimited", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2052362622 ^ (long)-2052362622)));
    public List Field13152 = new Vector();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13153 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4630, new Predicate[(int)742208175L ^ 0x2C3D32AF]);
    private int Field13154;

    public Bng53WtLmm5m0KiC2RGSGSluvVlEa5Q4() {
        super("NoChunkUnload", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340, (boolean)((long)396356757 ^ (long)396356756));
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
            G4ig1RJMVjZjD0pdA3DeU9nMcDsyiD84.Method3872((Packet)sPacketUnloadChunk);
        }
    }

    private void Method4630(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketUnloadChunk)) {
            return;
        }
        SPacketUnloadChunk sPacketUnloadChunk = (SPacketUnloadChunk)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        this.Field13152.add(sPacketUnloadChunk);
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1757409212 ^ (long)-1757409212);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-78510247L ^ 0xFB5207A6);
            int n2 = ((int)1759828234L ^ 0x68E4D90B) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-535728529L ^ 0xE011491A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

