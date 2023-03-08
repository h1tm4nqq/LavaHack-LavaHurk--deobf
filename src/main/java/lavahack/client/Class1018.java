//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import com.kisman.cc.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/features/module/Debug/Meow;", "Lcom/kisman/cc/features/module/Module;", "()V", "group1", "Lcom/kisman/cc/settings/types/SettingGroup;", "group1_1", "Lcom/kisman/cc/settings/Setting;", "group1_2", "group1_3", "group1_4", "group1_5", "group1_5_1", "group1_5_2", "group1_5_3", "group1_5_4", "onEnable", "", "kisman.cc" })
public final class Class1018 extends Class42
{
    private final Class1996 Field12420;
    private final Class44 Field12421;
    private final Class44 Field12422;
    private final Class44 Field12423;
    private final Class44 Field12424;
    private final Class1996 Field12425;
    private final Class44 Field12426;
    private final Class44 Field12427;
    private final Class44 Field12428;
    private final Class44 Field12429;
    private int Field12430;
    
    @Override
    public void Method38() {
        Class1796.Field16241.Field16267.Method1969(Class1233.Field13595);
        Method4132().displayGuiScreen((GuiScreen)Class1796.Field16241.Field16270);
        this.Method21(false);
    }
    
    public Class1018() {
        super("Meow", "Test of group settings", Class97.Field8345);
        final Class1996 method24 = this.Method24(new Class1996(new Class44("Group1", this)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method24, "register(SettingGroup(Setting(\"Group1\", this)))");
        this.Field12420 = method24;
        final Class44 method25 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Slider", this, 1.0, 1.0, Double.longBitsToDouble((long)699713704 ^ 0x4014000029B4C8A8L), true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method25, "register(group1.add(Sett\u2026s, 1.0, 1.0, 5.0, true)))");
        this.Field12421 = method25;
        final Class44 method26 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Combo", this, "Meow", CollectionsKt.listOf((Object[])new String[] { "Meow", "Meeow", "Meowow", "Cat" }))));
        Intrinsics.checkExpressionValueIsNotNull((Object)method26, "register(group1.add(Sett\u2026eow\", \"Meowow\", \"Cat\"))))");
        this.Field12422 = method26;
        final Class44 method27 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Check", this, true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method27, "register(group1.add(Sett\u2026up1 Check\", this, true)))");
        this.Field12423 = method27;
        final Class44 method28 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Color", this, new Class2027(255, 0, 125, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)method28, "register(group1.add(Sett\u2026lour(255, 0, 125, 255))))");
        this.Field12424 = method28;
        final Class1996 method29 = this.Method24(this.Field12420.Method7406(new Class1996(new Class44("Group1 Group2", this))));
        Intrinsics.checkExpressionValueIsNotNull((Object)method29, "register(group1.add(Sett\u2026\"Group1 Group2\", this))))");
        this.Field12425 = method29;
        final Class44 method30 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Slider", this, 1.0, 1.0, Double.longBitsToDouble(4617315517961601024L), true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method30, "register(group1_5.add(Se\u2026s, 1.0, 1.0, 5.0, true)))");
        this.Field12426 = method30;
        final Class44 method31 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Combo", this, "Meow", CollectionsKt.listOf((Object[])new String[] { "Meow", "Meeow", "Meowow", "Cat" }))));
        Intrinsics.checkExpressionValueIsNotNull((Object)method31, "register(group1_5.add(Se\u2026eow\", \"Meowow\", \"Cat\"))))");
        this.Field12427 = method31;
        final Class44 method32 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Check", this, true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method32, "register(group1_5.add(Se\u2026up2 Check\", this, true)))");
        this.Field12428 = method32;
        final Class44 method33 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Color", this, new Class2027(255, 255, 125, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)method33, "register(group1_5.add(Se\u2026ur(255, 255, 125, 255))))");
        this.Field12429 = method33;
    }
    
    public static final Minecraft Method4132() {
        return Class42.Field8052;
    }
    
    public static final void Method4133(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x285B ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
