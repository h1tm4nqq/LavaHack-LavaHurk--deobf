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

import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NfIijxWIgkgw5xManZNJ1n0KAF0kbStD;
import lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12010 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15881));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12011 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12012 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3884, new Predicate[(int)((long)-909867989 ^ (long)-909867989)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12013 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3882, new Predicate[(int)((long)-888153168 ^ (long)-888153168)]);
    private String Field12014 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ() {
        super("NoFall", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        super.Method44(this::Method3885);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12013);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12012);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12013);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12012);
    }

    private void Method3882(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        if (!this.Field12010.Method359().equalsIgnoreCase(ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15884.name())) return;
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.WATER_BUCKET, (int)518386365L ^ 0x1EE5F2BD, (int)((long)1173649164 ^ (long)1173649157));
        int n2 = ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (n == ((int)-1084830161L ^ 0x40A931D0)) return;
        Vec3d vec3d = ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        RayTraceResult rayTraceResult = ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(vec3d.x, vec3d.y - Double.longBitsToDouble((long)1027380855 ^ 0x400800003D3C9677L), vec3d.z), ((int)-287683026L ^ 0xEEDA4E2F) != 0);
        if (ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Float.intBitsToFloat((int)674691434L ^ 0x6896F96A)) return;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit != RayTraceResult.Type.BLOCK) return;
        if (ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceResult.getBlockPos()).getBlock() instanceof BlockLiquid) return;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1936()) return;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1935(((int)-137608760L ^ 0xF7CC41C9) != 0)) {
            return;
        }
        if (rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method160() == Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746) {
            rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1736(Float.intBitsToFloat((int)((long)1851871518 ^ (long)752177438)));
            return;
        }
        RayTraceResult rayTraceResult2 = ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(vec3d.x, vec3d.y - Double.longBitsToDouble((long)428389075 ^ 0x401400001988B2D3L), vec3d.z), ((int)-1616671285L ^ 0x9FA38DCA) != 0);
        if (rayTraceResult2 == null) return;
        if (rayTraceResult2.typeOfHit != RayTraceResult.Type.BLOCK) return;
        if (ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(rayTraceResult2.getBlockPos()).getBlock() instanceof BlockLiquid) return;
        if (!this.Field12011.Method2797(0x10951BF8L & 0x6D68C3EBL)) return;
        NfIijxWIgkgw5xManZNJ1n0KAF0kbStD.Method1441(NfIijxWIgkgw5xManZNJ1n0KAF0kbStD.Field9188, () -> ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.Method3883(n));
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n2, (boolean)((long)-446946206 ^ (long)-446946205));
        this.Field12011.Method2801();
    }

    private static void Method3883(int n) {
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, ((int)1898406260L ^ 0x71276175) != 0);
        ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, n == ((int)-1129083300L ^ 0x434C71A2) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND);
    }

    private void Method3884(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        CPacketPlayer cPacketPlayer = (CPacketPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        String string = this.Field12010.Method359();
        int n = (int)((long)1666526829 ^ (long)-1666526830);
        switch (string.hashCode()) {
            case -1911998296: {
                if (!string.equals("Packet")) return;
                n = (int)-1033501490L ^ 0xC26604CE;
                return;
            }
            case 2045826: {
                if (!string.equals("Anti")) return;
                n = (int)-1771299508L ^ 0x966C1D4D;
                return;
            }
            case 64547: {
                if (!string.equals("AAC")) return;
                n = (int)((long)-1613358464 ^ (long)-1613358463) << 1;
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
        int n = (int)981540603L ^ 0x3A811EFB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1155366468L ^ 0xBB228143);
            int n2 = (int)((long)316700754 ^ (long)316700739) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)763812847 ^ (long)763810900) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

