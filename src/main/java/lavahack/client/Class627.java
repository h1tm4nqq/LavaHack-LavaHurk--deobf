/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.common.config.ConfigCategory
 *  net.minecraftforge.common.config.ConfigElement
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.fml.client.config.GuiConfig
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

@Deprecated
public abstract class Class627
extends GuiConfig {
    private String Field10679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class627(GuiScreen guiScreen, String string, Configuration configuration, String string2) {
        super(guiScreen, Class627.getConfigElements(configuration, string2), string, false, false, GuiConfig.getAbridgedConfigPath((String)configuration.toString()));
    }

    private static List getConfigElements(Configuration configuration, String string) {
        ArrayList<ConfigElement> arrayList = new ArrayList<ConfigElement>();
        Iterator iterator = configuration.getCategoryNames().iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            ConfigCategory configCategory = configuration.getCategory(string2).setLanguageKey(string + ".category." + string2);
            if (configCategory.parent != null) continue;
            arrayList.add(new ConfigElement(configCategory));
        }
        return arrayList;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 230;
            cArray2[n] = (char)(cArray[n] ^ (0x1E3F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

