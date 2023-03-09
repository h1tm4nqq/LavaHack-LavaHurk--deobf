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
import lavahack.client.Class1290;
import lavahack.client.Class1479;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class934;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class430 {
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
        if (!Class32.Field7974) return;
        Class1479 class1479 = Class46.Field8122;
        if (class1479 == null) return;
        if (!class1479.Field14897) return;
        ArrayList arrayList = text.getLeft();
        ArrayList arrayList2 = text.getRight();
        arrayList.add("");
        arrayList.add(Field9794 + class1479.getDebugDimensions());
        arrayList.add(Field9794 + Class934.Field11944.getDebugInfoTileEntities());
        arrayList.add(Field9794 + Class934.Field11944.getDebugInfoRenders());
        RayTraceResult rayTraceResult = Class46.Field8129;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit != RayTraceResult.Type.BLOCK) return;
        BlockPos blockPos2 = rayTraceResult.getBlockPos();
        IBlockState iBlockState = class1479.getBlockState(blockPos2);
        arrayList2.add("");
        arrayList2.add(String.valueOf(Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock())) + Field9795);
        for (String string2 : Class1290.Method5241(iBlockState)) {
            arrayList2.add(string2 + Field9795);
        }
        BlockPos blockPos3 = blockPos2.add((Vec3i)class1479.Field14896);
        string2 = String.format("Looking at: %d %d %d (%d %d %d)", blockPos2.getX(), blockPos2.getY(), blockPos2.getZ(), blockPos3.getX(), blockPos3.getY(), blockPos3.getZ());
        if (this.Field9793.objectMouseOver != null && this.Field9793.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK && blockPos3.equals((Object)(blockPos = this.Field9793.objectMouseOver.getBlockPos()))) {
            string2 = string2 + " (matches)";
        }
        arrayList.add(Field9794 + string2);
    }

    private static String Method2061(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 146;
            cArray2[n] = (char)(cArray[n] ^ (0x2ADB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

