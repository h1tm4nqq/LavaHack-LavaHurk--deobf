//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1325;
import lavahack.client.Class1471;
import lavahack.client.Class424;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class Class835
implements Class1471 {
    public static final Class835 Field11553 = new Class835();
    private String Field11554 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method3558(class424);
    }

    @Nullable
    @Nullable
    public final Void Method3558(@NotNull @NotNull Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, (String)"arg");
        Object object = class424.Method2054(1);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"arg.fetch<Boolean>(1)");
        if (((Boolean)object).booleanValue()) {
            return null;
        }
        Class1325.Method5367().player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(((float[])class424.Method2054(0))[0], ((float[])class424.Method2054(0))[1], Class1325.Method5367().player.onGround));
        return null;
    }

    Class835() {
    }

    private static String Method3559(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 138;
            cArray2[n] = (char)(cArray[n] ^ (0x30E4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

