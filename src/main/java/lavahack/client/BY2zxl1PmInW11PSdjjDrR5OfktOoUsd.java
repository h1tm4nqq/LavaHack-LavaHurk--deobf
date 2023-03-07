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
public abstract class BY2zxl1PmInW11PSdjjDrR5OfktOoUsd
extends GuiConfig {
    private String Field10679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public BY2zxl1PmInW11PSdjjDrR5OfktOoUsd(GuiScreen guiScreen, String string, Configuration configuration, String string2) {
        super(guiScreen, BY2zxl1PmInW11PSdjjDrR5OfktOoUsd.getConfigElements(configuration, string2), string, ((int)-1991088970L ^ 0x895264B6) != 0, ((int)-1558949816L ^ 0xA3145048) != 0, GuiConfig.getAbridgedConfigPath((String)configuration.toString()));
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
        int n = (int)1003316391L ^ 0x3BCD64A7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1163097457 ^ (long)-1163097488);
            int n2 = (int)((long)966134562 ^ (long)966134609) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1446481197 ^ (long)1446482706) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

