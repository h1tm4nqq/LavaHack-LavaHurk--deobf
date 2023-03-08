//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T?\u0006\u0002\n\u0000?\u0006\u0002" }, d2 = { "MOTION_BLUR_SHADER", "", "kisman.cc" })
public final class Class1987
{
    @NotNull
    public static final String Field17128;
    private int Field17129;
    
    static {
        Field17128 = "{\\\"targets\\\":[\\\"swap\\\",\\\"previous\\\"],\\\"passes\\\":[{\\\"name\\\":\\\"phosphor\\\",\\\"intarget\\\":\\\"minecraft:main\\\",\\\"outtarget\\\":\\\"swap\\\",\\\"auxtargets\\\":[{\\\"name\\\":\\\"PrevSampler\\\",\\\"id\\\":\\\"previous\\\"}],\\\"uniforms\\\":[{\\\"name\\\":\\\"Phosphor\\\",\\\"values\\\":[%.2f, %.2f, %.2f]}]},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"previous\\\"},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"minecraft:main\\\"}]}";
    }
}
