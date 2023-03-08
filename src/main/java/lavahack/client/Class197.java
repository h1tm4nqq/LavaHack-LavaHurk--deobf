//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.configuration.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Class197 extends AbstractViaConfig
{
    private static List Field8872;
    private String Field8873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class197(final File file) {
        super(file);
        this.reloadConfig();
    }
    
    public URL getDefaultConfigURL() {
        return this.getClass().getClassLoader().getResource("assets/viaversion/config.yml");
    }
    
    protected void handleConfig(final Map map) {
    }
    
    public List getUnsupportedOptions() {
        return Class197.Field8872;
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
    
    static {
        Class197.Field8872 = Arrays.asList("anti-xray-patch", "bungee-ping-interval", "bungee-ping-save", "bungee-servers", "quick-move-action-fix", "nms-player-ticking", "velocity-ping-interval", "velocity-ping-save", "velocity-servers", "blockconnection-method", "change-1_9-hitbox", "change-1_14-hitbox");
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1848 ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
