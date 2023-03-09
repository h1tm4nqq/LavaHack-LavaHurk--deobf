//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/features/module/exploit/CowDupe;", "Lcom/kisman/cc/features/module/Module;", "()V", "factor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "kisman.cc"})
public final class Class1860
extends Class42 {
    private final Class44 Field16555 = this.Method23(new Class44("Factor", (Class42)this, Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble((long)1510174789 ^ 0x402400005A037045L), Double.longBitsToDouble((long)1209091185 ^ 0x4072C00048114471L), true));
    private int Field16556;

    @Override
    public void Method38() {
        if (Class1860.Method6954().player == null || Class1860.Method6954().world == null) {
            super.Method21(false);
            return;
        }
        if (Intrinsics.areEqual((Object)Class1860.Method6954().player.inventory.getCurrentItem().getItem(), (Object)Items.SHEARS)) {
            Class44 class44 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"factor");
            int n = class44.Method335();
            for (int i = 0; i < n; ++i) {
                if (Class1860.Method6954().pointedEntity == null) {
                    Class1393.Method5504().Method1886("Where your cow?!");
                    super.Method21(false);
                }
                Class1860.Method6954().player.connection.sendPacket((Packet)new CPacketUseEntity(Class1860.Method6954().pointedEntity, EnumHand.MAIN_HAND));
            }
            Class1740 class1740 = Class1393.Method5503();
            StringBuilder stringBuilder = new StringBuilder().append("You duped ");
            Class44 class442 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"factor");
            class1740.Method1886(stringBuilder.append(class442.Method335()).append(" cows!").toString());
        } else {
            Class1393.Method5504().Method1886("You need to hold shears to do the glitch.");
        }
        super.Method21(false);
    }

    public Class1860() {
        super("CowDupe", "Dupes your cows xD", Class97.Field8344);
    }

    public static final Minecraft Method6954() {
        return Class42.Field8052;
    }

    public static final void Method6955(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 152;
            cArray2[n] = (char)(cArray[n] ^ (0xD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

