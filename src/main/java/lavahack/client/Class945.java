//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import java.util.function.*;
import java.util.stream.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.world.*;
import java.awt.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class945 extends Class42
{
    private final Class44 Field12032;
    private final Class44 Field12033;
    private final Class44 Field12034;
    private final Class44 Field12035;
    private final Class44 Field12036;
    private final Class44 Field12037;
    private final Class1612 Field12038;
    private String Field12039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class945() {
        super("PlayerLook", Class97.Field8344);
        this.Field12032 = this.Method23(new Class44("Single", (Class42)this, true));
        this.Field12033 = this.Method23(new Class44("Self", (Class42)this, true));
        this.Field12034 = this.Method23(new Class44("Radius", (Class42)this, Double.longBitsToDouble((long)1899714842 ^ 0x40160000713B591AL), 1.0, Double.longBitsToDouble(4626322717216342016L), false));
        this.Field12035 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)257813027 ^ 0x402000000F5DEA23L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
        this.Field12036 = this.Method23(new Class44("Raytrace", (Class42)this, true));
        this.Field12037 = this.Method23(new Class44("Display Name", (Class42)this, false));
        this.Field12038 = new Class1612((Class42)this).Method3788().Method3789();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3902(final RenderWorldLastEvent renderWorldLastEvent) {
        final double method367 = this.Field12035.Method367();
        List<EntityPlayer> singletonList;
        if (this.Field12032.Method365()) {
            final EntityPlayer method368 = Class394.Method1924((float)method367);
            if (method368 == null) {
                return;
            }
            singletonList = Collections.singletonList(method368);
        }
        else {
            singletonList = (List<EntityPlayer>)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Class945::Method3903).collect(Collectors.toList());
        }
        if (this.Field12033.Method365()) {
            singletonList.add((EntityPlayer)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        }
        if (singletonList.isEmpty()) {
            return;
        }
        final HashMap<BlockPos, ArrayList<Entity>> hashMap = new HashMap<BlockPos, ArrayList<Entity>>();
        for (final Entity entity : singletonList) {
            if (entity instanceof EntityItem) {
                continue;
            }
            final BlockPos method369 = Class2029.Method7512(entity, this.Field12034.Method367(), this.Field12036.Method365());
            if (method369 == null) {
                continue;
            }
            if (hashMap.containsKey(method369)) {
                hashMap.get(method369).add(entity);
            }
            else {
                hashMap.put(method369, new ArrayList<Entity>(Collections.singletonList(entity)));
            }
        }
        for (final BlockPos key : hashMap.keySet()) {
            this.Field12038.Method3804(Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(key).getSelectedBoundingBox((World)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, key));
            if (this.Field12037.Method365()) {
                final StringBuilder sb = new StringBuilder();
                for (int i = 0; i < hashMap.get(key).size(); ++i) {
                    sb.append(hashMap.get(key).get(i).getName());
                    if (i != hashMap.get(key).size() - 1) {
                        sb.append("\n");
                    }
                }
                Class1415.Method5584(key, sb.toString(), Color.WHITE.getRGB());
            }
        }
    }
    
    private static boolean Method3903(final double n, final Entity entity) {
        return entity != Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && entity.getDistanceSq((Entity)Class945.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= n * n;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1302 ^ 0x82));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
