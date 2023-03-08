//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.atomic.*;
import java.util.function.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;

public class Class115
{
    public static Class115 Field8400;
    public Class1701 Field8401;
    public Class503 Field8402;
    public Class979 Field8403;
    public AtomicLong Field8404;
    @Class1801
    private final Class618 Field8405;
    private String Field8406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class115() {
        this.Field8404 = new AtomicLong();
        this.Field8405 = new Class618(this::Method840, new Predicate[0]);
        Class115.Field8400 = this;
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
    public void Method836(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        this.Field8402.Method2315();
        this.Field8401.Method6525();
    }
    
    public boolean Method837(final int n) {
        return System.currentTimeMillis() - this.Field8404.get() >= n;
    }
    
    public void Method838() {
        this.Field8404.set(System.currentTimeMillis());
    }
    
    public long Method839() {
        return this.Field8404.get();
    }
    
    private void Method840(final Class544 class544) {
        if (class544.Method982() instanceof SPacketPlayerPosLook) {
            this.Field8404.set(System.currentTimeMillis());
        }
    }
}
