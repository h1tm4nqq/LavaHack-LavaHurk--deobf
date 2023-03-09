//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class303;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class1747
extends Class42 {
    public Class44 Field16018 = this.Method23(new Class44("Place", (Class42)this, true));
    public Class44 Field16019 = this.Method23(new Class44("Break", (Class42)this, true));
    public Class44 Field16020 = this.Method23(new Class44("Ground", (Class42)this, false));
    public static Class1747 Field16021;
    @Class1801
    private final Class618 Field16022 = new Class618(this::Method6670, new Predicate[0]);
    private int Field16023;

    public Class1747() {
        super("NoGlitchBlocks", Class97.Field8344);
        Field16021 = this;
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
        if (!this.Method35()) return false;
        if (!this.Field16018.Method365()) return false;
        if (this.Field16020.Method365()) return true;
        if (!Class1747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return false;
        return true;
    }

    private void Method6670(Class303 class303) {
        if (!this.Field16019.Method365()) return;
        if (!class303.Field9305.equals((Object)Class1273.Field13746)) return;
        class303.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x7F48 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

