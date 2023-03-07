//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.multiplayer.WorldClient
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.APtPrB112pn7h48gEC65Bh3MdL3vmTuU;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.client.multiplayer.WorldClient;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$24
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$24 Field9311 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$24();
    private int Field9312;

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method1580(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    public final float[] Method1580(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object object = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1795184512 ^ (long)-1795184511));
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        switch (APtPrB112pn7h48gEC65Bh3MdL3vmTuU.Field12044[((Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG)((Object)object)).ordinal()]) {
            case 1: {
                WorldClient worldClient = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().world;
                Object object2 = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)253151401 ^ (long)253151401));
                Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"arg.fetch(0)");
                float[] fArray = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6179(worldClient.getEntityByID(((Number)object2).intValue()));
                return fArray;
            }
            case 2: {
                WorldClient worldClient = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().world;
                Object object3 = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-399663853 ^ (long)-399663853));
                Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"arg.fetch(0)");
                float[] fArray = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6163(worldClient.getEntityByID(((Number)object3).intValue()));
                return fArray;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$24() {
    }

    private static String Method1581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)540021048 ^ (long)540021048);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-670927364 ^ (long)-670927613);
            int n2 = (int)((long)-575154318 ^ (long)-575154387) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)802047704L ^ 0x2FCE6CE7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

