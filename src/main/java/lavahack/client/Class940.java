//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.util.Class650;
import java.util.function.Predicate;
import lavahack.client.Class1702;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class267;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class478;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class940
extends Class42 {
    private final Class44 Field12010 = this.Method23(new Class44("Mode", (Class42)this, Class1702.Field15881));
    private final Class650 Field12011 = new Class650();
    @Class1801
    private final Class618 Field12012 = new Class618(this::Method3884, new Predicate[0]);
    @Class1801
    private final Class618 Field12013 = new Class618(this::Method3882, new Predicate[0]);
    private String Field12014 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class940() {
        super("NoFall", Class97.Field8340);
        super.Method44(this::Method3885);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12013);
        Class1796.Field16242.Method706(this.Field12012);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12013);
        Class1796.Field16242.Method711(this.Field12012);
    }

    private void Method3882(Class478 class478) {
        if (!this.Field12010.Method359().equalsIgnoreCase(Class1702.Field15884.name())) return;
        int n = Class9.Method116(Items.WATER_BUCKET, 0, 9);
        int n2 = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (n == -1) return;
        Vec3d vec3d = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        RayTraceResult rayTraceResult = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(vec3d.x, vec3d.y - Double.longBitsToDouble((long)1027380855 ^ 0x400800003D3C9677L), vec3d.z), true);
        if (Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Float.intBitsToFloat(0x40A00000)) return;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit != RayTraceResult.Type.BLOCK) return;
        if (Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceResult.getBlockPos()).getBlock() instanceof BlockLiquid) return;
        if (Class394.Method1936()) return;
        if (Class394.Method1935(true)) {
            return;
        }
        if (class478.Method160() == Class1273.Field13746) {
            class478.Method1736(Float.intBitsToFloat(1119092736));
            return;
        }
        RayTraceResult rayTraceResult2 = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(vec3d.x, vec3d.y - Double.longBitsToDouble((long)428389075 ^ 0x401400001988B2D3L), vec3d.z), true);
        if (rayTraceResult2 == null) return;
        if (rayTraceResult2.typeOfHit != RayTraceResult.Type.BLOCK) return;
        if (Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceResult2.getBlockPos()).getBlock() instanceof BlockLiquid) return;
        if (!this.Field12011.Method2797(1000L)) return;
        Class267.Method1441(Class267.Field9188, () -> Class940.Method3883(n));
        Class9.Method110(n2, true);
        this.Field12011.Method2801();
    }

    private static void Method3883(int n) {
        Class9.Method110(n, true);
        Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, n == -2 ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND);
    }

    private void Method3884(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketPlayer)) return;
        CPacketPlayer cPacketPlayer = (CPacketPlayer)class805.Method982();
        String string = this.Field12010.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1911998296: {
                if (!string.equals("Packet")) return;
                return;
            }
            case 2045826: {
                if (!string.equals("Anti")) return;
                return;
            }
            case 64547: {
                if (!string.equals("AAC")) return;
                return;
            }
        }
    }

    private String Method3885() {
        return "[" + this.Field12010.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 68;
            cArray2[n] = (char)(cArray[n] ^ (0x7DD8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

