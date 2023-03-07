//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class NWDKHNNluoGU7BitlOA2GGqA28aI6iD9
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17506 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CustomMessage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1667998111 ^ (long)-1667998111));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17507 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CustomMessage", this, "_kisman_ on top!", "_kisman_ on top!", (boolean)((long)1551000330 ^ (long)1551000331));
    private final ArrayList Field17508;
    private String[] Field17509;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17510;
    private int Field17511;

    public NWDKHNNluoGU7BitlOA2GGqA28aI6iD9() {
        super("Spammer", "chat spammer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        String[] stringArray = new String[(int)-1888617630L ^ 0x8F6DFB69];
        stringArray[(int)((long)1111590545 ^ (long)1111590545)] = "L3g3ndry on top!";
        stringArray[(int)((long)-62663284 ^ (long)-62663283)] = "_kisman_ on top!";
        stringArray[(int)((long)-1034526483 ^ (long)-1034526484) << 1] = "kisman.cc on top!";
        stringArray[(int)-505368115L ^ 0xE1E0B1CE] = "Buy RusherHack with code \"Robertoss\"!";
        stringArray[(int)((long)-418971564 ^ (long)-418971563) << 2] = "kisman.cc owned me((";
        stringArray[(int)662763874L ^ 0x2780F967] = "Robertoss on top!";
        stringArray[(int)((long)-939877616 ^ (long)-939877613) << 1] = "TheKisDevs owns all";
        stringArray[(int)((long)940425990 ^ (long)940425985)] = "Gentleman is cute cate";
        stringArray[((int)1742849698L ^ 0x67E1C6A3) << 3] = "Dallas better than me hacks(";
        stringArray[(int)((long)-1759316333 ^ (long)-1759316326)] = "FakePearl enjoyers";
        stringArray[((int)1792225164L ^ 0x6AD32F89) << 1] = "https://github.com/TheKisDevs/LavaHack";
        this.Field17509 = stringArray;
        this.Field17510 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("GlobalMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1027483807 ^ (long)-1027483807)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x40A77B1A57F3FDBFL ^ 0x14F31A57F3FDBFL), 0.0, Double.longBitsToDouble((long)40460040 ^ 0x40C3880002695F08L), (boolean)((long)-889518963 ^ (long)-889518964)));
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17506);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17507);
        this.Field17508 = new ArrayList<String>(Arrays.asList(this.Field17509));
    }

    @Override
    public void Method45() {
        if (NWDKHNNluoGU7BitlOA2GGqA28aI6iD9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && NWDKHNNluoGU7BitlOA2GGqA28aI6iD9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        boolean bl = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7572(this, "GlobalMode").Method365();
        long l = (int)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7572(this, "Delay").Method367();
        if (!this.Field17510.Method2797(l)) return;
        if (this.Field17506.Method365()) {
            String string = this.Field17507.Method359();
            NWDKHNNluoGU7BitlOA2GGqA28aI6iD9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(bl ? "!" + string : string);
        } else {
            Random random = new Random();
            int n = random.nextInt(this.Field17508.size());
            String string = (String)this.Field17508.get(n);
            NWDKHNNluoGU7BitlOA2GGqA28aI6iD9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(bl ? "!" + string : string);
        }
        this.Field17510.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)18791765 ^ (long)18791765);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1416585623 ^ (long)-1416585578);
            int n2 = (int)((long)1653134884 ^ (long)1653134939);
            cArray2[n] = (char)(cArray[n] ^ (((int)-546514049L ^ 0xDF6CFEFC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

