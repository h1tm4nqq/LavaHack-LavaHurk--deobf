/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 */
package lavahack.client;

import com.viaversion.viaversion.configuration.AbstractViaConfig;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Class197
extends AbstractViaConfig {
    private static List Field8872 = Arrays.asList("anti-xray-patch", "bungee-ping-interval", "bungee-ping-save", "bungee-servers", "quick-move-action-fix", "nms-player-ticking", "velocity-ping-interval", "velocity-ping-save", "velocity-servers", "blockconnection-method", "change-1_9-hitbox", "change-1_14-hitbox");
    private String Field8873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class197(File file) {
        super(file);
        this.reloadConfig();
    }

    public URL getDefaultConfigURL() {
        return ((Object)((Object)this)).getClass().getClassLoader().getResource("assets/viaversion/config.yml");
    }

    protected void handleConfig(Map map) {
    }

    public List getUnsupportedOptions() {
        return Field8872;
    }

    public boolean isAntiXRay() {
        return false;
    }

    public boolean isNMSPlayerTicking() {
        return false;
    }

    public boolean is1_12QuickMoveActionFix() {
        return false;
    }

    public String getBlockConnectionMethod() {
        return "packet";
    }

    public boolean is1_9HitboxFix() {
        return false;
    }

    public boolean is1_14HitboxFix() {
        return false;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 108;
            cArray2[n] = (char)(cArray[n] ^ (0x1848 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

