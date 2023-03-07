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
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$7
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$7 Field11571 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$7();
    private String Field11572 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method3571(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method3571(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object[] objectArray = new Object[(int)((long)1438097299 ^ (long)1438097298) << 1];
        objectArray[(int)-921545735L ^ 0xC91253F9] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)697987253L ^ 0x299A70B5);
        objectArray[(int)15910210L ^ 0xF2C543] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1283083734L ^ 0xB385B22B);
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8500.Method929().Method1726(objectArray);
        Object[] objectArray2 = new Object[(int)((long)-2008694 ^ (long)-2008693) << 1];
        objectArray2[(int)((long)-1279990798 ^ (long)-1279990798)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1137023494 ^ (long)-1137023494));
        objectArray2[(int)1283326269L ^ 0x4C7E013C] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)2064285629L ^ 0x7B0A7FBC);
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8501.Method929().Method1726(objectArray2);
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$7() {
    }

    private static String Method3572(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1125089781L ^ 0xBCF07E0B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-617155845 ^ (long)-617156092);
            int n2 = (int)((long)1745358444 ^ (long)1745358537);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1368141102 ^ (long)1368143219) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

