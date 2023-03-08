//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.client.config.*;
import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraftforge.common.config.*;

@Deprecated
public abstract class Class627 extends GuiConfig
{
    private String Field10679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class627(final GuiScreen guiScreen, final String s, final Configuration configuration, final String s2) {
        super(guiScreen, getConfigElements(configuration, s2), s, false, false, GuiConfig.getAbridgedConfigPath(configuration.toString()));
    }
    
    private static List getConfigElements(final Configuration configuration, final String str) {
        final ArrayList<ConfigElement> list = new ArrayList<ConfigElement>();
        for (final String str2 : configuration.getCategoryNames()) {
            final ConfigCategory setLanguageKey = configuration.getCategory(str2).setLanguageKey(str + ".category." + str2);
            if (setLanguageKey.parent == null) {
                list.add(new ConfigElement(setLanguageKey));
            }
        }
        return list;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E3F ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
