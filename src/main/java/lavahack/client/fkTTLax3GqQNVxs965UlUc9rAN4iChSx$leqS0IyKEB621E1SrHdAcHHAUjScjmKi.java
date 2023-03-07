/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.net.URL;
import kotlin.Metadata;
import lavahack.client.fkTTLax3GqQNVxs965UlUc9rAN4iChSx;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class fkTTLax3GqQNVxs965UlUc9rAN4iChSx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final fkTTLax3GqQNVxs965UlUc9rAN4iChSx Field10812;
    private int Field10813;

    @Override
    public final void run() {
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx.Method4049(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "regular"));
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx.Method4051(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "prio"));
    }

    fkTTLax3GqQNVxs965UlUc9rAN4iChSx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2) {
        this.Field10812 = fkTTLax3GqQNVxs965UlUc9rAN4iChSx2;
    }

    private static String Method2837(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1853724403L ^ 0x9182690D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)699478911L ^ 0x29B13380);
            int n2 = ((int)631373666L ^ 0x25A1FF15) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1280732432L ^ 0x4C5642F3) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

