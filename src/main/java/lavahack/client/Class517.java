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

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import lavahack.client.Class1172;
import lavahack.client.Class1603;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class688;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class517
extends Class42 {
    public static Class517 Field10191;
    private final byte Field10192 = (byte)20;
    private List Field10193 = new ArrayList();
    private Class44 Field10194 = new Class44("RainBow", (Class42)this, true);
    private Class44 Field10195 = new Class44("Color", (Class42)this, "Color", new Class2027(255, 0, 0));
    @Class1801
    private final Class618 Field10196 = new Class618(this::Method2382, new Predicate[0]);
    private int Field10197;

    public Class517() {
        super("JumpCircle", Class97.Field8342);
        Field10191 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10194);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10195);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10196);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10196);
    }

    @Override
    public void Method45() {
        this.Field10193.removeIf(Class688::Method2899);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2381(RenderWorldLastEvent renderWorldLastEvent) {
        EntityPlayerSP entityPlayerSP = Class517.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        double d = -(entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)renderWorldLastEvent.getPartialTicks());
        double d2 = -(entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)renderWorldLastEvent.getPartialTicks());
        double d3 = -(entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)renderWorldLastEvent.getPartialTicks());
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)d3);
        GL11.glDisable((int)2884);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2929);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glShadeModel((int)7425);
        Collections.reverse(this.Field10193);
        Iterator iterator = this.Field10193.iterator();
        if (!iterator.hasNext()) {
            Collections.reverse(this.Field10193);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)2884);
            GL11.glEnable((int)2929);
            GL11.glEnable((int)3008);
            GL11.glPopMatrix();
            return;
        }
        Class688 class688 = (Class688)iterator.next();
        float f = (float)class688.Field10905 / Float.intBitsToFloat(1101004800);
        double d4 = class688.Method2897().x;
        double d5 = class688.Method2897().y - (double)f * Double.longBitsToDouble(4602678819172646912L);
        double d6 = class688.Method2897().z;
        float f2 = f + 1.0f - f;
        GL11.glBegin((int)8);
        int n = 0;
        while (true) {
            GL11.glColor4f((float)((float)class688.Method2898().x), (float)((float)class688.Method2898().y), (float)((float)class688.Method2898().z), (float)(Float.intBitsToFloat(1045220557) * (1.0f - (float)class688.Field10905 / Float.intBitsToFloat(1101004800))));
            GL11.glVertex3d((double)(d4 + Math.cos(Math.toRadians(n * 4)) * (double)f), (double)d5, (double)(d6 + Math.sin(Math.toRadians(n * 4)) * (double)f));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(Float.intBitsToFloat(1008981770) * (1.0f - (float)class688.Field10905 / Float.intBitsToFloat(1101004800))));
            GL11.glVertex3d((double)(d4 + Math.cos(Math.toRadians(n)) * (double)f2), (double)(d5 + Math.sin(f * Float.intBitsToFloat(0x41000000)) * Double.longBitsToDouble((long)903443544 ^ 0x3FE0000035D97458L)), (double)(d6 + Math.sin(Math.toRadians(n) * (double)f2)));
            n += 5;
        }
    }

    private void Method2382(Class1603 class1603) {
        this.Field10193.add(new Class688(this, class1603.Field15501.getPositionVector(), this.Field10194.Method365() ? new Class2027(Class1172.Method4712(1, 1L)).Method3608() : this.Field10195.Method339().Method3608()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 151;
            cArray2[n] = (char)(cArray[n] ^ (0x1EA9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

