//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"}, d2={"disconnectFromMC", "", "reason", "", "kisman.cc"})
public final class myVBgvqMM56TBmRqiljjSwV5NSQMObyg {
    private String Field14120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method5396(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"reason");
        Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        if (minecraft.getConnection() == null) return;
        Minecraft minecraft2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
        NetHandlerPlayClient netHandlerPlayClient = minecraft2.getConnection();
        if (netHandlerPlayClient == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.connection!!");
        netHandlerPlayClient.getNetworkManager().closeChannel((ITextComponent)new TextComponentString(string));
    }

    private static String Method5397(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-703103616L ^ 0xD6177D80;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1489935409L ^ 0x58CE9CCE);
            int n2 = (int)-580379331L ^ 0xDD681D3E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-879702539 ^ (long)-879710538) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

