/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.kisman.cc.util;

import com.kisman.cc.util.AccountData;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import com.kisman.cc.util.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import com.kisman.cc.util.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"runnables", "", "Ljava/lang/Runnable;", "check", "", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private static List Field8845;
    private String Field8846 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method1148() {
        if (AccountData.Field8161.Method2220() != null && AccountData.Field8161.Method2222() != null) {
            Object object = AccountData.Field8161.Method2226();
            int n = (int)((long)-1389367295 ^ (long)-1389367295);
            int n2 = object.length() == 0 ? (int)1770976665L ^ 0x698EF598 : (int)-1054685563L ^ 0xC122C685;
            object = AccountData.Field8161.Method2228();
            n = (int)((long)2144658476 ^ (long)2144658476);
            int n3 = ((Object)object).length == 0 ? (int)-228963126L ^ 0xF25A4CCB : (int)-1140547704L ^ 0xBC049F88;
            agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3718().get(AccountData.Field8161.Method2226());
            object = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi((leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object);
            int n4 = (int)((long)-1193336558 ^ (long)-1193336558);
            int n5 = (int)-18482593L ^ 0xFEE5FA5F;
            Runnable runnable = leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
            int n6 = (int)1495518408L ^ 0x5923CCC8;
            Field8845.add(runnable);
            ((Runnable)leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).run();
            return;
        }
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Error Code: 0x0003");
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6791();
    }

    static {
        int n = (int)((long)532705467 ^ (long)532705467);
        Field8845 = new ArrayList();
    }

    public static final List Method1149() {
        return Field8845;
    }

    public static final void Method1150(List list) {
        Field8845 = list;
    }

    private static String Method1151(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1803490703 ^ (long)1803490703);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1614169907 ^ (long)-1614170062);
            int n2 = (int)((long)1942615807 ^ (long)1942615726) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)931496296 ^ (long)931503055) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

