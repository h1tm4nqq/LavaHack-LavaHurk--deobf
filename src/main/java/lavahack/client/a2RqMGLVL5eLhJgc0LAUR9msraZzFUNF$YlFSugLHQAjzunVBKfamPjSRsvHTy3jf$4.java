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
import lavahack.client.JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$4
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$4 Field11555 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$4();
    private String Field11556 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method3560(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    @Nullable
    @Nullable
    public final Void Method3560(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        Object object = z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1453458279L ^ 0xA95DFC98);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"arg.fetch<Boolean>(1)");
        if (((Boolean)object).booleanValue()) {
            return null;
        }
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(((JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1693740098 ^ (long)1693740098))).Method7785(), ((JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1895566171 ^ (long)1895566171))).Method7787(), a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player.onGround));
        return null;
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$4() {
    }

    private static String Method3561(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1202171584 ^ (long)1202171584);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1725086260L ^ 0x66D2BACB);
            int n2 = (int)-618792347L ^ 0xDB1DFA3E;
            cArray2[n] = (char)(cArray[n] ^ (((int)947278451L ^ 0x3876551C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

