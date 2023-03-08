//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;
import kotlin.*;
import lavahack.loader.*;
import java.nio.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016?\u0006\b" }, d2 = { "com/kisman/cc/loader/LoaderKt$versions$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc" })
public final class Class865 implements Class122
{
    final Ref$ObjectRef Field11643;
    private int Field11644;
    
    public void Method852(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList: raw answer is \"" + str + '\"');
        Label_0217: {
            switch (str.hashCode()) {
                case 48: {
                    if (str.equals("0")) {
                        Class1204.Method4854("Invalid arguments of \"getversions\" command!");
                        break Label_0217;
                    }
                    break;
                }
                case 49: {
                    if (str.equals("1")) {
                        Class1204.Method4854("Invalid loader version!");
                        break Label_0217;
                    }
                    break;
                }
            }
            if (StringsKt.startsWith$default(str, "2", false, 2, (Object)null)) {
                Class1204.Method4854("Successfully received version list");
                final Object[] array = StringsKt.split$default((CharSequence)StringsKt.split$default((CharSequence)str, new String[] { "|" }, false, 0, 6, (Object)null).get(1), new String[] { "&" }, false, 0, 6, (Object)null).toArray(new String[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Class1204.Method4840((String[])array);
                Class1204.Method4852(true);
            }
        }
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(Class1204.Method4853());
        if (Intrinsics.areEqual((Object)Class1204.Method4853(), (Object)"Successfully received version list") ^ true) {
            Class1214.Method4886();
        }
        final Class800 class800 = (Class800)this.Field11643.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
    }
    
    public void Method853(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "buff");
    }
    
    Class865(final Ref$ObjectRef field11643) {
        this.Field11643 = field11643;
    }
    
    private static String Method3657(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x75C ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
