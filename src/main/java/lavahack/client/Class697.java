//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.util.Arrays;
import java.util.Iterator;
import lavahack.client.Class1393;
import lavahack.client.Class1568;
import lavahack.client.Class1796;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.math.RayTraceResult;
import org.lwjgl.input.Mouse;

public class Class697
extends Class42 {
    public Class44 Field10954 = this.Method23(new Class44("Mode", (Class42)this, "WellMore", Arrays.asList("Matrix 6.3", "Ping", "Vanish", "Zamorozka")));
    @Class873
    public static Class697 Field10955;
    private boolean Field10956 = false;
    private String Field10957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class697() {
        super("AntiBot", "Prevents you from targetting bots", Class97.Field8338);
        super.Method44(this::Method2920);
    }

    @Override
    public void Method45() {
        if (Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10954.Method309("Zamorozka") && Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && Mouse.isButtonDown((int)0)) {
            if (this.Field10956) {
                this.Field10956 = false;
                return;
            }
            this.Field10956 = true;
            RayTraceResult rayTraceResult = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
            if (rayTraceResult == null) return;
            if (rayTraceResult.typeOfHit != RayTraceResult.Type.ENTITY) {
                return;
            }
            Entity entity = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit;
            if (!(entity instanceof EntityPlayer)) {
                return;
            }
            Class1796.Field16245 = (EntityPlayer)entity;
            Class1393.Method5503().Method1886("Current target is " + entity.getName());
            return;
        }
        if (!this.Field10954.Method309("Matrix 6.3")) {
            if (!this.Field10954.Method309("Ping")) return;
            Iterator iterator = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
            while (iterator.hasNext()) {
                EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
                if (Class886.Method3699(entityPlayer) != -1) continue;
                entityPlayer.isDead = true;
            }
            return;
        }
        Iterator iterator = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
            if (entityPlayer == Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || entityPlayer.isDead) continue;
            boolean bl = Class1568.Method6186((Entity)entityPlayer, (Entity)Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Double.longBitsToDouble((long)338569589 ^ 0x40590000142E2975L)) && (double)Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= Double.longBitsToDouble((long)1471635634 ^ 0x401A000057B760B2L) && entityPlayer.canEntityBeSeen((Entity)Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            boolean bl2 = entityPlayer.getActivePotionEffect(MobEffects.SPEED) == null && entityPlayer.getActivePotionEffect(MobEffects.JUMP_BOOST) == null && entityPlayer.getActivePotionEffect(MobEffects.LEVITATION) == null && !entityPlayer.isInWater() && entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA && Class394.Method1918((Entity)entityPlayer) >= Double.longBitsToDouble((long)1765990776 ^ 0x4027CCCCA58E2DB5L);
        }
    }

    @Override
    public void Method38() {
        this.Field10956 = false;
    }

    @Override
    public void Method39() {
        Class1796.Field16245 = null;
    }

    private String Method2920() {
        return "[" + this.Field10954.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x7EE0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

