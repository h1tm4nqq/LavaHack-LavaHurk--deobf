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

public class fwgw2oRo7ZFADuER9tgw4xA2sWoZLQHo
extends AbstractViaConfig {
    private static List Field8872;
    private String Field8873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public fwgw2oRo7ZFADuER9tgw4xA2sWoZLQHo(File file) {
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
        return ((int)-379552049L ^ 0xE9607ECF) != 0;
    }

    public boolean isNMSPlayerTicking() {
        return ((int)1805824028L ^ 0x6BA2B01C) != 0;
    }

    public boolean is1_12QuickMoveActionFix() {
        return (int)((long)561664062 ^ (long)561664062) != 0;
    }

    public String getBlockConnectionMethod() {
        return "packet";
    }

    public boolean is1_9HitboxFix() {
        return (int)((long)-1114276176 ^ (long)-1114276176) != 0;
    }

    public boolean is1_14HitboxFix() {
        return ((int)342021326L ^ 0x1462D4CE) != 0;
    }

    static {
        String[] stringArray = new String[((int)-1982181079L ^ 0x89DA512A) << 2];
        stringArray[(int)-2118541882L ^ 0x81B99DC6] = "anti-xray-patch";
        stringArray[(int)871330872L ^ 0x33EF7439] = "bungee-ping-interval";
        stringArray[(int)((long)1163542393 ^ (long)1163542392) << 1] = "bungee-ping-save";
        stringArray[(int)250859897L ^ 0xEF3D17A] = "bungee-servers";
        stringArray[((int)1870874421L ^ 0x6F834734) << 2] = "quick-move-action-fix";
        stringArray[(int)((long)-1837617903 ^ (long)-1837617900)] = "nms-player-ticking";
        stringArray[(int)((long)-736698040 ^ (long)-736698037) << 1] = "velocity-ping-interval";
        stringArray[(int)-712030391L ^ 0xD58F474E] = "velocity-ping-save";
        stringArray[((int)-1207931142L ^ 0xB8006EFB) << 3] = "velocity-servers";
        stringArray[(int)((long)-104207442 ^ (long)-104207449)] = "blockconnection-method";
        stringArray[(int)((long)-1935806679 ^ (long)-1935806676) << 1] = "change-1_9-hitbox";
        stringArray[(int)((long)-1946262984 ^ (long)-1946262989)] = "change-1_14-hitbox";
        Field8872 = Arrays.asList(stringArray);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-104082819 ^ (long)-104082819);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-46520565L ^ 0xFD3A27F4);
            int n2 = ((int)-1419987241L ^ 0xAB5CB6CC) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1844231566 ^ (long)-1844231813) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

