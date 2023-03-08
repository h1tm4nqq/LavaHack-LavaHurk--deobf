//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.*;

public class Class2081 extends Class42
{
    private final Class44 Field17506;
    private final Class44 Field17507;
    private final ArrayList Field17508;
    private String[] Field17509;
    private final Class650 Field17510;
    private int Field17511;
    
    public Class2081() {
        super("Spammer", "chat spammer", Class97.Field8343);
        this.Field17506 = new Class44("CustomMessage", this, false);
        this.Field17507 = new Class44("CustomMessage", this, "_kisman_ on top!", "_kisman_ on top!", true);
        this.Field17509 = new String[] { "L3g3ndry on top!", "_kisman_ on top!", "kisman.cc on top!", "Buy RusherHack with code \"Robertoss\"!", "kisman.cc owned me((", "Robertoss on top!", "TheKisDevs owns all", "Gentleman is cute cate", "Dallas better than me hacks(", "FakePearl enjoyers", "https://github.com/TheKisDevs/LavaHack" };
        this.Field17510 = new Class650();
        Class1796.Field16241.Field16258.Method7569(new Class44("GlobalMode", this, false));
        Class1796.Field16241.Field16258.Method7569(new Class44("Delay", this, Double.longBitsToDouble(4662219572839972864L), 0.0, Double.longBitsToDouble((long)40460040 ^ 0x40C3880002695F08L), true));
        Class2081.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17506);
        Class2081.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17507);
        this.Field17508 = new ArrayList((Collection<? extends E>)Arrays.asList(this.Field17509));
    }
    
    @Override
    public void Method45() {
        if (Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final boolean method365 = Class1796.Field16241.Field16258.Method7572((Class42)this, "GlobalMode").Method365();
        if (this.Field17510.Method2797((long)(int)Class1796.Field16241.Field16258.Method7572((Class42)this, "Delay").Method367())) {
            if (this.Field17506.Method365()) {
                final String method366 = this.Field17507.Method359();
                Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(method365 ? ("!" + method366) : method366);
            }
            else {
                final String str = this.Field17508.get(new Random().nextInt(this.Field17508.size()));
                Class2081.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(method365 ? ("!" + str) : str);
            }
            this.Field17510.Method2801();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B06 ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
