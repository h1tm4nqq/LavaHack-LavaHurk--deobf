//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.util.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;

public class Class723 implements Class2142
{
    private static Class723 Field11081;
    private int Field11082;
    
    Class723() {
    }
    
    public static Class723 Method3023() {
        if (Class723.Field11081 == null) {
            Class723.Field11081 = new Class723();
        }
        return Class723.Field11081;
    }
    
    public boolean Method3024(final BlockPos blockPos) {
        return Class1036.Method4189(blockPos);
    }
    
    public boolean Method3025(final BlockPos blockPos, final boolean b) {
        return this.Method3026(blockPos, true, b);
    }
    
    public boolean Method3026(final BlockPos blockPos, final boolean b, final boolean b2) {
        return Class1486.Method5948(blockPos, b, b2);
    }
    
    public boolean Method3027(final BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return false;
        }
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        return true;
    }
    
    public boolean Method3028(final BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return false;
        }
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.playerController.onPlayerDamageBlock(blockPos, EnumFacing.UP);
        return true;
    }
    
    public void Method3029(final BlockPos blockPos, final EnumHand enumHand) {
        final RayTraceResult rayTraceBlocks = Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.rayTraceBlocks(new Vec3d(Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX, Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY + Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getEyeHeight(), Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ), new Vec3d(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() - Double.longBitsToDouble((long)1797613537 ^ 0x3FE000006B2567E1L), blockPos.getZ() + Double.longBitsToDouble((long)1196142220 ^ 0x3FE00000474BAE8CL)));
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, (rayTraceBlocks == null || rayTraceBlocks.sideHit == null) ? EnumFacing.UP : rayTraceBlocks.sideHit, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
    }
    
    public void Method3030(final BlockPos blockPos) {
        this.Method3029(blockPos, EnumHand.MAIN_HAND);
    }
    
    public void Method3031(final EnumHand enumHand) {
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(enumHand));
    }
    
    public boolean Method3032(final BlockPos blockPos, final boolean b) {
        return this.Method3033(blockPos, b, EnumHand.MAIN_HAND);
    }
    
    public boolean Method3033(final BlockPos blockPos, final boolean b, final EnumHand enumHand) {
        return Class1486.Method5949(blockPos, enumHand, b);
    }
    
    public Class1879 Method3034(final BlockPos blockPos) {
        for (final Class1879 class1879 : Class1879.values()) {
            if (!Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos.add(class1879.Field16669)).getMaterial().isReplaceable()) {
                return class1879;
            }
        }
        return null;
    }
    
    public Class1879 Method3035(final Class1879 obj) {
        switch (Class1235.Field13606[obj.ordinal()]) {
            case 1: {
                return Class1879.Field16667;
            }
            case 2: {
                return Class1879.Field16666;
            }
            case 3: {
                return Class1879.Field16665;
            }
            case 4: {
                return Class1879.Field16668;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + obj);
            }
        }
    }
    
    public Class1879 Method3036(final Class1879 obj) {
        switch (Class1235.Field13606[obj.ordinal()]) {
            case 1: {
                return Class1879.Field16665;
            }
            case 4: {
                return Class1879.Field16666;
            }
            case 3: {
                return Class1879.Field16667;
            }
            case 2: {
                return Class1879.Field16668;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + obj);
            }
        }
    }
    
    private static String Method3037(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x15C7 ^ 0xB0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
