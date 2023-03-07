/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import lavahack.client.BsRVr263akNSUZGB7y6lErT06N1IwkDB;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.gdKZuZQ3zBNwCAUkBQYaVetDDusT2Abq;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO {
    public static I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO Field8400;
    public gdKZuZQ3zBNwCAUkBQYaVetDDusT2Abq Field8401;
    public BsRVr263akNSUZGB7y6lErT06N1IwkDB Field8402;
    public PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk Field8403;
    public AtomicLong Field8404 = new AtomicLong();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8405 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method840, new Predicate[(int)-380998674L ^ 0xE94A6BEE]);
    private String Field8406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO() {
        Field8400 = this;
    }

    public void Method835() {
        this.Field8401 = new gdKZuZQ3zBNwCAUkBQYaVetDDusT2Abq();
        this.Field8402 = new BsRVr263akNSUZGB7y6lErT06N1IwkDB();
        this.Field8403 = new PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk();
        MinecraftForge.EVENT_BUS.register((Object)this);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8405);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method836(TickEvent.ClientTickEvent clientTickEvent) {
        this.Field8402.Method2315();
        this.Field8401.Method6525();
    }

    public boolean Method837(int n) {
        int n2;
        if (System.currentTimeMillis() - this.Field8404.get() >= (long)n) {
            n2 = (int)((long)-1932251363 ^ (long)-1932251364);
            return n2 != 0;
        }
        n2 = (int)((long)-812108987 ^ (long)-812108987);
        return n2 != 0;
    }

    public void Method838() {
        this.Field8404.set(System.currentTimeMillis());
    }

    public long Method839() {
        return this.Field8404.get();
    }

    private void Method840(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Field8404.set(System.currentTimeMillis());
    }
}

