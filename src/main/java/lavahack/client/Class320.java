//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.translation.I18n
 */
package lavahack.client;

import net.minecraft.util.text.translation.I18n;

public class Class320
extends Exception {
    private int Field9359;

    public Class320(String string) {
        super(I18n.translateToLocal((String)string));
    }

    public Class320(String string, Object ... objectArray) {
        super(I18n.translateToLocalFormatted((String)string, (Object[])objectArray));
    }
}

