//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.ToDoubleFunction;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class298;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class702;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1526
extends Class42 {
    private final Class44 Field15126 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)1943887725 ^ 0x4018000073DD5F6DL), false));
    private final Class44 Field15127 = this.Method23(new Class44("PlaceWallRange", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field15128 = this.Method23(new Class44("TargetRange", (Class42)this, Double.longBitsToDouble((long)412330339 ^ 0x402000001893A963L), 0.0, Double.longBitsToDouble(0x4030000000000000L), false));
    private final Class44 Field15129 = this.Method23(new Class44("Raytrace", (Class42)this, false));
    private final Class44 Field15130 = this.Method23(new Class44("PacketPlace", (Class42)this, false));
    private final Class44 Field15131 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field15132 = this.Method23(new Class44("PlaceDelay", (Class42)this, Double.longBitsToDouble((long)226879567 ^ 0x406900000D85E84FL), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943));
    private final Class1303 Field15133 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private Thread Field15134 = null;
    private Class702 Field15135 = null;
    private String Field15136 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1526() {
        super("FireworkAura", Class97.Field8338, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Method6061();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field15134.interrupt();
        this.Field15135 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6057(TickEvent tickEvent) {
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class298.Method1560(this::Method6065);
    }

    /*
     * Unable to fully structure code
     */
    private Class702 Method6058() {
        var1_1 = new ArrayList<Class702>();
        var2_2 = Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        block0: while (true) {
            if (var2_2.hasNext() == false) return var1_1.stream().min(Comparator.comparingDouble((ToDoubleFunction<x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.leqS0IyKEB621E1SrHdAcHHAUjScjmKi>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, Method6064(lavahack.client.Class702 ), (Llavahack/client/x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;)D)((Class1526)this))).orElse(null);
            var3_3 = (EntityPlayer)var2_2.next();
            if ((double)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)var3_3) > this.Field15128.Method367()) continue;
            var4_4 = Arrays.asList(new BlockPos[]{new BlockPos(var3_3.posX + Double.longBitsToDouble((long)1406940410 ^ 4599075940238034889L), var3_3.posY, var3_3.posZ + Double.longBitsToDouble((long)2048906565 ^ 4599075939839436406L)), new BlockPos(var3_3.posX + Double.longBitsToDouble((long)1621362715 ^ 4599075940014177064L), var3_3.posY, var3_3.posZ - Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(var3_3.posX - Double.longBitsToDouble((long)906072311 ^ 4599075938698961860L), var3_3.posY, var3_3.posZ + Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(var3_3.posX - Double.longBitsToDouble(0x3FD3333333333333L), var3_3.posY, var3_3.posZ - Double.longBitsToDouble(0x3FD3333333333333L))});
            var5_5 = var4_4.iterator();
            while (true) {
                if (var5_5.hasNext()) ** break;
                continue block0;
                var6_6 = var5_5.next();
                if (!Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.down()).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.down()) || !Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6) || !Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.up()).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.up()) || Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.up(2)).getBlock().isReplaceable((IBlockAccess)Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.up(2)) || !this.Method6060(var6_6.down())) continue;
                var1_1.add(new Class702(var6_6.down(), var3_3));
            }
            break;
        }
    }

    private double Method6059(BlockPos blockPos) {
        return Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1479764675 ^ 0x3FE0000058336AC3L), (double)blockPos.getY() + Double.longBitsToDouble((long)694695163 ^ 0x3FE00000296834FBL), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }

    private boolean Method6060(BlockPos blockPos) {
        double d = this.Method6059(blockPos);
        if (d > this.Field15126.Method367()) {
            return false;
        }
        if (this.Field15129.Method365()) {
            return Class394.Method1917(blockPos.up());
        }
        if (Class394.Method1917(blockPos.up())) return true;
        if (d <= this.Field15127.Method367()) return true;
        return false;
    }

    private void Method6061() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.Field15134 = new Thread(() -> this.Method6063(atomicBoolean));
        this.Field15134.start();
    }

    private void Method6062(Thread thread) {
        if (thread.isInterrupted()) {
            return;
        }
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = Class9.Method126(Items.FIREWORKS);
        if (n == -1) {
            return;
        }
        int n2 = Class1526.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field15133.Method341()).Method2972().Method1726(n, false);
        Class1036.Method4208(this.Field15135.Field10975, EnumHand.MAIN_HAND, this.Field15131.Method365(), this.Field15130.Method365());
        ((Class711)this.Field15133.Method341()).Method2972().Method1726(n2, true);
    }

    private void Method6063(AtomicBoolean atomicBoolean) {
        while (!Thread.interrupted()) {
            if (!atomicBoolean.get()) {
                Class298.Method1561(this.Field15132.Method335());
            }
            this.Method6062(Thread.currentThread());
            atomicBoolean.set(false);
        }
    }

    private double Method6064(Class702 class702) {
        return this.Method6059(class702.Field10975);
    }

    private void Method6065() {
        this.Field15135 = this.Method6058();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 223;
            cArray2[n] = (char)(cArray[n] ^ (0x3DF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

