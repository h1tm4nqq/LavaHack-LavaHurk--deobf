//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.TypeIntrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.TypeIntrinsics;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/ShadersObjectTypes$Entity;", "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "list", "", "T", "kisman.cc"})
final class mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV {
    private int Field12520;

    @Override
    @NotNull
    @NotNull
    public List Method1305() {
        List list = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.loadedEntityList;
        if (list != null) return TypeIntrinsics.asMutableList((Object)list);
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
    }

    mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string, int n) {
    }

    private static String Method1306(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1676779312 ^ (long)1676779312);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2134679759 ^ (long)2134679600);
            int n2 = ((int)-554726632L ^ 0xDEEF8B07) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-493237738L ^ 0xE299CD41) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

