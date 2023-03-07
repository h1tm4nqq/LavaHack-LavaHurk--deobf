//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1
implements Supplier {
    public static final iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1 Field9614 = new iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1();
    private String Field9615 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method1861();
    }

    @NotNull
    @NotNull
    public final String Method1861() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append((char)((int)1221721922L ^ 0x48D1FF19));
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5349() == null) {
            string = "No targets";
            return stringBuilder.append(string).append((char)((long)1639891514 ^ (long)1639891559)).toString();
        }
        Entity entity = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5349();
        if (entity != null) {
            string = entity.getName();
            return stringBuilder.append(string).append((char)((long)1639891514 ^ (long)1639891559)).toString();
        }
        string = null;
        return stringBuilder.append(string).append((char)((long)1639891514 ^ (long)1639891559)).toString();
    }

    iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1() {
    }

    private static String Method1862(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2103602659L ^ 0x829D921D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1676919958L ^ 0x63F3C469);
            int n2 = (int)((long)1197203073 ^ (long)1197203188) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-25255279L ^ 0xFE7EE948 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

