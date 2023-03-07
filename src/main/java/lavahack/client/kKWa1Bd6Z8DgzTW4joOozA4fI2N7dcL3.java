//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiSlot
 *  net.minecraft.client.renderer.Tessellator
 */
package lavahack.client;

import lavahack.client.obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU;
import lavahack.client.q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV;
import lavahack.client.tSCGodJYXU9nrxDrp2uram62eisBuqDE;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.Tessellator;
import org.apache.commons.io.FilenameUtils;

public class kKWa1Bd6Z8DgzTW4joOozA4fI2N7dcL3
extends GuiSlot {
    private final Minecraft Field17513 = Minecraft.getMinecraft();
    private final obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU Field17514;
    protected int Field17515 = (int)((long)-370227920 ^ (long)370227919);
    private long Field17516 = 0L;
    private int Field17517;

    public kKWa1Bd6Z8DgzTW4joOozA4fI2N7dcL3(obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU2) {
        super(Minecraft.getMinecraft(), obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU2.width, obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU2.height, ((int)-1831524797L ^ 0x92D52642) << 4, obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU2.height - ((int)((long)1157377414 ^ (long)1157377411) << 3), ((int)-100290848L ^ 0xFA05AEE3) << 3);
        this.Field17514 = obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU2;
    }

    protected int getSize() {
        return this.Field17514.Field10017.size();
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        int n4 = Minecraft.getSystemTime() - this.Field17516 < (0x58601F4L & 0x20829F4L) ? (int)((long)1182178529 ^ (long)1182178528) : (int)2000312849L ^ 0x773A5A11;
        this.Field17516 = Minecraft.getSystemTime();
        tSCGodJYXU9nrxDrp2uram62eisBuqDE tSCGodJYXU9nrxDrp2uram62eisBuqDE2 = (tSCGodJYXU9nrxDrp2uram62eisBuqDE)this.Field17514.Field10017.get(n);
        if (tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1052()) {
            this.Field17514.Method2239(tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1049());
            this.Field17515 = (int)((long)1923631370 ^ (long)-1923631371);
            return;
        }
        this.Field17515 = n;
    }

    protected boolean isSelected(int n) {
        int n2;
        if (n == this.Field17515) {
            n2 = (int)((long)-1442543814 ^ (long)-1442543813);
            return n2 != 0;
        }
        n2 = (int)((long)-773547997 ^ (long)-773547997);
        return n2 != 0;
    }

    protected void drawBackground() {
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    protected void drawSlot(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        if (n < 0) return;
        if (n >= this.Field17514.Field10017.size()) {
            return;
        }
        tSCGodJYXU9nrxDrp2uram62eisBuqDE tSCGodJYXU9nrxDrp2uram62eisBuqDE2 = (tSCGodJYXU9nrxDrp2uram62eisBuqDE)this.Field17514.Field10017.get(n);
        String string = tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1049();
        string = tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1052() ? string + "/" : FilenameUtils.getBaseName(string);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7538(this.Field17513.renderEngine, tSCGodJYXU9nrxDrp2uram62eisBuqDE2.Method1053(), n2, n3);
        this.Field17514.drawString(this.Field17513.fontRenderer, string, n2 + ((int)((long)-2061696726 ^ (long)-2061696727) << 3), n3 + ((int)((long)-1711889385 ^ (long)-1711889388) << 1), (int)((long)932451302 ^ (long)929819673));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)389150375 ^ (long)389150375);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)355023192 ^ (long)355023271);
            int n2 = (int)((long)1352783220 ^ (long)1352783215) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-418409152L ^ 0xE70FBEA1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

