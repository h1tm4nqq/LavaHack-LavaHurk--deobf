/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  net.minecraftforge.fml.common.FMLCommonHandler
 */
package lavahack.loader;

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import lavahack.loader.eZjgvzONpduAwYxUJP1g1vLc32WdbH9H;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import sun.management.VMManagement;
import sun.misc.Unsafe;

public class leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private static final Unsafe Field11604;
    private static Method Field11605;
    private static ClassLoader Field11606;
    private static boolean Field11607;
    private static final String[] Field11608;
    private int Field11609;

    public static boolean Method3594(String string) {
        block6: {
            Field field = ManagementFactory.getRuntimeMXBean().getClass().getDeclaredField("jvm");
            field.setAccessible((boolean)((long)41407150 ^ (long)41407151));
            VMManagement vMManagement = (VMManagement)field.get(ManagementFactory.getRuntimeMXBean());
            List<String> list = vMManagement.getVmArguments();
            Object object = Field11608;
            int n = ((String[])object).length;
            for (int i = (int)((long)-217414204 ^ (long)-217414204); i < n; ++i) {
                String string2 = object[i];
                for (String string3 : list) {
                    if (!string3.contains(string2)) continue;
                    if (string2.equals("-noverify")) {
                        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal noverify argument!");
                        com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Found illegal noverify argument!");
                        JOptionPane.showMessageDialog(null, "Please remove -noverify argument");
                        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4796();
                        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3958(eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3955());
                        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method3322("sendmessage User with key \"" + string + "\" have illegal -noverify argument!");
                        UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4893("Please remove -noverify argument!", (boolean)((long)1677458453 ^ (long)1677458452));
                        return ((int)2141747048L ^ 0x7FA87768) != 0;
                    }
                    break block6;
                }
            }
            if (!Field11607) {
                object = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3596("java/lang/instrument/Instrumentation");
                Field11604.defineClass("java.lang.instrument.Instrumentation", (byte[])object, (int)440555404L ^ 0x1A42578C, ((String[])object).length, null, null);
            }
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3595("sun.instrument.InstrumentationImpl")) {
                LavaHackLoaderCoreMod.getLOGGER().info("Found sun.instrument.InstrumentationImpl!");
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3597();
                return ((int)176345090L ^ 0xA82D002) != 0;
            }
            if (!Field11607) {
                object = "com/kisman/cc/loader/antidump/MaliciousClassFilter";
                byte[] byArray = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3596((String)object);
                Field11604.defineClass(((String)object).replaceAll("/", "."), byArray, (int)((long)1746710776 ^ (long)1746710776), byArray.length, null, null);
                System.setProperty("sun.jvm.hotspot.tools.jcore.filter", ((String)object).replaceAll("/", "."));
            }
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3600();
            Field11607 = (int)((long)443524935 ^ (long)443524934);
            return ((int)-543466829L ^ 0xDF9B5AB2) != 0;
        }
        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal program arguments!");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3597();
        return ((int)2141747048L ^ 0x7FA87768) != 0;
    }

    private static boolean Method3595(String string) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int n;
        Class[] classArray = new Class[(int)((long)-1775283531 ^ (long)-1775283532)];
        classArray[(int)((long)43475458 ^ (long)43475458)] = String.class;
        Method method = ClassLoader.class.getDeclaredMethod("findLoadedClass", classArray);
        method.setAccessible(((int)-1185391292L ^ 0xB9585D45) != 0);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
        Object[] objectArray = new Object[(int)1368818808L ^ 0x51968479];
        objectArray[(int)882182169L ^ 0x34950819] = string;
        if (method.invoke(classLoader, objectArray) == null) {
            Object[] objectArray2 = new Object[(int)((long)651125583 ^ (long)651125582)];
            objectArray2[(int)((long)1470870854 ^ (long)1470870854)] = string;
            if (method.invoke(classLoader2, objectArray2) == null) {
                n = (int)((long)-1703506682 ^ (long)-1703506682);
                return n != 0;
            }
        }
        n = (int)-725581028L ^ 0xD4C0831D;
        return n != 0;
    }

    private static byte[] Method3596(String string) {
        ClassNode classNode = new ClassNode();
        classNode.name = string.replace(((int)1651786580L ^ 0x62744343) << 1, (char)((long)1692312696 ^ (long)1692312663));
        classNode.access = (int)-205830716L ^ 0xF3BB45C5;
        classNode.version = (int)((long)769237840 ^ (long)769237853) << 2;
        classNode.superName = "java/lang/Object";
        ArrayList<MethodNode> arrayList = new ArrayList<MethodNode>();
        MethodNode methodNode = new MethodNode((int)((long)1873856840 ^ (long)1873856833), "<clinit>", "()V", null, null);
        InsnList insnList = new InsnList();
        insnList.add(new FieldInsnNode(((int)-1048329169L ^ 0xC183C476) << 1, "java/lang/System", "out", "Ljava/io/PrintStream;"));
        insnList.add(new LdcInsnNode("Nice try"));
        insnList.add(new MethodInsnNode(((int)2084534832L ^ 0x7C3F7A6B) << 1, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", (boolean)((long)-1395537519 ^ (long)-1395537519)));
        insnList.add(new TypeInsnNode((int)((long)-2136272167 ^ (long)-2136272286), "java/lang/Throwable"));
        insnList.add(new InsnNode((int)-1170817259L ^ 0xBA36BF4C));
        insnList.add(new LdcInsnNode("owned"));
        insnList.add(new MethodInsnNode((int)-701556120L ^ 0xD62F1ADF, "java/lang/Throwable", "<init>", "(Ljava/lang/String;)V", (boolean)((long)-116509482 ^ (long)-116509482)));
        insnList.add(new InsnNode((int)((long)611011182 ^ (long)611011281)));
        methodNode.instructions = insnList;
        arrayList.add(methodNode);
        classNode.methods = arrayList;
        ClassWriter classWriter = new ClassWriter((int)((long)161411211 ^ (long)161411210) << 1);
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }

    private static void Method3597() {
        Field11604.putAddress(0L, 0L);
        FMLCommonHandler.instance().exitJava((int)-334036810L ^ 0xEC1700B6, ((int)-1240870148L ^ 0xB609D2FC) != 0);
        Error error = new Error();
        error.setStackTrace(new StackTraceElement[(int)((long)-1748905784 ^ (long)-1748905784)]);
        throw error;
    }

    private static void Method3598() throws NoSuchMethodException {
        Object object;
        Object object2;
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("windows")) {
            object2 = System.getProperty("java.vm.name");
            object = ((String)object2).contains("Client VM") ? "/bin/client/jvm.dll" : "/bin/server/jvm.dll";
            System.load(System.getProperty("java.home") + (String)object);
            Field11606 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class.getClassLoader();
        } else {
            Field11606 = null;
        }
        Class[] classArray = new Class[(int)((long)-1211039169 ^ (long)-1211039170) << 1];
        classArray[(int)208458555L ^ 0xC6CD33B] = ClassLoader.class;
        classArray[(int)((long)1352601788 ^ (long)1352601789)] = String.class;
        Field11605 = ClassLoader.class.getDeclaredMethod("findNative", classArray);
        object2 = ClassLoader.getSystemClassLoader().loadClass("jdk.internal.module.IllegalAccessLogger");
        object = ((Class)object2).getDeclaredField("logger");
        Field11604.putObjectVolatile(object2, Field11604.staticFieldOffset((Field)object), null);
        Field11605.setAccessible((boolean)((long)-1170638394 ^ (long)-1170638393));
    }

    private static void Method3599() throws Throwable {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3598();
    }

    public static void Method3600() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3599();
        long l = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3601("gHotSpotVMStructs");
        Field11604.putLong(l, 0L);
    }

    private static long Method3601(String string) throws InvocationTargetException, IllegalAccessException {
        Object[] objectArray = new Object[((int)833199464L ^ 0x31A99D69) << 1];
        objectArray[(int)-1070952802L ^ 0xC02A8E9E] = Field11606;
        objectArray[(int)((long)-689930026 ^ (long)-689930025)] = string;
        long l = (Long)Field11605.invoke(null, objectArray);
        if (l != 0L) return Field11604.getLong(l);
        throw new NoSuchElementException(string);
    }

    private static String Method3602(long l) {
        byte by;
        if (l == 0L) {
            return null;
        }
        char[] cArray = new char[((int)-474127844L ^ 0xE3BD6219) << 3];
        int n = (int)((long)-1251592227 ^ (long)-1251592227);
        while ((by = Field11604.getByte(l + (long)n)) != 0) {
            int cfr_ignored_0 = cArray.length;
            cArray[n++] = (char)by;
        }
        return new String(cArray, (int)1747758301L ^ 0x682CACDD, n);
    }

    static {
        Unsafe unsafe;
        Field11607 = (int)-2017283144L ^ 0x87C2B3B8;
        String[] stringArray = new String[(int)167020028L ^ 0x9F485F1];
        stringArray[(int)-281104879L ^ 0xEF3EAE11] = "-XBootclasspath";
        stringArray[(int)((long)-1030528048 ^ (long)-1030528047)] = "-javaagent";
        stringArray[(int)((long)96325825 ^ (long)96325824) << 1] = "-Xdebug";
        stringArray[(int)((long)94285523 ^ (long)94285520)] = "-agentlib";
        stringArray[(int)((long)1431020083 ^ (long)1431020082) << 2] = "-Xrunjdwp";
        stringArray[(int)-1249413165L ^ 0xB58777D6] = "-Xnoagent";
        stringArray[(int)((long)818876348 ^ (long)818876351) << 1] = "-verbose";
        stringArray[(int)-1580281648L ^ 0xA1CED0D7] = "-DproxySet";
        stringArray[(int)((long)1512039732 ^ (long)1512039733) << 3] = "-DproxyHost";
        stringArray[(int)((long)-774551028 ^ (long)-774551035)] = "-DproxyPort";
        stringArray[(int)((long)-472440165 ^ (long)-472440162) << 1] = "-Djavax.net.ssl.trustStore";
        stringArray[(int)((long)1537637894 ^ (long)1537637901)] = "-Djavax.net.ssl.trustStorePassword";
        stringArray[(int)((long)-1256205295 ^ (long)-1256205294) << 2] = "-noverify";
        Field11608 = stringArray;
        Class<?> clazz = Class.forName("sun.misc.Unsafe");
        Field field = clazz.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Field11604 = unsafe = (Unsafe)field.get(null);
    }

    private static String Method3603(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-262679989 ^ (long)-262679989);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-972853503 ^ (long)-972853250);
            int n2 = (int)((long)1812946607 ^ (long)1812946594) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)530871432 ^ (long)530872115) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

