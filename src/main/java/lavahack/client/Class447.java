//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.awt.Point;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lavahack.client.Class1393;
import lavahack.client.Class783;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Mouse;

public class Class447 {
    private static final Random Field9859 = new Random();
    private String Field9860 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double[] Method2098(double[] dArray, double d) {
        return new double[]{dArray[0] + d, dArray[1] + d};
    }

    public static double Method2099(double d) {
        return d * Double.longBitsToDouble((long)1193329230 ^ 0x3F91DF46E720C24EL);
    }

    public static Vec3d Method2100(float f) {
        return new Vec3d(Math.cos(Class447.Method2099(f + Float.intBitsToFloat(1119092736))), 0.0, Math.sin(Class447.Method2099(f + Float.intBitsToFloat(1119092736))));
    }

    public static AxisAlignedBB Method2101(BlockPos blockPos) {
        return new AxisAlignedBB((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), 1.0, 1.0, 1.0);
    }

    public static Point Method2102() {
        Minecraft minecraft = Minecraft.getMinecraft();
        int n = minecraft.gameSettings.guiScale;
        if (n == 0) {
            n = 1000;
        }
        int n2 = 0;
        while (n2 < n) {
            if (minecraft.displayWidth / (n2 + 1) < 320) return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - 1);
            if (minecraft.displayHeight / (n2 + 1) < 240) return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - 1);
            ++n2;
        }
        return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - 1);
    }

    public static Vec3d Method2103(Entity entity, float f) {
        return Class447.Method2104(entity, f).subtract(Minecraft.getMinecraft().getRenderManager().viewerPosX, Minecraft.getMinecraft().getRenderManager().viewerPosY, Minecraft.getMinecraft().getRenderManager().viewerPosZ);
    }

    public static Vec3d Method2104(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f);
    }

    public static double Method2105(double d, double d2, double d3) {
        return d * (d3 - d2) / Double.longBitsToDouble((long)34868508 ^ 0x4059000002140D1CL) + d2;
    }

    public static Vec3d Method2106(Vec3d vec3d, Vec3d vec3d2) {
        return new Vec3d(vec3d.x * vec3d2.x, vec3d.y * vec3d2.y, vec3d.z * vec3d2.z);
    }

    public static Vec3d Method2107(Vec3d vec3d, float f) {
        return new Vec3d(vec3d.x * (double)f, vec3d.y * (double)f, vec3d.z * (double)f);
    }

    public static Vec3d Method2108(Vec3d vec3d, Vec3d vec3d2) {
        return new Vec3d(vec3d.x / vec3d2.x, vec3d.y / vec3d2.y, vec3d.z / vec3d2.z);
    }

    public static Vec3d Method2109(Vec3d vec3d, float f) {
        return new Vec3d(vec3d.x / (double)f, vec3d.y / (double)f, vec3d.z / (double)f);
    }

    public static double[] Method2110(double d) {
        Minecraft minecraft = Minecraft.getMinecraft();
        float f = 1.0f;
        if (minecraft.gameSettings.keyBindLeft.isPressed() || minecraft.gameSettings.keyBindRight.isPressed() || minecraft.gameSettings.keyBindBack.isPressed() || minecraft.gameSettings.keyBindForward.isPressed()) {
            f = minecraft.player.movementInput.moveForward;
        }
        float f2 = minecraft.player.movementInput.moveStrafe;
        float f3 = minecraft.player.prevRotationYaw + (minecraft.player.rotationYaw - minecraft.player.prevRotationYaw) * minecraft.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        return new double[]{d4, d5};
    }

    public static double Method2111(double d, int n) {
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static float Method2112(double d, int n) {
        BigDecimal bigDecimal = BigDecimal.valueOf(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.FLOOR);
        return bigDecimal.floatValue();
    }

    public static int Method2113(int n, int n2) {
        return n + Field9859.nextInt(n2 - n + 1);
    }

    public static double Method2114(double d, double d2) {
        return MathHelper.clamp((double)(d + Field9859.nextDouble() * d2), (double)d, (double)d2);
    }

    public static float Method2115(float f, float f2) {
        return MathHelper.clamp((float)(f + Field9859.nextFloat() * f2), (float)f, (float)f2);
    }

    public static int Method2116(int n, int n2, int n3) {
        int n4;
        if (n < n2) {
            n4 = n2;
            return n4;
        }
        n4 = Math.min(n, n3);
        return n4;
    }

    public static float Method2117(float f, float f2, float f3) {
        float f4;
        if (f < f2) {
            f4 = f2;
            return f4;
        }
        f4 = Math.min(f, f3);
        return f4;
    }

    public static double Method2118(double d, double d2, double d3) {
        double d4;
        if (d < d2) {
            d4 = d2;
            return d4;
        }
        d4 = Math.min(d, d3);
        return d4;
    }

    public static float Method2119(float f) {
        return MathHelper.sin((float)f);
    }

    public static float Method2120(float f) {
        return MathHelper.cos((float)f);
    }

    public static float Method2121(float f) {
        return MathHelper.wrapDegrees((float)f);
    }

    public static double Method2122(double d) {
        return MathHelper.wrapDegrees((double)d);
    }

    public static Vec3d Method2123(Vec3d vec3d, int n) {
        return new Vec3d(Class447.Method2124(vec3d.x, n), Class447.Method2124(vec3d.y, n), Class447.Method2124(vec3d.z, n));
    }

    public static double Method2124(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.FLOOR);
        return bigDecimal.doubleValue();
    }

    public static float Method2125(float f) {
        float f2 = f % Float.intBitsToFloat(1135869952);
        if (f2 >= Float.intBitsToFloat(0x43340000)) {
            f2 -= Float.intBitsToFloat(1135869952);
        }
        if (!(f2 < Float.intBitsToFloat(-1020002304))) return f2;
        f2 += Float.intBitsToFloat(1135869952);
        return f2;
    }

    public static float Method2126(float f, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(f);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.FLOOR);
        return bigDecimal.floatValue();
    }

    public static Map Method2127(Map map, boolean bl) {
        LinkedList linkedList = new LinkedList(map.entrySet());
        if (bl) {
            linkedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        } else {
            linkedList.sort(Map.Entry.comparingByValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static String Method2128() {
        Calendar calendar = Calendar.getInstance();
        int n = calendar.get(11);
        if (n < 12) {
            return "Good Morning";
        }
        if (n < 16) {
            return "Good Afternoon";
        }
        if (n >= 21) return "Good Night";
        return "Good Evening";
    }

    public static double Method2129(double d) {
        return d * Double.longBitsToDouble((long)1117397608 ^ 0x404CA5DC629A2268L);
    }

    public static double Method2130(double d, double d2) {
        double d3 = 1.0 / d2;
        return (double)Math.round(d * d3) / d3;
    }

    public static double[] Method2131(double d) {
        Minecraft minecraft = Minecraft.getMinecraft();
        float f = minecraft.player.movementInput.moveForward;
        float f2 = minecraft.player.movementInput.moveStrafe;
        float f3 = minecraft.player.prevRotationYaw + (minecraft.player.rotationYaw - minecraft.player.prevRotationYaw) * minecraft.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        return new double[]{d4, d5};
    }

    public static List Method2132(Entity entity) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d = entity.posY;
        double d2 = Class447.Method2124(axisAlignedBB.minX, 0);
        double d3 = Class447.Method2124(axisAlignedBB.minZ, 0);
        double d4 = Class447.Method2124(axisAlignedBB.maxX, 0);
        double d5 = Class447.Method2124(axisAlignedBB.maxZ, 0);
        if (d2 != d4) {
            arrayList.add(new Vec3d(d2, d, d3));
            arrayList.add(new Vec3d(d4, d, d3));
            if (d3 != d5) {
                arrayList.add(new Vec3d(d2, d, d5));
                arrayList.add(new Vec3d(d4, d, d5));
                return arrayList;
            }
        } else if (d3 != d5) {
            arrayList.add(new Vec3d(d2, d, d3));
            arrayList.add(new Vec3d(d2, d, d5));
            return arrayList;
        }
        arrayList.add(entity.getPositionVector());
        return arrayList;
    }

    public static boolean Method2133(Vec3d vec3d, Vec3d vec3d2) {
        return Class447.Method2134(vec3d, vec3d2);
    }

    public static boolean Method2134(Vec3d vec3d, Vec3d vec3d2) {
        BlockPos blockPos = new BlockPos(vec3d);
        BlockPos blockPos2 = new BlockPos(vec3d2.x, vec3d.y, vec3d2.z);
        return blockPos.equals((Object)blockPos2);
    }

    public static double Method2135(float f, float f2, float f3, float f4) {
        return Math.sqrt((f - f3) * (f - f3) + (f2 - f4) * (f2 - f4));
    }

    public static double Method2136(double d) {
        return 1.0 / Math.tan(d);
    }

    public static Class783 Method2137(int n, int n2, float f, int n3, int n4, float f2, boolean bl) {
        Class783 class783 = new Class783();
        double d = Double.longBitsToDouble((long)1479658048 ^ 0x3F91DF46FA635779L);
        if (Math.abs(f - f2) < 1.0f) {
            if (!bl) return class783;
            Class1393.Method5507().Method1886("The angles cannot be equal");
            return null;
        }
        if ((f < 0.0f && f2 > 0.0f || f > 0.0f && f2 < 0.0f) && Math.abs(Math.abs(Math.abs(f) - Float.intBitsToFloat(0x43340000)) - Math.abs(f2)) < 1.0f) {
            if (!bl) return class783;
            Class1393.Method5507().Method1886("The angles cannot be opposite");
            return null;
        }
        switch (Math.round(f)) {
            case -180: 
            case 0: 
            case 180: {
                class783.Field11301 = Math.round(n);
                class783.Field11302 = (int)Math.round(Class447.Method2136((double)(-f2) * d) * (double)n - ((double)n3 * Class447.Method2136((double)(-f2) * d) - (double)n4));
                return class783;
            }
            case -90: 
            case 90: {
                class783.Field11301 = Math.round(n2);
                class783.Field11302 = (int)Math.round((double)Math.round((double)n3 * Class447.Method2136((double)(-f2) * d) - (double)n4 + (double)n2) / Class447.Method2136((double)(-f2) * d));
                return class783;
            }
        }
        switch (Math.round(f2)) {
            case -180: 
            case 0: 
            case 180: {
                class783.Field11301 = Math.round(n3);
                class783.Field11302 = (int)Math.round(Class447.Method2136((double)(-f) * d) * (double)n3 - ((double)n * Class447.Method2136((double)(-f) * d) - (double)n2));
                return class783;
            }
            case -90: 
            case 90: {
                class783.Field11301 = Math.round(n4);
                class783.Field11302 = (int)Math.round((double)Math.round((double)n * Class447.Method2136((double)(-f) * d) - (double)n2 + (double)n4) / Class447.Method2136((double)(-f) * d));
                return class783;
            }
        }
        class783.Field11301 = (int)Math.round(((double)n * Class447.Method2136((double)(-f) * d) - (double)n2 - ((double)n3 * Class447.Method2136((double)(-f2) * d) - (double)n4)) / (Class447.Method2136((double)(-f) * d) - Class447.Method2136((double)(-f2) * d)));
        class783.Field11302 = (int)Math.round(Class447.Method2136((double)(-f) * d) * (double)class783.Field11301 - ((double)n * Class447.Method2136((double)(-f) * d) - (double)n2));
        return class783;
    }

    public static double Method2138(double d) {
        if (d != d) {
            return Double.longBitsToDouble(9221120237041090560L);
        }
        double d2 = d < 0.0 ? 0.0 - d : d;
        double d3 = (long)d;
        if (d2 > Double.longBitsToDouble(0x4330000000000000L)) return d;
        if (d3 == d) {
            return d;
        }
        d3 = d3 < 0.0 ? d3 - 1.0 : d3;
        return d3 + Double.longBitsToDouble((long)847636273 ^ 0x3FE000003285E731L);
    }

    public static List Method2139(double d, double d2, double d3, double d4, double d5) {
        double d6;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d7 = d2;
        double d8 = d3;
        double d9 = Math.abs(d4 - d2);
        double d10 = Math.abs(d5 - d3);
        double d11 = Math.signum(d4 - d2);
        double d12 = Math.signum(d5 - d3);
        if (d10 > d9) {
            double d13 = d9;
            d9 = d10;
            d10 = d13;
            d6 = 1.0;
        } else {
            d6 = 0.0;
        }
        double d14 = Double.longBitsToDouble((long)264869832 ^ 0x400000000FC997C8L) * d10 - d9;
        double d15 = Double.longBitsToDouble(0x4000000000000000L) * d10;
        double d16 = Double.longBitsToDouble((long)671977258 ^ 0x40000000280D8F2AL) * d10 - Double.longBitsToDouble(0x4000000000000000L) * d9;
        int n = 0;
        while ((double)n < d9) {
            if (d14 < 0.0) {
                Double.compare(d6, 1.0);
                d7 += d2;
                d14 += d15;
            } else {
                d8 += d12;
                d7 += d11;
                d14 += d16;
            }
            arrayList.add(new BlockPos(d7, d8, d));
            ++n;
        }
        return arrayList;
    }

    public static double Method2140(double d) {
        double d2 = d - 1.0;
        return Math.sqrt(1.0 - d2 * d2);
    }

    public static double Method2141(double d) {
        return Math.sqrt(-(d * d) - Double.longBitsToDouble((long)126523016 ^ 0x40000000078A9688L) * d);
    }

    public static double Method2142(double d) {
        return d * d + (1.0 - (1.0 - d) * (1.0 - d) - d * d) * d;
    }

    private static String Method2143(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 111;
            cArray2[n] = (char)(cArray[n] ^ (0x64BA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

