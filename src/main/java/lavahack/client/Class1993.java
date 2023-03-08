//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.text.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;

public class Class1993
{
    private Minecraft Field17162;
    private float[] Field17163;
    private DecimalFormat Field17164;
    private Class650 Field17165;
    private float Field17166;
    private long Field17167;
    private String Field17168;
    @Class1801
    private final Class618 Field17169;
    private String Field17170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1993() {
        this.Field17162 = Minecraft.getMinecraft();
        this.Field17169 = new Class618(this::Method7402, new Predicate[0]);
        this.Field17163 = new float[10];
        this.Field17164 = new DecimalFormat("##.00##");
        this.Field17165 = new Class650();
        this.Field17166 = Float.intBitsToFloat(1101004800);
        this.Field17167 = -1L;
        this.Field17168 = "";
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field17169);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7395(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.Field17167 == -1L) {
            this.Field17167 = currentTimeMillis;
            return;
        }
        float intBitsToFloat = (float)((currentTimeMillis - this.Field17167) / 20L);
        if (intBitsToFloat == 0.0f) {
            intBitsToFloat = Float.intBitsToFloat(1112014848);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(1148846080) / intBitsToFloat;
        if (intBitsToFloat2 > Float.intBitsToFloat(1101004800)) {
            intBitsToFloat2 = Float.intBitsToFloat(1101004800);
        }
        System.arraycopy(this.Field17163, 0, this.Field17163, 1, this.Field17163.length - 1);
        this.Field17163[0] = intBitsToFloat2;
        double n = 0.0;
        final float[] field17163 = this.Field17163;
        for (int length = field17163.length, i = 0; i < length; ++i) {
            n += field17163[i];
        }
        double longBitsToDouble;
        if ((longBitsToDouble = n / this.Field17163.length) > Double.longBitsToDouble((long)1902658368 ^ 0x4034000071684340L)) {
            longBitsToDouble = Double.longBitsToDouble(4626322717216342016L);
        }
        Float.parseFloat(this.Field17164.format(longBitsToDouble));
        this.Field17167 = currentTimeMillis;
    }
    
    public void Method7396() {
        Arrays.fill(this.Field17163, Float.intBitsToFloat(1101004800));
        this.Field17166 = Float.intBitsToFloat(1101004800);
    }
    
    public float Method7397() {
        return Float.intBitsToFloat(1101004800) / this.Field17166;
    }
    
    public float Method7398() {
        return this.Field17166;
    }
    
    public String Method7399() {
        return this.Field17168;
    }
    
    public void Method7400(final String field17168) {
        this.Field17168 = field17168;
    }
    
    public int Method7401() {
        if (this.Field17162.player == null || this.Field17162.world == null) {
            return 0;
        }
        return this.Field17162.player.connection.getPlayerInfo(this.Field17162.player.connection.getGameProfile().getId()).getResponseTime();
    }
    
    private void Method7402(final Class544 class544) {
        this.Field17165.Method2801();
    }
    
    private static String Method7403(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2120 ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
