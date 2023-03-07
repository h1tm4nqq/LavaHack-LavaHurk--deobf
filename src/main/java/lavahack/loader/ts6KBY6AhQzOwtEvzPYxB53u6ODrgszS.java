/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.concurrent.ThreadsKt
 *  kotlin.jvm.functions.Function0
 */
package lavahack.loader;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import lavahack.loader.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0007"}, d2={"illegalProcesses", "", "", "getIllegalProcesses", "()Ljava/util/List;", "runScanner", "", "kisman.cc"})
public final class ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS {
    @NotNull
    private static final List Field9371;
    private String Field9372 = "TheKisDevs & LavaHack Development owns you";

    @NotNull
    @NotNull
    public static final List Method1646() {
        return Field9371;
    }

    public static final void Method1647() {
        ThreadsKt.thread$default(((int)-821104400L ^ 0xCF0EF0F0) != 0, ((int)-1977363220L ^ 0x8A23D4EC) != 0, null, null, (int)((int)((long)1128869459 ^ (long)1128869459)), (Function0)ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12051, (int)((int)-305956448L ^ 0xEDC379BF), null);
    }

    static {
        Object[] objectArray = new String[(int)541783343L ^ 0x204AF50C];
        objectArray[(int)((long)111576197 ^ (long)111576197)] = "HTTPDebuggerSvc.exe";
        objectArray[(int)1021976805L ^ 0x3CEA20E4] = "HTTPDebuggerUI.exe";
        objectArray[((int)-1935815020L ^ 0x8C9DCE95) << 1] = "Extreme Injector v3.exe";
        objectArray[(int)-1061849455L ^ 0xC0B57692] = "binaryninja.exe";
        objectArray[((int)-600025196L ^ 0xDC3C5795) << 2] = "tcpview.exe";
        objectArray[(int)((long)200312604 ^ (long)200312601)] = "autoruns.exe";
        objectArray[((int)-499860167L ^ 0xE234BD3A) << 1] = "autorunsc.exe";
        objectArray[(int)((long)744026258 ^ (long)744026261)] = "filemon.exe";
        objectArray[(int)((long)1360894319 ^ (long)1360894318) << 3] = "procmon.exe";
        objectArray[(int)1556188527L ^ 0x5CC18D66] = "procexp.exe";
        objectArray[(int)((long)-685140306 ^ (long)-685140309) << 1] = "idaq.exe";
        objectArray[(int)((long)899107329 ^ (long)899107338)] = "idaq64.exe";
        objectArray[((int)221497340L ^ 0xD33C7FF) << 2] = "ida.exe";
        objectArray[(int)1168995822L ^ 0x45AD75E3] = "ida64.exe";
        objectArray[((int)-1982303271L ^ 0x89D873DE) << 1] = "ImmunityDebugger.exe";
        objectArray[(int)-165440291L ^ 0xF62394D2] = "Wireshark.exe";
        objectArray[(int)((long)-1854573324 ^ (long)-1854573323) << 4] = "dumpcap.exe";
        objectArray[(int)((long)1822256791 ^ (long)1822256774)] = "HookExplorer.exe";
        objectArray[((int)-1258696070L ^ 0xB4F9D273) << 1] = "ImportREC.exe";
        objectArray[(int)-1579316013L ^ 0xA1DD8CC0] = "PETools.exe";
        objectArray[((int)-1370201227L ^ 0xAE546370) << 2] = "LordPE.exe";
        objectArray[(int)-776959904L ^ 0xD1B08875] = "tcpview.exe";
        objectArray[((int)147174492L ^ 0x8C5B457) << 1] = "SysInspector.exe";
        objectArray[(int)1002892677L ^ 0x3BC6ED92] = "proc_analyzer.exe";
        objectArray[(int)((long)1356482391 ^ (long)1356482388) << 3] = "sysAnalyzer.exe";
        objectArray[(int)((long)98394336 ^ (long)98394361)] = "sniff_hit.exe";
        objectArray[(int)((long)1416944124 ^ (long)1416944113) << 1] = "windbq.exe";
        objectArray[(int)39999826L ^ 0x2625949] = "joeboxcontrol.exe";
        objectArray[((int)847156407L ^ 0x327E94B0) << 2] = "joeboxserver.exe";
        objectArray[(int)-463274153L ^ 0xE462FF4A] = "fiddler.exe";
        objectArray[((int)-1542265637L ^ 0xA412E4D4) << 1] = "tv_w32.exe";
        objectArray[(int)((long)1791233389 ^ (long)1791233394)] = "tv_x64.exe";
        objectArray[(int)((long)726230977 ^ (long)726230976) << 5] = "Charles.exe";
        objectArray[(int)((long)-65990942 ^ (long)-65990973)] = "netFilterService.exe";
        objectArray[(int)((long)-1331997051 ^ (long)-1331997036) << 1] = "HTTPAnalyzerStdV7.exe";
        Field9371 = CollectionsKt.listOf((Object[])objectArray);
    }

    private static String Method1648(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-988646338L ^ 0xC512743E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1657803589 ^ (long)-1657803708);
            int n2 = (int)((long)1802383800 ^ (long)1802383813) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1359449481 ^ (long)-1359458244) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

