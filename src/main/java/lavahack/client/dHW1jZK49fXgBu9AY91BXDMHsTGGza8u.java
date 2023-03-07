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
import lavahack.client.HtWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Mouse;

public class dHW1jZK49fXgBu9AY91BXDMHsTGGza8u {
    private static final Random Field9859 = new Random();
    private String Field9860 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double[] Method2098(double[] dArray, double d) {
        double[] dArray2 = new double[(int)((long)1429213333 ^ (long)1429213332) << 1];
        dArray2[(int)((long)1573677179 ^ (long)1573677179)] = dArray[(int)((long)-2059530594 ^ (long)-2059530594)] + d;
        dArray2[(int)((long)-462976532 ^ (long)-462976531)] = dArray[(int)-1677530811L ^ 0x9C02E944] + d;
        return dArray2;
    }

    public static double Method2099(double d) {
        return d * Double.longBitsToDouble((long)1193329230 ^ 0x3F91DF46E720C24EL);
    }

    public static Vec3d Method2100(float f) {
        return new Vec3d(Math.cos(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2099(f + Float.intBitsToFloat(0x4DC0F5B ^ 0x46680F5B))), 0.0, Math.sin(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2099(f + Float.intBitsToFloat((int)((long)1824532600 ^ (long)779364472)))));
    }

    public static AxisAlignedBB Method2101(BlockPos blockPos) {
        return new AxisAlignedBB((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), 1.0, 1.0, 1.0);
    }

