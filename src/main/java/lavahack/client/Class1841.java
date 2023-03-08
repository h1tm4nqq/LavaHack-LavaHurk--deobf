//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.client.config.*;
import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraftforge.common.config.*;

@Deprecated
public abstract class Class1841 extends GuiConfig
{
    private String Field16497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1841(final GuiScreen guiScreen, final String s, final Configuration configuration, final String s2) {
        super(guiScreen, getConfigElements(configuration, s2), s, false, false, GuiConfig.getAbridgedConfigPath(configuration.toString()));
    }
    
    private static List getConfigElements(final Configuration configuration, final String s) {
        return new ConfigElement(configuration.getCategory(s)).getChildElements();
    }
}
