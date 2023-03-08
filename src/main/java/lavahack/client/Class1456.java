//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/enums/BlockESPBlocks;", "", "handler", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "(Ljava/lang/String;ILcom/kisman/cc/util/interfaces/Validable;)V", "getHandler", "()Lcom/kisman/cc/util/interfaces/Validable;", "Web", "NetherPortal", "EndPortal", "Burrow", "kisman.cc" })
public enum Class1456
{
    Field14811("Web", 0, (Class1776)new Class1319()), 
    Field14812("NetherPortal", 1, (Class1776)new Class1318()), 
    Field14813("EndPortal", 2, (Class1776)new Class1322()), 
    Field14814("Burrow", 3, (Class1776)new Class1321());
    
    private static final Class1456[] Field14815;
    @NotNull
    private final Class1776 Field14816;
    private int Field14817;
    
    @NotNull
    @NotNull
    public final Class1776 Method5813() {
        return this.Field14816;
    }
    
    private Class1456(final String name, final int ordinal, final Class1776 field14816) {
        this.Field14816 = field14816;
    }
    
    private static String Method5814(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62C6 ^ 0xB5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