    public static Point Method2102() {
        Minecraft minecraft = Minecraft.getMinecraft();
        int n = minecraft.gameSettings.guiScale;
        if (n == 0) {
            n = (int)((long)502896123 ^ (long)502896006) << 3;
        }
        int n2 = (int)((long)-1062406833 ^ (long)-1062406833);
        while (n2 < n) {
            if (minecraft.displayWidth / (n2 + (int)((long)-1053534876 ^ (long)-1053534875)) < ((int)1955136091L ^ 0x7489025E) << 6) return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - (int)((long)-809838400 ^ (long)-809838399));
            if (minecraft.displayHeight / (n2 + ((int)1420088953L ^ 0x54A4D678)) < ((int)1832440884L ^ 0x6D38D43B) << 4) return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - (int)((long)-809838400 ^ (long)-809838399));
            ++n2;
        }
        return new Point(Mouse.getX() / n2, minecraft.displayHeight / n2 - Mouse.getY() / n2 - (int)((long)-809838400 ^ (long)-809838399));
    }

    public static Vec3d Method2103(Entity entity, float f) {
        return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2104(entity, f).subtract(Minecraft.getMinecraft().getRenderManager().viewerPosX, Minecraft.getMinecraft().getRenderManager().viewerPosY, Minecraft.getMinecraft().getRenderManager().viewerPosZ);
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
                f3 += (float)(f > 0.0f ? (int)((long)-1020630774 ^ (long)1020630745) : (int)-280366920L ^ 0xEF49F095);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)1786424976 ^ (long)1786425021) : (int)1632311824L ^ 0x9EB4E5C3);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat((int)237454180L ^ 0xB1A74364);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(0x69D347A0 ^ 0x2B6747A0)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)808079782 ^ (long)1922978214))));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[(int)((long)-240669830 ^ (long)-240669829) << 1];
        dArray[(int)-1090488039L ^ 0xBF007919] = d4;
        dArray[(int)632506583L ^ 0x25B348D6] = d5;
        return dArray;
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
        return n + Field9859.nextInt(n2 - n + ((int)-981116721L ^ 0xC58558CE));
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
        return new Vec3d(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(vec3d.x, n), dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(vec3d.y, n), dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(vec3d.z, n));
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
        float f2 = f % Float.intBitsToFloat((int)((long)510283842 ^ (long)1574850626));
        if (f2 >= Float.intBitsToFloat(0x7F6CAD66 ^ 0x3C58AD66)) {
            f2 -= Float.intBitsToFloat(0x343D511 ^ 0x40F7D511);
        }
        if (!(f2 < Float.intBitsToFloat(0x2F94E8D0 ^ 0xECA0E8D0))) return f2;
        f2 += Float.intBitsToFloat(0x373668FC ^ 0x748268FC);
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
        int n = calendar.get((int)1710907334L ^ 0x65FA5FCD);
        if (n < ((int)-1724833188L ^ 0x9931225F) << 2) {
            return "Good Morning";
        }
        if (n < ((int)-202647099L ^ 0xF3EBD9C4) << 4) {
            return "Good Afternoon";
        }
        if (n >= ((int)-77074933L ^ 0xFB67EE1E)) return "Good Night";
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
                f3 += (float)(f > 0.0f ? (int)-679243387L ^ 0x287C6E56 : (int)((long)-941104149 ^ (long)-941104186));
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)-776860049 ^ (long)-776860094) : (int)((long)1610036508 ^ (long)-1610036529));
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat((int)((long)1904688496 ^ (long)-838386320));
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(0x37318907 ^ 0x75858907)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(0xA8E1814 ^ 0x483A1814)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[(int)((long)735314435 ^ (long)735314434) << 1];
        dArray[(int)((long)764690694 ^ (long)764690694)] = d4;
        dArray[(int)511469101L ^ 0x1E7C662C] = d5;
        return dArray;
    }

    public static List Method2132(Entity entity) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d = entity.posY;
        double d2 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(axisAlignedBB.minX, (int)2022252172L ^ 0x78891E8C);
        double d3 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(axisAlignedBB.minZ, (int)((long)-1402200720 ^ (long)-1402200720));
        double d4 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(axisAlignedBB.maxX, (int)((long)120973457 ^ (long)120973457));
        double d5 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2124(axisAlignedBB.maxZ, (int)((long)1697845696 ^ (long)1697845696));
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
        return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2134(vec3d, vec3d2);
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

    public static HtWBWK2ivuwKi50cf15GY5qM8YWcaqqp Method2137(int n, int n2, float f, int n3, int n4, float f2, boolean bl) {
        HtWBWK2ivuwKi50cf15GY5qM8YWcaqqp htWBWK2ivuwKi50cf15GY5qM8YWcaqqp = new HtWBWK2ivuwKi50cf15GY5qM8YWcaqqp();
        double d = Double.longBitsToDouble((long)1479658048 ^ 0x3F91DF46FA635779L);
        if (Math.abs(f - f2) < 1.0f) {
            if (!bl) return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("The angles cannot be equal");
            return null;
        }
        if ((f < 0.0f && f2 > 0.0f || f > 0.0f && f2 < 0.0f) && Math.abs(Math.abs(Math.abs(f) - Float.intBitsToFloat(0x31B000B0 ^ 0x728400B0)) - Math.abs(f2)) < 1.0f) {
            if (!bl) return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("The angles cannot be opposite");
            return null;
        }
        switch (Math.round(f)) {
            case -180: 
            case 0: 
            case 180: {
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 = Math.round(n);
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11302 = (int)Math.round(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d) * (double)n - ((double)n3 * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d) - (double)n4));
                return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            }
            case -90: 
            case 90: {
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 = Math.round(n2);
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11302 = (int)Math.round((double)Math.round((double)n3 * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d) - (double)n4 + (double)n2) / dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d));
                return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            }
        }
        switch (Math.round(f2)) {
            case -180: 
            case 0: 
            case 180: {
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 = Math.round(n3);
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11302 = (int)Math.round(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) * (double)n3 - ((double)n * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) - (double)n2));
                return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            }
            case -90: 
            case 90: {
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 = Math.round(n4);
                htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11302 = (int)Math.round((double)Math.round((double)n * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) - (double)n2 + (double)n4) / dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d));
                return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
            }
        }
        htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 = (int)Math.round(((double)n * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) - (double)n2 - ((double)n3 * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d) - (double)n4)) / (dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) - dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f2) * d)));
        htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11302 = (int)Math.round(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) * (double)htWBWK2ivuwKi50cf15GY5qM8YWcaqqp.Field11301 - ((double)n * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2136((double)(-f) * d) - (double)n2));
        return htWBWK2ivuwKi50cf15GY5qM8YWcaqqp;
    }

    public static double Method2138(double d) {
        if (d != d) {
            return Double.longBitsToDouble(0xAC4DD87D6F6B23E0L ^ 0xD3B5D87D6F6B23E0L);
        }
        double d2 = d < 0.0 ? 0.0 - d : d;
        double d3 = (long)d;
        if (d2 > Double.longBitsToDouble(0xD488304879037DD6L ^ 0x97B8304879037DD6L)) return d;
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
        double d15 = Double.longBitsToDouble(0x7FEF84DBC731A09FL ^ 0x3FEF84DBC731A09FL) * d10;
        double d16 = Double.longBitsToDouble((long)671977258 ^ 0x40000000280D8F2AL) * d10 - Double.longBitsToDouble(0x4ACEF91888D6C2B4L ^ 0xACEF91888D6C2B4L) * d9;
        int n = (int)((long)-349957779 ^ (long)-349957779);
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
        int n = (int)-1629927300L ^ 0x9ED9487C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)64482112L ^ 0x3D7EBBF);
            int n2 = (int)1972230352L ^ 0x758DD8BF;
            cArray2[n] = (char)(cArray[n] ^ (((int)-729538789L ^ 0xD4842D46) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

