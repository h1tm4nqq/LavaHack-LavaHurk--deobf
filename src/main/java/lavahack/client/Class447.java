//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;
import net.minecraft.entity.*;
import java.math.*;
import net.minecraft.util.math.*;
import java.util.*;

public class Class447
{
    private static final Random Field9859;
    private String Field9860 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static double[] Method2098(final double[] array, final double n) {
        return new double[] { array[0] + n, array[1] + n };
    }
    
    public static double Method2099(final double n) {
        return n * Double.longBitsToDouble((long)1193329230 ^ 0x3F91DF46E720C24EL);
    }
    
    public static Vec3d Method2100(final float n) {
        return new Vec3d(Math.cos(Method2099(n + Float.intBitsToFloat(1119092736))), 0.0, Math.sin(Method2099(n + Float.intBitsToFloat(1119092736))));
    }
    
    public static AxisAlignedBB Method2101(final BlockPos blockPos) {
        return new AxisAlignedBB((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), 1.0, 1.0, 1.0);
    }
    
    public static Point Method2102() {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        int guiScale = getMinecraft.gameSettings.guiScale;
        if (guiScale == 0) {
            guiScale = 1000;
        }
        int n;
        for (n = 0; n < guiScale && getMinecraft.displayWidth / (n + 1) >= 320 && getMinecraft.displayHeight / (n + 1) >= 240; ++n) {}
        return new Point(Mouse.getX() / n, getMinecraft.displayHeight / n - Mouse.getY() / n - 1);
    }
    
    public static Vec3d Method2103(final Entity entity, final float n) {
        return Method2104(entity, n).subtract(Minecraft.getMinecraft().getRenderManager().viewerPosX, Minecraft.getMinecraft().getRenderManager().viewerPosY, Minecraft.getMinecraft().getRenderManager().viewerPosZ);
    }
    
