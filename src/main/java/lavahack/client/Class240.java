//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import com.kisman.cc.util.*;

public class Class240 extends Class42
{
    private final Class1365 Field9043;
    private final Class44 Field9044;
    private final Class44 Field9045;
    private boolean Field9046;
    private long Field9047;
    private BlockPos Field9048;
    private String Field9049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class240() {
        super("BlockOverlay", Class97.Field8345);
        this.Field9043 = new Class1365((Class42)this).Method5457();
        this.Field9044 = this.Method23(new Class44("Mode", this, (Enum)Class1377.Field14244));
        this.Field9045 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble((long)943890624 ^ 0x403400003842A0C0L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field9046 = false;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1319(final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        this.Field9048 = playerInteractEvent$LeftClickBlock.getPos();
        this.Field9047 = System.currentTimeMillis();
        this.Field9046 = true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1320(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos() == null) {
            return;
        }
        if (!this.Field9046) {
            return;
        }
        final double n = (System.currentTimeMillis() - this.Field9047) / (this.Field9045.Method335() * Double.longBitsToDouble((long)670636548 ^ 0x4049000027F91A04L));
        if (n > 1.0) {
            this.Field9046 = false;
            return;
        }
        Class815.Method3446(Class815.Method3447(Class815.Method3449(this.Field9048, this.Method1321(n))), Float.intBitsToFloat(1077936128), new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }
    
    private double Method1321(final double n) {
        switch (Class2073.Field17485[((Class1377)this.Field9044.Method341()).ordinal()]) {
            case 1: {
                return Class447.Method2140(n);
            }
            case 2: {
                return Class447.Method2141(n);
            }
            case 3: {
                return Math.sin(n * Double.longBitsToDouble((long)157313322 ^ 0x3FF921FB5D244432L));
            }
            case 4: {
                return Class447.Method2140(n * Double.longBitsToDouble(4611686018427387904L));
            }
            case 5: {
                return Math.sin(Double.longBitsToDouble(4611686018427387904L) * n * Double.longBitsToDouble(4609753056924675352L));
            }
            case 6: {
                return Class447.Method2140(n + 1.0);
            }
            default: {
                return n;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x72D ^ 0xBB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
