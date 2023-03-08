//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/util/enums/CapeEnum$Gif;", "Lcom/kisman/cc/util/enums/CapeEnum;", "count", "", "getCount", "()I", "setCount", "(I)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "setTimer", "(Lcom/kisman/cc/util/TimerUtils;)V", "location", "Lnet/minecraft/util/ResourceLocation;", "kisman.cc" })
final class Class1614 extends Class1529
{
    @NotNull
    private Class650 Field15550;
    private int Field15551;
    private int Field15552;
    
    @NotNull
    @NotNull
    public final Class650 Method6282() {
        return this.Field15550;
    }
    
    public final void Method6283(@NotNull @NotNull final Class650 field15550) {
        Intrinsics.checkParameterIsNotNull((Object)field15550, "<set-?>");
        this.Field15550 = field15550;
    }
    
    public final int Method6284() {
        return this.Field15551;
    }
    
    public final void Method6285(final int field15551) {
        this.Field15551 = field15551;
    }
    
    @NotNull
    @NotNull
    public ResourceLocation Method6069() {
        if (this.Field15551 > 34) {
            this.Field15551 = 0;
        }
        final ResourceLocation resourceLocation = new ResourceLocation("kismancc:cape/rainbow/cape-" + this.Field15551 + ".png");
        if (this.Field15550.Method2797(85L)) {
            this.Field15551++;
            this.Field15550.Method2801();
        }
        return resourceLocation;
    }
    
    Class1614(final String s, final int n) {
        super(s, n, "null", (DefaultConstructorMarker)null);
        this.Field15550 = new Class650();
    }
    
    private static String Method6071(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29CB ^ 0xEB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
