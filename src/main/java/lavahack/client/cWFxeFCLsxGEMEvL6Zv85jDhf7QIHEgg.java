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
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08;
import lavahack.client.k4TF8hWLqptlwihhISw1ydv1kbHGy2aB;
import net.minecraft.util.text.TextFormatting;

public class cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field10352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg() {
        super("help");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.currentScreen instanceof ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk) {
            List list = k4TF8hWLqptlwihhISw1ydv1kbHGy2aB.Field17384.values().stream().sorted(Comparator.comparing(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj::Method442)).collect(Collectors.toList());
            this.Method437("Command:");
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj = (FrvoqED59Mj96pmO7hxn2tEew1fZAOzj)iterator.next();
                String string2 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method442());
                String string3 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method448());
                String string4 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method447());
                new cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08(TextFormatting.GOLD + "> Command: " + string2).Method167();
                new cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08(TextFormatting.GREEN + ">> Usage: " + TextFormatting.RESET + string3).Method167();
                new cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08(TextFormatting.DARK_GREEN + ">> Description: " + TextFormatting.RESET + string4).Method167();
            }
            return;
        }
        List list = k4TF8hWLqptlwihhISw1ydv1kbHGy2aB.Field17384.values().stream().sorted(Comparator.comparing(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj::Method442)).collect(Collectors.toList());
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1892("Commands:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj = (FrvoqED59Mj96pmO7hxn2tEew1fZAOzj)iterator.next();
            String string5 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method442());
            String string6 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method448());
            String string7 = cWFxeFCLsxGEMEvL6Zv85jDhf7QIHEgg.Method2462(frvoqED59Mj96pmO7hxn2tEew1fZAOzj.Method447());
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1875(ChatFormatting.GOLD + "> Command: " + string5);
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1875(ChatFormatting.GREEN + ">> Usage: " + ChatFormatting.RESET + string6);
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1875(ChatFormatting.DARK_GREEN + ">> Description: " + ChatFormatting.RESET + string7);
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
        int n = (int)-38588965L ^ 0xFDB32DDB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1636025375 ^ (long)1636025568);
            int n2 = (int)((long)-1116419897 ^ (long)-1116419890) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)256706345L ^ 0xF4D5994 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

