//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\r" }, d2 = { "Lcom/kisman/cc/features/module/misc/HotbarScroller;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getNextValidSlot", "", "onEnable", "", "update", "kisman.cc" })
public final class Class1056 extends Class42
{
    private final Class44 Field12671;
    private final Class650 Field12672;
    private String Field12673 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        this.Field12672.Method2801();
    }
    
    @Override
    public void Method45() {
        final Class650 field12672 = this.Field12672;
        final Class44 field12673 = this.Field12671;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12673, "delay");
        if (field12672.Method2797(field12673.Method369())) {
            this.Field12672.Method2801();
        }
        if (Method4306().player == null || Method4306().world == null) {
            return;
        }
    }
    
    private final int Method4305() {
        return (Method4306().player.inventory.currentItem == 9) ? 0 : (Method4306().player.inventory.currentItem + 1);
    }
    
    public Class1056() {
        super("HotbarScroller", "uwu like future.", Class97.Field8343);
        this.Field12671 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble((long)1536874356 ^ 0x405900005B9AD774L), 1.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        this.Field12672 = new Class650();
        this.Method44(new Class867(this));
    }
    
    public static final Minecraft Method4306() {
        return Class42.Field8052;
    }
    
    public static final void Method4307(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method4308(final Class1056 class1056) {
        return class1056.Field12671;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D23 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
