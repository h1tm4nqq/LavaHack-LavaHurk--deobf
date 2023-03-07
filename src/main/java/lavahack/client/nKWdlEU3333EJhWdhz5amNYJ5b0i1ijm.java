//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0006\u0010\b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"dotTimer", "Lcom/kisman/cc/util/TimerUtils;", "dots", "", "undTimer", "disconnect", "", "getDots", "getUnderscore", "kisman.cc"})
public final class nKWdlEU3333EJhWdhz5amNYJ5b0i1ijm {
    private static final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17842 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private static final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17843 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private static String Field17844 = "";
    private String Field17845 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method7738() {
        NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.player.connection");
        netHandlerPlayClient.getNetworkManager().closeChannel((ITextComponent)new TextComponentString("kill yourself"));
    }

    @NotNull
    @NotNull
    public static final String Method7739() {
        if (Field17842.Method2797(0x689F5L & 0x750851F4L)) {
            Field17844 = Field17844 + ".";
            Field17842.Method2801();
        }
        if (Field17844.length() <= ((int)1988771952L ^ 0x768A4073)) return Field17844;
        Field17844 = "";
        return Field17844;
    }

    @NotNull
    @NotNull
    public static final String Method7740() {
        if (!Field17843.Method2797(0x318047F4L & 0x441021FCL)) {
            return "_";
        }
        if (!Field17843.Method2797(0x233FDL & 0xE803E8L)) return "";
        Field17843.Method2801();
        return "";
    }

    private static String Method7741(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-380088814 ^ (long)-380088814);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1439022814 ^ (long)1439022625);
            int n2 = ((int)-710231308L ^ 0xD5AABAFF) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-186880354 ^ (long)-186889975) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

