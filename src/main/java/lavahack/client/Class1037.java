//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004?\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002H\u0016?\u0006\u0002\u0010\u0007?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedBooleanSupplier;", "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Boolean;", "kisman.cc" })
public final class Class1037 extends Class904
{
    private String Field12567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Boolean Method4228() {
        final Boolean b = (Boolean)super.Method3751();
        return b != null && b;
    }
    
    @Override
    public Object Method3751() {
        return this.Method4228();
    }
    
    public Class1037(@NotNull @NotNull final Function0 function0) {
        Intrinsics.checkParameterIsNotNull((Object)function0, "get0");
        super(function0);
    }
    
    private static String Method3754(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3FBF ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
