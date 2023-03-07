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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.lang.reflect.Field;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lBrg2MUDA5p5lrnps5flXoe96O0snUin;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z Field13877;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13878 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1979445196 ^ (long)1979445197)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13879 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-714284310L ^ 0xD56CE215, (int)((long)-1981191897 ^ (long)-1981191897), (int)-212736307L ^ 0xF351E6CD, (int)-2047414190L ^ 0x85F6F0AD)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13880 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Filled", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2144653602L ^ 0x7FD4D123) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13881 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(((int)1819917591L ^ 0x6C79BD12) << 2, (int)((long)306517041 ^ (long)306517044) << 2, ((int)1533005765L ^ 0x5B5FCFC0) << 2, (int)((long)1731953338 ^ (long)1731953221))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13882 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Text Colour", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)458362813 ^ (long)458362690), (int)-1556845708L ^ 0xA3346B8B, (int)((long)1469395012 ^ (long)1469395131), (int)1312635283L ^ 0x4E3D396C)));
    private Field Field13883;
    private Field Field13884;
    private String Field13885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z() {
        super("BookFormatModule", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
        Field13877 = this;
        Class<GuiScreenBook> clazz = GuiScreenBook.class;
        this.Field13883 = clazz.getDeclaredField("book");
        this.Field13883.setAccessible((boolean)((long)339497218 ^ (long)339497219));
        this.Field13884 = clazz.getDeclaredField("bookIsUnsigned");
        this.Field13884.setAccessible(((int)1254141490L ^ 0x4AC0AE33) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5237(GuiOpenEvent guiOpenEvent) {
        if (!(guiOpenEvent.getGui() instanceof GuiScreenBook)) return;
        GuiScreenBook guiScreenBook = (GuiScreenBook)guiOpenEvent.getGui();
        if (guiScreenBook instanceof lBrg2MUDA5p5lrnps5flXoe96O0snUin) {
            return;
        }
        if ((Boolean)this.Field13884.get(guiScreenBook) == false) return;
        ItemStack itemStack = (ItemStack)this.Field13883.get(guiScreenBook);
        guiOpenEvent.setGui((GuiScreen)new lBrg2MUDA5p5lrnps5flXoe96O0snUin((EntityPlayer)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, itemStack));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1522432184 ^ (long)-1522432184);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-679141032L ^ 0xD78521A7);
            int n2 = (int)902710168L ^ 0x35CE43A1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-590011922L ^ 0xDCD5322D) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

