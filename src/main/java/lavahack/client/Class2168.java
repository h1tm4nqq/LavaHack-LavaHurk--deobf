//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/module/misc/WebhookSpammer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "debug", "delay", "timer", "Lcom/kisman/cc/util/TimerUtils;", "isBeta", "", "onEnable", "", "update", "kisman.cc" })
public final class Class2168 extends Class42
{
    private final Class44 Field17912;
    private final Class44 Field17913;
    private final Class44 Field17914;
    private final Class650 Field17915;
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
        if (Method7809().player == null || Method7809().world == null || !this.Field17915.Method2797(this.Field17913.Method369())) {
            return;
        }
        this.Field17915.Method2801();
    }
    
    public Class2168() {
        super("WebhookSpammer", "Using discord webhook for spamming", Class97.Field8343);
        this.Field17912 = new Class44("Color", this, "Embed Color", new Class2027(255, 0, 0));
        this.Field17913 = new Class44("Delay", this, Double.longBitsToDouble(4652007308841189376L), 0.0, Double.longBitsToDouble((long)295762095 ^ 0x40C3880011A0F8AFL), true);
        this.Field17914 = new Class44("Debug", this, false);
        this.Field17915 = new Class650();
        Method7811().Method7569(this.Field17912);
        Method7811().Method7569(this.Field17913);
        Method7811().Method7569(this.Field17914);
    }
    
    public static final Minecraft Method7809() {
        return Class42.Field8052;
    }
    
    public static final void Method7810(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class2047 Method7811() {
        return Class42.Field8053;
    }
    
    public static final void Method7812(final Class2047 field8053) {
        Class42.Field8053 = field8053;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x46A1 ^ 0x92));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
