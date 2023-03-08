//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import org.lwjgl.input.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.inventory.*;
import net.minecraft.init.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import java.util.*;

public class Class697 extends Class42
{
    public Class44 Field10954;
    @Class873
    public static Class697 Field10955;
    private boolean Field10956;
    private String Field10957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class697() {
        super("AntiBot", "Prevents you from targetting bots", Class97.Field8338);
        this.Field10954 = this.Method23(new Class44("Mode", (Class42)this, "WellMore", (List)Arrays.asList("Matrix 6.3", "Ping", "Vanish", "Zamorozka")));
        this.Field10956 = false;
        super.Method44((Supplier)this::Method2920);
    }
    
    public void Method45() {
        if (Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10954.Method309("Zamorozka") && Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && Mouse.isButtonDown(0)) {
            if (!this.Field10956) {
                this.Field10956 = true;
                final RayTraceResult objectMouseOver = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
                if (objectMouseOver == null || objectMouseOver.typeOfHit != RayTraceResult$Type.ENTITY) {
                    return;
                }
                final Entity entityHit = Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit;
                if (!(entityHit instanceof EntityPlayer)) {
                    return;
                }
                Class1796.Field16245 = (EntityPlayer)entityHit;
                Class1393.Method5503().Method1886("Current target is " + entityHit.getName());
            }
            else {
                this.Field10956 = false;
            }
        }
        else if (this.Field10954.Method309("Matrix 6.3")) {
            for (final EntityPlayer entityPlayer : Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
                if (entityPlayer != Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !entityPlayer.isDead) {
                    final boolean b = Class1568.Method6186((Entity)entityPlayer, (Entity)Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Double.longBitsToDouble((long)338569589 ^ 0x40590000142E2975L)) && Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= Double.longBitsToDouble((long)1471635634 ^ 0x401A000057B760B2L) && entityPlayer.canEntityBeSeen((Entity)Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    final boolean b2 = entityPlayer.getActivePotionEffect(MobEffects.SPEED) == null && entityPlayer.getActivePotionEffect(MobEffects.JUMP_BOOST) == null && entityPlayer.getActivePotionEffect(MobEffects.LEVITATION) == null && !entityPlayer.isInWater() && entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA && Class394.Method1918((Entity)entityPlayer) >= Double.longBitsToDouble((long)1765990776 ^ 0x4027CCCCA58E2DB5L);
                }
            }
        }
        else if (this.Field10954.Method309("Ping")) {
            for (final EntityPlayer entityPlayer2 : Class697.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
                if (Class886.Method3699(entityPlayer2) == -1) {
                    entityPlayer2.isDead = true;
                }
            }
        }
    }
    
    public void Method38() {
        this.Field10956 = false;
    }
    
    public void Method39() {
        Class1796.Field16245 = null;
    }
    
    private String Method2920() {
        return "[" + this.Field10954.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7EE0 ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
