//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$23
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$23 Field9313 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$23();
    private String Field9314 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method1582(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method1582(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object object = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-236331522L ^ 0xF1E9DDFF);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"arg.fetch<Boolean>(1)");
        if (((Boolean)object).booleanValue()) {
            return null;
        }
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.rotationYaw = ((JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1694505903L ^ 0x9AFFE451)).Method7785();
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.rotationPitch = ((JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1437198228 ^ (long)1437198228))).Method7787();
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$23() {
    }

    private static String Method1583(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1262928117L ^ 0xB4B93F0B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)904003366 ^ (long)904003545);
            int n2 = (int)((long)-888141775 ^ (long)-888141578);
            cArray2[n] = (char)(cArray[n] ^ ((int)1842377759L ^ 0x6DD04BCC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

