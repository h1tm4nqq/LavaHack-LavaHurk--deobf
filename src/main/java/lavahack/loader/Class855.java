//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import sun.misc.*;
import java.lang.management.*;
import sun.management.*;
import javax.swing.*;
import java.awt.*;
import com.kisman.cc.loader.*;
import java.security.*;
import java.lang.reflect.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.*;
import net.minecraftforge.fml.common.*;
import java.util.*;

public class Class855
{
    private static final Unsafe Field11604;
    private static Method Field11605;
    private static ClassLoader Field11606;
    private static boolean Field11607;
    private static final String[] Field11608;
    private int Field11609;
    
    public static boolean Method3594(final String str) {
        final Field declaredField = ManagementFactory.getRuntimeMXBean().getClass().getDeclaredField("jvm");
        declaredField.setAccessible(true);
        final List<String> vmArguments = ((VMManagement)declaredField.get(ManagementFactory.getRuntimeMXBean())).getVmArguments();
        for (final String s : Class855.Field11608) {
            final Iterator<String> iterator = vmArguments.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().contains(s)) {
                    if (s.equals("-noverify")) {
                        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal noverify argument!");
                        Class1204.Method4854("Found illegal noverify argument!");
                        JOptionPane.showMessageDialog(null, "Please remove -noverify argument");
                        Class1191.Method4796();
                        Class964.Method3958((Class122)Class964.Method3955()).Method3322("sendmessage User with key \"" + str + "\" have illegal -noverify argument!");
                        Class1214.Method4893("Please remove -noverify argument!", true);
                    }
                    else {
                        LavaHackLoaderCoreMod.getLOGGER().info("Found illegal program arguments!");
                        Method3597();
                    }
                    return false;
                }
            }
        }
        if (!Class855.Field11607) {
            final byte[] method3596 = Method3596("java/lang/instrument/Instrumentation");
            Class855.Field11604.defineClass("java.lang.instrument.Instrumentation", method3596, 0, method3596.length, (ClassLoader)null, (ProtectionDomain)null);
        }
        if (Method3595("sun.instrument.InstrumentationImpl")) {
            LavaHackLoaderCoreMod.getLOGGER().info("Found sun.instrument.InstrumentationImpl!");
            Method3597();
            return false;
        }
        if (!Class855.Field11607) {
            final String s2 = "com/kisman/cc/loader/antidump/MaliciousClassFilter";
            final byte[] method3597 = Method3596(s2);
            Class855.Field11604.defineClass(s2.replaceAll("/", "."), method3597, 0, method3597.length, (ClassLoader)null, (ProtectionDomain)null);
            System.setProperty("sun.jvm.hotspot.tools.jcore.filter", s2.replaceAll("/", "."));
        }
        Method3600();
        return Class855.Field11607 = true;
    }
    
    private static boolean Method3595(final String s) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
        declaredMethod.setAccessible(true);
        final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return declaredMethod.invoke(contextClassLoader, s) != null || declaredMethod.invoke(systemClassLoader, s) != null;
    }
    
    private static byte[] Method3596(final String s) {
        final ClassNode classNode = new ClassNode();
        classNode.name = s.replace('.', '/');
        classNode.access = 1;
        classNode.version = 52;
        classNode.superName = "java/lang/Object";
        final ArrayList<MethodNode> methods = new ArrayList<MethodNode>();
        final MethodNode methodNode = new MethodNode(9, "<clinit>", "()V", (String)null, (String[])null);
        final InsnList instructions = new InsnList();
        instructions.add((AbstractInsnNode)new FieldInsnNode(178, "java/lang/System", "out", "Ljava/io/PrintStream;"));
        instructions.add((AbstractInsnNode)new LdcInsnNode((Object)"Nice try"));
        instructions.add((AbstractInsnNode)new MethodInsnNode(182, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false));
        instructions.add((AbstractInsnNode)new TypeInsnNode(187, "java/lang/Throwable"));
        instructions.add((AbstractInsnNode)new InsnNode(89));
        instructions.add((AbstractInsnNode)new LdcInsnNode((Object)"owned"));
        instructions.add((AbstractInsnNode)new MethodInsnNode(183, "java/lang/Throwable", "<init>", "(Ljava/lang/String;)V", false));
        instructions.add((AbstractInsnNode)new InsnNode(191));
        methodNode.instructions = instructions;
        methods.add(methodNode);
        classNode.methods = methods;
        final ClassWriter classWriter = new ClassWriter(2);
        classNode.accept((ClassVisitor)classWriter);
        return classWriter.toByteArray();
    }
    
    private static void Method3597() {
        Class855.Field11604.putAddress(0L, 0L);
        FMLCommonHandler.instance().exitJava(0, false);
        final Error error = new Error();
        error.setStackTrace(new StackTraceElement[0]);
        throw error;
    }
    
    private static void Method3598() throws NoSuchMethodException {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.load(System.getProperty("java.home") + (System.getProperty("java.vm.name").contains("Client VM") ? "/bin/client/jvm.dll" : "/bin/server/jvm.dll"));
            Class855.Field11606 = Class855.class.getClassLoader();
        }
        else {
            Class855.Field11606 = null;
        }
        Class855.Field11605 = ClassLoader.class.getDeclaredMethod("findNative", ClassLoader.class, String.class);
        final Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass("jdk.internal.module.IllegalAccessLogger");
        Class855.Field11604.putObjectVolatile(loadClass, Class855.Field11604.staticFieldOffset(loadClass.getDeclaredField("logger")), null);
        Class855.Field11605.setAccessible(true);
    }
    
    private static void Method3599() throws Throwable {
        Method3598();
    }
    
    public static void Method3600() {
        Method3599();
        Class855.Field11604.putLong(Method3601("gHotSpotVMStructs"), 0L);
    }
    
    private static long Method3601(final String s) throws InvocationTargetException, IllegalAccessException {
        final long longValue = (long)Class855.Field11605.invoke(null, Class855.Field11606, s);
        if (longValue == 0L) {
            throw new NoSuchElementException(s);
        }
        return Class855.Field11604.getLong(longValue);
    }
    
    private static String Method3602(final long n) {
        if (n == 0L) {
            return null;
        }
        char[] value;
        int count;
        byte byte1;
        int length;
        for (value = new char[40], count = 0; (byte1 = Class855.Field11604.getByte(n + count)) != 0; value[count++] = (char)byte1) {
            length = value.length;
        }
        return new String(value, 0, count);
    }
    
    static {
        Class855.Field11607 = false;
        Field11608 = new String[] { "-XBootclasspath", "-javaagent", "-Xdebug", "-agentlib", "-Xrunjdwp", "-Xnoagent", "-verbose", "-DproxySet", "-DproxyHost", "-DproxyPort", "-Djavax.net.ssl.trustStore", "-Djavax.net.ssl.trustStorePassword", "-noverify" };
        final Field declaredField = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        declaredField.setAccessible(true);
        Field11604 = (Unsafe)declaredField.get(null);
    }
    
    private static String Method3603(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xEEC ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
