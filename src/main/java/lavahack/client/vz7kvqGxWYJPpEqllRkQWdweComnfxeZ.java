/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.spongepowered.asm.mixin.Mixins
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a;
import lavahack.client.UagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8;
import lavahack.client.gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9;
import org.spongepowered.asm.mixin.Mixins;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/plugins/PluginHandler;", "", "()V", "coreModInit", "", "init", "kisman.cc"})
public final class vz7kvqGxWYJPpEqllRkQWdweComnfxeZ {
    private String Field15503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method6264() {
        S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a = S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a, (String)"PluginManager.getInstance()");
        Iterator iterator = s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1850().values().iterator();
        while (iterator.hasNext()) {
            gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = (gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3)iterator.next();
            String[] stringArray = new String[(int)((long)66445819 ^ (long)66445818)];
            int n = (int)505502271L ^ 0x1E215A3F;
            gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33 = gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32;
            Intrinsics.checkExpressionValueIsNotNull((Object)gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33, (String)"config");
            stringArray[n] = gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33.Method6443();
            Mixins.addConfigurations((String[])stringArray);
        }
    }

    public final void Method6265() {
        S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845().Method1848();
        S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a = S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a, (String)"PluginManager.getInstance()");
        Iterator iterator = s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1850().values().iterator();
        while (iterator.hasNext()) {
            gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32;
            gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33 = gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = (gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33, (String)"config");
            UagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8 uagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8 = new UagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8(gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh33);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.add(uagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8);
            uagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8.Method4487().Method3759();
            uagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8.Method4489();
        }
    }

    public vz7kvqGxWYJPpEqllRkQWdweComnfxeZ() {
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9.Method4872();
        S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845().Method1846(S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.class.getClassLoader());
    }

    private static String Method6266(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1791242419 ^ (long)-1791242419);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-802161445 ^ (long)-802161628);
            int n2 = (int)((long)-1793289468 ^ (long)-1793289441) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)805301441L ^ 0x2FFFB198 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

