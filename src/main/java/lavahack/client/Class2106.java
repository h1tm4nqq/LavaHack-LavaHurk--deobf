//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.renderer.texture.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/render/image/NameableImage;", "", "name", "", "texture", "Lnet/minecraft/client/renderer/texture/DynamicTexture;", "(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/DynamicTexture;)V", "getName", "()Ljava/lang/String;", "getTexture", "()Lnet/minecraft/client/renderer/texture/DynamicTexture;", "kisman.cc" })
public final class Class2106
{
    @NotNull
    private final String Field17587;
    @NotNull
    private final DynamicTexture Field17588;
    private String Field17589 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method7645() {
        return this.Field17587;
    }
    
    @NotNull
    @NotNull
    public final DynamicTexture Method7646() {
        return this.Field17588;
    }
    
    public Class2106(@NotNull @NotNull final String field17587, @NotNull @NotNull final DynamicTexture field17588) {
        Intrinsics.checkParameterIsNotNull((Object)field17587, "name");
        Intrinsics.checkParameterIsNotNull((Object)field17588, "texture");
        this.Field17587 = field17587;
        this.Field17588 = field17588;
    }
    
    private static String Method7647(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x78D5 ^ 0x81));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
