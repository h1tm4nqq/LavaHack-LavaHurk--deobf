//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import com.kisman.cc.event.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.network.play.client.*;

public class Class940 extends Class42
{
    private final Class44 Field12010;
    private final Class650 Field12011;
    @Class1801
    private final Class618 Field12012;
    @Class1801
    private final Class618 Field12013;
    private String Field12014 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class940() {
        super("NoFall", Class97.Field8340);
        this.Field12010 = this.Method23(new Class44("Mode", (Class42)this, (Enum)Class1702.Field15881));
        this.Field12011 = new Class650();
        this.Field12012 = new Class618(this::Method3884, new Predicate[0]);
        this.Field12013 = new Class618(this::Method3882, new Predicate[0]);
        super.Method44((Supplier)this::Method3885);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12013);
        Class1796.Field16242.Method706(this.Field12012);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12013);
        Class1796.Field16242.Method711(this.Field12012);
    }
    
    private void Method3882(final Class478 class478) {
        if (this.Field12010.Method359().equalsIgnoreCase(Class1702.Field15884.name())) {
            final int method116 = Class9.Method116(Items.WATER_BUCKET, 0, 9);
            final int currentItem = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (method116 != -1) {
                final Vec3d getPositionVector = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
                final RayTraceResult rayTraceBlocks = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(getPositionVector, new Vec3d(getPositionVector.x, getPositionVector.y - Double.longBitsToDouble((long)1027380855 ^ 0x400800003D3C9677L), getPositionVector.z), true);
                if (Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Float.intBitsToFloat(1084227584) || rayTraceBlocks == null || rayTraceBlocks.typeOfHit != RayTraceResult$Type.BLOCK || Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceBlocks.getBlockPos()).getBlock() instanceof BlockLiquid || Class394.Method1936() || Class394.Method1935(true)) {
                    return;
                }
                if (class478.Method160() == Class1273.Field13746) {
                    class478.Method1736(Float.intBitsToFloat(1119092736));
                }
                else {
                    final RayTraceResult rayTraceBlocks2 = Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(getPositionVector, new Vec3d(getPositionVector.x, getPositionVector.y - Double.longBitsToDouble((long)428389075 ^ 0x401400001988B2D3L), getPositionVector.z), true);
                    if (rayTraceBlocks2 != null && rayTraceBlocks2.typeOfHit == RayTraceResult$Type.BLOCK && !(Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceBlocks2.getBlockPos()).getBlock() instanceof BlockLiquid) && this.Field12011.Method2797(1000L)) {
                        Class267.Method1441(Class267.Field9188, Class940::Method3883);
                        Class9.Method110(currentItem, true);
                        this.Field12011.Method2801();
                    }
                }
            }
        }
    }
    
    private static void Method3883(final int n) {
        Class9.Method110(n, true);
        Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class940.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (n == -2) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND);
    }
    
    private void Method3884(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer) {
            final CPacketPlayer cPacketPlayer = (CPacketPlayer)class805.Method982();
            final String method359 = this.Field12010.Method359();
            switch (method359.hashCode()) {
                case -1911998296: {
                    if (method359.equals("Packet")) {
                        break;
                    }
                    break;
                }
                case 2045826: {
                    if (method359.equals("Anti")) {
                        break;
                    }
                    break;
                }
                case 64547: {
                    if (method359.equals("AAC")) {
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private String Method3885() {
        return "[" + this.Field12010.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7DD8 ^ 0x44));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