    public static Vec3d Method2104(final Entity entity, final float n) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * n, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * n, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * n);
    }
    
    public static double Method2105(final double n, final double n2, final double n3) {
        return n * (n3 - n2) / Double.longBitsToDouble((long)34868508 ^ 0x4059000002140D1CL) + n2;
    }
    
    public static Vec3d Method2106(final Vec3d vec3d, final Vec3d vec3d2) {
        return new Vec3d(vec3d.x * vec3d2.x, vec3d.y * vec3d2.y, vec3d.z * vec3d2.z);
    }
    
    public static Vec3d Method2107(final Vec3d vec3d, final float n) {
        return new Vec3d(vec3d.x * n, vec3d.y * n, vec3d.z * n);
    }
    
    public static Vec3d Method2108(final Vec3d vec3d, final Vec3d vec3d2) {
        return new Vec3d(vec3d.x / vec3d2.x, vec3d.y / vec3d2.y, vec3d.z / vec3d2.z);
    }
    
    public static Vec3d Method2109(final Vec3d vec3d, final float n) {
        return new Vec3d(vec3d.x / n, vec3d.y / n, vec3d.z / n);
    }
    
    public static double[] Method2110(final double n) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        float n2 = 1.0f;
        if (getMinecraft.gameSettings.keyBindLeft.isPressed() || getMinecraft.gameSettings.keyBindRight.isPressed() || getMinecraft.gameSettings.keyBindBack.isPressed() || getMinecraft.gameSettings.keyBindForward.isPressed()) {
            n2 = getMinecraft.player.movementInput.moveForward;
        }
        float moveStrafe = getMinecraft.player.movementInput.moveStrafe;
        float n3 = getMinecraft.player.prevRotationYaw + (getMinecraft.player.rotationYaw - getMinecraft.player.prevRotationYaw) * getMinecraft.getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        final double sin = Math.sin(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        final double cos = Math.cos(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        return new double[] { n2 * n * cos + moveStrafe * n * sin, n2 * n * sin - moveStrafe * n * cos };
    }
    
    public static double Method2111(final double val, final int newScale) {
        return new BigDecimal(val).setScale(newScale, RoundingMode.HALF_UP).doubleValue();
    }
    
    public static float Method2112(final double val, final int newScale) {
        return BigDecimal.valueOf(val).setScale(newScale, RoundingMode.FLOOR).floatValue();
    }
    
    public static int Method2113(final int n, final int n2) {
        return n + Class447.Field9859.nextInt(n2 - n + 1);
    }
    
    public static double Method2114(final double n, final double n2) {
        return MathHelper.clamp(n + Class447.Field9859.nextDouble() * n2, n, n2);
    }
    
    public static float Method2115(final float n, final float n2) {
        return MathHelper.clamp(n + Class447.Field9859.nextFloat() * n2, n, n2);
    }
    
    public static int Method2116(final int a, final int n, final int b) {
        return (a < n) ? n : Math.min(a, b);
    }
    
    public static float Method2117(final float a, final float n, final float b) {
        return (a < n) ? n : Math.min(a, b);
    }
    
    public static double Method2118(final double a, final double n, final double b) {
        return (a < n) ? n : Math.min(a, b);
    }
    
    public static float Method2119(final float n) {
        return MathHelper.sin(n);
    }
    
    public static float Method2120(final float n) {
        return MathHelper.cos(n);
    }
    
    public static float Method2121(final float n) {
        return MathHelper.wrapDegrees(n);
    }
    
    public static double Method2122(final double n) {
        return MathHelper.wrapDegrees(n);
    }
    
    public static Vec3d Method2123(final Vec3d vec3d, final int n) {
        return new Vec3d(Method2124(vec3d.x, n), Method2124(vec3d.y, n), Method2124(vec3d.z, n));
    }
    
    public static double Method2124(final double val, final int newScale) {
        if (newScale < 0) {
            throw new IllegalArgumentException();
        }
        return BigDecimal.valueOf(val).setScale(newScale, RoundingMode.FLOOR).doubleValue();
    }
    
    public static float Method2125(final float n) {
        float n2 = n % Float.intBitsToFloat(1135869952);
        if (n2 >= Float.intBitsToFloat(1127481344)) {
            n2 -= Float.intBitsToFloat(1135869952);
        }
        if (n2 < Float.intBitsToFloat(-1020002304)) {
            n2 += Float.intBitsToFloat(1135869952);
        }
        return n2;
    }
    
    public static float Method2126(final float n, final int newScale) {
        if (newScale < 0) {
            throw new IllegalArgumentException();
        }
        return BigDecimal.valueOf(n).setScale(newScale, RoundingMode.FLOOR).floatValue();
    }
    
    public static Map Method2127(final Map map, final boolean b) {
        final LinkedList<Object> list = new LinkedList<Object>(map.entrySet());
        if (b) {
            list.sort((Comparator<? super Object>)Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        else {
            list.sort((Comparator<? super Object>)Map.Entry.comparingByValue());
        }
        final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        for (final Map.Entry<Object, V> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
    
    public static String Method2128() {
        final int value = Calendar.getInstance().get(11);
        if (value < 12) {
            return "Good Morning";
        }
        if (value < 16) {
            return "Good Afternoon";
        }
        if (value < 21) {
            return "Good Evening";
        }
        return "Good Night";
    }
    
    public static double Method2129(final double n) {
        return n * Double.longBitsToDouble((long)1117397608 ^ 0x404CA5DC629A2268L);
    }
    
    public static double Method2130(final double n, final double n2) {
        final double n3 = 1.0 / n2;
        return Math.round(n * n3) / n3;
    }
    
    public static double[] Method2131(final double n) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        float n2 = getMinecraft.player.movementInput.moveForward;
        float moveStrafe = getMinecraft.player.movementInput.moveStrafe;
        float n3 = getMinecraft.player.prevRotationYaw + (getMinecraft.player.rotationYaw - getMinecraft.player.prevRotationYaw) * getMinecraft.getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        final double sin = Math.sin(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        final double cos = Math.cos(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        return new double[] { n2 * n * cos + moveStrafe * n * sin, n2 * n * sin - moveStrafe * n * cos };
    }
    
    public static List Method2132(final Entity entity) {
        final ArrayList<Vec3d> list = new ArrayList<Vec3d>();
        final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
        final double posY = entity.posY;
        final double method2124 = Method2124(getEntityBoundingBox.minX, 0);
        final double method2125 = Method2124(getEntityBoundingBox.minZ, 0);
        final double method2126 = Method2124(getEntityBoundingBox.maxX, 0);
        final double method2127 = Method2124(getEntityBoundingBox.maxZ, 0);
        if (method2124 != method2126) {
            list.add(new Vec3d(method2124, posY, method2125));
            list.add(new Vec3d(method2126, posY, method2125));
            if (method2125 != method2127) {
                list.add(new Vec3d(method2124, posY, method2127));
                list.add(new Vec3d(method2126, posY, method2127));
                return list;
            }
        }
        else if (method2125 != method2127) {
            list.add(new Vec3d(method2124, posY, method2125));
            list.add(new Vec3d(method2124, posY, method2127));
            return list;
        }
        list.add(entity.getPositionVector());
        return list;
    }
    
    public static boolean Method2133(final Vec3d vec3d, final Vec3d vec3d2) {
        return Method2134(vec3d, vec3d2);
    }
    
    public static boolean Method2134(final Vec3d vec3d, final Vec3d vec3d2) {
        return new BlockPos(vec3d).equals((Object)new BlockPos(vec3d2.x, vec3d.y, vec3d2.z));
    }
    
    public static double Method2135(final float n, final float n2, final float n3, final float n4) {
        return Math.sqrt((n - n3) * (n - n3) + (n2 - n4) * (n2 - n4));
    }
    
    public static double Method2136(final double a) {
        return 1.0 / Math.tan(a);
    }
    
    public static Class783 Method2137(final int n, final int n2, final float n3, final int n4, final int n5, final float n6, final boolean b) {
        final Class783 class783 = new Class783();
        final double longBitsToDouble = Double.longBitsToDouble((long)1479658048 ^ 0x3F91DF46FA635779L);
        Label_0550: {
            if (Math.abs(n3 - n6) < 1.0f) {
                if (b) {
                    Class1393.Method5507().Method1886("The angles cannot be equal");
                    return null;
                }
            }
            else if (((n3 < 0.0f && n6 > 0.0f) || (n3 > 0.0f && n6 < 0.0f)) && Math.abs(Math.abs(Math.abs(n3) - Float.intBitsToFloat(1127481344)) - Math.abs(n6)) < 1.0f) {
                if (b) {
                    Class1393.Method5507().Method1886("The angles cannot be opposite");
                    return null;
                }
            }
            else {
                switch (Math.round(n3)) {
                    case -180:
                    case 0:
                    case 180: {
                        class783.Field11301 = Math.round((float)n);
                        class783.Field11302 = (int)Math.round(Method2136(-n6 * longBitsToDouble) * n - (n4 * Method2136(-n6 * longBitsToDouble) - n5));
                        break;
                    }
                    case -90:
                    case 90: {
                        class783.Field11301 = Math.round((float)n2);
                        class783.Field11302 = (int)Math.round(Math.round(n4 * Method2136(-n6 * longBitsToDouble) - n5 + n2) / Method2136(-n6 * longBitsToDouble));
                        break;
                    }
                    default: {
                        switch (Math.round(n6)) {
                            case -180:
                            case 0:
                            case 180: {
                                class783.Field11301 = Math.round((float)n4);
                                class783.Field11302 = (int)Math.round(Method2136(-n3 * longBitsToDouble) * n4 - (n * Method2136(-n3 * longBitsToDouble) - n2));
                                break Label_0550;
                            }
                            case -90:
                            case 90: {
                                class783.Field11301 = Math.round((float)n5);
                                class783.Field11302 = (int)Math.round(Math.round(n * Method2136(-n3 * longBitsToDouble) - n2 + n5) / Method2136(-n3 * longBitsToDouble));
                                break Label_0550;
                            }
                            default: {
                                class783.Field11301 = (int)Math.round((n * Method2136(-n3 * longBitsToDouble) - n2 - (n4 * Method2136(-n6 * longBitsToDouble) - n5)) / (Method2136(-n3 * longBitsToDouble) - Method2136(-n6 * longBitsToDouble)));
                                class783.Field11302 = (int)Math.round(Method2136(-n3 * longBitsToDouble) * class783.Field11301 - (n * Method2136(-n3 * longBitsToDouble) - n2));
                                break Label_0550;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return class783;
    }
    
    public static double Method2138(final double n) {
        if (n != n) {
            return Double.longBitsToDouble(9221120237041090560L);
        }
        final double n2 = (n < 0.0) ? (0.0 - n) : n;
        final double n3 = (double)(long)n;
        if (n2 > Double.longBitsToDouble(4841369599423283200L) || n3 == n) {
            return n;
        }
        return ((n3 < 0.0) ? (n3 - 1.0) : n3) + Double.longBitsToDouble((long)847636273 ^ 0x3FE000003285E731L);
    }
    
    public static List Method2139(final double n, final double n2, final double n3, final double n4, final double n5) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        double n6 = n2;
        double n7 = n3;
        double abs = Math.abs(n4 - n2);
        double abs2 = Math.abs(n5 - n3);
        final double signum = Math.signum(n4 - n2);
        final double signum2 = Math.signum(n5 - n3);
        double d1;
        if (abs2 > abs) {
            final double n8 = abs;
            abs = abs2;
            abs2 = n8;
            d1 = 1.0;
        }
        else {
            d1 = 0.0;
        }
        double n9 = Double.longBitsToDouble((long)264869832 ^ 0x400000000FC997C8L) * abs2 - abs;
        final double n10 = Double.longBitsToDouble(4611686018427387904L) * abs2;
        final double n11 = Double.longBitsToDouble((long)671977258 ^ 0x40000000280D8F2AL) * abs2 - Double.longBitsToDouble(4611686018427387904L) * abs;
        for (int n12 = 0; n12 < abs; ++n12) {
            if (n9 < 0.0) {
                Double.compare(d1, 1.0);
                n6 += n2;
                n9 += n10;
            }
            else {
                n7 += signum2;
                n6 += signum;
                n9 += n11;
            }
            list.add(new BlockPos(n6, n7, n));
        }
        return list;
    }
    
    public static double Method2140(final double n) {
        final double n2 = n - 1.0;
        return Math.sqrt(1.0 - n2 * n2);
    }
    
    public static double Method2141(final double n) {
        return Math.sqrt(-(n * n) - Double.longBitsToDouble((long)126523016 ^ 0x40000000078A9688L) * n);
    }
    
    public static double Method2142(final double n) {
        return n * n + (1.0 - (1.0 - n) * (1.0 - n) - n * n) * n;
    }
    
    static {
        Field9859 = new Random();
    }
    
    private static String Method2143(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x64BA ^ 0x6F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
