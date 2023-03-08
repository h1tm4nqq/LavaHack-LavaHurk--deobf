//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import java.awt.*;

public class Class486 extends Class42
{
    public final Class44 Field10025;
    public final Class44 Field10026;
    public final Class44 Field10027;
    public final Class44 Field10028;
    @Class873
    public static Class486 Field10029;
    private String Field10030 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class486() {
        super("HotbarModifier", "Extra features of your hotbar!", Class97.Field8342);
        this.Field10025 = this.Method23(new Class44("Shadow", (Class42)this, false));
        this.Field10026 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 152)).Method313((Supplier)this.Field10025::Method365));
        this.Field10027 = this.Method23(new Class44("Offhand", (Class42)this, true).Method313((Supplier)this.Field10025::Method365));
        this.Field10028 = this.Method23(new Class44("Offhand Gradient", (Class42)this, false).Method313((Supplier)this::Method2248));
    }
    
    public static Color Method2247() {
        return null.Field10026.Method339().Method3625();
    }
    
    private Boolean Method2248() {
        return this.Field10027.Method365() && this.Field10025.Method365();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1384 ^ 0x71));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
