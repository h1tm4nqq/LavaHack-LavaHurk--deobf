//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.nio.*;
import lavahack.loader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016?\u0006\b" }, d2 = { "com/kisman/cc/loader/LoaderKt$load$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc" })
public final class Class810 implements Class122
{
    final Class1731 Field11452;
    private String Field11453 = "TheKisDevs & LavaHack Development owns you";
    
    public void Method852(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
        String s2 = null;
        Label_0114: {
            switch (s.hashCode()) {
                case 48: {
                    if (s.equals("0")) {
                        s2 = "Invalid arguments of \"getpublicjar\" command!";
                        break Label_0114;
                    }
                    break;
                }
                case 49: {
                    if (s.equals("1")) {
                        s2 = "Invalid key or HWID | Loader is outdated!";
                        break Label_0114;
                    }
                    break;
                }
                case 50: {
                    if (s.equals("2")) {
                        s2 = "Key and HWID is valid!";
                        break Label_0114;
                    }
                    break;
                }
                case 51: {
                    if (s.equals("3")) {
                        s2 = "You have no access for selected version!";
                        break Label_0114;
                    }
                    break;
                }
            }
            s2 = "Invalid answer of \"getpublicjar\" command";
        }
        Class1204.Method4854(s2);
    }
    
    public void Method853(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "buff");
        final Class1731 field11452 = this.Field11452;
        final byte[] array = byteBuffer.array();
        Intrinsics.checkExpressionValueIsNotNull((Object)array, "buff.array()");
        final Class1441 method6626 = new Class1743(array).Method6626();
        if (method6626 == null) {
            Intrinsics.throwNpe();
        }
        field11452.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(method6626.Method5752());
    }
    
    Class810(final Class1731 field11452) {
        this.Field11452 = field11452;
    }
    
    private static String Method3406(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5F69 ^ 0x2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
