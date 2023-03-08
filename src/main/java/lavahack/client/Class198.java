//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/features/module/misc/PortalsModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "allowGuis", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "godMode", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "doAllowGuis", "", "onDisable", "onEnable", "update", "kisman.cc" })
public final class Class198 extends Class42
{
    private final Class44 Field8874;
    private final Class44 Field8875;
    private final Class618 Field8876;
    private String Field8877 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field8876);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field8876);
    }
    
    @Override
    public void Method45() {
        if (Method1181().player == null || Method1181().world == null) {
            return;
        }
        this.Method1180();
    }
    
    private final void Method1180() {
        final Class44 field8874 = this.Field8874;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8874, "allowGuis");
        if (field8874.Method365()) {
            Method1181().player.inPortal = false;
        }
    }
    
    public Class198() {
        super("PortalsModifier", "Extra nether portals features.", Class97.Field8343);
        this.Field8874 = this.Method23(new Class44("Allow Guis", this, true));
        this.Field8875 = this.Method23(new Class44("God Mode", this, false));
        this.Field8876 = new Class618((Class254)new Class1094(this), new Predicate[0]);
    }
    
    public static final Minecraft Method1181() {
        return Class42.Field8052;
    }
    
    public static final void Method1182(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method1183(final Class198 class198) {
        return class198.Field8875;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58AB ^ 0x4A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
