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
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
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
import lavahack.loader.eZjgvzONpduAwYxUJP1g1vLc32WdbH9H;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.jetbrains.annotations.NotNull;
import sun.misc.PerfCounter;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0006\u0010.\u001a\u00020/\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0006\u00101\u001a\u00020/\u001a.\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0001\u001a6\u00107\u001a\u0006\u0012\u0002\b\u0003082\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00032\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001080<H\u0002\u001a\u000e\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010@\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010A\u001a\u00020/2\u0006\u0010>\u001a\u00020?\u001a\u000e\u0010B\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\"*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007\"\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007\"$\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006C"}, d2={"address", "", "canPressInstallButton", "", "getCanPressInstallButton", "()Z", "setCanPressInstallButton", "(Z)V", "haveLibraries", "getHaveLibraries", "setHaveLibraries", "loaded", "getLoaded", "setLoaded", "oldLogs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getOldLogs", "()Ljava/util/ArrayList;", "setOldLogs", "(Ljava/util/ArrayList;)V", "overwritingLibrary", "getOverwritingLibrary", "setOverwritingLibrary", "port", "", "receivedVersionCheckAnswer", "getReceivedVersionCheckAnswer", "setReceivedVersionCheckAnswer", "receivedVersions", "getReceivedVersions", "setReceivedVersions", "value", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "version", "versions", "", "getVersions", "()[Ljava/lang/String;", "setVersions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "createGui", "", "downloadLibraries", "initLoader", "load", "key", "properties", "processors", "versionToLoad", "loadClass", "Ljava/lang/Class;", "name", "resolve", "classFinder", "Lkotlin/Function1;", "loadIntoClassLoader", "bytes", "", "loadIntoCustomClassLoader", "loadIntoResourceCache", "versionCheck", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
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
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4793()) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4797(string);
        } else {
            Field13458.add(string);
        }
        Field13464 = string;
    }

    public static final void Method4855(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3, @NotNull @NotNull String string4, @NotNull @NotNull String string5) {

        if (UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4884()) {
            Kisman.LOGGER.debug("Not loading due to running in debugging environment!");
            return;
        }
        if (!Field13461) return;
        if (LavaHackLoaderCoreMod.Companion.getLoaded()) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(objectRef, string, string3, string4);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        objectRef.element = eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3958(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        ((qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)objectRef.element).Method3322("getpublicjar " + string + ((int)((long)-62230201 ^ (long)-62230202) << 5) + string2 + ((int)((long)1568087820 ^ (long)1568087821) << 5) + string3 + (((int)-877960183L ^ 0xCBAB6408) << 5) + string4 + (((int)1818320267L ^ 0x6C615D8A) << 5) + string5);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is trying to download classes...");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Trying to download LavaHack");
    }

    public static final void Method4856() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Creating the gui");
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4795();
        Iterator iterator = Field13458.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"log");
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4797(string2);
        }
    }

    public static final void Method4857() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method4052();
        ThreadsKt.thread$default((boolean)((long)-944390331 ^ (long)-944390331), (boolean)((long)-1140140094 ^ (long)-1140140094), null, null, (int)((int)((long)-459729380 ^ (long)-459729380)), (Function0)leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14799, (int)((int)((long)-99837892 ^ (long)-99837917)), null);
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
        int n = (int)-71479059L ^ 0xFBBD50ED;
        int n2 = (int)-1238830601L ^ 0xB628F1F7;
        byte[] byArray = null;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Started downloading libraries");
        if (!file.exists()) {
            Files.createFile(file.toPath(), new FileAttribute[(int)((long)-756325970 ^ (long)-756325970)]);
        }
        byte[] byArray2 = Files.readAllBytes(file2.toPath());
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"Files.readAllBytes(library.toPath())");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4861(byArray2);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Loaded libraries into class loader");
    }

    public static final void Method4859(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck was started!");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(objectRef);
        objectRef.element = eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3958(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
        ((qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)objectRef.element).Method3322("checkversion " + string);
    }

    public static final void Method4860(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"version");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList was started!");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A(objectRef);
        objectRef.element = eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3958(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        ((qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)objectRef.element).Method3322("getversions " + string);
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
        field2.setAccessible((boolean)((long)1139624240 ^ (long)1139624241));
        Object object = field.get(Launch.classLoader);
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.ByteArray>");
        }
        Map map = TypeIntrinsics.asMutableMap((Object)object);
        HashMap hashMap = new HashMap();
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting classes...");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Injecting classes...");
        int n = (int)-692133306L ^ 0xD6BEE246;
        int n2 = (int)((long)1381024163 ^ (long)1381024163);
        Object object2 = null;
        byte[] byArray2 = null;
        Object object3 = byArray;
        int n3 = (int)1504122787L ^ 0x59A717A3;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object3);
        InputStream inputStream = byteArrayInputStream;
        object3 = new ZipInputStream(inputStream);
        n3 = (int)-809913554L ^ 0xCFB9B32E;
        Throwable throwable = null;
        ZipInputStream zipInputStream = (ZipInputStream)object3;
        int n4 = (int)((long)1762844855 ^ (long)1762844855);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        while (true) {
            Object object4 = zipInputStream.getNextEntry();
            int n5 = (int)((long)1240496050 ^ (long)1240496050);
            int n6 = (int)-2092707039L ^ 0x8343D321;
            Object object5 = object4;
            int n7 = (int)((long)1539023672 ^ (long)1539023672);
            objectRef.element = object5;
            if (object4 == null) break;
            ZipEntry zipEntry = (ZipEntry)objectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            Object object6 = object4 = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)object6, (String)"name");
            if (StringsKt.endsWith$default((String)object6, (String)".class", (boolean)((long)1351655546 ^ (long)1351655546), (int)((int)((long)1563621056 ^ (long)1563621057) << 1), null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injecting class \"" + StringsKt.removeSuffix((String)object4, (CharSequence)".class") + ((int)((long)785383223 ^ (long)785383206) << 1));
                object4 = StringsKt.removeSuffix((String)object4, (CharSequence)".class");
                object4 = StringsKt.replace$default((String)object4, (char)((int)1826991299L ^ 0x6CE5ACEC), (char)(((int)1218957298L ^ 0x48A7CFE5) << 1), ((int)1685486539L ^ 0x64767BCB) != 0, (int)((int)((long)-987197370 ^ (long)-987197369) << 2), null);
                if (Intrinsics.areEqual((Object)object4, (Object)"Main")) {
                    leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4861(ByteStreamsKt.readBytes((InputStream)zipInputStream));
                } else {
                    Map map2 = map;
                    byte[] byArray3 = ByteStreamsKt.readBytes((InputStream)zipInputStream);
                    int n8 = (int)((long)2069637323 ^ (long)2069637323);
                    map2.put(object4, byArray3);
                    if (object2 == null) {
                        object2 = object4;
                        byArray2 = (byte[])map.get(object4);
                    }
                }
                n5 = n;
                n = n5 + (int)((long)-1754833336 ^ (long)-1754833335);
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Injecting " + (String)object4);
                continue;
            }
            if (!UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4882((String)object4)) continue;
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found new resource \"" + (String)object4 + (((int)939678487L ^ 0x38025B06) << 1));
            Map map3 = hashMap;
            Object object7 = object4;
            byte[] byArray4 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4885(zipInputStream);
            Intrinsics.checkExpressionValueIsNotNull((Object)byArray4, (String)"Utility.getBytesFromInputStream(zipStream)");
            object5 = byArray4;
            n7 = (int)63707312L ^ 0x3CC18B0;
            map3.put(object7, object5);
            n5 = n2;
            n2 = n5 + ((int)-853426807L ^ 0xCD21BD88);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Found \"" + (String)object4 + "\" resource.");
        }
        zipInputStream = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)object3, (Throwable)throwable);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Injected " + n + " classes, Found " + n2 + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        object3 = hashMap;
        n3 = (int)((long)-1441950777 ^ (long)-1441950777);
        int n9 = !object3.isEmpty() ? (int)1876992681L ^ 0x6FE0A2A8 : (int)((long)613697082 ^ (long)613697082);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is setting resourceCache!");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Setting \"resourceCache\"");
        field.set(Launch.classLoader, map);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Done!");
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
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Finding files...");
        int n = (int)((long)-2048198562 ^ (long)-2048198562);
        int n2 = (int)1604593120L ^ 0x5FA425E0;
        Object object = byArray;
        int n3 = (int)520687258L ^ 0x1F090E9A;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        InputStream inputStream = byteArrayInputStream;
        object = new ZipInputStream(inputStream);
        n3 = (int)((long)-811540015 ^ (long)-811540015);
        Throwable throwable = null;
        ZipInputStream zipInputStream = (ZipInputStream)object;
        int n4 = (int)-764958427L ^ 0xD267A925;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        while (true) {
            Object object2 = zipInputStream.getNextEntry();
            int n5 = (int)((long)-1711830513 ^ (long)-1711830513);
            int n6 = (int)463619756L ^ 0x1BA246AC;
            Object object3 = object2;
            int n7 = (int)((long)1601192435 ^ (long)1601192435);
            objectRef.element = object3;
            if (object2 == null) break;
            ZipEntry zipEntry = (ZipEntry)objectRef.element;
            if (zipEntry == null) {
                Intrinsics.throwNpe();
            }
            Object object4 = object2 = zipEntry.getName();
            Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"name");
            if (StringsKt.endsWith$default((String)object4, (String)".class", (boolean)((long)-294897545 ^ (long)-294897545), (int)((int)((long)-1908567908 ^ (long)-1908567907) << 1), null)) {
                LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found class \"" + StringsKt.removeSuffix((String)object2, (CharSequence)".class") + (((int)-1596174599L ^ 0xA0DC4EE8) << 1));
                object2 = StringsKt.removeSuffix((String)object2, (CharSequence)".class");
                object2 = StringsKt.replace$default((String)object2, (char)((long)845937340 ^ (long)845937299), (char)((int)((long)-1425422264 ^ (long)-1425422241) << 1), ((int)334963041L ^ 0x13F72161) != 0, (int)((int)((long)1764255260 ^ (long)1764255261) << 2), null);
                Map map = concurrentHashMap;
                byte[] byArray2 = ByteStreamsKt.readBytes((InputStream)zipInputStream);
                int n8 = (int)-1058875103L ^ 0xC0E2D921;
                map.put(object2, byArray2);
                n5 = n;
                n = n5 + ((int)-915623850L ^ 0xC96CB057);
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Found class \"" + StringsKt.removeSuffix((String)object2, (CharSequence)".class") + ((int)((long)264500529 ^ (long)264500512) << 1));
                continue;
            }
            if (!UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4882((String)object2)) continue;
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found resource \"" + (String)object2 + ((int)((long)1446580747 ^ (long)1446580762) << 1));
            Map map = hashMap;
            Object object5 = object2;
            byte[] byArray3 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4885(zipInputStream);
            Intrinsics.checkExpressionValueIsNotNull((Object)byArray3, (String)"Utility.getBytesFromInputStream(zipStream)");
            object3 = byArray3;
            n7 = (int)-1676991559L ^ 0x9C0B23B9;
            map.put(object5, object3);
            n5 = n2;
            n2 = n5 + (int)((long)-1591606257 ^ (long)-1591606258);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Found resource \"" + (String)object2 + ((int)((long)1697520532 ^ (long)1697520517) << 1));
        }
        zipInputStream = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)object, (Throwable)throwable);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Found " + n + " classes and " + n2 + " resources");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Found " + n + " classes and " + n2 + " resources");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting classes...");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Injecting classes...");
        object = concurrentHashMap;
        n3 = (int)1893156874L ^ 0x70D7480A;
        int n9 = !object.isEmpty() ? (int)-355391360L ^ 0xEAD12881 : (int)135813360L ^ 0x81858F0;
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is injecting resources...");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Injecting resources...");
        object = hashMap;
        n3 = (int)((long)1054210227 ^ (long)1054210227);
        int n10 = !object.isEmpty() ? (int)((long)-11532967 ^ (long)-11532968) : (int)((long)-1221973620 ^ (long)-1221973620);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Successfully loader!");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("LavaHack Loader is done!");
    }

    private static final Class Method4864(String string, boolean bl, Function1 function1) {
        Object[] objectArray = new Object[(int)-498393226L ^ 0xE24B1F77];
        objectArray[(int)1999249579L ^ 0x772A20AB] = string;
        Object object = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4890(Launch.classLoader, "getClassLoadingLock", objectArray);
        if (object == null) {
            Intrinsics.throwNpe();
        }
        Object object2 = object;
        int n = (int)((long)-1264335643 ^ (long)-1264335643);
        int n2 = (int)1443650722L ^ 0x560C5CA2;
        int n3 = (int)((long)1969415308 ^ (long)1969415308);
        Object[] objectArray2 = new Object[(int)-1426981791L ^ 0xAAF1FC60];
        objectArray2[(int)((long)-979204260 ^ (long)-979204260)] = string;
        Class clazz = (Class)UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4890(Launch.classLoader, "findLoadedClass", objectArray2);
        if (clazz == null) {
            Class clazz2;
            long l = System.nanoTime();
            ClassLoader classLoader = (ClassLoader)UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4891(Launch.classLoader, "parent");
            if (classLoader != null) {
                Object[] objectArray3 = new Object[(int)((long)1345372250 ^ (long)1345372251) << 1];
                objectArray3[(int)((long)780644463 ^ (long)780644463)] = string;
                objectArray3[(int)((long)138676825 ^ (long)138676824)] = ((int)1205275755L ^ 0x47D70C6B) != 0;
                clazz2 = (Class)UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4890(Launch.classLoader, "loadClass", objectArray3);
            } else {
                Object[] objectArray4 = new Object[(int)((long)395566024 ^ (long)395566025)];
                objectArray4[(int)((long)859835052 ^ (long)859835052)] = string;
                clazz2 = clazz = (Class)UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4890(Launch.classLoader, "findBootstrapClassOrNull", objectArray4);
            }
            if (clazz == null) {
                long l2 = System.nanoTime();
                clazz = (Class)function1.invoke((Object)string);
                PerfCounter.getParentDelegationTime().addTime(l2 - l);
                PerfCounter.getFindClassTime().addElapsedTimeFrom(l2);
                PerfCounter.getFindClasses().increment();
            }
        }
        if (bl) {
            Object[] objectArray5 = new Object[(int)-403133586L ^ 0xE7F8AB6F];
            objectArray5[(int)1312202134L ^ 0x4E369D96] = clazz;
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4890(Launch.classLoader, "resolveClass", objectArray5);
        }
        Class clazz3 = clazz;
        Intrinsics.checkExpressionValueIsNotNull((Object)clazz3, (String)"c");
        return clazz3;
    }

    static {
        Field13455 = "2.0";
        Field13454 = (int)-1032757254L ^ 0xC2713C21;
        Field13453 = "161.97.78.143";
        int n = (int)1264865823L ^ 0x4B64521F;
        Field13457 = new String[(int)-1366010204L ^ 0xAE9456A4];
        Field13458 = new ArrayList();
        Field13461 = (int)-188185998L ^ 0xF4C88273;
        Field13464 = "Idling";
    }

    public static final void Method4865() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4858();
    }

    private static String Method4866(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-889164685 ^ (long)-889164685);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1483566031 ^ (long)1483565872);
            int n2 = (int)((long)-1396471535 ^ (long)-1396471548) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1822602360 ^ (long)1822590749) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

