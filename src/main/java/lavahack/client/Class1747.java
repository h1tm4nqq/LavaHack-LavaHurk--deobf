//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.event.*;

public class Class1747 extends Class42
{
    public Class44 Field16018;
    public Class44 Field16019;
    public Class44 Field16020;
    public static Class1747 Field16021;
    @Class1801
    private final Class618 Field16022;
    private int Field16023;
    
    public Class1747() {
        super("NoGlitchBlocks", Class97.Field8344);
        this.Field16018 = this.Method23(new Class44("Place", this, true));
        this.Field16019 = this.Method23(new Class44("Break", this, true));
        this.Field16020 = this.Method23(new Class44("Ground", this, false));
        this.Field16022 = new Class618(this::Method6670, new Predicate[0]);
        Class1747.Field16021 = this;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16022);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16022);
    }
    
    public boolean Method6669() {
        return this.Method35() && this.Field16018.Method365() && (this.Field16020.Method365() || Class1747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
    }
    
    private void Method6670(final Class303 class303) {
        if (this.Field16019.Method365() && class303.Field9305.equals((Object)Class1273.Field13746)) {
            class303.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7F48 ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
