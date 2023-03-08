//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import lavahack.loader.*;
import java.nio.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016?\u0006\b" }, d2 = { "com/kisman/cc/loader/LoaderKt$versionCheck$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc" })
public final class Class1978 implements Class122
{
    final Ref$ObjectRef Field17106;
    private String Field17107 = "TheKisDevs & LavaHack Development owns you";
    
    public void Method852(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck: raw answer is \"" + str + '\"');
        String s = null;
        Label_0125: {
            switch (str.hashCode()) {
                case 48: {
                    if (str.equals("0")) {
                        s = "Invalid arguments of \"checkversion\" command!";
                        break Label_0125;
                    }
                    break;
                }
                case 49: {
                    if (str.equals("1")) {
                        s = "Your loader is outdated! Please update it!";
                        break Label_0125;
                    }
                    break;
                }
                case 50: {
                    if (str.equals("2")) {
                        s = "Loader is on latest version!";
                        break Label_0125;
                    }
                    break;
                }
            }
            s = "kill yourself <3";
        }
        Class1204.Method4854(s);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(Class1204.Method4853());
        if (Intrinsics.areEqual((Object)str, (Object)"2") ^ true) {
            Class1214.Method4886();
        }
        Class1204.Method4850(true);
        final Class800 class800 = (Class800)this.Field17106.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
    }
    
    public void Method853(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "buff");
    }
    
    Class1978(final Ref$ObjectRef field17106) {
        this.Field17106 = field17106;
    }
    
    private static String Method7319(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3272 ^ 0x71));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
