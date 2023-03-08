//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/GLSLMenuShaders;", "", "file", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFile", "()Ljava/lang/String;", "path", "SquaresHighway", "VoxelPacMan", "Squares2", "kisman.cc" })
public enum Class116
{
    Field8407("SquaresHighway", 0, "squares_highway.fsh"), 
    Field8408("VoxelPacMan", 1, "voxel_pac_man.fsh"), 
    Field8409("Squares2", 2, "squares2.fsh");
    
    private static final Class116[] Field8410;
    @NotNull
    private final String Field8411;
    private String Field8412 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method841() {
        return "assets/kismancc/shader/glslmenu/shaders/" + this.Field8411;
    }
    
    @NotNull
    @NotNull
    public final String Method842() {
        return this.Field8411;
    }
    
    private Class116(final String name, final int ordinal, final String field8411) {
        this.Field8411 = field8411;
    }
    
    private static String Method843(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7617 ^ 0xAC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
