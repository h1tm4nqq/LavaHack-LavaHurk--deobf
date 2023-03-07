//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.EuozWlXfatDJBw011lSGqCUJRn70lupn;
import lavahack.client.Sv29wE551AqbVdEIXquNgSfEAIgOnsoV;
import lavahack.client.vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class CRVKufIsB5B5TedoK53oRMKEmTI1lFCi {
    private static final float Field16677 = 0.0f;
    private final List Field16678 = new ArrayList();
    private String Field16679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public CRVKufIsB5B5TedoK53oRMKEmTI1lFCi(int n) {
        this.Method6977(n);
    }

    public CRVKufIsB5B5TedoK53oRMKEmTI1lFCi() {
        this(Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17654);
    }

    public void Method6977(int n) {
        int n2 = (int)((long)603045924 ^ (long)603045924);
        while (n2 < n) {
            this.Field16678.add(EuozWlXfatDJBw011lSGqCUJRn70lupn.Method7363());
            ++n2;
        }
    }

    public static double Method6978(float f, float f2, float f3, float f4) {
        return Math.sqrt((f - f3) * (f - f3) + (f2 - f4) * (f2 - f4));
    }

    public void Method6979(int n) {
        Iterator iterator = this.Field16678.iterator();
        while (iterator.hasNext()) {
            EuozWlXfatDJBw011lSGqCUJRn70lupn euozWlXfatDJBw011lSGqCUJRn70lupn = (EuozWlXfatDJBw011lSGqCUJRn70lupn)iterator.next();
            euozWlXfatDJBw011lSGqCUJRn70lupn.Method7375(n, Float.intBitsToFloat(0x35900D15 ^ 0x85CC1D8));
        }
    }

    private void Method6980(float f, float f2, float f3, float f4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, float f5) {
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)((int)-89651838L ^ 0xFAA80583));
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnd();
    }

    private void Method6981(float f, float f2, float f3, float f4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)((int)-424196828L ^ 0xE6B748C5));
        GL11.glEnable((int)(((int)-328762603L ^ 0xEC677EE4) << 1));
        GL11.glBlendFunc((int)((int)((long)1982549369 ^ (long)1982549240) << 1), (int)((int)((long)1818778383 ^ (long)1818777612)));
        GL11.glShadeModel((int)((int)-928505707L ^ 0xC8A83D94));
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)((int)((long)1100442962 ^ (long)1100442963)));
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17328);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)((int)((long)647415901 ^ (long)647415228)));
        GL11.glDisable((int)(((int)2147251472L ^ 0x7FFC70E1) << 1));
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void Method6982(float f, float f2, float f3, float f4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)((int)-1020784159L ^ 0xC3281C00));
        GL11.glEnable((int)(((int)597962067L ^ 0x23A428A2) << 1));
        GL11.glBlendFunc((int)((int)((long)-1202981646 ^ (long)-1202981517) << 1), (int)((int)134382606L ^ 0x802870D));
        GL11.glShadeModel((int)((int)((long)-1078677035 ^ (long)-1078678316)));
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)((int)((long)-925297850 ^ (long)-925297849)));
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17328);
        float f6 = f2 >= f4 ? f4 + (f2 - f4) / 2.0f : f2 + (f4 - f2) / 2.0f;
        float f7 = f >= f3 ? f3 + (f - f3) / 2.0f : f + (f3 - f) / 2.0f;
        GL11.glVertex2f((float)f7, (float)f6);
        GL11.glEnd();
        GL11.glBegin((int)((int)-634543600L ^ 0xDA2DA211));
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17328);
        GL11.glVertex2f((float)f7, (float)f6);
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Field17328);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)((int)-1922739117L ^ 0x8D6559B2));
        GL11.glDisable((int)((int)((long)-1338567154 ^ (long)-1338567681) << 1));
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void Method6983(float f, float f2, float f3, float f4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)((int)1819083514L ^ 0x6C6D0F1B));
        GL11.glEnable((int)(((int)715116963L ^ 0x2A9FD452) << 1));
        GL11.glBlendFunc((int)((int)((long)1113140839 ^ (long)1113141222) << 1), (int)((int)386446053L ^ 0x1708B1E6));
        GL11.glShadeModel((int)((int)((long)534714036 ^ (long)534711221)));
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, (float)Float.intBitsToFloat((int)2091791697L ^ 0x3EAE3551));
        GL11.glLineWidth((float)(f5 + Float.intBitsToFloat((int)740907531L ^ 0x6CA95A0B)));
        GL11.glBegin((int)((int)-621590752L ^ 0xDAF34721));
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17327, (float)Float.intBitsToFloat((int)((long)1369576893 ^ (long)329389501)));
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)((int)-242589044L ^ 0xF18A6F6D));
        GL11.glDisable((int)(((int)537367659L ^ 0x2007919A) << 1));
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    public void Method6984() {
        GL11.glPushMatrix();
        GL11.glEnable((int)((int)((long)1550398569 ^ (long)1550397848) << 1));
        GL11.glDisable((int)((int)((long)1229380423 ^ (long)1229379238)));
        GL11.glBlendFunc((int)(((int)1283352592L ^ 0x4C7E6991) << 1), (int)((int)((long)44446762 ^ (long)44447529)));
        GL11.glDisable((int)(((int)440557107L ^ 0x1A425CE2) << 2));
        GL11.glDisable((int)((int)((long)-1997936183 ^ (long)-1997937624)));
        GL11.glDisable((int)((int)((long)911304873 ^ (long)911303640)));
        GL11.glDepthMask((boolean)((long)1215406009 ^ (long)1215406009));
        if (Minecraft.getMinecraft().currentScreen == null) {
            return;
        }
        Iterator iterator = this.Field16678.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)Float.intBitsToFloat((int)((long)1864455352 ^ (long)1344361656)), (float)Float.intBitsToFloat((int)1526855624L ^ 0x6401F7C8), (float)Float.intBitsToFloat((int)924545015L ^ 0x81B6FF7));
                GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glEnable((int)((int)2089945987L ^ 0x7C920662));
                GL11.glPopMatrix();
                GL11.glDepthMask((boolean)((long)-871938394 ^ (long)-871938393));
                GL11.glEnable((int)(((int)1128164425L ^ 0x433E6E98) << 2));
                GL11.glEnable((int)((int)((long)845337139 ^ (long)845340626)));
                GL11.glEnable((int)((int)716556046L ^ 0x2AB5CC7F));
                GL11.glEnable((int)((int)((long)-416376490 ^ (long)-416377673)));
                GL11.glDisable((int)((int)((long)1184907353 ^ (long)1184908712) << 1));
                GL11.glPopMatrix();
                return;
            }
            EuozWlXfatDJBw011lSGqCUJRn70lupn euozWlXfatDJBw011lSGqCUJRn70lupn = (EuozWlXfatDJBw011lSGqCUJRn70lupn)iterator.next();
            if (null.Field11814.Method359().equals(vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15140.name())) {
                euozWlXfatDJBw011lSGqCUJRn70lupn.Field17131.Method3632();
            } else {
                GL11.glColor4f((float)Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17641.Field17325, (float)Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17641.Field17326, (float)Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17641.Field17327, (float)euozWlXfatDJBw011lSGqCUJRn70lupn.Method7366());
            }
            if (Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17653) {
                GL11.glPointSize((float)(euozWlXfatDJBw011lSGqCUJRn70lupn.Method7369() * Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17652));
                GL11.glBegin((int)((int)((long)-2064153283 ^ (long)-2064153283)));
                GL11.glVertex2f((float)euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), (float)euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371());
                GL11.glEnd();
            }
            int n = Mouse.getEventX() * Minecraft.getMinecraft().currentScreen.width / Minecraft.getMinecraft().displayWidth;
            int n2 = Minecraft.getMinecraft().currentScreen.height - Mouse.getEventY() * Minecraft.getMinecraft().currentScreen.height / Minecraft.getMinecraft().displayHeight - (int)((long)74929042 ^ (long)74929043);
            float f = 0.0f;
            EuozWlXfatDJBw011lSGqCUJRn70lupn euozWlXfatDJBw011lSGqCUJRn70lupn2 = null;
            int n3 = ((int)-814610663L ^ 0xCF720700) << 2;
            for (EuozWlXfatDJBw011lSGqCUJRn70lupn euozWlXfatDJBw011lSGqCUJRn70lupn3 : this.Field16678) {
                float f2 = euozWlXfatDJBw011lSGqCUJRn70lupn.Method7367(euozWlXfatDJBw011lSGqCUJRn70lupn3);
                if (!(f2 <= Float.intBitsToFloat(0x15271497 ^ 0x57EF1497)) || !(CRVKufIsB5B5TedoK53oRMKEmTI1lFCi.Method6978(n, n2, euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371()) <= Double.longBitsToDouble(0xF79A9FA43A1C5D2DL ^ 0xB7C39FA43A1C5D2DL)) && !(CRVKufIsB5B5TedoK53oRMKEmTI1lFCi.Method6978(n, n2, euozWlXfatDJBw011lSGqCUJRn70lupn3.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn3.Method7371()) <= Double.longBitsToDouble((long)1184297759 ^ 0x405900004696F31FL))) continue;
                Float.compare(f, 0.0f);
                f = f2;
                euozWlXfatDJBw011lSGqCUJRn70lupn2 = euozWlXfatDJBw011lSGqCUJRn70lupn3;
            }
            if (euozWlXfatDJBw011lSGqCUJRn70lupn2 == null || !Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17650) continue;
            if (Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17645) {
                if (Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17647.equals(Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17648)) {
                    this.Method6981(euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7371(), Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17642, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17643, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17646);
                    continue;
                }
                if (Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17647.equals(Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17649)) {
                    this.Method6982(euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7371(), Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17642, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17644, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17643, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17646);
                    continue;
                }
                this.Method6980(euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7371(), Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17641, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17646);
                continue;
            }
            this.Method6980(euozWlXfatDJBw011lSGqCUJRn70lupn.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn.Method7371(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7370(), euozWlXfatDJBw011lSGqCUJRn70lupn2.Method7371(), Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17641, Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Field17646);
        }
    }

    public void Method6985() {
        Sv29wE551AqbVdEIXquNgSfEAIgOnsoV.Method7657();
    }
}

