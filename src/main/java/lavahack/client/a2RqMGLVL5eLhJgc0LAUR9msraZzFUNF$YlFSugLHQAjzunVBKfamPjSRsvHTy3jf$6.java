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
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$6
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$6 Field11551 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$6();
    private String Field11552 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method3556(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method3556(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object[] objectArray = new Object[((int)815262184L ^ 0x3097E9E9) << 1];
        objectArray[(int)((long)1973376402 ^ (long)1973376402)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1528219107L ^ 0xA4E93A1D);
        objectArray[(int)39873620L ^ 0x2606C55] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)605462087 ^ (long)605462086));
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8499.Method930().Method1726(objectArray);
        Object[] objectArray2 = new Object[(int)((long)310529034 ^ (long)310529035) << 1];
        objectArray2[(int)((long)-108134748 ^ (long)-108134748)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)627174365L ^ 0x2561EBDD);
        objectArray2[(int)449241335L ^ 0x1AC6E0F6] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-395238722L ^ 0xE87122BF);
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8501.Method930().Method1726(objectArray2);
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$6() {
    }

    private static String Method3557(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-294762259L ^ 0xEE6E48ED;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)156339657 ^ (long)156339510);
            int n2 = (int)((long)1620442970 ^ (long)1620443085);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1071562181L ^ 0xC0212CD6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

