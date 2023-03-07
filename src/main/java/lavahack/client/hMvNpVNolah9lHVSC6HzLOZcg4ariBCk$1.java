//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk;
import net.minecraft.entity.player.EntityPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "get"})
final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1
implements Supplier {
    public static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1 Field14620 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1();
    private String Field14621 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5686();
    }

    public final String Method5686() {
        if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6015(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034).Method496() == null) {
            return "";
        }
        EntityPlayer entityPlayer = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6015(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034).Method496();
        String string = (char)((long)1232818811 ^ (long)1232818720) + (entityPlayer != null ? entityPlayer.getName() : null) + (char)((int)-2051583496L ^ 0x85B751A5);
        return string;
    }

    hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1() {
    }

    private static String Method5687(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2131339041 ^ (long)-2131339041);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)30122639L ^ 0x1CBA270);
            int n2 = (int)((long)1257130839 ^ (long)1257130768) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1471246736 ^ (long)1471250171) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

