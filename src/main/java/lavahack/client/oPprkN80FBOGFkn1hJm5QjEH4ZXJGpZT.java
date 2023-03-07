//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT Field10191;
    private final byte Field10192 = (byte)((int)((long)587885794 ^ (long)587885799) << 2);
    private List Field10193 = new ArrayList();
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10194 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RainBow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1302323704 ^ (long)-1302323703));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10195 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)232982062L ^ 0xDE306D1, (int)-1008512647L ^ 0xC3E35179, (int)((long)1373070225 ^ (long)1373070225)));
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10196 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2382, new Predicate[(int)-166126614L ^ 0xF6191BEA]);
    private int Field10197;

    public oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT() {
        super("JumpCircle", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field10191 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10194);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10195);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10196);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10196);
    }

    @Override
    public void Method45() {
        this.Field10193.removeIf(oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi::Method2899);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2381(RenderWorldLastEvent renderWorldLastEvent) {
        EntityPlayerSP entityPlayerSP = oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        double d = -(entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)renderWorldLastEvent.getPartialTicks());
        double d2 = -(entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)renderWorldLastEvent.getPartialTicks());
        double d3 = -(entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)renderWorldLastEvent.getPartialTicks());
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)d3);
        GL11.glDisable((int)((int)((long)1570768164 ^ (long)1570768885) << 2));
        GL11.glEnable((int)((int)((long)2072991679 ^ (long)2072990286) << 1));
        GL11.glDisable((int)((int)((long)-62564025 ^ (long)-62565210)));
        GL11.glDisable((int)(((int)-1660517864L ^ 0x9D068237) << 6));
        GL11.glDisable((int)((int)((long)1968341214 ^ (long)1968343983)));
        GL11.glBlendFunc((int)((int)((long)-331159327 ^ (long)-331159200) << 1), (int)((int)((long)-938773759 ^ (long)-938774526)));
        GL11.glDisable((int)((int)((long)-1916599061 ^ (long)-1916599202) << 4));
        GL11.glShadeModel((int)((int)((long)-776318497 ^ (long)-776319778)));
        Collections.reverse(this.Field10193);
        Iterator iterator = this.Field10193.iterator();
        if (!iterator.hasNext()) {
            Collections.reverse(this.Field10193);
            GL11.glEnable((int)((int)((long)-1426429219 ^ (long)-1426429336) << 4));
            GL11.glEnable((int)((int)557906655L ^ 0x2140F73E));
            GL11.glDisable((int)((int)((long)-580638063 ^ (long)-580636832) << 1));
            GL11.glShadeModel((int)(((int)865680374L ^ 0x33993BEB) << 8));
            GL11.glEnable((int)(((int)986031320L ^ 0x3AC5A609) << 2));
            GL11.glEnable((int)((int)((long)-826679403 ^ (long)-826682140)));
            GL11.glEnable((int)((int)((long)308280282 ^ (long)308280309) << 6));
            GL11.glPopMatrix();
            return;
        }
        oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
        float f = (float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10905 / Float.intBitsToFloat((int)((long)300566038 ^ (long)1347044886));
        double d4 = oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2897().x;
        double d5 = oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2897().y - (double)f * Double.longBitsToDouble(0x9F0DBEA096ED521AL ^ 0xA0EDBEA096ED521AL);
        double d6 = oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2897().z;
        float f2 = f + 1.0f - f;
        GL11.glBegin((int)(((int)-2106151614L ^ 0x8276AD43) << 3));
        int n = (int)((long)-16625591 ^ (long)-16625591);
        while (true) {
            int cfr_ignored_0 = ((int)1674486484L ^ 0x63CEA2F9) << 3;
            GL11.glColor4f((float)((float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2898().x), (float)((float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2898().y), (float)((float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2898().z), (float)(Float.intBitsToFloat((int)1508441879L ^ 0x67A433DA) * (1.0f - (float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10905 / Float.intBitsToFloat(0xEF7FCC8 ^ 0x4F57FCC8))));
            GL11.glVertex3d((double)(d4 + Math.cos(Math.toRadians(n * (((int)-766855349L ^ 0xD24AB74A) << 2))) * (double)f), (double)d5, (double)(d6 + Math.sin(Math.toRadians(n * ((int)((long)-1427243818 ^ (long)-1427243817) << 2))) * (double)f));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(Float.intBitsToFloat(0x30D0237A ^ 0xCF3F470) * (1.0f - (float)oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10905 / Float.intBitsToFloat((int)((long)82357068 ^ (long)1162390348)))));
            GL11.glVertex3d((double)(d4 + Math.cos(Math.toRadians(n)) * (double)f2), (double)(d5 + Math.sin(f * Float.intBitsToFloat((int)211328958L ^ 0x4D989FBE)) * Double.longBitsToDouble((long)903443544 ^ 0x3FE0000035D97458L)), (double)(d6 + Math.sin(Math.toRadians(n) * (double)f2)));
            n += (int)((long)-1667400123 ^ (long)-1667400128);
        }
    }

    private void Method2382(ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl ityDJooi2U23sHYdNmIhbJFmcHy1UFNl) {
        this.Field10193.add(new oPprkN80FBOGFkn1hJm5QjEH4ZXJGpZT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, ityDJooi2U23sHYdNmIhbJFmcHy1UFNl.Field15501.getPositionVector(), this.Field10194.Method365() ? new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4712((int)((long)-1536001130 ^ (long)-1536001129), 1L)).Method3608() : this.Field10195.Method339().Method3608()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-971531892 ^ (long)-971531892);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)47302630 ^ (long)47302425);
            int n2 = (int)((long)225640806 ^ (long)225640945);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1033041643L ^ 0xC26D17BC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

