/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 */
package lavahack.client;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import lavahack.client.Class1070;
import lavahack.client.Class1458;
import lavahack.client.Class1796;
import lavahack.client.Class553;
import lavahack.client.Class685;
import lavahack.client.Class874;
import lavahack.client.Class95;

public class Class1362 {
    public ObjectList Field14198;
    public ObjectList Field14199;
    public ObjectList Field14200;
    private String Field14201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method5435(InputStream inputStream) throws IOException {
        String string;
        this.Field14198 = new ObjectArrayList();
        this.Field14199 = new ObjectArrayList();
        this.Field14200 = new ObjectArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((string = bufferedReader.readLine()) != null) {
            Class874 class874;
            String[] stringArray;
            if (string.startsWith("CL")) {
                stringArray = string.replace("CL: ", "").split(" ");
                class874 = new Class685();
                class874.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = stringArray[0];
                class874.Ljc0gDTN8WkwPRHY480HpEkScGALG41A = class874.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = stringArray[1];
                this.Field14198.add((Object)class874);
                System.out.println("Class: official " + class874.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named/intermediary " + class874.Ljc0gDTN8WkwPRHY480HpEkScGALG41A);
            }
            if (string.startsWith("FD")) {
                stringArray = string.replaceAll("FD: ", "").split(" ");
                class874 = new Class1070();
                ((Class1070)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = stringArray[0].split("/")[1];
                ((Class1070)class874).Field12715 = "";
                ((Class1070)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = stringArray[1].split("/")[stringArray[1].split("/").length - 1];
                ((Class1070)class874).Ljc0gDTN8WkwPRHY480HpEkScGALG41A = Class1796.Field16241.Field16280.Method2925(((Class1070)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
                ((Class1070)class874).Field12717 = this.Method5436(stringArray[0].split("/")[0], Class1458.Field14820);
                if (((Class1070)class874).Field12717 != null) {
                    ((Class1070)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ((Class1070)class874).Field12717.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
                }
                this.Field14200.add((Object)class874);
                System.out.println("Field: official " + ((Class1070)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named " + ((Class1070)class874).Ljc0gDTN8WkwPRHY480HpEkScGALG41A + ", intermediary " + ((Class1070)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
            }
            if (!string.startsWith("MD")) continue;
            stringArray = string.replace("MD: ", "").split(" ");
            class874 = new Class553();
            ((Class553)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = stringArray[0].split("/")[1];
            ((Class553)class874).Field10347 = stringArray[1];
            ((Class553)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = stringArray[2].split("/")[stringArray[2].split("/").length - 1];
            ((Class553)class874).Ljc0gDTN8WkwPRHY480HpEkScGALG41A = Class1796.Field16241.Field16280.Method2926(((Class553)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
            ((Class553)class874).Field10350 = this.Method5436(stringArray[0].split("/")[0], Class1458.Field14820);
            if (((Class553)class874).Field10350 != null) {
                ((Class553)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ((Class553)class874).Field10350.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
            }
            this.Field14199.add((Object)class874);
            System.out.println("Method: official " + ((Class553)class874).vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named " + ((Class553)class874).Ljc0gDTN8WkwPRHY480HpEkScGALG41A + ", intermediary " + ((Class553)class874).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
        }
    }

    /*
     * Exception decompiling
     */
    public Class685 Method5436(String var1_1, Class1458 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.IfStatement.getStructuredStatement(IfStatement.java:110)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Exception decompiling
     */
    public Class1070 Method5437(String var1_1, String var2_2, Class95 var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.IfStatement.getStructuredStatement(IfStatement.java:110)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Exception decompiling
     */
    public Class553 Method5438(String var1_1, String var2_2, Class95 var3_3, int var4_4, String var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.IfStatement.getStructuredStatement(IfStatement.java:110)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public List Method5439() {
        return this.Field14198;
    }

    public List Method5440() {
        return this.Field14200;
    }

    public List Method5441() {
        return this.Field14199;
    }

    private static String Method5442(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 227;
            cArray2[n] = (char)(cArray[n] ^ (0x3DF6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

