//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import lavahack.client.Class2047;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/module/misc/WebhookSpammer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "debug", "delay", "timer", "Lcom/kisman/cc/util/TimerUtils;", "isBeta", "", "onEnable", "", "update", "kisman.cc"})
public final class Class2168
extends Class42 {
    private final Class44 Field17912 = new Class44("Color", (Class42)this, "Embed Color", new Class2027(255, 0, 0));
    private final Class44 Field17913 = new Class44("Delay", (Class42)this, Double.longBitsToDouble(4652007308841189376L), 0.0, Double.longBitsToDouble((long)295762095 ^ 0x40C3880011A0F8AFL), true);
    private final Class44 Field17914 = new Class44("Debug", (Class42)this, false);
    private final Class650 Field17915 = new Class650();
    private String Field17916 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        this.Field17915.Method2801();
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method45() {
        if (Class2168.Method7809().player == null) return;
        if (Class2168.Method7809().world == null) return;
        if (!this.Field17915.Method2797(this.Field17913.Method369())) {
            return;
        }
        this.Field17915.Method2801();
    }

    public Class2168() {
        super("WebhookSpammer", "Using discord webhook for spamming", Class97.Field8343);
        Class2168.Method7811().Method7569(this.Field17912);
        Class2168.Method7811().Method7569(this.Field17913);
        Class2168.Method7811().Method7569(this.Field17914);
    }

    public static final Minecraft Method7809() {
        return Class42.Field8052;
    }

    public static final void Method7810(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class2047 Method7811() {
        return Class42.Field8053;
    }

    public static final void Method7812(Class2047 class2047) {
        Class42.Field8053 = class2047;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 146;
            cArray2[n] = (char)(cArray[n] ^ (0x46A1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

