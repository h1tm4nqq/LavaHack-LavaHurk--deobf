//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DO10dYPePXo8COr6afE85sGACRIzqf8t {
    private final Minecraft Field9793 = Minecraft.getMinecraft();
    private static final String Field9794 = "[" + TextFormatting.GOLD + "Schematica" + TextFormatting.RESET + "] ";
    private static final String Field9795 = " [" + TextFormatting.GOLD + "S" + TextFormatting.RESET + "]";
    private String Field9796 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public void Method2060(RenderGameOverlayEvent.Text text) {
        BlockPos blockPos;
        String string2;
        if (!this.Field9793.gameSettings.showDebugInfo) return;
        if (!Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7974) return;
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) return;
        if (!oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897) return;
        ArrayList arrayList = text.getLeft();
        ArrayList arrayList2 = text.getRight();
        arrayList.add("");
        arrayList.add(Field9794 + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getDebugDimensions());
        arrayList.add(Field9794 + YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.getDebugInfoTileEntities());
        arrayList.add(Field9794 + YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.getDebugInfoRenders());
        RayTraceResult rayTraceResult = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8129;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit != RayTraceResult.Type.BLOCK) return;
        BlockPos blockPos2 = rayTraceResult.getBlockPos();
        IBlockState iBlockState = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getBlockState(blockPos2);
        arrayList2.add("");
        arrayList2.add(String.valueOf(Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock())) + Field9795);
        for (String string2 : cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5241(iBlockState)) {
            arrayList2.add(string2 + Field9795);
        }
        BlockPos blockPos3 = blockPos2.add((Vec3i)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896);
        Object[] objectArray = new Object[(int)((long)-1564171177 ^ (long)-1564171180) << 1];
        objectArray[(int)((long)-341716278 ^ (long)-341716278)] = blockPos2.getX();
        objectArray[(int)1347595676L ^ 0x5052AD9D] = blockPos2.getY();
        objectArray[((int)1118837453L ^ 0x42B01ACC) << 1] = blockPos2.getZ();
        objectArray[(int)((long)458950748 ^ (long)458950751)] = blockPos3.getX();
        objectArray[(int)((long)507913573 ^ (long)507913572) << 2] = blockPos3.getY();
        objectArray[(int)((long)1111805981 ^ (long)1111805976)] = blockPos3.getZ();
        string2 = String.format("Looking at: %d %d %d (%d %d %d)", objectArray);
        if (this.Field9793.objectMouseOver != null && this.Field9793.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK && blockPos3.equals((Object)(blockPos = this.Field9793.objectMouseOver.getBlockPos()))) {
            string2 = string2 + " (matches)";
        }
        arrayList.add(Field9794 + string2);
    }

    private static String Method2061(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)604764962L ^ 0x240BFB22;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)422219015 ^ (long)422219256);
            int n2 = (int)((long)-186255654 ^ (long)-186255725) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2034478513L ^ 0x7943876A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

