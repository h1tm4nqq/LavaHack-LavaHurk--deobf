//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1233;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/module/Debug/Meow;", "Lcom/kisman/cc/features/module/Module;", "()V", "group1", "Lcom/kisman/cc/settings/types/SettingGroup;", "group1_1", "Lcom/kisman/cc/settings/Setting;", "group1_2", "group1_3", "group1_4", "group1_5", "group1_5_1", "group1_5_2", "group1_5_3", "group1_5_4", "onEnable", "", "kisman.cc"})
public final class Class1018
extends Class42 {
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
        Class1018.Method4132().displayGuiScreen((GuiScreen)Class1796.Field16241.Field16270);
        this.Method21(false);
    }

    public Class1018() {
        super("Meow", "Test of group settings", Class97.Field8345);
        Class1996 class1996 = this.Method24(new Class1996(new Class44("Group1", this)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"register(SettingGroup(Setting(\"Group1\", this)))");
        this.Field12420 = class1996;
        Class44 class44 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Slider", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)699713704 ^ 0x4014000029B4C8A8L), true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(group1.add(Sett\u2026s, 1.0, 1.0, 5.0, true)))");
        this.Field12421 = class44;
        Class44 class442 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Combo", (Class42)this, "Meow", CollectionsKt.listOf((Object[])new String[]{"Meow", "Meeow", "Meowow", "Cat"}))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"register(group1.add(Sett\u2026eow\", \"Meowow\", \"Cat\"))))");
        this.Field12422 = class442;
        Class44 class443 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Check", (Class42)this, true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"register(group1.add(Sett\u2026up1 Check\", this, true)))");
        this.Field12423 = class443;
        Class44 class444 = this.Method23(this.Field12420.Method7405(new Class44("Group1 Color", (Class42)this, new Class2027(255, 0, 125, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"register(group1.add(Sett\u2026lour(255, 0, 125, 255))))");
        this.Field12424 = class444;
        Class1996 class19962 = this.Method24(this.Field12420.Method7406(new Class1996(new Class44("Group1 Group2", this))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class19962, (String)"register(group1.add(Sett\u2026\"Group1 Group2\", this))))");
        this.Field12425 = class19962;
        Class44 class445 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Slider", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4014000000000000L), true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"register(group1_5.add(Se\u2026s, 1.0, 1.0, 5.0, true)))");
        this.Field12426 = class445;
        Class44 class446 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Combo", (Class42)this, "Meow", CollectionsKt.listOf((Object[])new String[]{"Meow", "Meeow", "Meowow", "Cat"}))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"register(group1_5.add(Se\u2026eow\", \"Meowow\", \"Cat\"))))");
        this.Field12427 = class446;
        Class44 class447 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Check", (Class42)this, true)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"register(group1_5.add(Se\u2026up2 Check\", this, true)))");
        this.Field12428 = class447;
        Class44 class448 = this.Method23(this.Field12425.Method7405(new Class44("Group1 Group2 Color", (Class42)this, new Class2027(255, 255, 125, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"register(group1_5.add(Se\u2026ur(255, 255, 125, 255))))");
        this.Field12429 = class448;
    }

    public static final Minecraft Method4132() {
        return Class42.Field8052;
    }

    public static final void Method4133(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x285B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

