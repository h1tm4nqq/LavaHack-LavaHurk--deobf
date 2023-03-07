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
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.kKWa1Bd6Z8DgzTW4joOozA4fI2N7dcL3;
import lavahack.client.kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import lavahack.client.tSCGodJYXU9nrxDrp2uram62eisBuqDE;
import lavahack.client.v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU
extends QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP {
    private static final v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v Field10008 = new v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v(((int)-373595963L ^ 0xE9BB60C4) != 0);
    private static final v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v Field10009 = new v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v(((int)-2022714102L ^ 0x876FD50A) != 0);
    private kKWa1Bd6Z8DgzTW4joOozA4fI2N7dcL3 Field10010;
    private GuiButton Field10011 = null;
    private GuiButton Field10012 = null;
    private final String Field10013 = I18n.format((String)"schematica.gui.title", (Object[])new Object[(int)-1330625431L ^ 0xB0B04469]);
    private final String Field10014 = I18n.format((String)"schematica.gui.folderInfo", (Object[])new Object[(int)((long)-2063891491 ^ (long)-2063891491)]);
    private String Field10015 = I18n.format((String)"schematica.gui.noschematic", (Object[])new Object[(int)((long)952261271 ^ (long)952261271)]);
    protected File Field10016 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990;
    protected final List Field10017 = new ArrayList();
    private int Field10018;

    public obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU(GuiScreen guiScreen) {
        super(guiScreen);
    }

    @Override
    public void initGui() {
        int n = (int)((long)-676488340 ^ (long)-676488340);
        this.Field10011 = new GuiButton(n++, this.width / ((int)((long)-1582068713 ^ (long)-1582068714) << 1) - (((int)-451956483L ^ 0xE50FB0B0) << 1), this.height - (((int)-1249649947L ^ 0xB583DAEC) << 2), ((int)548171118L ^ 0x20AC6D25) << 1, ((int)-2051082171L ^ 0x85BEF840) << 2, I18n.format((String)"schematica.gui.openFolder", (Object[])new Object[(int)1586741635L ^ 0x5E93C183]));
        this.buttonList.add(this.Field10011);
        this.Field10012 = new GuiButton(n++, this.width / (((int)97369576L ^ 0x5CDBDE9) << 1) + (((int)1161114781L ^ 0x4535349C) << 2), this.height - (((int)847001767L ^ 0x327C38AE) << 2), ((int)-748378671L ^ 0xD364A59A) << 1, ((int)-223473643L ^ 0xF2AE1010) << 2, I18n.format((String)"schematica.gui.done", (Object[])new Object[(int)1659443792L ^ 0x62E91A50]));
        this.buttonList.add(this.Field10012);
        this.Field10010 = new kKWa1Bd6Z8DgzTW4joOozA4fI2N7dcL3(this);
        this.Method2240();
    }

    public void Method2236() throws IOException {
        super.handleMouseInput();
        this.Field10010.handleMouseInput();
    }

    protected void Method2237(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field10011.id) {
            int n = (int)((long)299852100 ^ (long)299852100);
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[(int)53831937L ^ 0x3356901]).invoke(null, new Object[(int)-656696991L ^ 0xD8DB9961]);
            Class[] classArray = new Class[(int)((long)1441206542 ^ (long)1441206543)];
            classArray[(int)-1733837635L ^ 0x98A7BCBD] = URI.class;
            Object[] objectArray = new Object[(int)1427968095L ^ 0x551D105E];
            objectArray[(int)1341144770L ^ 0x4FF03EC2] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990.toURI();
            clazz.getMethod("browse", classArray).invoke(object, objectArray);
            return;
        }
        if (guiButton.id != this.Field10012.id) {
            this.Field10010.actionPerformed(guiButton);
            return;
        }
        if (Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
            this.Method2241();
        }
        this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.Field10010.drawScreen(n, n2, f);
        this.drawCenteredString(this.fontRenderer, this.Field10013, this.width / (((int)591707937L ^ 0x2344BF20) << 1), ((int)300595415L ^ 0x11EAB8D6) << 2, (int)((long)103951701 ^ (long)114152106));
        this.drawCenteredString(this.fontRenderer, this.Field10014, this.width / ((int)((long)-531011014 ^ (long)-531011013) << 1) - (((int)-389969156L ^ 0xE8C18ADB) << 1), this.height - ((int)((long)-104233294 ^ (long)-104233295) << 2), ((int)1156401890L ^ 0x44EC4BE3) << 7);
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
        int n;
        File[] fileArray;
        File[] fileArray2;
        String string = null;
        Item item = null;
        this.Field10017.clear();
        if (!this.Field10016.getCanonicalPath().equals(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990.getCanonicalPath())) {
            this.Field10017.add(new tSCGodJYXU9nrxDrp2uram62eisBuqDE("..", Items.LAVA_BUCKET, (int)((long)1082091374 ^ (long)1082091374), (boolean)((long)1540091115 ^ (long)1540091114)));
        }
        if ((fileArray2 = this.Field10016.listFiles(Field10008)) == null) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("listFiles returned null (directory: {})!", (Object)this.Field10016);
        } else {
            Arrays.sort(fileArray2, (file, file2) -> file.getName().compareToIgnoreCase(file2.getName()));
            fileArray = fileArray2;
            int n2 = fileArray.length;
            for (n = (int)-609562657L ^ 0xDBAACFDF; n < n2; ++n) {
                File file3 = fileArray[n];
                if (file3 == null) continue;
                string = file3.getName();
                object = file3.listFiles();
                item = object == null || ((File[])object).length == 0 ? Items.BUCKET : Items.WATER_BUCKET;
                this.Field10017.add(new tSCGodJYXU9nrxDrp2uram62eisBuqDE(string, item, (int)((long)1745627761 ^ (long)1745627761), file3.isDirectory()));
            }
        }
        fileArray = this.Field10016.listFiles(Field10009);
        if (fileArray == null || fileArray.length == 0) {
            this.Field10017.add(new tSCGodJYXU9nrxDrp2uram62eisBuqDE(this.Field10015, Blocks.DIRT, (int)((long)1058480255 ^ (long)1058480255), ((int)-1734508835L ^ 0x989D7EDD) != 0));
            return;
        }
        Arrays.sort(fileArray, (file, file2) -> file.getName().compareToIgnoreCase(file2.getName()));
        File[] fileArray3 = fileArray;
        n = fileArray3.length;
        int n3 = (int)-1341858025L ^ 0xB004DF17;
        while (n3 < n) {
            object = fileArray3[n3];
            string = ((File)object).getName();
            this.Field10017.add(new tSCGodJYXU9nrxDrp2uram62eisBuqDE(string, kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1529((File)object), ((File)object).isDirectory()));
            ++n3;
        }
    }

    private void Method2241() {
        int n = this.Field10010.Field17515;
        if (n < 0) return;
        if (n >= this.Field10017.size()) return;
        tSCGodJYXU9nrxDrp2uram62eisBuqDE tSCGodJYXU9nrxDrp2uram62eisBuqDE2 = (tSCGodJYXU9nrxDrp2uram62eisBuqDE)this.Field10017.get(n);
        if (!Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method417(null, this.Field10016, tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1049())) return;
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) return;
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method425(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
    }

    private static String Method2244(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-950005393L ^ 0xC760116F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1391922338 ^ (long)-1391922271);
            int n2 = (int)((long)1975188485 ^ (long)1975188524) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-181280058 ^ (long)-181299621) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

