//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1393;
import lavahack.client.Class158;
import lavahack.client.Class2045;
import lavahack.client.Class264;
import lavahack.client.Class967;
import net.minecraft.util.text.TextFormatting;

public class Class554
extends Class158 {
    private String Field10352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class554() {
        super("help");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (Class554.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.currentScreen instanceof Class264) {
            List list = Class2045.Field17384.values().stream().sorted(Comparator.comparing(Class158::Method442)).collect(Collectors.toList());
            this.Method437("Command:");
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Class158 class158 = (Class158)iterator.next();
                String string2 = Class554.Method2462(class158.Method442());
                String string3 = Class554.Method2462(class158.Method448());
                String string4 = Class554.Method2462(class158.Method447());
                new Class967(TextFormatting.GOLD + "> Command: " + string2).Method167();
                new Class967(TextFormatting.GREEN + ">> Usage: " + TextFormatting.RESET + string3).Method167();
                new Class967(TextFormatting.DARK_GREEN + ">> Description: " + TextFormatting.RESET + string4).Method167();
            }
            return;
        }
        List list = Class2045.Field17384.values().stream().sorted(Comparator.comparing(Class158::Method442)).collect(Collectors.toList());
        Class1393.Method5503().Method1892("Commands:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class158 class158 = (Class158)iterator.next();
            String string5 = Class554.Method2462(class158.Method442());
            String string6 = Class554.Method2462(class158.Method448());
            String string7 = Class554.Method2462(class158.Method447());
            Class1393.Method5506().Method1875(ChatFormatting.GOLD + "> Command: " + string5);
            Class1393.Method5506().Method1875(ChatFormatting.GREEN + ">> Usage: " + ChatFormatting.RESET + string6);
            Class1393.Method5506().Method1875(ChatFormatting.DARK_GREEN + ">> Description: " + ChatFormatting.RESET + string7);
        }
    }

    private static String Method2462(String string) {
        if (string == null) {
            return "(not available)";
        }
        String string2 = string;
        return string2;
    }

    @Override
    public String Method447() {
        return "help of commands";
    }

    @Override
    public String Method448() {
        return "help";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x5EBD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

