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
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$8
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$8 Field11576 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$8();
    private String Field11577 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method3576(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method3576(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object[] objectArray = new Object[(int)((long)-99511964 ^ (long)-99511963) << 1];
        objectArray[(int)((long)-1661256586 ^ (long)-1661256586)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)729828150L ^ 0x2B804B36);
        objectArray[(int)((long)-23344043 ^ (long)-23344044)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1043624503 ^ (long)1043624502));
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8500.Method930().Method1726(objectArray);
        Object[] objectArray2 = new Object[((int)-1572414855L ^ 0xA246DA78) << 1];
        objectArray2[(int)778256326L ^ 0x2E633FC6] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1378043076 ^ (long)-1378043076));
        objectArray2[(int)-2715056L ^ 0xFFD69251] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-215914014 ^ (long)-215914013));
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8501.Method930().Method1726(objectArray2);
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$8() {
    }

    private static String Method3577(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1312120564 ^ (long)-1312120564);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-707193715 ^ (long)-707193742);
            int n2 = (int)-1691797945L ^ 0x9B29362E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-152920621 ^ (long)-152912140) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

