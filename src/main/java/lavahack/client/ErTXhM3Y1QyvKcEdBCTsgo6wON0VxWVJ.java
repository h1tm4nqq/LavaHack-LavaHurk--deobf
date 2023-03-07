//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.eXIEwpfsveJ6FwbLoefTKstatmuKRSOh;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/module/misc/WebhookSpammer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "debug", "delay", "timer", "Lcom/kisman/cc/util/TimerUtils;", "isBeta", "", "onEnable", "", "update", "kisman.cc"})
public final class ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17912 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Embed Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-372967989 ^ (long)-372968140), (int)((long)1675460641 ^ (long)1675460641), (int)-1256592216L ^ 0xB519ECA8));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17913 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4F6164730D6D835DL ^ 0xFEE24730D6D835DL), 0.0, Double.longBitsToDouble((long)295762095 ^ 0x40C3880011A0F8AFL), ((int)-2057089471L ^ 0x85634E40) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17914 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1955116241 ^ (long)-1955116241));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17915 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field17916 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        this.Field17915.Method2801();
    }

    @Override
    public boolean Method52() {
        return ((int)-1569427477L ^ 0xA2746FEA) != 0;
    }

    @Override
    public void Method45() {
        if (ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ.Method7809().player == null) return;
        if (ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ.Method7809().world == null) return;
        if (!this.Field17915.Method2797(this.Field17913.Method369())) {
            return;
        }
        this.Field17915.Method2801();
    }

    public ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ() {
        super("WebhookSpammer", "Using discord webhook for spamming", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ.Method7811().Method7569(this.Field17912);
        ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ.Method7811().Method7569(this.Field17913);
        ErTXhM3Y1QyvKcEdBCTsgo6wON0VxWVJ.Method7811().Method7569(this.Field17914);
    }

    public static final Minecraft Method7809() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7810(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final eXIEwpfsveJ6FwbLoefTKstatmuKRSOh Method7811() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8053;
    }

    public static final void Method7812(eXIEwpfsveJ6FwbLoefTKstatmuKRSOh eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8053 = eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1384337625 ^ (long)-1384337625);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-487047133L ^ 0xE2F840DC);
            int n2 = (int)((long)-1357473005 ^ (long)-1357472934) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)977038879L ^ 0x3A3C28BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

