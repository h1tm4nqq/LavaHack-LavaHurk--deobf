//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hmXFVV70oFXtttAHGMjr2omukv6a6rhh;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class LI3uerJ5t2CxfQoWFESvEIiZlzk71f7R
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field9214 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LI3uerJ5t2CxfQoWFESvEIiZlzk71f7R() {
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
        if (stringArray.length < ((int)-249116390L ^ 0xF126C91B)) {
            this.Method438("To few arguments: " + this.Method448());
            return;
        }
        String string2 = stringArray[(int)-540323152L ^ 0xDFCB52B0];
        Item item = (Item)Item.REGISTRY.getObject((Object)new ResourceLocation(string2));
        if (item == null) {
            this.Method438("Could not find item: " + string2);
            return;
        }
        if (stringArray.length >= (int)((long)728604519 ^ (long)728604518) << 1) {
            String string3 = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Method7669(stringArray, (int)((long)-27735971 ^ (long)-27735972), stringArray.length).toString();
            hmXFVV70oFXtttAHGMjr2omukv6a6rhh.Field10058.put(item, string3);
            this.Method437("Successfully changed name to: " + string3);
            return;
        }
        String string4 = (String)hmXFVV70oFXtttAHGMjr2omukv6a6rhh.Field10059.get(item);
        if (string4 == null) {
            return;
        }
        hmXFVV70oFXtttAHGMjr2omukv6a6rhh.Field10058.put(item, string4);
        this.Method437("Successfully reset: " + string2);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1711653786L ^ 0x99FA3C66;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1474195664 ^ (long)1474195503);
            int n2 = ((int)1222828092L ^ 0x48E2E031) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1801164605 ^ (long)-1801172906) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

