/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K;
import lavahack.client.x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/subsystem/SubSystemManager;", "", "()V", "subsystems", "", "Lcom/kisman/cc/features/subsystem/SubSystem;", "getSubsystems", "()Ljava/util/List;", "setSubsystems", "(Ljava/util/List;)V", "init", "", "kisman.cc"})
public final class w9yoWrhYfanbmeXFvDRBCxqulYbR2bTN {
    @NotNull
    private List Field11684;
    private String Field11685 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final List Method3668() {
        return this.Field11684;
    }

    public final void Method3669(@NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"<set-?>");
        this.Field11684 = list;
    }

    public final void Method3670() {
        Iterator iterator = this.Field11684.iterator();
        while (iterator.hasNext()) {
            cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx2 = (cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx)iterator.next();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Subsystem Manager: Initializing \"" + cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx2.Method1063() + "\" subsystem!");
            cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx2.Method1060();
        }
    }

    public w9yoWrhYfanbmeXFvDRBCxqulYbR2bTN() {
        Object[] objectArray = new cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx[((int)1874425116L ^ 0x6FB9751D) << 1];
        objectArray[(int)-701586070L ^ 0xD62EA56A] = lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K.Field15860;
        objectArray[(int)((long)1279809204 ^ (long)1279809205)] = x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN.Field8964;
        this.Field11684 = CollectionsKt.listOf((Object[])objectArray);
    }

    private static String Method3671(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1528816393L ^ 0xA4E01CF7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)560755336 ^ (long)560755319);
            int n2 = (int)((long)957231749 ^ (long)957231684);
            cArray2[n] = (char)(cArray[n] ^ (((int)1726155718L ^ 0x66E30DB9) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

