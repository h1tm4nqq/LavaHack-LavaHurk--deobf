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
import lavahack.client.Class1415;
import lavahack.client.Class1612;
import lavahack.client.Class2029;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class945
extends Class42 {
    private final Class44 Field12032 = this.Method23(new Class44("Single", (Class42)this, true));
    private final Class44 Field12033 = this.Method23(new Class44("Self", (Class42)this, true));
    private final Class44 Field12034 = this.Method23(new Class44("Radius", (Class42)this, Double.longBitsToDouble((long)1899714842 ^ 0x40160000713B591AL), 1.0, Double.longBitsToDouble(0x4034000000000000L), false));
    private final Class44 Field12035 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)257813027 ^ 0x402000000F5DEA23L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
    private final Class44 Field12036 = this.Method23(new Class44("Raytrace", (Class42)this, true));
    private final Class44 Field12037 = this.Method23(new Class44("Display Name", (Class42)this, false));
    private final Class1612 Field12038 = new Class1612(this).Method3788().Method3789();
    private String Field12039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class945() {
        super("PlayerLook", Class97.Field8344);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3902(RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        List<Object> list;
        Object object2;
        double d = this.Field12035.Method367();
        if (this.Field12032.Method365()) {
            object2 = Class394.Method1924((float)d);
            if (object2 == null) {
                return;
            }
            list = Collections.singletonList(object2);
        } else {
            list = Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(arg_0 -> Class945.Method3903(d, arg_0)).collect(Collectors.toList());
        }
        if (this.Field12033.Method365()) {
            list.add(Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        }
        if (list.isEmpty()) {
            return;
        }
        object2 = new HashMap();
        for (Entity entity : list) {
            if (entity instanceof EntityItem || (object = Class2029.Method7512(entity, this.Field12034.Method367(), this.Field12036.Method365())) == null) continue;
            if (((HashMap)object2).containsKey(object)) {
                ((ArrayList)((HashMap)object2).get(object)).add(entity);
                continue;
            }
            ((HashMap)object2).put(object, new ArrayList<Entity>(Collections.singletonList(entity)));
        }
        Iterator<Object> iterator = ((HashMap)object2).keySet().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            this.Field12038.Method3804(Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos));
            if (!this.Field12037.Method365()) continue;
            object = new StringBuilder();
            for (int i = 0; i < ((ArrayList)((HashMap)object2).get(blockPos)).size(); ++i) {
                ((StringBuilder)object).append(((Entity)((ArrayList)((HashMap)object2).get(blockPos)).get(i)).getName());
                if (i == ((ArrayList)((HashMap)object2).get(blockPos)).size() - 1) continue;
                ((StringBuilder)object).append("\n");
            }
            Class1415.Method5584(blockPos, ((StringBuilder)object).toString(), Color.WHITE.getRGB());
        }
    }

    private static boolean Method3903(double d, Entity entity) {
        if (entity == Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        if (!(entity.getDistanceSq((Entity)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= d * d)) return false;
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 130;
            cArray2[n] = (char)(cArray[n] ^ (0x1302 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

