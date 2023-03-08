//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.concurrent.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004?\u0006\u0007" }, d2 = { "illegalProcesses", "", "", "getIllegalProcesses", "()Ljava/util/List;", "runScanner", "", "kisman.cc" })
public final class Class328
{
    @NotNull
    private static final List Field9371;
    private String Field9372 = "TheKisDevs & LavaHack Development owns you";
    
    @NotNull
    @NotNull
    public static final List Method1646() {
        return Class328.Field9371;
    }
    
    public static final void Method1647() {
        ThreadsKt.thread$default(false, false, (ClassLoader)null, (String)null, 0, (Function0)Class951.Field12051, 31, (Object)null);
    }
    
    static {
        Field9371 = CollectionsKt.listOf((Object[])new String[] { "HTTPDebuggerSvc.exe", "HTTPDebuggerUI.exe", "Extreme Injector v3.exe", "binaryninja.exe", "tcpview.exe", "autoruns.exe", "autorunsc.exe", "filemon.exe", "procmon.exe", "procexp.exe", "idaq.exe", "idaq64.exe", "ida.exe", "ida64.exe", "ImmunityDebugger.exe", "Wireshark.exe", "dumpcap.exe", "HookExplorer.exe", "ImportREC.exe", "PETools.exe", "LordPE.exe", "tcpview.exe", "SysInspector.exe", "proc_analyzer.exe", "sysAnalyzer.exe", "sniff_hit.exe", "windbq.exe", "joeboxcontrol.exe", "joeboxserver.exe", "fiddler.exe", "tv_w32.exe", "tv_x64.exe", "Charles.exe", "netFilterService.exe", "HTTPAnalyzerStdV7.exe" });
    }
    
    private static String Method1648(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4496 ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
