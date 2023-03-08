//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\b" }, d2 = { "Lcom/kisman/cc/features/module/exploit/DamageLeave;", "Lcom/kisman/cc/features/module/Module;", "()V", "motion", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "update", "", "kisman.cc" })
public final class Class2128 extends Class42
{
    private final Class44 Field17680;
    private String Field17681 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method45() {
        if (Method7665().player != null && Method7665().world != null && Method7665().player.hurtTime >= 7) {
            final EntityPlayerSP player = Method7665().player;
            final Class44 field17680 = this.Field17680;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17680, "motion");
            player.motionY = field17680.Method367();
            Class1393.Method5503().Method1886("Done! Disabling!");
            this.Method21(false);
        }
    }
    
    public Class2128() {
        super("DamageLeave", "Sets your Y motion when you get \"any\" damage", Class97.Field8344);
        this.Field17680 = this.Method23(new Class44("Motion", this, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble((long)1011401076 ^ 0x401400003C48C174L), Double.longBitsToDouble(4626322717216342016L), true));
    }
    
    public static final Minecraft Method7665() {
        return Class42.Field8052;
    }
    
    public static final void Method7666(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D30 ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
