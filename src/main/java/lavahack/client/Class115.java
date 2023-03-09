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
import lavahack.client.Class1701;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class503;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class979;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class115 {
    public static Class115 Field8400;
    public Class1701 Field8401;
    public Class503 Field8402;
    public Class979 Field8403;
    public AtomicLong Field8404 = new AtomicLong();
    @Class1801
    private final Class618 Field8405 = new Class618(this::Method840, new Predicate[0]);
    private String Field8406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class115() {
        Field8400 = this;
    }

    public void Method835() {
        this.Field8401 = new Class1701();
        this.Field8402 = new Class503();
        this.Field8403 = new Class979();
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field8405);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method836(TickEvent.ClientTickEvent clientTickEvent) {
        this.Field8402.Method2315();
        this.Field8401.Method6525();
    }

    public boolean Method837(int n) {
        if (System.currentTimeMillis() - this.Field8404.get() < (long)n) return false;
        return true;
    }

    public void Method838() {
        this.Field8404.set(System.currentTimeMillis());
    }

    public long Method839() {
        return this.Field8404.get();
    }

    private void Method840(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Field8404.set(System.currentTimeMillis());
    }
}

