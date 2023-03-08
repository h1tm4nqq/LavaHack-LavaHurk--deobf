//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/gui/other/search/SearchGui$Companion;", "", "()V", "nameMode", "Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "getNameMode", "()Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "setNameMode", "(Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;)V", "resolutionX", "", "getResolutionX", "()I", "setResolutionX", "(I)V", "kisman.cc" })
public final class Class201
{
    private int Field8880;
    
    @NotNull
    @NotNull
    public final Class1854 Method1192() {
        return Class1000.access$getNameMode$cp();
    }
    
    public final void Method1193(@NotNull @NotNull final Class1854 class1854) {
        Intrinsics.checkParameterIsNotNull((Object)class1854, "<set-?>");
        Class1000.access$setNameMode$cp(class1854);
    }
    
    public final int Method1194() {
        return Class1000.access$getResolutionX$cp();
    }
    
    public final void Method1195(final int n) {
        Class1000.access$setResolutionX$cp(n);
    }
    
    private Class201() {
    }
    
    public Class201(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1196(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C59 ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
