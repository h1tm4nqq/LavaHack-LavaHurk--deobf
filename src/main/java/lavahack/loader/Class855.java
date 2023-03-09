/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  net.minecraftforge.fml.common.FMLCommonHandler
 */
package lavahack.loader;

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.Class1214;
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import lavahack.loader.Class1191;
import lavahack.loader.Class800;
import lavahack.loader.Class964;
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

public class Class855 {
    private static final Unsafe Field11604;
    private static Method Field11605;
    private static ClassLoader Field11606;
    private static boolean Field11607;
    private static final String[] Field11608;
    private int Field11609;

    public static boolean Method3594(String string) {
        block6: {
            Object object;
            Field field = ManagementFactory.getRuntimeMXBean().getClass().getDeclaredField("jvm");
            field.setAccessible(true);
            VMManagement vMManagement = (VMManagement)field.get(ManagementFactory.getRuntimeMXBean());
            List<String> list = vMManagement.getVmArguments();
            for (String string2 : Field11608) {
                for (String string3 : list) {
                    if (!string3.contains(string2)) continue;
                    if (string2.equals("-noverify")) {
                        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal noverify argument!");
                        Class1204.Method4854("Found illegal noverify argument!");
                        JOptionPane.showMessageDialog(null, "Please remove -noverify argument");
                        Class1191.Method4796();
                        Class800 class800 = Class964.Method3958(Class964.Method3955());
                        class800.Method3322("sendmessage User with key \"" + string + "\" have illegal -noverify argument!");
                        Class1214.Method4893("Please remove -noverify argument!", true);
                        return false;
                    }
                    break block6;
                }
            }
            if (!Field11607) {
                object = Class855.Method3596("java/lang/instrument/Instrumentation");
                Field11604.defineClass("java.lang.instrument.Instrumentation", (byte[])object, 0, ((String[])object).length, null, null);
            }
            if (Class855.Method3595("sun.instrument.InstrumentationImpl")) {
                LavaHackLoaderCoreMod.getLOGGER().info("Found sun.instrument.InstrumentationImpl!");
                Class855.Method3597();
                return false;
            }
            if (!Field11607) {
                object = "com/kisman/cc/loader/antidump/MaliciousClassFilter";
                byte[] byArray = Class855.Method3596((String)object);
                Field11604.defineClass(((String)object).replaceAll("/", "."), byArray, 0, byArray.length, null, null);
                System.setProperty("sun.jvm.hotspot.tools.jcore.filter", ((String)object).replaceAll("/", "."));
            }
            Class855.Method3600();
            Field11607 = true;
            return true;
        }
        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal program arguments!");
        Class855.Method3597();
        return false;
    }

    private static boolean Method3595(String string) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
        method.setAccessible(true);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
        if (method.invoke(classLoader, string) != null) return true;
        if (method.invoke(classLoader2, string) != null) return true;
        return false;
    }

    private static byte[] Method3596(String string) {
        ClassNode classNode = new ClassNode();
        classNode.name = string.replace('.', '/');
        classNode.access = 1;
        classNode.version = 52;
        classNode.superName = "java/lang/Object";
        ArrayList<MethodNode> arrayList = new ArrayList<MethodNode>();
        MethodNode methodNode = new MethodNode(9, "<clinit>", "()V", null, null);
        InsnList insnList = new InsnList();
        insnList.add(new FieldInsnNode(178, "java/lang/System", "out", "Ljava/io/PrintStream;"));
        insnList.add(new LdcInsnNode("Nice try"));
        insnList.add(new MethodInsnNode(182, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false));
        insnList.add(new TypeInsnNode(187, "java/lang/Throwable"));
        insnList.add(new InsnNode(89));
        insnList.add(new LdcInsnNode("owned"));
        insnList.add(new MethodInsnNode(183, "java/lang/Throwable", "<init>", "(Ljava/lang/String;)V", false));
        insnList.add(new InsnNode(191));
        methodNode.instructions = insnList;
        arrayList.add(methodNode);
        classNode.methods = arrayList;
        ClassWriter classWriter = new ClassWriter(2);
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }

    private static void Method3597() {
        Field11604.putAddress(0L, 0L);
        FMLCommonHandler.instance().exitJava(0, false);
        Error error = new Error();
        error.setStackTrace(new StackTraceElement[0]);
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
            Field11606 = Class855.class.getClassLoader();
        } else {
            Field11606 = null;
        }
        Field11605 = ClassLoader.class.getDeclaredMethod("findNative", ClassLoader.class, String.class);
        object2 = ClassLoader.getSystemClassLoader().loadClass("jdk.internal.module.IllegalAccessLogger");
        object = ((Class)object2).getDeclaredField("logger");
        Field11604.putObjectVolatile(object2, Field11604.staticFieldOffset((Field)object), null);
        Field11605.setAccessible(true);
    }

    private static void Method3599() throws Throwable {
        Class855.Method3598();
    }

    public static void Method3600() {
        Class855.Method3599();
        long l = Class855.Method3601("gHotSpotVMStructs");
        Field11604.putLong(l, 0L);
    }

    private static long Method3601(String string) throws InvocationTargetException, IllegalAccessException {
        long l = (Long)Field11605.invoke(null, Field11606, string);
        if (l != 0L) return Field11604.getLong(l);
        throw new NoSuchElementException(string);
    }

    private static String Method3602(long l) {
        byte by;
        if (l == 0L) {
            return null;
        }
        char[] cArray = new char[40];
        int n = 0;
        while ((by = Field11604.getByte(l + (long)n)) != 0) {
            int cfr_ignored_0 = cArray.length;
            cArray[n++] = (char)by;
        }
        return new String(cArray, 0, n);
    }

    static {
        Unsafe unsafe;
        Field11607 = false;
        Field11608 = new String[]{"-XBootclasspath", "-javaagent", "-Xdebug", "-agentlib", "-Xrunjdwp", "-Xnoagent", "-verbose", "-DproxySet", "-DproxyHost", "-DproxyPort", "-Djavax.net.ssl.trustStore", "-Djavax.net.ssl.trustStorePassword", "-noverify"};
        Class<?> clazz = Class.forName("sun.misc.Unsafe");
        Field field = clazz.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Field11604 = unsafe = (Unsafe)field.get(null);
    }

    private static String Method3603(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 104;
            cArray2[n] = (char)(cArray[n] ^ (0xEEC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

