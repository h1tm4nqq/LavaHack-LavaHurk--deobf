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
public abstract class RRDpwDz7cHDGEu9ehELz6vKeu5g2qIIs
extends GuiConfig {
    private String Field16497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RRDpwDz7cHDGEu9ehELz6vKeu5g2qIIs(GuiScreen guiScreen, String string, Configuration configuration, String string2) {
        super(guiScreen, RRDpwDz7cHDGEu9ehELz6vKeu5g2qIIs.getConfigElements(configuration, string2), string, ((int)-1467282098L ^ 0xA88B0D4E) != 0, (boolean)((long)374073031 ^ (long)374073031), GuiConfig.getAbridgedConfigPath((String)configuration.toString()));
    }

    private static List getConfigElements(Configuration configuration, String string) {
        ConfigElement configElement = new ConfigElement(configuration.getCategory(string));
        return configElement.getChildElements();
    }
}

