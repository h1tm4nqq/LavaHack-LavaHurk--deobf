//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraftforge.client.event.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.text.*;

public class Class430
{
    private final Minecraft Field9793;
    private static final String Field9794;
    private static final String Field9795;
    private String Field9796 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class430() {
        this.Field9793 = Minecraft.getMinecraft();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2060(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (this.Field9793.gameSettings.showDebugInfo && Class32.Field7974) {
            final Class1479 field8122 = Class46.Field8122;
            if (field8122 != null && field8122.Field14897) {
                final ArrayList left = renderGameOverlayEvent$Text.getLeft();
                final ArrayList right = renderGameOverlayEvent$Text.getRight();
                left.add("");
                left.add(Class430.Field9794 + field8122.getDebugDimensions());
                left.add(Class430.Field9794 + Class934.Field11944.getDebugInfoTileEntities());
                left.add(Class430.Field9794 + Class934.Field11944.getDebugInfoRenders());
                final RayTraceResult field8123 = Class46.Field8129;
                if (field8123 != null && field8123.typeOfHit == RayTraceResult$Type.BLOCK) {
                    final BlockPos getBlockPos = field8123.getBlockPos();
                    final IBlockState getBlockState = field8122.getBlockState(getBlockPos);
                    right.add("");
                    right.add(String.valueOf(Block.REGISTRY.getNameForObject((Object)getBlockState.getBlock())) + Class430.Field9795);
                    final Iterator iterator = Class1290.Method5241(getBlockState).iterator();
                    while (iterator.hasNext()) {
                        right.add(iterator.next() + Class430.Field9795);
                    }
                    final BlockPos add = getBlockPos.add((Vec3i)field8122.Field14896);
                    String s = String.format("Looking at: %d %d %d (%d %d %d)", getBlockPos.getX(), getBlockPos.getY(), getBlockPos.getZ(), add.getX(), add.getY(), add.getZ());
                    if (this.Field9793.objectMouseOver != null && this.Field9793.objectMouseOver.typeOfHit == RayTraceResult$Type.BLOCK && add.equals((Object)this.Field9793.objectMouseOver.getBlockPos())) {
                        s += " (matches)";
                    }
                    left.add(Class430.Field9794 + s);
                }
            }
        }
    }
    
    static {
        Field9794 = "[" + TextFormatting.GOLD + "Schematica" + TextFormatting.RESET + "] ";
        Field9795 = " [" + TextFormatting.GOLD + "S" + TextFormatting.RESET + "]";
    }
    
    private static String Method2061(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2ADB ^ 0x92));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
