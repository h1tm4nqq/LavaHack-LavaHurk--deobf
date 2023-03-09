/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.Kisman
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.Unit
 *  kotlin.concurrent.ThreadsKt
 *  kotlin.io.ByteStreamsKt
 *  kotlin.io.CloseableKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  kotlin.jvm.internal.TypeIntrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.launchwrapper.Launch
 *  net.minecraft.launchwrapper.LaunchClassLoader
 *  sun.misc.PerfCounter
 */
package com.kisman.cc.loader;

import com.kisman.cc.Kisman;
import com.kisman.cc.loader.Class1214;
import com.kisman.cc.loader.Class1451;
import com.kisman.cc.loader.Class1731;
import com.kisman.cc.loader.Class1978;
import com.kisman.cc.loader.Class810;
import com.kisman.cc.loader.Class865;
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.util.AccountData;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import lavahack.loader.Class1007;
import lavahack.loader.Class1191;
import lavahack.loader.Class800;
import lavahack.loader.Class964;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.jetbrains.annotations.NotNull;
import sun.misc.PerfCounter;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0006\u0010.\u001a\u00020/\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0006\u00101\u001a\u00020/\u001a.\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0001\u001a6\u00107\u001a\u0006\u0012\u0002\b\u0003082\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00032\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001080<H\u0002\u001a\u000e\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010@\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010A\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010B\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\"*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007\"\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007\"$\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006C"}, d2={"address", "", "canPressInstallButton", "", "getCanPressInstallButton", "()Z", "setCanPressInstallButton", "(Z)V", "haveLibraries", "getHaveLibraries", "setHaveLibraries", "loaded", "getLoaded", "setLoaded", "oldLogs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getOldLogs", "()Ljava/util/ArrayList;", "setOldLogs", "(Ljava/util/ArrayList;)V", "overwritingLibrary", "getOverwritingLibrary", "setOverwritingLibrary", "port", "", "receivedVersionCheckAnswer", "getReceivedVersionCheckAnswer", "setReceivedVersionCheckAnswer", "receivedVersions", "getReceivedVersions", "setReceivedVersions", "value", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "version", "versions", "", "getVersions", "()[Ljava/lang/String;", "setVersions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "createGui", "", "downloadLibraries", "initLoader", "load", "key", "properties", "processors", "versionToLoad", "loadClass", "Ljava/lang/Class;", "name", "resolve", "classFinder", "Lkotlin/Function1;", "loadIntoClassLoader", "bytes", "", "loadIntoCustomClassLoader", "loadIntoResourceCache", "versionCheck", "kisman.cc"})
public final class Class1204 {
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
        return Field13456;
    }

    public static final void Method4838(boolean bl) {
        Field13456 = bl;
    }

    @NotNull
    @NotNull
    public static final String[] Method4839() {
        return Field13457;
    }

    public static final void Method4840(@NotNull @NotNull String[] stringArray) {
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"<set-?>");
        Field13457 = stringArray;
    }

    @NotNull
    @NotNull
    public static final ArrayList Method4841() {
        return Field13458;
    }

    public static final void Method4842(@NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"<set-?>");
        Field13458 = arrayList;
    }

    public static final boolean Method4843() {
        return Field13459;
    }

    public static final void Method4844(boolean bl) {
        Field13459 = bl;
    }

    public static final boolean Method4845() {
        return Field13460;
    }

    public static final void Method4846(boolean bl) {
        Field13460 = bl;
    }

    public static final boolean Method4847() {
        return Field13461;
    }

    public static final void Method4848(boolean bl) {
        Field13461 = bl;
    }

    public static final boolean Method4849() {
        return Field13462;
    }

    public static final void Method4850(boolean bl) {
        Field13462 = bl;
    }

    public static final boolean Method4851() {
        return Field13463;
    }

    public static final void Method4852(boolean bl) {
        Field13463 = bl;
    }

    @NotNull
    @NotNull
    public static final String Method4853() {
        return Field13464;
    }

    public static final void Method4854(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"value");
        if (Class1191.Method4793()) {
            Class1191.Method4797(string);
        } else {
            Field13458.add(string);
        }
        Field13464 = string;
    }

    public static final void Method4855(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3, @NotNull @NotNull String string4, @NotNull @NotNull String string5) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"key");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"version");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"properties");
        Intrinsics.checkParameterIsNotNull((Object)string4, (String)"processors");
        Intrinsics.checkParameterIsNotNull((Object)string5, (String)"versionToLoad");
        if (Class1214.Method4884()) {
            Kisman.LOGGER.debug("Not loading due to running in debugging environment!");
            return;
        }
        if (!Field13461) return;
        if (LavaHackLoaderCoreMod.Companion.getLoaded()) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Class1731 class1731 = new Class1731(objectRef, string, string3, string4);
        Class810 class810 = new Class810(class1731);
        objectRef.element = Class964.Method3958(class810);
        ((Class800)objectRef.element).Method3322("getpublicjar " + string + ' ' + string2 + ' ' + string3 + ' ' + string4 + ' ' + string5);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is trying to download classes...");
        Class1204.Method4854("Trying to download LavaHack");
    }

    public static final void Method4856() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Creating the gui");
        Class1191.Method4795();
        Iterator iterator = Field13458.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"log");
            Class1191.Method4797(string2);
        }
    }

    public static final void Method4857() {
        Class1007.Method4052();
        ThreadsKt.thread$default((boolean)false, (boolean)false, null, null, (int)0, (Function0)Class1451.Field14799, (int)31, null);
    }

    private static final void Method4858() {
        if (!Field13460) {
            return;
        }
        File file = new File("lavahack/loader/libraries");
        File file2 = new File("lavahack/loader/libraries/library.jar");
        if (file2.exists() && !Field13459) {
            return;
        }
        boolean bl = false;
        boolean bl2 = false;
        byte[] byArray = null;
        Class1204.Method4854("Started downloading libraries");
        if (!file.exists()) {
            Files.createFile(file.toPath(), new FileAttribute[0]);
        }
        byte[] byArray2 = Files.readAllBytes(file2.toPath());
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"Files.readAllBytes(library.toPath())");
        Class1204.Method4861(byArray2);
        Class1204.Method4854("Loaded libraries into class loader");
    }

    public static final void Method4859(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck was started!");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Class1978 class1978 = new Class1978(objectRef);
        objectRef.element = Class964.Method3958(class1978);
        ((Class800)objectRef.element).Method3322("checkversion " + string);
    }

    public static final void Method4860(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList was started!");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Class865 class865 = new Class865(objectRef);
        objectRef.element = Class964.Method3958(class865);
        ((Class800)objectRef.element).Method3322("getversions " + string);
    }

    public static final void Method4861(@NotNull @NotNull byte[] byArray) {
        File file;
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"bytes");
        File file2 = file = File.createTempFile("LavaHack-Main-Class", ".jar");
        Intrinsics.checkExpressionValueIsNotNull((Object)file2, (String)"tempFile");
        FilesKt.writeBytes((File)file2, (byte[])byArray);
        file.deleteOnExit();
        Launch.classLoader.addURL(file.toURI().toURL());
    }

    public static final void Method4862(@NotNull @NotNull byte[] byArray) {
        Field field;
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"bytes");
        Field field2 = field = LaunchClassLoader.class.getDeclaredField("resourceCache");
        Intrinsics.checkExpressionValueIsNotNull((Object)field2, (String)"resourceCacheField");
        field2.setAccessible(true);
        Object object = field.get(Launch.classLoader);
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.ByteArray>");
        }
        Map map = TypeIntrinsics.asMutableMap((Object)object);
        HashMap hashMap = new HashMap();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting classes...");
        Class1204.Method4854("Injecting classes...");
        int n = 0;
        int n2 = 0;
        Object object2 = null;
        byte[] byArray2 = null;
        Object object3 = byArray;
        boolean bl = false;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object3);
        InputStream inputStream = byteArrayInputStream;
        object3 = new ZipInputStream(inputStream);
        bl = false;
        Throwable throwable = null;
        ZipInputStream zipInputStream = (ZipInputStream)object3;
        boolean bl2 = false;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        while (true) {
            Object object4 = zipInputStream.getNextEntry();
            int n3 = 0;
            boolean bl3 = false;
            Object object5 = object4;
            boolean bl4 = false;
            objectRef.element = object5;
            if (object4 == null) break;
            ZipEntry zipEntry = (ZipEntry)objectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            Object object6 = object4 = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)object6, (String)"name");
            if (StringsKt.endsWith$default((String)object6, (String)".class", (boolean)false, (int)2, null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting class \"" + StringsKt.removeSuffix((String)object4, (CharSequence)".class") + '\"');
                object4 = StringsKt.removeSuffix((String)object4, (CharSequence)".class");
                object4 = StringsKt.replace$default((String)object4, (char)'/', (char)'.', (boolean)false, (int)4, null);
                if (Intrinsics.areEqual((Object)object4, (Object)"Main")) {
                    Class1204.Method4861(ByteStreamsKt.readBytes((InputStream)zipInputStream));
                } else {
                    Map map2 = map;
                    byte[] byArray3 = ByteStreamsKt.readBytes((InputStream)zipInputStream);
                    boolean bl5 = false;
                    map2.put(object4, byArray3);
                    if (object2 == null) {
                        object2 = object4;
                        byArray2 = (byte[])map.get(object4);
                    }
                }
                n3 = n;
                n = n3 + 1;
                Class1204.Method4854("Injecting " + (String)object4);
                continue;
            }
            if (!Class1214.Method4882((String)object4)) continue;
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found new resource \"" + (String)object4 + '\"');
            Map map3 = hashMap;
            Object object7 = object4;
            byte[] byArray4 = Class1214.Method4885(zipInputStream);
            Intrinsics.checkExpressionValueIsNotNull((Object)byArray4, (String)"Utility.getBytesFromInputStream(zipStream)");
            object5 = byArray4;
            bl4 = false;
            map3.put(object7, object5);
            n3 = n2;
            n2 = n3 + 1;
            Class1204.Method4854("Found \"" + (String)object4 + "\" resource.");
        }
        zipInputStream = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)object3, (Throwable)throwable);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injected " + n + " classes, Found " + n2 + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        object3 = hashMap;
        bl = false;
        boolean bl6 = !object3.isEmpty();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is setting resourceCache!");
        Class1204.Method4854("Setting \"resourceCache\"");
        field.set(Launch.classLoader, map);
        Class1204.Method4854("Done!");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is done!");
        String string = object2;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        AccountData.Field8161.Method2227(string);
        if (byArray2 == null) {
            Intrinsics.throwNpe();
        }
        AccountData.Field8161.Method2229(byArray2);
    }

    public static final void Method4863(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"bytes");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        HashMap hashMap = new HashMap();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting LavaHack...");
        Class1204.Method4854("Finding files...");
        int n = 0;
        int n2 = 0;
        Object object = byArray;
        boolean bl = false;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        InputStream inputStream = byteArrayInputStream;
        object = new ZipInputStream(inputStream);
        bl = false;
        Throwable throwable = null;
        ZipInputStream zipInputStream = (ZipInputStream)object;
        boolean bl2 = false;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        while (true) {
            Object object2 = zipInputStream.getNextEntry();
            int n3 = 0;
            boolean bl3 = false;
            Object object3 = object2;
            boolean bl4 = false;
            objectRef.element = object3;
            if (object2 == null) break;
            ZipEntry zipEntry = (ZipEntry)objectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            Object object4 = object2 = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"name");
            if (StringsKt.endsWith$default((String)object4, (String)".class", (boolean)false, (int)2, null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found class \"" + StringsKt.removeSuffix((String)object2, (CharSequence)".class") + '\"');
                object2 = StringsKt.removeSuffix((String)object2, (CharSequence)".class");
                object2 = StringsKt.replace$default((String)object2, (char)'/', (char)'.', (boolean)false, (int)4, null);
                Map map = concurrentHashMap;
                byte[] byArray2 = ByteStreamsKt.readBytes((InputStream)zipInputStream);
                boolean bl5 = false;
                map.put(object2, byArray2);
                n3 = n;
                n = n3 + 1;
                Class1204.Method4854("Found class \"" + StringsKt.removeSuffix((String)object2, (CharSequence)".class") + '\"');
                continue;
            }
            if (!Class1214.Method4882((String)object2)) continue;
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found resource \"" + (String)object2 + '\"');
            Map map = hashMap;
            Object object5 = object2;
            byte[] byArray3 = Class1214.Method4885(zipInputStream);
            Intrinsics.checkExpressionValueIsNotNull((Object)byArray3, (String)"Utility.getBytesFromInputStream(zipStream)");
            object3 = byArray3;
            bl4 = false;
            map.put(object5, object3);
            n3 = n2;
            n2 = n3 + 1;
            Class1204.Method4854("Found resource \"" + (String)object2 + '\"');
        }
        zipInputStream = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)object, (Throwable)throwable);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found " + n + " classes and " + n2 + " resources");
        Class1204.Method4854("Found " + n + " classes and " + n2 + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting classes...");
        Class1204.Method4854("Injecting classes...");
        object = concurrentHashMap;
        bl = false;
        boolean bl6 = !object.isEmpty();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        Class1204.Method4854("Injecting resources...");
        object = hashMap;
        bl = false;
        boolean bl7 = !object.isEmpty();
        Class1204.Method4854("Successfully loader!");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is done!");
    }

    private static final Class Method4864(String string, boolean bl, Function1 function1) {
        Object object = Class1214.Method4890(Launch.classLoader, "getClassLoadingLock", string);
        if (object == null) {
            Intrinsics.throwNpe();
        }
        Object object2 = object;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        Class clazz = (Class)Class1214.Method4890(Launch.classLoader, "findLoadedClass", string);
        if (clazz == null) {
            long l = System.nanoTime();
            ClassLoader classLoader = (ClassLoader)Class1214.Method4891(Launch.classLoader, "parent");
            Class clazz2 = clazz = classLoader != null ? (Class)Class1214.Method4890(Launch.classLoader, "loadClass", string, false) : (Class)Class1214.Method4890(Launch.classLoader, "findBootstrapClassOrNull", string);
            if (clazz == null) {
                long l2 = System.nanoTime();
                clazz = (Class)function1.invoke((Object)string);
                PerfCounter.getParentDelegationTime().addTime(l2 - l);
                PerfCounter.getFindClassTime().addElapsedTimeFrom(l2);
                PerfCounter.getFindClasses().increment();
            }
        }
        if (bl) {
            Class1214.Method4890(Launch.classLoader, "resolveClass", clazz);
        }
        Class clazz3 = clazz;
        Intrinsics.checkExpressionValueIsNotNull((Object)clazz3, (String)"c");
        return clazz3;
    }

    static {
        Field13455 = "2.0";
        Field13454 = 25563;
        Field13453 = "161.97.78.143";
        boolean bl = false;
        Field13457 = new String[0];
        Field13458 = new ArrayList();
        Field13461 = true;
        Field13464 = "Idling";
    }

    public static final void Method4865() {
        Class1204.Method4858();
    }

    private static String Method4866(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 168;
            cArray2[n] = (char)(cArray[n] ^ (0x66CA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

