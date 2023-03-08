//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/features/module/movement/SoftScaffold;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "noJump", "onlyWhenOnGround", "packet", "switchMode", "timer", "Lcom/kisman/cc/util/TimerUtils;", "doNoJump", "", "onEnable", "update", "kisman.cc" })
public final class Class1910 extends Class42
{
    private final Class44 Field16811;
    private final Class44 Field16812;
    private final Class44 Field16813;
    private final Class44 Field16814;
    private final Class44 Field16815;
    private final Class650 Field16816;
    private String Field16817 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field16816.Method2801();
    }
    
    @Override
    public void Method45() {
        if (Method7096().player != null && Method7096().world != null) {
            final Class44 field16815 = this.Field16815;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16815, "onlyWhenOnGround");
            if (!field16815.Method365() || Method7096().player.onGround) {
                final Class650 field16816 = this.Field16816;
                final Class44 field16817 = this.Field16813;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16817, "delay");
                if (field16816.Method2797(field16817.Method369())) {
                    this.Field16816.Method2801();
                    final int method103 = Class9.Method103(0, 9);
                    if (method103 == -1) {
                        Class1393.Method5504().Method1886("Out of valid blocks. Disabling!");
                        super.Method21(false);
                    }
                    final int currentItem = Method7096().player.inventory.currentItem;
                    final Class44 field16818 = this.Field16811;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16818, "switchMode");
                    final Enum method104 = field16818.Method341();
                    if (method104 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
                    }
                    final Class711 class711 = (Class711)method104;
                    class711.Method2972().Method1726(new Object[] { method103, false });
                    if (Method7096().player.onGround) {
                        final BlockPos method105 = Class1744.Method6657();
                        final EnumHand main_HAND = EnumHand.MAIN_HAND;
                        final Class44 field16819 = this.Field16814;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field16819, "packet");
                        Class1486.Method5949(method105, main_HAND, field16819.Method365());
                    }
                    class711.Method2972().Method1726(new Object[] { currentItem, true });
                }
                this.Method7095();
            }
        }
    }
    
    private final void Method7095() {
        final Class44 field16812 = this.Field16812;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16812, "noJump");
        if (field16812.Method365()) {
            Method7096().gameSettings.keyBindJump.pressed = false;
            Method7096().player.motionY = 0.0;
        }
    }
    
    public Class1910() {
        super("SoftScaffold", "Like default Scaffold but for soft(no solid) blocks.", Class97.Field8340);
        this.Field16811 = this.Method23(new Class44("Switch Mode", this, Class711.Field11028));
        this.Field16812 = this.Method23(new Class44("No Jump", this, false));
        this.Field16813 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble((long)1629778869 ^ 0x40340000612473B5L), 0.0, Double.longBitsToDouble((long)1707862844 ^ 0x408F400065CBEB3CL), Class467.Field9943));
        this.Field16814 = this.Method23(new Class44("Packet", this, false));
        this.Field16815 = this.Method23(new Class44("Only When onGround", this, true));
        this.Field16816 = new Class650();
    }
    
    public static final Minecraft Method7096() {
        return Class42.Field8052;
    }
    
    public static final void Method7097(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F54 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
