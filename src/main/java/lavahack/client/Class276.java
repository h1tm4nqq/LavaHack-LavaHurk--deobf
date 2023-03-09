//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.Class2131;
import lavahack.client.Class158;
import lavahack.client.Class496;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class Class276
extends Class158 {
    private String Field9214 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class276() {
        super("itemname");
    }

    @Override
    public String Method447() {
        return "Changes the name of an Item when ItemRenamer is enabled";
    }

    @Override
    public String Method448() {
        return "itemname <original item name> <new item name>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < 1) {
            this.Method438("To few arguments: " + this.Method448());
            return;
        }
        String string2 = stringArray[0];
        Item item = (Item)Item.REGISTRY.getObject((Object)new ResourceLocation(string2));
        if (item == null) {
            this.Method438("Could not find item: " + string2);
            return;
        }
        if (stringArray.length >= 2) {
            String string3 = Class2131.Method7669(stringArray, 1, stringArray.length).toString();
            Class496.Field10058.put(item, string3);
            this.Method437("Successfully changed name to: " + string3);
            return;
        }
        String string4 = (String)Class496.Field10059.get(item);
        if (string4 == null) {
            return;
        }
        Class496.Field10058.put(item, string4);
        this.Method437("Successfully reset: " + string2);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x412A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

