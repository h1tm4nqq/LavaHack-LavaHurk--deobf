//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiScreenBook
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.lang.reflect.Field;
import lavahack.client.Class42;
import lavahack.client.Class427;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1288
extends Class42 {
    public static Class1288 Field13877;
    public final Class44 Field13878 = this.Method23(new Class44("Outline", (Class42)this, true));
    public final Class44 Field13879 = this.Method23(new Class44("Outline Color", (Class42)this, new Class2027(255, 0, 0, 255)));
    public final Class44 Field13880 = this.Method23(new Class44("Filled", (Class42)this, true));
    public final Class44 Field13881 = this.Method23(new Class44("Outline Color", (Class42)this, new Class2027(20, 20, 20, 255)));
    public final Class44 Field13882 = this.Method23(new Class44("Text Colour", (Class42)this, new Class2027(255, 255, 255, 255)));
    private Field Field13883;
    private Field Field13884;
    private String Field13885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1288() {
        super("BookFormatModule", "", Class97.Field8344);
        Field13877 = this;
        Class<GuiScreenBook> clazz = GuiScreenBook.class;
        this.Field13883 = clazz.getDeclaredField("book");
        this.Field13883.setAccessible(true);
        this.Field13884 = clazz.getDeclaredField("bookIsUnsigned");
        this.Field13884.setAccessible(true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5237(GuiOpenEvent guiOpenEvent) {
        if (!(guiOpenEvent.getGui() instanceof GuiScreenBook)) return;
        GuiScreenBook guiScreenBook = (GuiScreenBook)guiOpenEvent.getGui();
        if (guiScreenBook instanceof Class427) {
            return;
        }
        if ((Boolean)this.Field13884.get(guiScreenBook) == false) return;
        ItemStack itemStack = (ItemStack)this.Field13883.get(guiScreenBook);
        guiOpenEvent.setGui((GuiScreen)new Class427((EntityPlayer)Class1288.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, itemStack));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 57;
            cArray2[n] = (char)(cArray[n] ^ (0x4F0C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

