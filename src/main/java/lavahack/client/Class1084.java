//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import java.util.*;

public class Class1084 extends Class42
{
    private final ArrayList Field12835;
    private final ArrayList Field12836;
    private String Field12837 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1084() {
        super("VisualRange", "", Class97.Field8343);
        this.Field12835 = new ArrayList();
        this.Field12836 = new ArrayList();
    }
    
    @Override
    public void Method45() {
        this.Field12836.clear();
        for (final Entity entity : Class1084.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (entity instanceof EntityPlayer && !entity.getName().equalsIgnoreCase(Class1084.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName())) {
                this.Field12836.add(entity.getName());
            }
        }
        if (!this.Field12835.equals(this.Field12836)) {
            for (final String s : this.Field12836) {
                if (!this.Field12835.contains(s)) {
                    Class1393.Method5507().Method1886(s + " entered in visual range!");
                }
            }
            for (final String s2 : this.Field12835) {
                if (!this.Field12836.contains(s2)) {
                    Class1393.Method5506().Method1886(s2 + " left from visual range!");
                }
            }
            this.Field12835.clear();
            this.Field12835.addAll(this.Field12836);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x33E2 ^ 0x82));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
