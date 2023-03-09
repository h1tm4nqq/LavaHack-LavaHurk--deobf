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

import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0006\u0010\b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"dotTimer", "Lcom/kisman/cc/util/TimerUtils;", "dots", "", "undTimer", "disconnect", "", "getDots", "getUnderscore", "kisman.cc"})
public final class Class2150 {
    private static final Class650 Field17842 = new Class650();
    private static final Class650 Field17843 = new Class650();
    private static String Field17844 = "";
    private String Field17845 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method7738() {
        NetHandlerPlayClient netHandlerPlayClient = Class2142.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.player.connection");
        netHandlerPlayClient.getNetworkManager().closeChannel((ITextComponent)new TextComponentString("kill yourself"));
    }

    @NotNull
    @NotNull
    public static final String Method7739() {
        if (Field17842.Method2797(500L)) {
            Field17844 = Field17844 + ".";
            Field17842.Method2801();
        }
        if (Field17844.length() <= 3) return Field17844;
        Field17844 = "";
        return Field17844;
    }

    @NotNull
    @NotNull
    public static final String Method7740() {
        if (!Field17843.Method2797(500L)) {
            return "_";
        }
        if (!Field17843.Method2797(1000L)) return "";
        Field17843.Method2801();
        return "";
    }

    private static String Method7741(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x2797 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

