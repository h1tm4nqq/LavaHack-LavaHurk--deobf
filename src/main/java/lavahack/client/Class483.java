//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package lavahack.client;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lavahack.client.Class1169;
import lavahack.client.Class1479;
import lavahack.client.Class156;
import lavahack.client.Class2083;
import lavahack.client.Class2101;
import lavahack.client.Class292;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class542;
import lavahack.client.Class593;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Class483
extends Class593 {
    private static final Class1169 Field10008 = new Class1169(true);
    private static final Class1169 Field10009 = new Class1169(false);
    private Class2083 Field10010;
    private GuiButton Field10011 = null;
    private GuiButton Field10012 = null;
    private final String Field10013 = I18n.format((String)"schematica.gui.title", (Object[])new Object[0]);
    private final String Field10014 = I18n.format((String)"schematica.gui.folderInfo", (Object[])new Object[0]);
    private String Field10015 = I18n.format((String)"schematica.gui.noschematic", (Object[])new Object[0]);
    protected File Field10016 = Class32.Field7990;
    protected final List Field10017 = new ArrayList();
    private int Field10018;

    public Class483(GuiScreen guiScreen) {
        super(guiScreen);
    }

    @Override
    public void initGui() {
        int n = 0;
        this.Field10011 = new GuiButton(n++, this.width / 2 - 154, this.height - 36, 150, 20, I18n.format((String)"schematica.gui.openFolder", (Object[])new Object[0]));
        this.buttonList.add(this.Field10011);
        this.Field10012 = new GuiButton(n++, this.width / 2 + 4, this.height - 36, 150, 20, I18n.format((String)"schematica.gui.done", (Object[])new Object[0]));
        this.buttonList.add(this.Field10012);
        this.Field10010 = new Class2083(this);
        this.Method2240();
    }

    public void Method2236() throws IOException {
        super.handleMouseInput();
        this.Field10010.handleMouseInput();
    }

    protected void Method2237(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field10011.id) {
            boolean bl = false;
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, Class32.Field7990.toURI());
            return;
        }
        if (guiButton.id != this.Field10012.id) {
            this.Field10010.actionPerformed(guiButton);
            return;
        }
        if (Class2101.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
            this.Method2241();
        }
        this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.Field10010.drawScreen(n, n2, f);
        this.drawCenteredString(this.fontRenderer, this.Field10013, this.width / 2, 4, 0xFFFFFF);
        this.drawCenteredString(this.fontRenderer, this.Field10014, this.width / 2 - 78, this.height - 12, 0x808080);
        super.drawScreen(n, n2, f);
    }

    public void Method2238() {
    }

    protected void Method2239(String string) {
        this.Field10016 = new File(this.Field10016, string);
        this.Field10016 = this.Field10016.getCanonicalFile();
        this.Method2240();
    }

    protected void Method2240() {
        Object object;
        File[] fileArray;
        String string = null;
        Item item = null;
        this.Field10017.clear();
        if (!this.Field10016.getCanonicalPath().equals(Class32.Field7990.getCanonicalPath())) {
            this.Field10017.add(new Class156("..", Items.LAVA_BUCKET, 0, true));
        }
        if ((fileArray = this.Field10016.listFiles(Field10008)) == null) {
            Class542.Field10314.error("listFiles returned null (directory: {})!", (Object)this.Field10016);
        } else {
            Arrays.sort(fileArray, (file, file2) -> file.getName().compareToIgnoreCase(file2.getName()));
            for (File file3 : fileArray) {
                if (file3 == null) continue;
                string = file3.getName();
                object = file3.listFiles();
                item = object == null || ((File[])object).length == 0 ? Items.BUCKET : Items.WATER_BUCKET;
                this.Field10017.add(new Class156(string, item, 0, file3.isDirectory()));
            }
        }
        File[] fileArray2 = this.Field10016.listFiles(Field10009);
        if (fileArray2 == null || fileArray2.length == 0) {
            this.Field10017.add(new Class156(this.Field10015, Blocks.DIRT, 0, false));
            return;
        }
        Arrays.sort(fileArray2, (file, file2) -> file.getName().compareToIgnoreCase(file2.getName()));
        File[] fileArray3 = fileArray2;
        int n = fileArray3.length;
        int n2 = 0;
        while (n2 < n) {
            object = fileArray3[n2];
            string = ((File)object).getName();
            this.Field10017.add(new Class156(string, Class292.Method1529((File)object), ((File)object).isDirectory()));
            ++n2;
        }
    }

    private void Method2241() {
        int n = this.Field10010.Field17515;
        if (n < 0) return;
        if (n >= this.Field10017.size()) return;
        Class156 class156 = (Class156)this.Field10017.get(n);
        if (!Class2101.Field17565.Method417(null, this.Field10016, class156.Method1049())) return;
        Class1479 class1479 = Class46.Field8122;
        if (class1479 == null) return;
        Class46.Method425(class1479);
    }

    private static String Method2244(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 82;
            cArray2[n] = (char)(cArray[n] ^ (0x749D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

