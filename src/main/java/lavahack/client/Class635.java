//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.network.play.server.SPacketBlockBreakAnim
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.function.Predicate;
import lavahack.client.Class1178;
import lavahack.client.Class1388;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.network.play.server.SPacketBlockBreakAnim;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class Class635
extends Class42 {
    private Class44 Field10719 = new Class44("Message Type", (Class42)this, Class1388.Field14293);
    private Class44 Field10720 = new Class44("Display Show Delay", (Class42)this, Double.longBitsToDouble((long)173757493 ^ 0x408F40000A5B5435L), 1.0, Double.longBitsToDouble((long)983985242 ^ 0x40B388003AA66C5AL), Class467.Field9943);
    private ArrayList Field10721 = new ArrayList();
    private Class650 Field10722 = new Class650();
    @Class1801
    private final Class618 Field10723 = new Class618(this::Method2753, new Predicate[0]);
    private int Field10724;

    public Class635() {
        super("BreakAlert", Class97.Field8338);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10719);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10720);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10723);
        this.Field10721.clear();
    }

    @Override
    public void Method45() {
        if (Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (this.Field10721.isEmpty()) {
            return;
        }
        int n = 0;
        while (n < this.Field10721.size()) {
            if (this.Field10719.Method359().equalsIgnoreCase(Class1388.Field14293.name())) {
                Class1393.Method5507().Method1886(TextFormatting.DARK_PURPLE + "Break Alert! " + TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!");
            }
            ++n;
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2748(RenderGameOverlayEvent.Text text) {
        if (!this.Field10722.Method2797(this.Field10720.Method369())) {
            this.Field10722.Method2801();
            return;
        }
        int n = 0;
        while (n < this.Field10721.size()) {
            if (this.Field10719.Method359().equalsIgnoreCase(Class1388.Field14294.name())) {
                ScaledResolution scaledResolution = new ScaledResolution(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
                Class1178.Field13314.Method762(TextFormatting.DARK_PURPLE + "Break Alert!", scaledResolution.getScaledWidth() / 2, scaledResolution.getScaledHeight() / 2 - Class1178.Method4748(), -1);
                Class1178.Field13315.Method762(TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!", scaledResolution.getScaledWidth() / 2, scaledResolution.getScaledHeight() / 2 + 5, -1);
            }
            ++n;
        }
    }

    private ArrayList Method2749() {
        int n;
        int n2;
        double d = Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        double d2 = Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        int n3 = this.Method2750(d, false);
        int n4 = this.Method2750(d, true);
        int n5 = this.Method2750(d2, false);
        int n6 = this.Method2750(d2, true);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        for (n2 = 1; n2 < n3 + 1; ++n2) {
            arrayList.add(this.Method2752(this.Method2751(), n2, 1 + n5));
            arrayList.add(this.Method2752(this.Method2751(), n2, -(1 + n6)));
        }
        for (n2 = 0; n2 <= n4; ++n2) {
            arrayList.add(this.Method2752(this.Method2751(), -n2, 1 + n5));
            arrayList.add(this.Method2752(this.Method2751(), -n2, -(1 + n6)));
        }
        for (n = 1; n < n5 + 1; ++n) {
            arrayList.add(this.Method2752(this.Method2751(), 1 + n3, n));
            arrayList.add(this.Method2752(this.Method2751(), -(1 + n4), n));
        }
        n = 0;
        while (n <= n6) {
            arrayList.add(this.Method2752(this.Method2751(), 1 + n3, -n));
            arrayList.add(this.Method2752(this.Method2751(), -(1 + n4), -n));
            ++n;
        }
        return arrayList;
    }

    private int Method2750(double d, boolean bl) {
        if (bl) {
            if (!(d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4629295593105558319L)) ^ 0x7FEDBCE3A865B81CL))) return 0;
            return 1;
        }
        if (!(d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1608219652 ^ 0x403659BB42AFAE3FL)) ^ 0x7FD03FDD7B12B45DL))) return 0;
        return 1;
    }

    private BlockPos Method2751() {
        double d;
        double d2 = Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        if (Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)580018004 ^ 0x403364B825354FA3L)) ^ 0x7FDAFD219E3E896DL)) {
            d = Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1645815601 ^ 0x4013A10B86BD8221L)) ^ 0x7FE3A10BE4A4A510L);
            return new BlockPos(d2, d, Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        d = Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        return new BlockPos(d2, d, Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private BlockPos Method2752(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9217310814387042241L)) ^ 0x7FEA7759ABE7F7C1L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9217310814387042241L)) ^ 0x7FEA7759ABE7F7C1L), d2);
    }

    private void Method2753(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketBlockBreakAnim)) return;
        SPacketBlockBreakAnim sPacketBlockBreakAnim = (SPacketBlockBreakAnim)class544.Method982();
        if (this.Method2749().isEmpty()) return;
        if (!this.Method2749().contains(sPacketBlockBreakAnim.getPosition())) {
            return;
        }
        if (!this.Field10721.contains(sPacketBlockBreakAnim.getPosition()) && sPacketBlockBreakAnim.getProgress() > 0 && sPacketBlockBreakAnim.getProgress() <= 10) {
            this.Field10721.add(sPacketBlockBreakAnim.getPosition());
            return;
        }
        if (sPacketBlockBreakAnim.getProgress() > 0) {
            if (sPacketBlockBreakAnim.getProgress() <= 10) return;
        }
        this.Field10721.remove(sPacketBlockBreakAnim.getPosition());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 210;
            cArray2[n] = (char)(cArray[n] ^ (0x4908 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

