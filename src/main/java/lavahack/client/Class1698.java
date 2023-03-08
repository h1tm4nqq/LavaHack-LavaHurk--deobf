//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1698 extends Class488
{
    private boolean Field15862;
    private String Field15863 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1698(final String s, final Class1164 class1164) {
        super("key", s, class1164);
        this.Field15862 = false;
    }
    
    @Override
    protected void Method2267() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @Override
    protected void Method2268() {
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6507(final TickEvent tickEvent) {
        final int int1 = Integer.parseInt(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (int1 < 0 || int1 > 256) {
            Class1796.Field16243.error("[KeyActivator] Invalid key range: " + int1);
            return;
        }
        if (!Keyboard.isKeyDown(int1)) {
            this.Field15862 = false;
            return;
        }
        if (this.Field15862) {
            return;
        }
        this.Method2266();
        this.Field15862 = true;
    }
    
    private static String Method6508(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x448D ^ 0x46));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
