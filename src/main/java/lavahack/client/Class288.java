//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;
import java.util.*;

public class Class288
{
    public ArrayList Field9235;
    private String Field9236 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class288() {
        this.Field9235 = new ArrayList();
        MinecraftForge.EVENT_BUS.register((Object)this);
        final Class884 field16286 = Class1796.Field16241.Field16286;
        ++field16286.Field11713;
    }
    
    public void Method1522() {
        Class1796.Field16242.Method715(new Class279("HUD Module Manager"));
        this.Field9235.add(new Class1006());
        this.Field9235.add(new Class1898());
        this.Field9235.add(Class539.Field10276);
        this.Field9235.add(new Class119());
        this.Field9235.add(new Class715());
        this.Field9235.add(new Class493());
        this.Field9235.add(new Class980());
        this.Field9235.add(new Class706());
        this.Field9235.add(new Class2102());
        this.Field9235.add(new Class216());
        this.Field9235.add(new Class1015());
        this.Field9235.add(new Class1031());
        this.Field9235.add(new Class619());
        this.Field9235.add(new Class591());
        this.Field9235.add(new Class1052());
        this.Field9235.add(new Class1422());
        this.Field9235.add(new Class1426());
        this.Field9235.add(new Class463());
        this.Field9235.add(new Class2141());
        this.Field9235.add(new Class1292());
        this.Field9235.add(new Class295());
        this.Field9235.add(new Class73());
        this.Field9235.add(new Class33());
    }
    
    public Class1249 Method1523(final String anotherString) {
        for (final Class1249 class1249 : this.Field9235) {
            if (class1249.Method40().equalsIgnoreCase(anotherString)) {
                return class1249;
            }
        }
        return null;
    }
    
    private static String Method1524(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F0C ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
