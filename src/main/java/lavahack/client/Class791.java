//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;

@Class794
@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/features/module/combat/CrystalPvPHelper;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoBurrow", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoSurround", "distance", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "triggered", "", "onEnable", "", "update", "kisman.cc" })
public final class Class791 extends Class42
{
    private final Class44 Field11368;
    private final Class44 Field11369;
    private final Class44 Field11370;
    private final Class411 Field11371;
    private boolean Field11372;
    private String Field11373 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        this.Field11371.Method2004();
        this.Field11372 = false;
    }
    
    public void Method45() {
        if (Method3301().player == null || Method3301().world == null) {
            return;
        }
        this.Field11371.Method2005((Runnable)new Class561(this));
    }
    
    public Class791() {
        super("CrystalPvPHelper", "Helps with crystal pvp.", Class97.Field8338);
        this.Field11368 = this.Method23(new Class44("Distance", (Class42)this, Double.longBitsToDouble((long)206849917 ^ 0x400800000C54477DL), 1.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field11369 = this.Method23(new Class44("Auto Burrow", (Class42)this, false));
        this.Field11370 = this.Method23(new Class44("Auto Surround", (Class42)this, false));
        this.Field11371 = this.Method54();
    }
    
    public static final Minecraft Method3301() {
        return Class42.Field8052;
    }
    
    public static final void Method3302(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final boolean Method3303(final Class791 class791) {
        return class791.Field11372;
    }
    
    public static final void Method3304(final Class791 class791, final boolean field11372) {
        class791.Field11372 = field11372;
    }
    
    public static final Class44 Method3305(final Class791 class791) {
        return class791.Field11368;
    }
    
    public static final Class44 Method3306(final Class791 class791) {
        return class791.Field11369;
    }
    
    public static final Class44 Method3307(final Class791 class791) {
        return class791.Field11370;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x46E0 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
