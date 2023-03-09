//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class2081
extends Class42 {
    private final Class44 Field17506 = new Class44("CustomMessage", (Class42)this, false);
    private final Class44 Field17507 = new Class44("CustomMessage", this, "_kisman_ on top!", "_kisman_ on top!", true);
    private final ArrayList Field17508;
    private String[] Field17509 = new String[]{"L3g3ndry on top!", "_kisman_ on top!", "kisman.cc on top!", "Buy RusherHack with code \"Robertoss\"!", "kisman.cc owned me((", "Robertoss on top!", "TheKisDevs owns all", "Gentleman is cute cate", "Dallas better than me hacks(", "FakePearl enjoyers", "https://github.com/TheKisDevs/LavaHack"};
    private final Class650 Field17510 = new Class650();
    private int Field17511;

    public Class2081() {
        super("Spammer", "chat spammer", Class97.Field8343);
        Class1796.Field16241.Field16258.Method7569(new Class44("GlobalMode", (Class42)this, false));
        Class1796.Field16241.Field16258.Method7569(new Class44("Delay", (Class42)this, Double.longBitsToDouble(4662219572839972864L), 0.0, Double.longBitsToDouble((long)40460040 ^ 0x40C3880002695F08L), true));
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17506);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17507);
        this.Field17508 = new ArrayList<String>(Arrays.asList(this.Field17509));
    }

    @Override
    public void Method45() {
        if (Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        boolean bl = Class1796.Field16241.Field16258.Method7572(this, "GlobalMode").Method365();
        long l = (int)Class1796.Field16241.Field16258.Method7572(this, "Delay").Method367();
        if (!this.Field17510.Method2797(l)) return;
        if (this.Field17506.Method365()) {
            String string = this.Field17507.Method359();
            Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(bl ? "!" + string : string);
        } else {
            Random random = new Random();
            int n = random.nextInt(this.Field17508.size());
            String string = (String)this.Field17508.get(n);
            Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(bl ? "!" + string : string);
        }
        this.Field17510.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 127;
            cArray2[n] = (char)(cArray[n] ^ (0x4B06 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

