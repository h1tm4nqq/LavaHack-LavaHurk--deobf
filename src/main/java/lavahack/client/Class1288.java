//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;
import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1288 extends Class42
{
    public static Class1288 Field13877;
    public final Class44 Field13878;
    public final Class44 Field13879;
    public final Class44 Field13880;
    public final Class44 Field13881;
    public final Class44 Field13882;
    private Field Field13883;
    private Field Field13884;
    private String Field13885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1288() {
        super("BookFormatModule", "", Class97.Field8344);
        this.Field13878 = this.Method23(new Class44("Outline", this, true));
        this.Field13879 = this.Method23(new Class44("Outline Color", this, new Class2027(255, 0, 0, 255)));
        this.Field13880 = this.Method23(new Class44("Filled", this, true));
        this.Field13881 = this.Method23(new Class44("Outline Color", this, new Class2027(20, 20, 20, 255)));
        this.Field13882 = this.Method23(new Class44("Text Colour", this, new Class2027(255, 255, 255, 255)));
        Class1288.Field13877 = this;
        final Class<GuiScreenBook> clazz = GuiScreenBook.class;
        (this.Field13883 = clazz.getDeclaredField("book")).setAccessible(true);
        (this.Field13884 = clazz.getDeclaredField("bookIsUnsigned")).setAccessible(true);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5237(final GuiOpenEvent guiOpenEvent) {
        if (guiOpenEvent.getGui() instanceof GuiScreenBook) {
            final GuiScreenBook guiScreenBook = (GuiScreenBook)guiOpenEvent.getGui();
            if (guiScreenBook instanceof Class427) {
                return;
            }
            if (this.Field13884.get(guiScreenBook)) {
                guiOpenEvent.setGui((GuiScreen)new Class427((EntityPlayer)Class1288.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (ItemStack)this.Field13883.get(guiScreenBook)));
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F0C ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
