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

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.Arrays;
import java.util.Iterator;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.math.RayTraceResult;
import org.lwjgl.input.Mouse;

public class PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10954;
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX Field10955;
    private boolean Field10956;
    private String Field10957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX() {
        super("AntiBot", "Prevents you from targetting bots", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[(int)((long)-990090098 ^ (long)-990090097) << 2];
        stringArray[(int)((long)-128024065 ^ (long)-128024065)] = "Matrix 6.3";
        stringArray[(int)((long)-465058863 ^ (long)-465058864)] = "Ping";
        stringArray[((int)30879150L ^ 0x1D72DAF) << 1] = "Vanish";
        stringArray[(int)((long)-960564940 ^ (long)-960564937)] = "Zamorozka";
        this.Field10954 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "WellMore", Arrays.asList(stringArray)));
        this.Field10956 = (int)-747594331L ^ 0xD3709DA5;
        super.Method44(this::Method2920);
    }

    @Override
    public void Method45() {
        if (PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10954.Method309("Zamorozka") && PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && Mouse.isButtonDown((int)((int)((long)1681108383 ^ (long)1681108383)))) {
            if (this.Field10956) {
                this.Field10956 = (int)230924207L ^ 0xDC39FAF;
                return;
            }
            this.Field10956 = (int)-1979573163L ^ 0x8A021C54;
            RayTraceResult rayTraceResult = PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
            if (rayTraceResult == null) return;
            if (rayTraceResult.typeOfHit != RayTraceResult.Type.ENTITY) {
                return;
            }
            Entity entity = PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit;
            if (!(entity instanceof EntityPlayer)) {
                return;
            }
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16245 = (EntityPlayer)entity;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Current target is " + entity.getName());
            return;
        }
        if (!this.Field10954.Method309("Matrix 6.3")) {
            if (!this.Field10954.Method309("Ping")) return;
            Iterator iterator = PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
            while (iterator.hasNext()) {
                EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
                if (agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3699(entityPlayer) != (int)((long)-147215749 ^ (long)147215748)) continue;
                entityPlayer.isDead = (int)((long)-1541455505 ^ (long)-1541455506);
            }
            return;
        }
        Iterator iterator = PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
            if (entityPlayer == PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || entityPlayer.isDead) continue;
            int n = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6186((Entity)entityPlayer, (Entity)PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Double.longBitsToDouble((long)338569589 ^ 0x40590000142E2975L)) && (double)PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= Double.longBitsToDouble((long)1471635634 ^ 0x401A000057B760B2L) && entityPlayer.canEntityBeSeen((Entity)PpfOkMOVdHKWdN39F0ztkLKuIy85tYoX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? (int)((long)244379679 ^ (long)244379678) : (int)((long)-460642015 ^ (long)-460642015);
            int n2 = entityPlayer.getActivePotionEffect(MobEffects.SPEED) == null && entityPlayer.getActivePotionEffect(MobEffects.JUMP_BOOST) == null && entityPlayer.getActivePotionEffect(MobEffects.LEVITATION) == null && !entityPlayer.isInWater() && entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA && EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1918((Entity)entityPlayer) >= Double.longBitsToDouble((long)1765990776 ^ 0x4027CCCCA58E2DB5L) ? (int)((long)31475293 ^ (long)31475292) : (int)((long)1420854970 ^ (long)1420854970);
        }
    }

    @Override
    public void Method38() {
        this.Field10956 = (int)1196827608L ^ 0x475623D8;
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16245 = null;
    }

    private String Method2920() {
        return "[" + this.Field10954.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-356552704L ^ 0xEABF7000;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)508589374L ^ 0x1E5075C1);
            int n2 = (int)((long)322688081 ^ (long)322688118) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1394099513L ^ 0x531846CE) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

