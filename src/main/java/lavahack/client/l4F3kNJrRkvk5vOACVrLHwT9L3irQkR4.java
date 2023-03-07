//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3;
import net.minecraft.util.math.BlockPos;

public class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4 {
    private String Field11288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Iterable Method3238(BlockPos blockPos, BlockPos blockPos2) {
        return l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3239(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3239(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1(blockPos, blockPos2);
    }

    public static Iterable Method3240(BlockPos blockPos, BlockPos blockPos2) {
        return l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3241(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3241(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2(blockPos, blockPos2);
    }

    public static Iterable Method3242(BlockPos blockPos, BlockPos blockPos2) {
        return l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3243(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3243(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3(blockPos, blockPos2);
    }
}

