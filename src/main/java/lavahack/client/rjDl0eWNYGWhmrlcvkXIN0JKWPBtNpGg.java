/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class rjDl0eWNYGWhmrlcvkXIN0JKWPBtNpGg
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16935 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Pitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2015785815 ^ (long)2015785814)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16936 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LookPitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1261038792 ^ 0x405680004B29ECC8L), 0.0, Double.longBitsToDouble((long)600844875 ^ 0xC056800023D02A4BL), ((int)1124224975L ^ 0x43024FCF) != 0).Method313(this.Field16935::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16937 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1848913247 ^ 0x405900006E342D5FL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16938;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field16939;
    private String Field16940 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public rjDl0eWNYGWhmrlcvkXIN0JKWPBtNpGg() {
        super("SilentXP", "SilentXp", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[(int)((long)-974697311 ^ (long)-974697312) << 1];
        stringArray[(int)((long)823671101 ^ (long)823671101)] = "Packet";
        stringArray[(int)((long)1518304007 ^ (long)1518304006)] = "Client";
        this.Field16938 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Packet", new ArrayList<String>(Arrays.asList(stringArray))));
        this.Field16939 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    }

    @Override
    public void Method38() {
        this.Field16939.Method2801();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void Method45() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getInt(SwitchStringRewriter.java:417)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$700(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)318720985 ^ (long)318720985);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-631513072 ^ (long)-631512849);
            int n2 = (int)((long)-283855192 ^ (long)-283855179) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-76096076 ^ (long)-76102041) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

