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
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$11
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$11 Field9360 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$11();
    private String Field9361 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method1629(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method1629(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object[] objectArray = new Object[(int)((long)-851444721 ^ (long)-851444722) << 1];
        objectArray[(int)((long)-420521 ^ (long)-420521)] = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)625707494 ^ (long)625707494));
        objectArray[(int)((long)-127353118 ^ (long)-127353117)] = ((int)-1691338601L ^ 0x9B303897) != 0;
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8500.Method929().Method1726(objectArray);
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$11() {
    }

    private static String Method1630(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-462005332 ^ (long)-462005332);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1222717482 ^ (long)1222717653);
            int n2 = (int)((long)-1346452083 ^ (long)-1346452076);
            cArray2[n] = (char)(cArray[n] ^ (((int)-458023214L ^ 0xE4B31A4F) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

