//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil;", "", "()V", "Companion", "kisman.cc"})
public final class wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L {
    private static final Minecraft Field17019;
    @NotNull
    private static NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE Field17020;
    public static final wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17021;
    private String Field17022 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field17021 = new wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Minecraft minecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"Minecraft.getMinecraft()");
        Field17019 = minecraft;
        Supplier supplier = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14453.Method5302();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14447;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"AutoRer.instance.placeRange");
        Supplier supplier2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method394();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier2, (String)"AutoRer.instance.placeRange.supplierFloat");
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, (String)"AutoRer.instance");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14451;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"AutoRer.instance.targetRange");
        Supplier supplier3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier3, (String)"AutoRer.instance.targetRange.supplierDouble");
        Field17020 = new NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE(supplier, supplier2, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, supplier3, wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field11767, wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14874);
    }

    public static final NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE Method7266() {
        return Field17020;
    }

    public static final void Method7267(NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE nREDuDbOBX0uUenjamC4Fz7tEkLPv8mE) {
        Field17020 = nREDuDbOBX0uUenjamC4Fz7tEkLPv8mE;
    }

    public static final Minecraft Method7268() {
        return Field17019;
    }

    private static String Method7269(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1979549950 ^ (long)1979549950);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1397584902L ^ 0x534D74F9);
            int n2 = (int)1727806666L ^ 0x66FC3C77;
            cArray2[n] = (char)(cArray[n] ^ (((int)-215094764L ^ 0xF32DE8D9) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

