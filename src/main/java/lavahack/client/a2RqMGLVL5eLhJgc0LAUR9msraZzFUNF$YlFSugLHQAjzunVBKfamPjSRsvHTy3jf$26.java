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
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$26
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$26 Field9307 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$26();
    private String Field9308 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method1576(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method1576(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object object = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1951623994 ^ (long)-1951623993));
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"arg.fetch<Boolean>(1)");
        if (((Boolean)object).booleanValue()) {
            return null;
        }
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.rotationYaw = ((float[])z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)932147793 ^ (long)932147793)))[(int)((long)-1574237760 ^ (long)-1574237760)];
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.rotationYawHead = ((float[])z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1126379929L ^ 0xBCDCCE67))[(int)((long)1346326459 ^ (long)1346326459)];
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.renderYawOffset = ((float[])z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)27014589L ^ 0x19C35BD))[(int)936142303L ^ 0x37CC65DF];
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.rotationPitch = ((float[])z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1325987037L ^ 0x4F08F4DD))[(int)((long)826601464 ^ (long)826601465)];
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$26() {
    }

    private static String Method1577(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-951098845L ^ 0xC74F6223;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1914569113 ^ (long)1914569062);
            int n2 = (int)((long)1244624129 ^ (long)1244624252);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1422032963 ^ (long)-1422053730) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

