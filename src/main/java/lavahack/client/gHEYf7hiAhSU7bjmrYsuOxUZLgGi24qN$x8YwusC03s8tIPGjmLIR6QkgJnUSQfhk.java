//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.item.ItemPickaxe
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemPickaxe;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderGetEntitiesINAABBexcluding;", "kotlin.jvm.PlatformType", "invoke"})
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk Field15722 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk();
    private String Field15723 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6413((QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR)object);
    }

    public final void Method6413(QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR) {
        if (!gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7082(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809).Method365()) return;
        if (gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7085(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809).Method365()) {
            EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemPickaxe)) return;
        }
        qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Method158();
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk() {
    }

    private static String Method6414(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)247677738L ^ 0xEC3432A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1190741607 ^ (long)1190741656);
            int n2 = ((int)-1658894165L ^ 0x9D1F48D8) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1982180978 ^ (long)1982189741) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

