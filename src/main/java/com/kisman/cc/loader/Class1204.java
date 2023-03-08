//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import org.jetbrains.annotations.*;
import com.kisman.cc.*;
import lavahack.loader.*;
import kotlin.concurrent.*;
import java.nio.file.attribute.*;
import java.nio.file.*;
import net.minecraft.launchwrapper.*;
import kotlin.jvm.internal.*;
import java.util.zip.*;
import kotlin.text.*;
import kotlin.*;
import kotlin.io.*;
import java.io.*;
import com.kisman.cc.util.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.*;
import kotlin.jvm.functions.*;
import sun.misc.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0006\u0010.\u001a\u00020/\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0006\u00101\u001a\u00020/\u001a.\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0001\u001a6\u00107\u001a\u0006\u0012\u0002\b\u0003082\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00032\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001080<H\u0002\u001a\u000e\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010@\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010A\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010B\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T?\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\"*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0086T?\u0006\u0002\n\u0000\"\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007\"\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007\"$\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001@FX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\"\u000e\u0010&\u001a\u00020\u0001X\u0086T?\u0006\u0002\n\u0000\"\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(X\u0086\u000e?\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,?\u0006C" }, d2 = { "address", "", "canPressInstallButton", "", "getCanPressInstallButton", "()Z", "setCanPressInstallButton", "(Z)V", "haveLibraries", "getHaveLibraries", "setHaveLibraries", "loaded", "getLoaded", "setLoaded", "oldLogs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getOldLogs", "()Ljava/util/ArrayList;", "setOldLogs", "(Ljava/util/ArrayList;)V", "overwritingLibrary", "getOverwritingLibrary", "setOverwritingLibrary", "port", "", "receivedVersionCheckAnswer", "getReceivedVersionCheckAnswer", "setReceivedVersionCheckAnswer", "receivedVersions", "getReceivedVersions", "setReceivedVersions", "value", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "version", "versions", "", "getVersions", "()[Ljava/lang/String;", "setVersions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "createGui", "", "downloadLibraries", "initLoader", "load", "key", "properties", "processors", "versionToLoad", "loadClass", "Ljava/lang/Class;", "name", "resolve", "classFinder", "Lkotlin/Function1;", "loadIntoClassLoader", "bytes", "", "loadIntoCustomClassLoader", "loadIntoResourceCache", "versionCheck", "kisman.cc" })
public final class Class1204
{
    @NotNull
    public static final String Field13453;
    public static final int Field13454;
    @NotNull
    public static final String Field13455;
    private static boolean Field13456;
    @NotNull
    private static String[] Field13457;
    @NotNull
    private static ArrayList Field13458;
    private static boolean Field13459;
    private static boolean Field13460;
    private static boolean Field13461;
    private static boolean Field13462;
    private static boolean Field13463;
    @NotNull
    private static String Field13464;
    private String Field13465 = "TheKisDevs & LavaHack Development owns you";
    
    public static final boolean Method4837() {
        return Class1204.Field13456;
    }
    
    public static final void Method4838(final boolean field13456) {
        Class1204.Field13456 = field13456;
    }
    
    @NotNull
    @NotNull
    public static final String[] Method4839() {
        return Class1204.Field13457;
    }
    
    public static final void Method4840(@NotNull @NotNull final String[] field13457) {
        Intrinsics.checkParameterIsNotNull((Object)field13457, "<set-?>");
        Class1204.Field13457 = field13457;
    }
    
    @NotNull
    @NotNull
    public static final ArrayList Method4841() {
        return Class1204.Field13458;
    }
    
    public static final void Method4842(@NotNull @NotNull final ArrayList field13458) {
        Intrinsics.checkParameterIsNotNull((Object)field13458, "<set-?>");
        Class1204.Field13458 = field13458;
    }
    
    public static final boolean Method4843() {
        return Class1204.Field13459;
    }
    
    public static final void Method4844(final boolean field13459) {
        Class1204.Field13459 = field13459;
    }
    
    public static final boolean Method4845() {
        return Class1204.Field13460;
    }
    
    public static final void Method4846(final boolean field13460) {
        Class1204.Field13460 = field13460;
    }
    
    public static final boolean Method4847() {
        return Class1204.Field13461;
    }
    
    public static final void Method4848(final boolean field13461) {
        Class1204.Field13461 = field13461;
    }
    
    public static final boolean Method4849() {
        return Class1204.Field13462;
    }
    
    public static final void Method4850(final boolean field13462) {
        Class1204.Field13462 = field13462;
    }
    
    public static final boolean Method4851() {
        return Class1204.Field13463;
    }
    
    public static final void Method4852(final boolean field13463) {
        Class1204.Field13463 = field13463;
    }
    
    @NotNull
    @NotNull
    public static final String Method4853() {
        return Class1204.Field13464;
    }
    
    public static final void Method4854(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "value");
        if (Class1191.Method4793()) {
            Class1191.Method4797(s);
        }
        else {
            Class1204.Field13458.add(s);
        }
        Class1204.Field13464 = s;
    }
    
    public static final void Method4855(@NotNull @NotNull final String str, @NotNull @NotNull final String str2, @NotNull @NotNull final String str3, @NotNull @NotNull final String str4, @NotNull @NotNull final String str5) {
        Intrinsics.checkParameterIsNotNull((Object)str, "key");
        Intrinsics.checkParameterIsNotNull((Object)str2, "version");
        Intrinsics.checkParameterIsNotNull((Object)str3, "properties");
        Intrinsics.checkParameterIsNotNull((Object)str4, "processors");
        Intrinsics.checkParameterIsNotNull((Object)str5, "versionToLoad");
        if (Class1214.Method4884()) {
            Kisman.LOGGER.debug("Not loading due to running in debugging environment!");
            return;
        }
        if (!Class1204.Field13461 || LavaHackLoaderCoreMod.Companion.getLoaded()) {
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        ref$ObjectRef.element = Class964.Method3958((Class122)new Class810(new Class1731(ref$ObjectRef, str, str3, str4)));
        ((Class800)ref$ObjectRef.element).Method3322("getpublicjar " + str + ' ' + str2 + ' ' + str3 + ' ' + str4 + ' ' + str5);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is trying to download classes...");
        Method4854("Trying to download LavaHack");
    }
    
    public static final void Method4856() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Creating the gui");
        Class1191.Method4795();
        for (final String s : Class1204.Field13458) {
            Intrinsics.checkExpressionValueIsNotNull((Object)s, "log");
            Class1191.Method4797(s);
        }
    }
    
    public static final void Method4857() {
        Class1007.Method4052();
        ThreadsKt.thread$default(false, false, (ClassLoader)null, (String)null, 0, (Function0)Class1451.Field14799, 31, (Object)null);
    }
    
    private static final void Method4858() {
        if (!Class1204.Field13460) {
            return;
        }
        final File file = new File("lavahack/loader/libraries");
        final File file2 = new File("lavahack/loader/libraries/library.jar");
        if (file2.exists() && !Class1204.Field13459) {
            return;
        }
        final byte[] array = null;
        Method4854("Started downloading libraries");
        if (!file.exists()) {
            Files.createFile(file.toPath(), (FileAttribute<?>[])new FileAttribute[0]);
        }
        final byte[] allBytes = Files.readAllBytes(file2.toPath());
        Intrinsics.checkExpressionValueIsNotNull((Object)allBytes, "Files.readAllBytes(library.toPath())");
        Method4861(allBytes);
        Method4854("Loaded libraries into class loader");
    }
    
    public static final void Method4859(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck was started!");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        ref$ObjectRef.element = Class964.Method3958((Class122)new Class1978(ref$ObjectRef));
        ((Class800)ref$ObjectRef.element).Method3322("checkversion " + str);
    }
    
    public static final void Method4860(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList was started!");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        ref$ObjectRef.element = Class964.Method3958((Class122)new Class865(ref$ObjectRef));
        ((Class800)ref$ObjectRef.element).Method3322("getversions " + str);
    }
    
    public static final void Method4861(@NotNull @NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull((Object)array, "bytes");
        final File tempFile;
        final File file = tempFile = File.createTempFile("LavaHack-Main-Class", ".jar");
        Intrinsics.checkExpressionValueIsNotNull((Object)tempFile, "tempFile");
        FilesKt.writeBytes(tempFile, array);
        file.deleteOnExit();
        Launch.classLoader.addURL(file.toURI().toURL());
    }
    
    public static final void Method4862(@NotNull @NotNull final byte[] buf) {
        Intrinsics.checkParameterIsNotNull((Object)buf, "bytes");
        final Field declaredField;
        final Field field = declaredField = LaunchClassLoader.class.getDeclaredField("resourceCache");
        Intrinsics.checkExpressionValueIsNotNull((Object)declaredField, "resourceCacheField");
        declaredField.setAccessible(true);
        final Object value = field.get(Launch.classLoader);
        if (value == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.ByteArray>");
        }
        final Map mutableMap = TypeIntrinsics.asMutableMap(value);
        final HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting classes...");
        Method4854("Injecting classes...");
        int i = 0;
        int j = 0;
        String s = null;
        byte[] array = null;
        final ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(buf));
        final Throwable t = null;
        final ZipInputStream zipInputStream2 = zipInputStream;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        while (true) {
            final ZipEntry nextEntry = zipInputStream2.getNextEntry();
            ref$ObjectRef.element = nextEntry;
            if (nextEntry == null) {
                break;
            }
            final ZipEntry zipEntry = (ZipEntry)ref$ObjectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            final String name;
            final String s2 = name = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)name, "name");
            if (StringsKt.endsWith$default(name, ".class", false, 2, (Object)null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting class \"" + StringsKt.removeSuffix(s2, (CharSequence)".class") + '\"');
                final String replace$default = StringsKt.replace$default(StringsKt.removeSuffix(s2, (CharSequence)".class"), '/', '.', false, 4, (Object)null);
                if (Intrinsics.areEqual((Object)replace$default, (Object)"Main")) {
                    Method4861(ByteStreamsKt.readBytes((InputStream)zipInputStream2));
                }
                else {
                    mutableMap.put(replace$default, ByteStreamsKt.readBytes((InputStream)zipInputStream2));
                    if (s == null) {
                        s = replace$default;
                        array = mutableMap.get(replace$default);
                    }
                }
                i++;
                Method4854("Injecting " + replace$default);
            }
            else {
                if (!Class1214.Method4882(s2)) {
                    continue;
                }
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found new resource \"" + s2 + '\"');
                final HashMap<String, byte[]> hashMap2 = hashMap;
                final String s3 = s2;
                final byte[] method4885 = Class1214.Method4885(zipInputStream2);
                Intrinsics.checkExpressionValueIsNotNull((Object)method4885, "Utility.getBytesFromInputStream(zipStream)");
                hashMap2.put(s3, method4885);
                j++;
                Method4854("Found \"" + s2 + "\" resource.");
            }
        }
        final Unit instance = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)zipInputStream, t);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injected " + i + " classes, Found " + j + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        if (!hashMap.isEmpty()) {}
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is setting resourceCache!");
        Method4854("Setting \"resourceCache\"");
        field.set(Launch.classLoader, mutableMap);
        Method4854("Done!");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is done!");
        final AccountData.Companion field2 = AccountData.Field8161;
        final String s4 = s;
        if (s4 == null) {
            Intrinsics.throwNpe();
        }
        field2.Method2227(s4);
        final AccountData.Companion field3 = AccountData.Field8161;
        final byte[] array2 = array;
        if (array2 == null) {
            Intrinsics.throwNpe();
        }
        field3.Method2229(array2);
    }
    
    public static final void Method4863(@NotNull @NotNull final byte[] buf) {
        Intrinsics.checkParameterIsNotNull((Object)buf, "bytes");
        final ConcurrentHashMap<String, byte[]> concurrentHashMap = new ConcurrentHashMap<String, byte[]>();
        final HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting LavaHack...");
        Method4854("Finding files...");
        int n = 0;
        int n2 = 0;
        final ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(buf));
        final Throwable t = null;
        final ZipInputStream zipInputStream2 = zipInputStream;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        while (true) {
            final ZipEntry nextEntry = zipInputStream2.getNextEntry();
            ref$ObjectRef.element = nextEntry;
            if (nextEntry == null) {
                break;
            }
            final ZipEntry zipEntry = (ZipEntry)ref$ObjectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            final String name;
            final String s = name = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)name, "name");
            if (StringsKt.endsWith$default(name, ".class", false, 2, (Object)null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found class \"" + StringsKt.removeSuffix(s, (CharSequence)".class") + '\"');
                final String replace$default = StringsKt.replace$default(StringsKt.removeSuffix(s, (CharSequence)".class"), '/', '.', false, 4, (Object)null);
                concurrentHashMap.put(replace$default, ByteStreamsKt.readBytes((InputStream)zipInputStream2));
                n++;
                Method4854("Found class \"" + StringsKt.removeSuffix(replace$default, (CharSequence)".class") + '\"');
            }
            else {
                if (!Class1214.Method4882(s)) {
                    continue;
                }
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found resource \"" + s + '\"');
                final HashMap<String, byte[]> hashMap2 = hashMap;
                final String s2 = s;
                final byte[] method4885 = Class1214.Method4885(zipInputStream2);
                Intrinsics.checkExpressionValueIsNotNull((Object)method4885, "Utility.getBytesFromInputStream(zipStream)");
                hashMap2.put(s2, method4885);
                n2++;
                Method4854("Found resource \"" + s + '\"');
            }
        }
        final Unit instance = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)zipInputStream, t);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found " + n + " classes and " + n2 + " resources");
        Method4854("Found " + n + " classes and " + n2 + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting classes...");
        Method4854("Injecting classes...");
        if (!concurrentHashMap.isEmpty()) {}
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        Method4854("Injecting resources...");
        if (!hashMap.isEmpty()) {}
        Method4854("Successfully loader!");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is done!");
    }
    
    private static final Class Method4864(final String s, final boolean b, final Function1 function1) {
        if (Class1214.Method4890(Launch.classLoader, "getClassLoadingLock", s) == null) {
            Intrinsics.throwNpe();
        }
        Class clazz = (Class)Class1214.Method4890(Launch.classLoader, "findLoadedClass", s);
        if (clazz == null) {
            final long nanoTime = System.nanoTime();
            clazz = (Class)((Class1214.Method4891(Launch.classLoader, "parent") != null) ? Class1214.Method4890(Launch.classLoader, "loadClass", s, false) : ((Class)Class1214.Method4890(Launch.classLoader, "findBootstrapClassOrNull", s)));
            if (clazz == null) {
                final long nanoTime2 = System.nanoTime();
                clazz = (Class)function1.invoke((Object)s);
                PerfCounter.getParentDelegationTime().addTime(nanoTime2 - nanoTime);
                PerfCounter.getFindClassTime().addElapsedTimeFrom(nanoTime2);
                PerfCounter.getFindClasses().increment();
            }
        }
        if (b) {
            Class1214.Method4890(Launch.classLoader, "resolveClass", clazz);
        }
        final Class clazz2 = clazz;
        Intrinsics.checkExpressionValueIsNotNull((Object)clazz2, "c");
        return clazz2;
    }
    
    static {
        Field13455 = "2.0";
        Field13454 = 25563;
        Field13453 = "161.97.78.143";
        Class1204.Field13457 = new String[0];
        Class1204.Field13458 = new ArrayList();
        Class1204.Field13461 = true;
        Class1204.Field13464 = "Idling";
    }
    
    public static final void Method4865() {
        Method4858();
    }
    
    private static String Method4866(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66CA ^ 0xA8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
