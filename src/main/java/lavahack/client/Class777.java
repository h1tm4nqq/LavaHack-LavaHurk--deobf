//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.Class456;
import lavahack.client.Class457;
import lavahack.client.Class458;
import net.minecraft.util.math.BlockPos;

public class Class777 {
    private String Field11288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Iterable Method3238(BlockPos blockPos, BlockPos blockPos2) {
        return Class777.Method3239(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3239(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new Class456(blockPos, blockPos2);
    }

    public static Iterable Method3240(BlockPos blockPos, BlockPos blockPos2) {
        return Class777.Method3241(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3241(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new Class458(blockPos, blockPos2);
    }

    public static Iterable Method3242(BlockPos blockPos, BlockPos blockPos2) {
        return Class777.Method3243(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }

    public static Iterable Method3243(int n, int n2, int n3, int n4, int n5, int n6) {
        BlockPos blockPos = new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6));
        BlockPos blockPos2 = new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
        return new Class457(blockPos, blockPos2);
    }
}

