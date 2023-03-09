/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.common.config.ConfigElement
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.fml.client.config.GuiConfig
 */
package lavahack.client;

import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

@Deprecated
public abstract class Class1841
extends GuiConfig {
    private String Field16497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1841(GuiScreen guiScreen, String string, Configuration configuration, String string2) {
        super(guiScreen, Class1841.getConfigElements(configuration, string2), string, false, false, GuiConfig.getAbridgedConfigPath((String)configuration.toString()));
    }

    private static List getConfigElements(Configuration configuration, String string) {
        ConfigElement configElement = new ConfigElement(configuration.getCategory(string));
        return configElement.getChildElements();
    }
}

