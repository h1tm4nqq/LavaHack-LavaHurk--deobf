//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.util.text.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.server.*;

@Deprecated
public class Class635 extends Class42
{
    private Class44 Field10719;
    private Class44 Field10720;
    private ArrayList Field10721;
    private Class650 Field10722;
    @Class1801
    private final Class618 Field10723;
    private int Field10724;
    
    public Class635() {
        super("BreakAlert", Class97.Field8338);
        this.Field10719 = new Class44("Message Type", (Class42)this, (Enum)Class1388.Field14293);
        this.Field10720 = new Class44("Display Show Delay", (Class42)this, Double.longBitsToDouble((long)173757493 ^ 0x408F40000A5B5435L), 1.0, Double.longBitsToDouble((long)983985242 ^ 0x40B388003AA66C5AL), Class467.Field9943);
        this.Field10721 = new ArrayList();
        this.Field10722 = new Class650();
        this.Field10723 = new Class618(this::Method2753, new Predicate[0]);
        Class635.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10719);
        Class635.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10720);
    }
    
    public boolean Method52() {
        return true;
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10723);
        this.Field10721.clear();
    }
    
    public void Method45() {
        if (Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || this.Field10721.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.Field10721.size(); ++i) {
            if (this.Field10719.Method359().equalsIgnoreCase(Class1388.Field14293.name())) {
                Class1393.Method5507().Method1886(TextFormatting.DARK_PURPLE + "Break Alert! " + TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!");
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2748(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (this.Field10722.Method2797(this.Field10720.Method369())) {
            for (int i = 0; i < this.Field10721.size(); ++i) {
                if (this.Field10719.Method359().equalsIgnoreCase(Class1388.Field14294.name())) {
                    final ScaledResolution scaledResolution = new ScaledResolution(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
                    Class1178.Field13314.Method762(TextFormatting.DARK_PURPLE + "Break Alert!", (float)(scaledResolution.getScaledWidth() / 2), (float)(scaledResolution.getScaledHeight() / 2 - Class1178.Method4748()), -1);
                    Class1178.Field13315.Method762(TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!", (float)(scaledResolution.getScaledWidth() / 2), (float)(scaledResolution.getScaledHeight() / 2 + 5), -1);
                }
            }
        }
        else {
            this.Field10722.Method2801();
        }
    }
    
    private ArrayList Method2749() {
        final double n = Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        final double n2 = Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        final int method2750 = this.Method2750(n, false);
        final int method2751 = this.Method2750(n, true);
        final int method2752 = this.Method2750(n2, false);
        final int method2753 = this.Method2750(n2, true);
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (int i = 1; i < method2750 + 1; ++i) {
            list.add(this.Method2752(this.Method2751(), i, 1 + method2752));
            list.add(this.Method2752(this.Method2751(), i, -(1 + method2753)));
        }
        for (int j = 0; j <= method2751; ++j) {
            list.add(this.Method2752(this.Method2751(), -j, 1 + method2752));
            list.add(this.Method2752(this.Method2751(), -j, -(1 + method2753)));
        }
        for (int k = 1; k < method2752 + 1; ++k) {
            list.add(this.Method2752(this.Method2751(), 1 + method2750, k));
            list.add(this.Method2752(this.Method2751(), -(1 + method2751), k));
        }
        for (int l = 0; l <= method2753; ++l) {
            list.add(this.Method2752(this.Method2751(), 1 + method2750, -l));
            list.add(this.Method2752(this.Method2751(), -(1 + method2751), -l));
        }
        return list;
    }
    
    private int Method2750(final double n, final boolean b) {
        if (b) {
            return (n <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4629295593105558319L)) ^ 0x7FEDBCE3A865B81CL)) ? 1 : 0;
        }
        return (n >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1608219652 ^ 0x403659BB42AFAE3FL)) ^ 0x7FD03FDD7B12B45DL)) ? 1 : 0;
    }
    
    private BlockPos Method2751() {
        return new BlockPos(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)580018004 ^ 0x403364B825354FA3L)) ^ 0x7FDAFD219E3E896DL)) ? (Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1645815601 ^ 0x4013A10B86BD8221L)) ^ 0x7FE3A10BE4A4A510L)) : Math.floor(Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class635.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    private BlockPos Method2752(final BlockPos blockPos, double n, double n2) {
        if (blockPos.getX() < 0) {
            n = -n;
        }
        if (blockPos.getZ() < 0) {
            n2 = -n2;
        }
        return blockPos.add(n, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9217310814387042241L)) ^ 0x7FEA7759ABE7F7C1L), n2);
    }
    
    private void Method2753(final Class544 class544) {
        if (class544.Method982() instanceof SPacketBlockBreakAnim) {
            final SPacketBlockBreakAnim sPacketBlockBreakAnim = (SPacketBlockBreakAnim)class544.Method982();
            if (this.Method2749().isEmpty() || !this.Method2749().contains(sPacketBlockBreakAnim.getPosition())) {
                return;
            }
            if (!this.Field10721.contains(sPacketBlockBreakAnim.getPosition()) && sPacketBlockBreakAnim.getProgress() > 0 && sPacketBlockBreakAnim.getProgress() <= 10) {
                this.Field10721.add(sPacketBlockBreakAnim.getPosition());
            }
            else if (sPacketBlockBreakAnim.getProgress() <= 0 || sPacketBlockBreakAnim.getProgress() > 10) {
                this.Field10721.remove(sPacketBlockBreakAnim.getPosition());
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4908 ^ 0xD2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
