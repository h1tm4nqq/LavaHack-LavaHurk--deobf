//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.TextComponentString;

public class Class848
extends Class42 {
    public static Class848 Field11583;
    public ArrayList Field11584 = new ArrayList();
    @Class1801
    private final Class618 Field11585 = new Class618(this::Method3585, new Predicate[0]);
    private int Field11586;

    public Class848() {
        super("AntiSpammer", Class97.Field8343);
        Field11583 = this;
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field11585);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field11585);
    }

    private void Method3585(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketChat)) return;
        if (!((SPacketChat)class544.Method982()).isSystem()) {
            return;
        }
        String string = ((SPacketChat)class544.Method982()).chatComponent.getFormattedText();
        Iterator iterator = this.Field11584.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                ((SPacketChat)class544.Method982()).chatComponent = new TextComponentString(string);
                return;
            }
            String string2 = (String)iterator.next();
            string = string.replaceAll(string2, "");
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x1806 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

