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
import lavahack.client.GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
import lavahack.client.rTJG0nfcS1JpLt6DNhjjGVN31WF21125;
import lavahack.client.rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/ShadersShaders$Shader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "instance", "Lcom/kisman/cc/util/enums/ShadersShaders;", "(Lcom/kisman/cc/util/enums/ShadersShaders;)V", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public final class rTJG0nfcS1JpLt6DNhjjGVN31WF21125$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P {
    private GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh Field15804;
    private final rTJG0nfcS1JpLt6DNhjjGVN31WF21125 Field15805;
    private String Field15806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final rTJG0nfcS1JpLt6DNhjjGVN31WF21125$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method6462(@NotNull @NotNull GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh) {
        Intrinsics.checkParameterIsNotNull((Object)gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, (String)"pattern");
        this.Field15804 = gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
        return this;
    }

    @Override
    public void Method917() {
        GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh = this.Field15804;
        if (gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh == null) {
            Intrinsics.throwNpe();
        }
        this.Field15805.Method1480(gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, this);
    }

    @Override
    public void Method918() {
        GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh = this.Field15804;
        if (gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh == null) {
            Intrinsics.throwNpe();
        }
        this.Field15805.Method1479(gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, this);
    }

    public rTJG0nfcS1JpLt6DNhjjGVN31WF21125$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(@NotNull @NotNull rTJG0nfcS1JpLt6DNhjjGVN31WF21125 rTJG0nfcS1JpLt6DNhjjGVN31WF211252) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)rTJG0nfcS1JpLt6DNhjjGVN31WF211252), (String)"instance");
        super(rTJG0nfcS1JpLt6DNhjjGVN31WF211252.Method1482());
        this.Field15805 = rTJG0nfcS1JpLt6DNhjjGVN31WF211252;
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1704732875L ^ 0x659C28CB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1895574113 ^ (long)1895574174);
            int n2 = (int)1045501186L ^ 0x3E51156F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)752095730 ^ (long)752095335) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

