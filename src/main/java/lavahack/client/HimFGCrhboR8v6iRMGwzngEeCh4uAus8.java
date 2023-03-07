/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL41
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL41;

public class HimFGCrhboR8v6iRMGwzngEeCh4uAus8
implements EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP {
    private String Field10326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method2445(double d, double d2, double d3, double d4, Color color) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)((long)-152961502 ^ (long)-152961499), (int)d / (((int)-978806419L ^ 0xC5A8996C) << 1), (int)d2 / ((int)((long)-1421005409 ^ (long)-1421005410) << 1), (int)d / ((int)((long)-1664532276 ^ (long)-1664532275) << 1) + (int)d3 / ((int)((long)1271402123 ^ (long)1271402122) << 1), (int)d2 / ((int)((long)1829195434 ^ (long)1829195435) << 1) + (int)d4 / ((int)((long)-847345982 ^ (long)-847345981) << 1), color.getRGB());
    }

    @Override
    public void Method2444(float f, float f2, int n, int n2) {
        float f3 = (float)(n2 >> (((int)944198490L ^ 0x38475359) << 3) & (int)((long)693426023 ^ (long)693426072)) / Float.intBitsToFloat((int)((long)1790628439 ^ (long)700830295));
        float f4 = (float)(n2 >> (((int)648599344L ^ 0x26A8D731) << 4) & ((int)1855274127L ^ 0x6E953C70)) / Float.intBitsToFloat((int)((long)1443382925 ^ (long)360138381));
        float f5 = (float)(n2 >> ((int)((long)806683419 ^ (long)806683418) << 3) & ((int)621928110L ^ 0x2511DE51)) / Float.intBitsToFloat((int)706251857L ^ 0x69678C51);
        float f6 = (float)(n2 & (int)((long)411807075 ^ (long)411807132)) / Float.intBitsToFloat(0x1B62F4B9 ^ 0x581DF4B9);
        GL11.glPushMatrix();
        GL11.glEnable((int)((int)((long)-1941636057 ^ (long)-1941636650) << 1));
        GL11.glBlendFunc((int)((int)((long)1441740483 ^ (long)1441740610) << 1), (int)((int)((long)1589261637 ^ (long)1589261894)));
        GL11.glDisable((int)((int)362621838L ^ 0x159D266F));
        GL11.glEnable((int)(((int)1774406220L ^ 0x69C34A15) << 5));
        GL11.glBlendFunc((int)(((int)-1267997145L ^ 0xB46BE7A6) << 1), (int)((int)1215822633L ^ 0x4877F82A));
        GL11.glLineWidth((float)Float.intBitsToFloat((int)1615879972L ^ 0x20105F24));
        GL11.glBegin((int)((int)((long)-1233902407 ^ (long)-1233902406)));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(0x876F6008F425D606L ^ 0xC7766008F425D606L)), (double)(f2 + Float.intBitsToFloat((int)1737226629L ^ 0x27BBF985)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(0x2A16CF72CBA2D11DL ^ 0x6A31CF72CBA2D11DL)), (double)(f2 + Float.intBitsToFloat(0x26CFF29C ^ 0x67EBF29C)));
        GL11.glVertex2d((double)(f + (float)n - Float.intBitsToFloat((int)((long)620986702 ^ (long)1683980622))), (double)(f2 + Float.intBitsToFloat((int)((long)141515830 ^ (long)1217879094))));
        GL11.glEnd();
        GL11.glLineWidth((float)Float.intBitsToFloat((int)((long)560008881 ^ (long)513871537)));
        GL11.glBegin((int)((int)((long)-1939188069 ^ (long)-1939188072)));
        GL11.glColor4f((float)f4, (float)f5, (float)f6, (float)f3);
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble((long)1084099192 ^ 0x401A0000409E0A78L)), (double)(f2 + Float.intBitsToFloat(0x58ED1CBE ^ 0x18AD1CBE)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble((long)1465836142 ^ 0x40270000575EE26EL)), (double)(f2 + Float.intBitsToFloat((int)412067433L ^ 0x59AFA669)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(0xC78B826D02CAF498L ^ 0x87A0826D02CAF498L)), (double)(f2 + Float.intBitsToFloat((int)1944658420L ^ 0x32E921F4)));
        GL11.glEnd();
        GL11.glEnable((int)((int)((long)-231568208 ^ (long)-231571119)));
        GL11.glDisable((int)(((int)460327086L ^ 0x1B700D5F) << 1));
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public void Method2446(double d, double d2, double d3, double d4, float f, Color color) {
        if (!null.Field11803.Method365()) {
            return;
        }
        GL11.glLineWidth((float)f);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(((int)-1404913646L ^ 0xAC42B813) << 1, (int)d / (((int)1178440947L ^ 0x463D94F2) << 1), (int)d2 / ((int)((long)1242790199 ^ (long)1242790198) << 1), (int)d / (((int)-611826498L ^ 0xDB8844BF) << 1) + (int)d3 / ((int)((long)-456305584 ^ (long)-456305583) << 1), (int)d2 / ((int)((long)510030977 ^ (long)510030976) << 1) + (int)d4 / ((int)((long)1297085206 ^ (long)1297085207) << 1), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4719(color));
    }

    @Override
    public void Method2447(Color color) {
        zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4730(color);
    }

    @Override
    public void Method2448(int n, int n2, String string, Color color) {
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4743(string, (float)n / 2.0f, (float)(++n2) / 2.0f, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4719(color), (boolean)((long)1673813356 ^ (long)1673813357));
    }

    @Override
    public int Method2449(String string) {
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string) * (((int)-880874711L ^ 0xCB7EEB28) << 1);
    }

    @Override
    public int Method2450(String string) {
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4747(((int)-1135119753L ^ 0xBC577276) != 0) * (((int)1810542271L ^ 0x6BEAAEBE) << 1);
    }

    @Override
    public void Method2451(double d, double d2, double d3, double d4, double d5, double d6, Color color) {
    }

    @Override
    public void Method2452() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)(((int)1376758455L ^ 0x520FAAB6) << 8));
        GL11.glColorMask(((int)-527303810L ^ 0xE091FB7E) != 0, (boolean)((long)863343097 ^ (long)863343097), ((int)-2044616601L ^ 0x8621A067) != 0, (boolean)((long)-1898798778 ^ (long)-1898798778));
        GL11.glDepthFunc((int)((int)((long)1325233798 ^ (long)1325233287)));
        GL11.glEnable((int)((int)((long)977517975 ^ (long)977516262)));
        GL11.glDepthMask(((int)-155354355L ^ 0xF6BD7B0C) != 0);
    }

    @Override
    public void Method2453() {
        GL11.glColorMask((boolean)((long)931228904 ^ (long)931228905), (boolean)((long)-1125325936 ^ (long)-1125325935), (boolean)((long)-1129438327 ^ (long)-1129438328), (boolean)((long)1251424018 ^ (long)1251424019));
        GL11.glDepthMask(((int)-119714666L ^ 0xF8DD4C97) != 0);
        GL11.glDepthFunc((int)(((int)-535758124L ^ 0xE010FBD5) << 1));
    }

    @Override
    public void Method2454() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)((int)((long)1236388119 ^ (long)1236388114) << 8));
        GL11.glDisable((int)((int)((long)2096288323 ^ (long)2096290098)));
        GL11.glDepthFunc((int)((int)-522852153L ^ 0xE0D5EAC4));
        GL11.glDepthMask(((int)2018926643L ^ 0x78566033) != 0);
    }

    @Override
    public int Method2455() {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-76027796 ^ (long)-76027787) << 2, ((int)-1988799985L ^ 0x89755216) << 2);
    }

    @Override
    public Color Method2456() {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4711((int)((long)-1972120867 ^ (long)-1972120892) << 2, (int)((long)-935730009 ^ (long)-935729986) << 2);
    }
}

