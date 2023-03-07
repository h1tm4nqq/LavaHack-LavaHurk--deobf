//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.MPDCCvkF3qJIgU5Mi7zfayTfjefx878y;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FVWplG1wFxEkzua6zLZMbu23SYlQkj0H
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12032 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Single", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1796309239 ^ (long)-1796309240)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12033 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Self", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-17268418L ^ 0xFEF8813F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12034 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1899714842 ^ 0x40160000713B591AL), 1.0, Double.longBitsToDouble(0x352CF9D1D6EDD0L ^ 0x40012CF9D1D6EDD0L), ((int)203772597L ^ 0xC2552B5) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12035 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)257813027 ^ 0x402000000F5DEA23L), 1.0, Double.longBitsToDouble(0x4FBCF92D0BFFD22BL ^ 0xF92F92D0BFFD22BL), (boolean)((long)1799565832 ^ (long)1799565832)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12036 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Raytrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-149190263L ^ 0xF71B8988) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12037 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Display Name", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)550867726L ^ 0x20D5930E) != 0));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field12038 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method3788().Method3789();
    private String Field12039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public FVWplG1wFxEkzua6zLZMbu23SYlQkj0H() {
        super("PlayerLook", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3902(RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        List<Object> list;
        Object object2;
        double d = this.Field12035.Method367();
        if (this.Field12032.Method365()) {
            object2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924((float)d);
            if (object2 == null) {
                return;
            }
            list = Collections.singletonList(object2);
        } else {
            list = FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(arg_0 -> FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.Method3903(d, arg_0)).collect(Collectors.toList());
        }
        if (this.Field12033.Method365()) {
            list.add(FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        }
        if (list.isEmpty()) {
            return;
        }
        object2 = new HashMap();
        for (Entity entity : list) {
            if (entity instanceof EntityItem || (object = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7512(entity, this.Field12034.Method367(), this.Field12036.Method365())) == null) continue;
            if (((HashMap)object2).containsKey(object)) {
                ((ArrayList)((HashMap)object2).get(object)).add(entity);
                continue;
            }
            ((HashMap)object2).put(object, new ArrayList<Entity>(Collections.singletonList(entity)));
        }
        Iterator<Object> iterator = ((HashMap)object2).keySet().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            this.Field12038.Method3804(FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getSelectedBoundingBox((World)FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos));
            if (!this.Field12037.Method365()) continue;
            object = new StringBuilder();
            for (int i = (int)((long)-1055288798 ^ (long)-1055288798); i < ((ArrayList)((HashMap)object2).get(blockPos)).size(); ++i) {
                ((StringBuilder)object).append(((Entity)((ArrayList)((HashMap)object2).get(blockPos)).get(i)).getName());
                if (i == ((ArrayList)((HashMap)object2).get(blockPos)).size() - ((int)-1110665347L ^ 0xBDCC977C)) continue;
                ((StringBuilder)object).append("\n");
            }
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method5584(blockPos, ((StringBuilder)object).toString(), Color.WHITE.getRGB());
        }
    }

    private static boolean Method3903(double d, Entity entity) {
        int n;
        if (entity != FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && entity.getDistanceSq((Entity)FVWplG1wFxEkzua6zLZMbu23SYlQkj0H.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= d * d) {
            n = (int)1150687444L ^ 0x449618D5;
            return n != 0;
        }
        n = (int)-1056634546L ^ 0xC105094E;
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1727998127L ^ 0x9900D751;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1136179773L ^ 0xBC47453C);
            int n2 = (int)((long)638924727 ^ (long)638924790) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1142159251L ^ 0x4413FE12) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

