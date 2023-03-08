//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraft.client.resources.*;
import java.net.*;
import java.io.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.entity.player.*;

public class Class483 extends Class593
{
    private static final Class1169 Field10008;
    private static final Class1169 Field10009;
    private Class2083 Field10010;
    private GuiButton Field10011;
    private GuiButton Field10012;
    private final String Field10013;
    private final String Field10014;
    private String Field10015;
    protected File Field10016;
    protected final List Field10017;
    private int Field10018;
    
    public Class483(final GuiScreen guiScreen) {
        super(guiScreen);
        this.Field10011 = null;
        this.Field10012 = null;
        this.Field10013 = I18n.format("schematica.gui.title", new Object[0]);
        this.Field10014 = I18n.format("schematica.gui.folderInfo", new Object[0]);
        this.Field10015 = I18n.format("schematica.gui.noschematic", new Object[0]);
        this.Field10016 = Class32.Field7990;
        this.Field10017 = new ArrayList();
    }
    
    @Override
    public void initGui() {
        int n = 0;
        this.Field10011 = new GuiButton(n++, this.width / 2 - 154, this.height - 36, 150, 20, I18n.format("schematica.gui.openFolder", new Object[0]));
        this.buttonList.add(this.Field10011);
        this.Field10012 = new GuiButton(n++, this.width / 2 + 4, this.height - 36, 150, 20, I18n.format("schematica.gui.done", new Object[0]));
        this.buttonList.add(this.Field10012);
        this.Field10010 = new Class2083(this);
        this.Method2240();
    }
    
    public void Method2236() throws IOException {
        super.handleMouseInput();
        this.Field10010.handleMouseInput();
    }
    
    protected void Method2237(final GuiButton guiButton) {
        if (guiButton.enabled) {
            if (guiButton.id == this.Field10011.id) {
                final Class<?> forName = Class.forName("java.awt.Desktop");
                forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), Class32.Field7990.toURI());
            }
            else if (guiButton.id == this.Field10012.id) {
                if (Class2101.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
                    this.Method2241();
                }
                this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            else {
                this.Field10010.actionPerformed(guiButton);
            }
        }
    }
    
    @Override
    public void drawScreen(final int n, final int n2, final float n3) {
        this.Field10010.drawScreen(n, n2, n3);
        this.drawCenteredString(this.fontRenderer, this.Field10013, this.width / 2, 4, 16777215);
        this.drawCenteredString(this.fontRenderer, this.Field10014, this.width / 2 - 78, this.height - 12, 8421504);
        super.drawScreen(n, n2, n3);
    }
    
    public void Method2238() {
    }
    
    protected void Method2239(final String child) {
        this.Field10016 = new File(this.Field10016, child);
        this.Field10016 = this.Field10016.getCanonicalFile();
        this.Method2240();
    }
    
    protected void Method2240() {
        this.Field10017.clear();
        if (!this.Field10016.getCanonicalPath().equals(Class32.Field7990.getCanonicalPath())) {
            this.Field10017.add(new Class156("..", Items.LAVA_BUCKET, 0, true));
        }
        final File[] listFiles = this.Field10016.listFiles((FileFilter)Class483.Field10008);
        if (listFiles == null) {
            Class542.Field10314.error("listFiles returned null (directory: {})!", (Object)this.Field10016);
        }
        else {
            Arrays.sort(listFiles, (file, file3) -> file.getName().compareToIgnoreCase(file3.getName()));
            for (final File file5 : listFiles) {
                if (file5 != null) {
                    final String name = file5.getName();
                    final File[] listFiles2 = file5.listFiles();
                    this.Field10017.add(new Class156(name, (listFiles2 == null || listFiles2.length == 0) ? Items.BUCKET : Items.WATER_BUCKET, 0, file5.isDirectory()));
                }
            }
        }
        final File[] listFiles3 = this.Field10016.listFiles((FileFilter)Class483.Field10009);
        if (listFiles3 == null || listFiles3.length == 0) {
            this.Field10017.add(new Class156(this.Field10015, Blocks.DIRT, 0, false));
        }
        else {
            Arrays.sort(listFiles3, (file2, file4) -> file2.getName().compareToIgnoreCase(file4.getName()));
            for (final File file6 : listFiles3) {
                this.Field10017.add(new Class156(file6.getName(), Class292.Method1529(file6), file6.isDirectory()));
            }
        }
    }
    
    private void Method2241() {
        final int field17515 = this.Field10010.Field17515;
        if (field17515 >= 0 && field17515 < this.Field10017.size() && Class2101.Field17565.Method417((EntityPlayer)null, this.Field10016, ((Class156)this.Field10017.get(field17515)).Method1049())) {
            final Class1479 field17516 = Class46.Field8122;
            if (field17516 != null) {
                Class46.Method425(field17516);
            }
        }
    }
    
    static {
        Field10008 = new Class1169(true);
        Field10009 = new Class1169(false);
    }
    
    private static String Method2244(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x749D ^ 0x52));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
