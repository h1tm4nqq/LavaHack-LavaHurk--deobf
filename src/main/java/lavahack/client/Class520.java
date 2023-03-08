//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.api.platform.*;
import com.viaversion.viaversion.libs.gson.*;

public class Class520 implements ViaInjector
{
    private String Field10205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void inject() {
    }
    
    public void uninject() {
    }
    
    public int getServerProtocolVersion() {
        return 340;
    }
    
    public String getEncoderName() {
        return "via-encoder";
    }
    
    public String getDecoderName() {
        return "via-decoder";
    }
    
    public JsonObject getDump() {
        return new JsonObject();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF58 ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
