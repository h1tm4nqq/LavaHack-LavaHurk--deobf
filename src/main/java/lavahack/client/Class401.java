//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.renderer.GlStateManager
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1471;
import lavahack.client.Class424;
import net.minecraft.client.renderer.GlStateManager;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lorg/cubic/dynamictask/ArgumentFetcher;", "kotlin.jvm.PlatformType", "call"})
final class Class401
implements Class1471 {
    public static final Class401 Field9675 = new Class401();
    private String Field9676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method1982(class424);
    }

    @Nullable
    @Nullable
    public final Void Method1982(Class424 class424) {
        GlStateManager.enableDepth();
        return null;
    }

    Class401() {
    }
}

