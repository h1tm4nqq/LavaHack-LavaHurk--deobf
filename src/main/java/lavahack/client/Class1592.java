//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/util/enums/DiagonalDirections;", "", "direction1", "Lnet/minecraft/util/EnumFacing;", "direction2", "displayName", "", "(Ljava/lang/String;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Ljava/lang/String;)V", "getDirection1", "()Lnet/minecraft/util/EnumFacing;", "getDirection2", "getDisplayName", "()Ljava/lang/String;", "toString", "XpZp", "XmZm", "XpZm", "XmZp", "kisman.cc" })
public enum Class1592
{
    Field15448("XpZp", 0, EnumFacing.EAST, EnumFacing.SOUTH, "X+ Z+"), 
    Field15449("XmZm", 1, EnumFacing.WEST, EnumFacing.NORTH, "X- Z-"), 
    Field15450("XpZm", 2, EnumFacing.EAST, EnumFacing.NORTH, "X+ Z-"), 
    Field15451("XmZp", 3, EnumFacing.WEST, EnumFacing.SOUTH, "X- Z+");
    
    private static final Class1592[] Field15452;
    @NotNull
    private final EnumFacing Field15453;
    @NotNull
    private final EnumFacing Field15454;
    @NotNull
    private final String Field15455;
    private String Field15456 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field15455;
    }
    
    @NotNull
    @NotNull
    public final EnumFacing Method6249() {
        return this.Field15453;
    }
    
    @NotNull
    @NotNull
    public final EnumFacing Method6250() {
        return this.Field15454;
    }
    
    @NotNull
    @NotNull
    public final String Method6251() {
        return this.Field15455;
    }
    
    private Class1592(final String name, final int ordinal, final EnumFacing field15453, final EnumFacing field15454, final String field15455) {
        this.Field15453 = field15453;
        this.Field15454 = field15454;
        this.Field15455 = field15455;
    }
    
    private static String Method6252(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x21ED ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
