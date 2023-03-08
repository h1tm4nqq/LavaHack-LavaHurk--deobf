//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.server.*;
import org.lwjgl.opengl.*;

public class Class1733 extends Class42
{
    private final Class44 Field15948;
    private final Class44 Field15949;
    private final Class44 Field15950;
    private final Class44 Field15951;
    private final Class44 Field15952;
    private final Class44 Field15953;
    private final Class44 Field15954;
    private final Class411 Field15955;
    private final ArrayList Field15956;
    @Class1801
    private final Class618 Field15957;
    private String Field15958 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1733() {
        super("SpawnsESP", "        super(\"SpawnsESP\", )", Class97.Field8342);
        this.Field15948 = this.Method23(new Class44("Color", this, new Class2027(255, 255, 255, 255)));
        this.Field15949 = this.Method23(new Class44("Crystals", this, true));
        this.Field15950 = this.Method23(new Class44("Players", this, false));
        this.Field15951 = this.Method23(new Class44("Mobs", this, false));
        this.Field15952 = this.Method23(new Class44("Boats", this, false));
        this.Field15953 = this.Method23(new Class44("Duration", this, 1.0, Double.longBitsToDouble((long)1733649555 ^ 0x3FB99999C7556493L), Double.longBitsToDouble((long)384489593 ^ 0x4014000016EAD879L), false));
        this.Field15954 = this.Method23(new Class44("Width", this, Double.longBitsToDouble(4612811918334230528L), Double.longBitsToDouble((long)945394719 ^ 0x3FB99999A1C00D85L), Double.longBitsToDouble(4621819117588971520L), false));
        this.Field15955 = this.Method54();
        this.Field15956 = new ArrayList();
        this.Field15957 = new Class618(this::Method6602, new Predicate[0]);
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
        for (final Class1440 o : this.Field15956) {
            if ((float)(System.currentTimeMillis() - Class1440.Method5749(o)) > Double.longBitsToDouble(4652007308841189376L) * this.Field15953.Method367()) {
                this.Field15956.remove(o);
            }
            else {
                Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method6604);
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6601(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field15955.Method2005(this::Method6603);
    }
    
    private void Method6602(final Class544 class544) {
        if (class544.Method982() instanceof SPacketSpawnObject) {
            if (((SPacketSpawnObject)class544.Method982()).getType() == 51 && this.Field15949.Method365()) {
                this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnObject)class544.Method982()).getX(), ((SPacketSpawnObject)class544.Method982()).getY(), ((SPacketSpawnObject)class544.Method982()).getZ()), Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1056964608)));
            }
            else if (((SPacketSpawnObject)class544.Method982()).getType() == 1 && this.Field15952.Method365()) {
                this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnObject)class544.Method982()).getX(), ((SPacketSpawnObject)class544.Method982()).getY(), ((SPacketSpawnObject)class544.Method982()).getZ()), 1.0f, Float.intBitsToFloat(1061158912)));
            }
        }
        else if (class544.Method982() instanceof SPacketSpawnPlayer && this.Field15950.Method365()) {
            this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnPlayer)class544.Method982()).getX(), ((SPacketSpawnPlayer)class544.Method982()).getY(), ((SPacketSpawnPlayer)class544.Method982()).getZ()), Float.intBitsToFloat(1072064102), Float.intBitsToFloat(1056964608)));
        }
        else if (class544.Method982() instanceof SPacketSpawnMob && this.Field15951.Method365()) {
            this.Field15956.add(new Class1440(new Vec3d(((SPacketSpawnMob)class544.Method982()).getX(), ((SPacketSpawnMob)class544.Method982()).getY(), ((SPacketSpawnMob)class544.Method982()).getZ()), Float.intBitsToFloat(1072064102), Float.intBitsToFloat(1056964608)));
        }
    }
    
    private void Method6603() {
        Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method20);
    }
    
    private void Method6604(final Class1440 class1440) {
        Class815.Method3433();
        final double n = Class1440.Method5746(class1440).x - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosX;
        final double n2 = Class1440.Method5746(class1440).y - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosY;
        final double n3 = Class1440.Method5746(class1440).z - Class1733.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosZ;
        GL11.glLineWidth(this.Field15954.Method368());
        GL11.glBegin(1);
        this.Field15948.Method339().Method3632();
        int n4 = 0;
        while (true) {
            final Vec3d vec3d = new Vec3d(n + Math.sin(n4 * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble((long)919509432 ^ 0x4066800036CE99B8L)) * Class1440.Method5747(class1440), n2 + Class1440.Method5748(class1440) * ((float)(System.currentTimeMillis() - Class1440.Method5749(class1440)) / (Double.longBitsToDouble((long)2084540661 ^ 0x408F40007C3F90F5L) * this.Field15953.Method367())), n3 + Math.cos(n4 * Double.longBitsToDouble((long)1863033455 ^ 0x400921FB3B4F8F77L) / Double.longBitsToDouble((long)2049302457 ^ 0x406680007A25DFB9L)) * Class1440.Method5747(class1440));
            GL11.glVertex3d(vec3d.x, vec3d.y, vec3d.z);
            ++n4;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1752 ^ 0xBA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
