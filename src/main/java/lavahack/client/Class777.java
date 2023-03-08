//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public class Class777
{
    private String Field11288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Iterable Method3238(final BlockPos blockPos, final BlockPos blockPos2) {
        return Method3239(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }
    
    public static Iterable Method3239(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return (Iterable)new Class456(new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6)), new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6)));
    }
    
    public static Iterable Method3240(final BlockPos blockPos, final BlockPos blockPos2) {
        return Method3241(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }
    
    public static Iterable Method3241(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return (Iterable)new Class458(new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6)), new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6)));
    }
    
    public static Iterable Method3242(final BlockPos blockPos, final BlockPos blockPos2) {
        return Method3243(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
    }
    
    public static Iterable Method3243(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return (Iterable)new Class457(new BlockPos(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6)), new BlockPos(Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6)));
    }
}
