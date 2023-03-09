//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketSpawnMob
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.network.play.server.SPacketSpawnPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import lavahack.client.Class1440;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketSpawnMob;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.network.play.server.SPacketSpawnPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class1733
extends Class42 {
    private final Class44 Field15948 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field15949 = this.Method23(new Class44("Crystals", (Class42)this, true));
    private final Class44 Field15950 = this.Method23(new Class44("Players", (Class42)this, false));
    private final Class44 Field15951 = this.Method23(new Class44("Mobs", (Class42)this, false));
    private final Class44 Field15952 = this.Method23(new Class44("Boats", (Class42)this, false));
    private final Class44 Field15953 = this.Method23(new Class44("Duration", (Class42)this, 1.0, Double.longBitsToDouble((long)1733649555 ^ 0x3FB99999C7556493L), Double.longBitsToDouble((long)384489593 ^ 0x4014000016EAD879L), false));
    private final Class44 Field15954 = this.Method23(new Class44("Width", (Class42)this, Double.longBitsToDouble(0x4004000000000000L), Double.longBitsToDouble((long)945394719 ^ 0x3FB99999A1C00D85L), Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class411 Field15955 = this.Method54();
    private final ArrayList Field15956 = new ArrayList();
    @Class1801
    private final Class618 Field15957 = new Class618(this::Method6602, new Predicate[0]);
    private String Field15958 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1733() {
        super("SpawnsESP", "        super(\"SpawnsESP\", )", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field15957);
        this.Field15955.Method2004();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field15957);
    }

    private void Method20() {
        Iterator iterator = this.Field15956.iterator();
        while (iterator.hasNext()) {
            Class1440 class1440 = (Class1440)iterator.next();
            if ((double)(System.currentTimeMillis() - Class1440.Method5749(class1440)) > Double.longBitsToDouble(4652007308841189376L) * this.Field15953.Method367()) {
                this.Field15956.remove(class1440);
                continue;
            }
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method6604(class1440));
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6601(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field15955.Method2005(this::Method6603);
    }

    private void Method6602(Class544 class544) {
        if (class544.Method982() instanceof SPacketSpawnObject) {
            if (((SPacketSpawnObject)class544.Method982()).getType() == 51 && this.Field15949.Method365()) {
                this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnObject)class544.Method982()).getX(), ((SPacketSpawnObject)class544.Method982()).getY(), ((SPacketSpawnObject)class544.Method982()).getZ()), Float.intBitsToFloat(1069547520), Float.intBitsToFloat(0x3F000000)));
                return;
            }
            if (((SPacketSpawnObject)class544.Method982()).getType() != 1) return;
            if (!this.Field15952.Method365()) return;
            this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnObject)class544.Method982()).getX(), ((SPacketSpawnObject)class544.Method982()).getY(), ((SPacketSpawnObject)class544.Method982()).getZ()), 1.0f, Float.intBitsToFloat(1061158912)));
            return;
        }
        if (class544.Method982() instanceof SPacketSpawnPlayer && this.Field15950.Method365()) {
            this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnPlayer)class544.Method982()).getX(), ((SPacketSpawnPlayer)class544.Method982()).getY(), ((SPacketSpawnPlayer)class544.Method982()).getZ()), Float.intBitsToFloat(1072064102), Float.intBitsToFloat(0x3F000000)));
            return;
        }
        if (!(class544.Method982() instanceof SPacketSpawnMob)) return;
        if (!this.Field15951.Method365()) return;
        this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnMob)class544.Method982()).getX(), ((SPacketSpawnMob)class544.Method982()).getY(), ((SPacketSpawnMob)class544.Method982()).getZ()), Float.intBitsToFloat(1072064102), Float.intBitsToFloat(0x3F000000)));
    }

    private void Method6603() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method20);
    }

    private void Method6604(Class1440 class1440) {
        Class815.Method3433();
        double d = Class1440.Method5746((Class1440)class1440).x - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosX;
        double d2 = Class1440.Method5746((Class1440)class1440).y - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosY;
        double d3 = Class1440.Method5746((Class1440)class1440).z - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosZ;
        GL11.glLineWidth((float)this.Field15954.Method368());
        GL11.glBegin((int)1);
        this.Field15948.Method339().Method3632();
        int n = 0;
        while (true) {
            Vec3d vec3d = new Vec3d(d + Math.sin((double)n * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble((long)919509432 ^ 0x4066800036CE99B8L)) * (double)Class1440.Method5747(class1440), d2 + (double)Class1440.Method5748(class1440) * ((double)(System.currentTimeMillis() - Class1440.Method5749(class1440)) / (Double.longBitsToDouble((long)2084540661 ^ 0x408F40007C3F90F5L) * this.Field15953.Method367())), d3 + Math.cos((double)n * Double.longBitsToDouble((long)1863033455 ^ 0x400921FB3B4F8F77L) / Double.longBitsToDouble((long)2049302457 ^ 0x406680007A25DFB9L)) * (double)Class1440.Method5747(class1440));
            GL11.glVertex3d((double)vec3d.x, (double)vec3d.y, (double)vec3d.z);
            ++n;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 186;
            cArray2[n] = (char)(cArray[n] ^ (0x1752 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

