//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import com.kisman.cc.util.*;

public class Class276 extends Class158
{
    private String Field9214 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class276() {
        super("itemname");
    }
    
    public String Method447() {
        return "Changes the name of an Item when ItemRenamer is enabled";
    }
    
    public String Method448() {
        return "itemname <original item name> <new item name>";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 1) {
            this.Method438("To few arguments: " + this.Method448());
            return;
        }
        final String s2 = array[0];
        final Item item = (Item)Item.REGISTRY.getObject((Object)new ResourceLocation(s2));
        if (item == null) {
            this.Method438("Could not find item: " + s2);
            return;
        }
        if (array.length >= 2) {
            final String string = Class2131.Method7669((CharSequence[])array, 1, array.length).toString();
            Class496.Field10058.put(item, string);
            this.Method437("Successfully changed name to: " + string);
            return;
        }
        final String s3 = Class496.Field10059.get(item);
        if (s3 == null) {
            return;
        }
        Class496.Field10058.put(item, s3);
        this.Method437("Successfully reset: " + s2);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x412A ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
