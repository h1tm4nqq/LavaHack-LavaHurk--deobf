//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class517 extends Class42
{
    public static Class517 Field10191;
    private final byte Field10192 = 20;
    private List Field10193;
    private Class44 Field10194;
    private Class44 Field10195;
    @Class1801
    private final Class618 Field10196;
    private int Field10197;
    
    public Class517() {
        super("JumpCircle", Class97.Field8342);
        this.Field10193 = new ArrayList();
        this.Field10194 = new Class44("RainBow", (Class42)this, true);
        this.Field10195 = new Class44("Color", (Class42)this, "Color", new Class2027(255, 0, 0));
        this.Field10196 = new Class618(this::Method2382, new Predicate[0]);
        Class517.Field10191 = this;
        Class517.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10194);
        Class517.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10195);
    }
    
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10196);
    }
    
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10196);
    }
    
    public void Method45() {
        this.Field10193.removeIf(Class688::Method2899);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2381(final RenderWorldLastEvent renderWorldLastEvent) {
        final EntityPlayerSP player = Class517.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        final double n = -(player.lastTickPosX + (player.posX - player.lastTickPosX) * renderWorldLastEvent.getPartialTicks());
        final double n2 = -(player.lastTickPosY + (player.posY - player.lastTickPosY) * renderWorldLastEvent.getPartialTicks());
        final double n3 = -(player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * renderWorldLastEvent.getPartialTicks());
        GL11.glPushMatrix();
        GL11.glTranslated(n, n2, n3);
        GL11.glDisable(2884);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2896);
        GL11.glShadeModel(7425);
        Collections.reverse(this.Field10193);
        final Iterator iterator = this.Field10193.iterator();
        if (!iterator.hasNext()) {
            Collections.reverse(this.Field10193);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            GL11.glShadeModel(7424);
            GL11.glEnable(2884);
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glPopMatrix();
            return;
        }
        final Class688 class688 = iterator.next();
        final float n4 = class688.Field10905 / Float.intBitsToFloat(1101004800);
        final double x = class688.Method2897().x;
        final double n5 = class688.Method2897().y - n4 * Double.longBitsToDouble(4602678819172646912L);
        final double z = class688.Method2897().z;
        final float n6 = n4 + 1.0f - n4;
        GL11.glBegin(8);
        int n7 = 0;
        while (true) {
            GL11.glColor4f((float)class688.Method2898().x, (float)class688.Method2898().y, (float)class688.Method2898().z, Float.intBitsToFloat(1045220557) * (1.0f - class688.Field10905 / Float.intBitsToFloat(1101004800)));
            GL11.glVertex3d(x + Math.cos(Math.toRadians(n7 * 4)) * n4, n5, z + Math.sin(Math.toRadians(n7 * 4)) * n4);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, Float.intBitsToFloat(1008981770) * (1.0f - class688.Field10905 / Float.intBitsToFloat(1101004800)));
            GL11.glVertex3d(x + Math.cos(Math.toRadians(n7)) * n6, n5 + Math.sin(n4 * Float.intBitsToFloat(1090519040)) * Double.longBitsToDouble((long)903443544 ^ 0x3FE0000035D97458L), z + Math.sin(Math.toRadians(n7) * n6));
            n7 += 5;
        }
    }
    
    private void Method2382(final Class1603 class1603) {
        this.Field10193.add(new Class688(this, class1603.Field15501.getPositionVector(), this.Field10194.Method365() ? new Class2027(Class1172.Method4712(1, 1L)).Method3608() : this.Field10195.Method339().Method3608()));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1EA9 ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
