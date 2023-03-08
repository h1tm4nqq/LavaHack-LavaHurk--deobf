//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import com.kisman.cc.util.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class133 extends Class42
{
    private final Class44 Field8492;
    private String Field8493 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class133() {
        super("HoleTest", Class97.Field8345, true);
        this.Field8492 = this.Method23(new Class44("Range", this, 1.0, Double.longBitsToDouble(4624633867356078080L), Double.longBitsToDouble(4629137466983448576L), false));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method911(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class133.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class133.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final Iterator<Class1960> iterator = Class1510.Method6031(this.Field8492.Method367()).iterator();
        while (iterator.hasNext()) {
            Class815.Method3446(Class815.Method3447(iterator.next().Method7277()), 2.0f, new Class2027(255, 255, 255, 120), new Class2027(255, 255, 255, 120), Class2008.Field17214);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F13 ^ 0xA3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
