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
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$5
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$5 Field11547 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$5();
    private String Field11548 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method3554(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method3554(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object[] objectArray = new Object[((int)-120338213L ^ 0xF8D3C8DA) << 1];
        objectArray[(int)((long)408802267 ^ (long)408802267)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)723095629 ^ (long)723095629));
        objectArray[(int)((long)-2043722688 ^ (long)-2043722687)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)249195619 ^ (long)249195618));
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8499.Method929().Method1726(objectArray);
        Object[] objectArray2 = new Object[(int)((long)1239133795 ^ (long)1239133794) << 1];
        objectArray2[(int)281501567L ^ 0x10C75F7F] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1491274354 ^ (long)-1491274354));
        objectArray2[(int)-11836035L ^ 0xFF4B657C] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1111520880L ^ 0xBDBF8991);
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8501.Method929().Method1726(objectArray2);
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$5() {
    }

    private static String Method3555(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)704006255L ^ 0x29F6486F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2016912925L ^ 0x87C8591C);
            int n2 = (int)-1721656416L ^ 0x99619BB3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1119407341 ^ (long)-1119406332) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

