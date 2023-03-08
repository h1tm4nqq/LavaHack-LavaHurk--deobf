//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.fml.common.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import org.apache.logging.log4j.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/gui/loadingscreen/progressbar/ProgressBarController;", "", "name", "", "(Ljava/lang/String;)V", "bar", "Lnet/minecraftforge/fml/common/ProgressManager$ProgressBar;", "event", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/loadingscreen/progressbar/EventProgressBar;", "getName", "()Ljava/lang/String;", "steps", "", "init", "", "uninit", "kisman.cc" })
public final class Class884
{
    @JvmField
    public int Field11713;
    private ProgressManager$ProgressBar Field11714;
    private final Class618 Field11715;
    @NotNull
    private final String Field11716;
    private String Field11717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method3685() {
        Class1796.Field16242.Method706(this.Field11715);
        this.Field11714 = ProgressManager.push(this.Field11716, this.Field11713, true);
    }
    
    public final void Method3686() {
        final ProgressManager$ProgressBar field11714 = this.Field11714;
        if (field11714 == null) {
            Intrinsics.throwNpe();
        }
        final int steps = field11714.getSteps();
        final ProgressManager$ProgressBar field11715 = this.Field11714;
        if (field11715 == null) {
            Intrinsics.throwNpe();
        }
        if (steps != field11715.getStep()) {
            final Logger field11716 = Class1796.Field16243;
            final StringBuilder append = new StringBuilder().append("ProgressBar: Trying to pop progress bar(");
            final ProgressManager$ProgressBar field11717 = this.Field11714;
            if (field11717 == null) {
                Intrinsics.throwNpe();
            }
            final StringBuilder append2 = append.append(field11717.getSteps()).append(") with ");
            final ProgressManager$ProgressBar field11718 = this.Field11714;
            if (field11718 == null) {
                Intrinsics.throwNpe();
            }
            field11716.error(append2.append(field11718.getStep()).append(" passed steps!").toString());
            final ProgressManager$ProgressBar field11719 = this.Field11714;
            if (field11719 == null) {
                Intrinsics.throwNpe();
            }
            if (field11719 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorProgressBar");
            }
            final AccessorProgressBar accessorProgressBar = (AccessorProgressBar)field11719;
            final ProgressManager$ProgressBar field11720 = this.Field11714;
            if (field11720 == null) {
                Intrinsics.throwNpe();
            }
            accessorProgressBar.Method739(field11720.getSteps());
        }
        final ProgressManager$ProgressBar field11721 = this.Field11714;
        if (field11721 == null) {
            Intrinsics.throwNpe();
        }
        ProgressManager.pop(field11721);
        Class1796.Field16242.Method711(this.Field11715);
    }
    
    @NotNull
    @NotNull
    public final String Method3687() {
        return this.Field11716;
    }
    
    public Class884(@NotNull @NotNull final String field11716) {
        Intrinsics.checkParameterIsNotNull((Object)field11716, "name");
        this.Field11716 = field11716;
        this.Field11715 = new Class618((Class254)new Class752(this), new Predicate[0]);
    }
    
    public static final ProgressManager$ProgressBar Method3688(final Class884 class884) {
        return class884.Field11714;
    }
    
    public static final void Method3689(final Class884 class884, final ProgressManager$ProgressBar field11714) {
        class884.Field11714 = field11714;
    }
    
    private static String Method3690(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFCE ^ 0xA9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
