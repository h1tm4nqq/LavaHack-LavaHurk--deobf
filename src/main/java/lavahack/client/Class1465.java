//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/minecraft/ResourceLocationHandler;", "Lnet/minecraft/util/ResourceLocation;", "name", "", "shader", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getShader", "toString", "kisman.cc" })
public final class Class1465 extends ResourceLocation
{
    @NotNull
    private final String Field14847;
    @NotNull
    private final String Field14848;
    private String Field14849 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public String toString() {
        return this.Field14847;
    }
    
    @NotNull
    @NotNull
    public final String getName() {
        return this.Field14847;
    }
    
    @NotNull
    @NotNull
    public final String getShader() {
        return this.Field14848;
    }
    
    public Class1465(@NotNull @NotNull final String field14847, @NotNull @NotNull final String field14848) {
        Intrinsics.checkParameterIsNotNull((Object)field14847, "name");
        Intrinsics.checkParameterIsNotNull((Object)field14848, "shader");
        super("another:resource");
        this.Field14847 = field14847;
        this.Field14848 = field14848;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F64 ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
