//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import java.util.function.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import net.minecraft.init.*;
import net.minecraft.util.*;

public class Class1526 extends Class42
{
    private final Class44 Field15126;
    private final Class44 Field15127;
    private final Class44 Field15128;
    private final Class44 Field15129;
    private final Class44 Field15130;
    private final Class44 Field15131;
    private final Class44 Field15132;
    private final Class1303 Field15133;
    private Thread Field15134;
    private Class702 Field15135;
    private String Field15136 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1526() {
        super("FireworkAura", Class97.Field8338, true);
        this.Field15126 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)1943887725 ^ 0x4018000073DD5F6DL), false));
        this.Field15127 = this.Method23(new Class44("PlaceWallRange", this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field15128 = this.Method23(new Class44("TargetRange", this, Double.longBitsToDouble((long)412330339 ^ 0x402000001893A963L), 0.0, Double.longBitsToDouble(4625196817309499392L), false));
        this.Field15129 = this.Method23(new Class44("Raytrace", this, false));
        this.Field15130 = this.Method23(new Class44("PacketPlace", this, false));
        this.Field15131 = this.Method23(new Class44("Rotate", this, false));
        this.Field15132 = this.Method23(new Class44("PlaceDelay", this, Double.longBitsToDouble((long)226879567 ^ 0x406900000D85E84FL), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943));
        this.Field15133 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028).Method5303();
        this.Field15134 = null;
        this.Field15135 = null;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Method6061();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Field15134.interrupt();
        this.Field15135 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6057(final TickEvent tickEvent) {
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class298.Method1560(this::Method6065);
    }
    
    private Class702 Method6058() {
        final ArrayList<Class702> list = new ArrayList<Class702>();
        for (final EntityPlayer entityPlayer : Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > this.Field15128.Method367()) {
                continue;
            }
            for (final BlockPos blockPos : Arrays.asList(new BlockPos(entityPlayer.posX + Double.longBitsToDouble((long)1406940410 ^ 0x3FD3333360EF07C9L), entityPlayer.posY, entityPlayer.posZ + Double.longBitsToDouble((long)2048906565 ^ 0x3FD33333492CE676L)), new BlockPos(entityPlayer.posX + Double.longBitsToDouble((long)1621362715 ^ 0x3FD3333353973B28L), entityPlayer.posY, entityPlayer.posZ - Double.longBitsToDouble(4599075939470750515L)), new BlockPos(entityPlayer.posX - Double.longBitsToDouble((long)906072311 ^ 0x3FD333330532A3C4L), entityPlayer.posY, entityPlayer.posZ + Double.longBitsToDouble(4599075939470750515L)), new BlockPos(entityPlayer.posX - Double.longBitsToDouble(4599075939470750515L), entityPlayer.posY, entityPlayer.posZ - Double.longBitsToDouble(4599075939470750515L)))) {
                if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.down()).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.down()) && Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos) && Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.up()) && !Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(2)).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.up(2)) && this.Method6060(blockPos.down())) {
                    list.add(new Class702(blockPos.down(), entityPlayer));
                }
            }
        }
        return list.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super Class702>)this::Method6064)).orElse(null);
    }
    
    private double Method6059(final BlockPos blockPos) {
        return Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble((long)1479764675 ^ 0x3FE0000058336AC3L), blockPos.getY() + Double.longBitsToDouble((long)694695163 ^ 0x3FE00000296834FBL), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private boolean Method6060(final BlockPos blockPos) {
        final double method6059 = this.Method6059(blockPos);
        if (method6059 > this.Field15126.Method367()) {
            return false;
        }
        if (this.Field15129.Method365()) {
            return Class394.Method1917(blockPos.up());
        }
        return Class394.Method1917(blockPos.up()) || method6059 <= this.Field15127.Method367();
    }
    
    private void Method6061() {
        (this.Field15134 = new Thread(this::Method6063)).start();
    }
    
    private void Method6062(final Thread thread) {
        if (thread.isInterrupted()) {
            return;
        }
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int method126 = Class9.Method126(Items.FIREWORKS);
        if (method126 == -1) {
            return;
        }
        final int currentItem = Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field15133.Method341()).Method2972().Method1726(method126, false);
        Class1036.Method4208(this.Field15135.Field10975, EnumHand.MAIN_HAND, this.Field15131.Method365(), this.Field15130.Method365());
        ((Class711)this.Field15133.Method341()).Method2972().Method1726(currentItem, true);
    }
    
    private void Method6063(final AtomicBoolean atomicBoolean) {
        while (!Thread.interrupted()) {
            if (!atomicBoolean.get()) {
                Class298.Method1561(this.Field15132.Method335());
            }
            this.Method6062(Thread.currentThread());
            atomicBoolean.set(false);
        }
    }
    
    private double Method6064(final Class702 class702) {
        return this.Method6059(class702.Field10975);
    }
    
    private void Method6065() {
        this.Field15135 = this.Method6058();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3DF ^ 0xDF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
