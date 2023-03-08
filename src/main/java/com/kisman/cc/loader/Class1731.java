//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import lavahack.loader.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "processBytes", "", "bytes", "", "invoke" })
final class Class1731 extends Lambda implements Function1
{
    final Ref$ObjectRef Field15938;
    final String Field15939;
    final String Field15940;
    final String Field15941;
    private String Field15942 = "TheKisDevs & LavaHack Development owns you";
    
    public Object invoke(final Object o) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((byte[])o);
        return Unit.INSTANCE;
    }
    
    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull((Object)array, "bytes");
        Class1204.Method4854("Successfully received LavaHack");
        LavaHackLoaderCoreMod.Companion.setLoaded(true);
        Class1204.Method4848(false);
        Class1204.Method4862(array);
        Class1191.Method4796();
        final Class800 class800 = (Class800)this.Field15938.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
        AccountData.Field8161.Method2221(this.Field15939);
        AccountData.Field8161.Method2223(this.Field15940);
        AccountData.Field8161.Method2225(Integer.parseInt(this.Field15941));
        LavaHackLoaderCoreMod.Companion.resume();
    }
    
    Class1731(final Ref$ObjectRef field15938, final String field15939, final String field15940, final String field15941) {
        this.Field15938 = field15938;
        this.Field15939 = field15939;
        this.Field15940 = field15940;
        this.Field15941 = field15941;
        super(1);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E4C ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
