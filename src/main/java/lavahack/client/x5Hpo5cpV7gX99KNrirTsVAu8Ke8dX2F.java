//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2;
import lavahack.client.x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15126 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC4B5B3ECD88861D6L ^ 0x84A1B3ECD88861D6L), 0.0, Double.longBitsToDouble((long)1943887725 ^ 0x4018000073DD5F6DL), ((int)294862256L ^ 0x11933DB0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15127 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceWallRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x15BDDCB9BA473626L ^ 0x55B5DCB9BA473626L), 0.0, Double.longBitsToDouble(0x752A22A9D2798603L ^ 0x353222A9D2798603L), (boolean)((long)2066659482 ^ (long)2066659482)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15128 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)412330339 ^ 0x402000001893A963L), 0.0, Double.longBitsToDouble(0xEDBD8131EAB5133FL ^ 0xAD8D8131EAB5133FL), (boolean)((long)2027501788 ^ (long)2027501788)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15129 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Raytrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-830305514 ^ (long)-830305514)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15130 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PacketPlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-845970786L ^ 0xCD93829E) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15131 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-906752662 ^ (long)-906752662)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15132 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)226879567 ^ 0x406900000D85E84FL), 0.0, Double.longBitsToDouble(0x6FE0752446A59489L ^ 0x2F7F352446A59489L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15133 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private Thread Field15134 = null;
    private x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15135 = null;
    private String Field15136 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F() {
        super("FireworkAura", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338, ((int)-1475871158L ^ 0xA807FE4B) != 0);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
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
        if (x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1560(this::Method6065);
    }

    /*
     * Unable to fully structure code
     */
    private x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6058() {
        var1_1 = new ArrayList<x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>();
        var2_2 = x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        block0: while (true) {
            if (var2_2.hasNext() == false) return var1_1.stream().min(Comparator.comparingDouble((ToDoubleFunction<x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, Method6064(lavahack.client.x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ), (Llavahack/client/x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;)D)((x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F)this))).orElse(null);
            var3_3 = (EntityPlayer)var2_2.next();
            if ((double)x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)var3_3) > this.Field15128.Method367()) continue;
            v0 = new BlockPos[((int)-1351979069L ^ -1351979070) << 2];
            v0[(int)-998199205L ^ -998199205] = new BlockPos(var3_3.posX + Double.longBitsToDouble((long)1406940410 ^ 4599075940238034889L), var3_3.posY, var3_3.posZ + Double.longBitsToDouble((long)2048906565 ^ 4599075939839436406L));
            v0[(int)((long)2016110743 ^ (long)2016110742)] = new BlockPos(var3_3.posX + Double.longBitsToDouble((long)1621362715 ^ 4599075940014177064L), var3_3.posY, var3_3.posZ - Double.longBitsToDouble(3143300404113778417L ^ 1462557325510841794L));
            v0[((int)623981604L ^ 623981605) << 1] = new BlockPos(var3_3.posX - Double.longBitsToDouble((long)906072311 ^ 4599075938698961860L), var3_3.posY, var3_3.posZ + Double.longBitsToDouble(4954974667597180445L ^ 8867772410385095982L));
            v0[(int)((long)-2114021759 ^ (long)-2114021758)] = new BlockPos(var3_3.posX - Double.longBitsToDouble(6719357327506853475L ^ 7128284312822480208L), var3_3.posY, var3_3.posZ - Double.longBitsToDouble(6137488678651807059L ^ 7710037614131607136L));
            var4_4 = Arrays.asList(v0);
            var5_5 = var4_4.iterator();
            while (true) {
                if (var5_5.hasNext()) ** break;
                continue block0;
                var6_6 = var5_5.next();
                if (!x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.down()).getBlock().isReplaceable((IBlockAccess)x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.down()) || !x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6).getBlock().isReplaceable((IBlockAccess)x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6) || !x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.up()).getBlock().isReplaceable((IBlockAccess)x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.up()) || x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(var6_6.up((int)((long)-1477637238 ^ (long)-1477637237) << 1)).getBlock().isReplaceable((IBlockAccess)x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, var6_6.up((int)((long)669087619 ^ (long)669087618) << 1)) || !this.Method6060(var6_6.down())) continue;
                var1_1.add(new x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(var6_6.down(), var3_3));
            }
            break;
        }
    }

    private double Method6059(BlockPos blockPos) {
        return x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1479764675 ^ 0x3FE0000058336AC3L), (double)blockPos.getY() + Double.longBitsToDouble((long)694695163 ^ 0x3FE00000296834FBL), (double)blockPos.getZ() + Double.longBitsToDouble(0x2ED695BF93A2F52AL ^ 0x113695BF93A2F52AL));
    }

    private boolean Method6060(BlockPos blockPos) {
        int n;
        double d = this.Method6059(blockPos);
        if (d > this.Field15126.Method367()) {
            return ((int)2105556304L ^ 0x7D803D50) != 0;
        }
        if (this.Field15129.Method365()) {
            return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos.up());
        }
        if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos.up()) && !(d <= this.Field15127.Method367())) {
            n = (int)((long)176717007 ^ (long)176717007);
            return n != 0;
        }
        n = (int)((long)-691246270 ^ (long)-691246269);
        return n != 0;
    }

    private void Method6061() {
        AtomicBoolean atomicBoolean = new AtomicBoolean((boolean)((long)-201619756 ^ (long)-201619755));
        this.Field15134 = new Thread(() -> this.Method6063(atomicBoolean));
        this.Field15134.start();
    }

    private void Method6062(Thread thread) {
        if (thread.isInterrupted()) {
            return;
        }
        if (x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(Items.FIREWORKS);
        if (n == ((int)-359154168L ^ 0x156841F7)) {
            return;
        }
        int n2 = x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Object[] objectArray = new Object[((int)1186138298L ^ 0x46B308BB) << 1];
        objectArray[(int)1072482584L ^ 0x3FECC918] = n;
        objectArray[(int)-721644453L ^ 0xD4FC945A] = ((int)1093691788L ^ 0x4130698C) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15133.Method341()).Method2972().Method1726(objectArray);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(this.Field15135.Field10975, EnumHand.MAIN_HAND, this.Field15131.Method365(), this.Field15130.Method365());
        Object[] objectArray2 = new Object[((int)-1699926208L ^ 0x9AAD2F41) << 1];
        objectArray2[(int)((long)2012709014 ^ (long)2012709014)] = n2;
        objectArray2[(int)-2006606728L ^ 0x88659C79] = (boolean)((long)1535798424 ^ (long)1535798425);
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15133.Method341()).Method2972().Method1726(objectArray2);
    }

    private void Method6063(AtomicBoolean atomicBoolean) {
        while (!Thread.interrupted()) {
            if (!atomicBoolean.get()) {
                v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(this.Field15132.Method335());
            }
            this.Method6062(Thread.currentThread());
            atomicBoolean.set(((int)-1922416200L ^ 0x8D6A41B8) != 0);
        }
    }

    private double Method6064(x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return this.Method6059(x5Hpo5cpV7gX99KNrirTsVAu8Ke8dX2F$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10975);
    }

    private void Method6065() {
        this.Field15135 = this.Method6058();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-862771781L ^ 0xCC9325BB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-427002926L ^ 0xE68C732D);
            int n2 = (int)-2108323476L ^ 0x825589B3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1785327224 ^ (long)-1785327017) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

