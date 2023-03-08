//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.init.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\b" }, d2 = { "Lcom/kisman/cc/features/module/exploit/CowDupe;", "Lcom/kisman/cc/features/module/Module;", "()V", "factor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "kisman.cc" })
public final class Class1860 extends Class42
{
    private final Class44 Field16555;
    private int Field16556;
    
    @Override
    public void Method38() {
        if (Method6954().player == null || Method6954().world == null) {
            super.Method21(false);
            return;
        }
        if (Intrinsics.areEqual((Object)Method6954().player.inventory.getCurrentItem().getItem(), (Object)Items.SHEARS)) {
            int i = 0;
            final Class44 field16555 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16555, "factor");
            while (i < field16555.Method335()) {
                if (Method6954().pointedEntity == null) {
                    Class1393.Method5504().Method1886("Where your cow?!");
                    super.Method21(false);
                }
                Method6954().player.connection.sendPacket((Packet)new CPacketUseEntity(Method6954().pointedEntity, EnumHand.MAIN_HAND));
                ++i;
            }
            final Class1740 method5503 = Class1393.Method5503();
            final StringBuilder append = new StringBuilder().append("You duped ");
            final Class44 field16556 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16556, "factor");
            method5503.Method1886(append.append(field16556.Method335()).append(" cows!").toString());
        }
        else {
            Class1393.Method5504().Method1886("You need to hold shears to do the glitch.");
        }
        super.Method21(false);
    }
    
    public Class1860() {
        super("CowDupe", "Dupes your cows xD", Class97.Field8344);
        this.Field16555 = this.Method23(new Class44("Factor", this, Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble((long)1510174789 ^ 0x402400005A037045L), Double.longBitsToDouble((long)1209091185 ^ 0x4072C00048114471L), true));
    }
    
    public static final Minecraft Method6954() {
        return Class42.Field8052;
    }
    
    public static final void Method6955(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD ^ 0x98));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
