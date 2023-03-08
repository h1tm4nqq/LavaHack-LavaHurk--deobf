//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.net.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bR\u0011\u0010\u0002\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/net/URLReader;", "", "url", "", "(Ljava/lang/String;)V", "Ljava/net/URL;", "(Ljava/net/URL;)V", "getUrl", "()Ljava/net/URL;", "get", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kisman.cc" })
public final class Class1890
{
    @NotNull
    private final URL Field16706;
    private int Field16707;
    
    @NotNull
    @NotNull
    public final ArrayList Method6999() {
        final ArrayList<String> list = new ArrayList<String>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.Field16706.openStream()));
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        while (true) {
            final String line = bufferedReader.readLine();
            final Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
            final String element = line;
            Intrinsics.checkExpressionValueIsNotNull((Object)element, "it");
            ref$ObjectRef2.element = element;
            if (line == null) {
                break;
            }
            list.add((String)ref$ObjectRef.element);
        }
        return list;
    }
    
    @NotNull
    @NotNull
    public final URL Method7000() {
        return this.Field16706;
    }
    
    public Class1890(@NotNull @NotNull final URL field16706) {
        Intrinsics.checkParameterIsNotNull((Object)field16706, "url");
        this.Field16706 = field16706;
    }
    
    public Class1890(@NotNull @NotNull final String spec) {
        Intrinsics.checkParameterIsNotNull((Object)spec, "url");
        this(new URL(spec));
    }
    
    private static String Method7001(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C73 ^ 0x49));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
