/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.kisman.cc.util;

import com.kisman.cc.util.AccountData;
import com.kisman.cc.util.Class2118;
import com.kisman.cc.util.Class76;
import com.kisman.cc.util.Class886;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lavahack.client.Class1796;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"runnables", "", "Ljava/lang/Runnable;", "check", "", "kisman.cc"})
public final class Class191 {
    private static List Field8845;
    private String Field8846 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method1148() {
        if (AccountData.Field8161.Method2220() != null && AccountData.Field8161.Method2222() != null) {
            Object object = AccountData.Field8161.Method2226();
            boolean bl = false;
            boolean bl2 = object.length() == 0;
            object = AccountData.Field8161.Method2228();
            bl = false;
            boolean bl3 = ((Object)object).length == 0;
            Class886.Method3718().get(AccountData.Field8161.Method2226());
            object = new Class76();
            Class2118 class2118 = new Class2118((Class76)object);
            boolean bl4 = false;
            boolean bl5 = false;
            Runnable runnable = class2118;
            boolean bl6 = false;
            Field8845.add(runnable);
            ((Runnable)class2118).run();
            return;
        }
        Class1796.Field16243.error("Error Code: 0x0003");
        Class1796.Method6791();
    }

    static {
        boolean bl = false;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 162;
            cArray2[n] = (char)(cArray[n] ^ (0x1AA7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

