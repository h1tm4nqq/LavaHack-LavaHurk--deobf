//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.client.event.*;
import java.util.stream.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;

public class Class575 extends Class42
{
    private final Class44 Field10447;
    private final Class1612 Field10448;
    private final Class44 Field10449;
    private List Field10450;
    private final Class618 Field10451;
    private String Field10452 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class575() {
        super("NewChunks", Class97.Field8344);
        this.Field10447 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(4620693217682128896L), Double.longBitsToDouble((long)1181271342 ^ 0x401000004668C52EL), Double.longBitsToDouble((long)1205733977 ^ 0x4060000047DE0A59L), true));
        this.Field10448 = new Class1612((Class42)this).Method3788().Method3789();
        this.Field10449 = this.Method23(new Class44("EdgeOf", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)2044779299 ^ 0x401C000079E0DB23L), false));
        this.Field10450 = new Vector();
        this.Field10451 = new Class618(this::Method2526, new Predicate[0]);
    }
    
    public void Method38() {
        if (Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class1796.Field16242.Method706(this.Field10451);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10451);
        this.Field10450.clear();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2524(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final double method367 = this.Field10449.Method367();
        final double n = Double.longBitsToDouble((long)1440731287 ^ 0x4030000055DFD097L) - this.Field10449.Method367();
        this.Field10450 = (List)this.Field10450.stream().filter(this::Method2525).collect(Collectors.toList());
        for (final Class574 class574 : this.Field10450) {
            this.Field10448.Method3804(new AxisAlignedBB((int)class574.Method2522() + method367, 0.0, (int)class574.Method2523() + method367, (int)class574.Method2522() + n, 0.0, (int)class574.Method2523() + n));
        }
    }
    
    private boolean Method2525(final Class574 class574) {
        return Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)((int)class574.Method2522() + 8), Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)((int)class574.Method2523() + 8)) <= this.Field10447.Method335();
    }
    
    private void Method2526(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketChunkData)) {
            return;
        }
        final SPacketChunkData sPacketChunkData = (SPacketChunkData)class544.Method982();
        if (sPacketChunkData.isFullChunk()) {
            return;
        }
        final Class574 class545 = new Class574((Object)(sPacketChunkData.getChunkX() * 16), (Object)(sPacketChunkData.getChunkZ() * 16));
        if (!this.Field10450.contains(class545)) {
            this.Field10450.add(class545);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x30A8 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
