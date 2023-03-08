//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0005H&j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b?\u0006\t" }, d2 = { "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "", "(Ljava/lang/String;I)V", "list", "", "T", "Entity", "TileEntity", "Hand", "kisman.cc" })
public enum Class1736
{
    Field15965("Entity", 0), 
    Field15966("TileEntity", 1), 
    Field15967("Hand", 2);
    
    private static final Class1736[] Field15968;
    private int Field15969;
    
    @Nullable
    @Nullable
    public abstract List Method1305();
    
    private Class1736(final String name, final int ordinal) {
    }
    
    public Class1736(final String s, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s, n);
    }
    
    private static String Method1306(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x26AF ^ 0xCE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
