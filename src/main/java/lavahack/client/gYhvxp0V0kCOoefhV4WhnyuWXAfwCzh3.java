/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.gson.annotations.SerializedName;

public final class gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 {
    @SerializedName(value="name")
    private String Field15764;
    @SerializedName(value="displayName")
    private String Field15765;
    @SerializedName(value="version")
    private String Field15766;
    @SerializedName(value="prefix")
    private String Field15767;
    @SerializedName(value="mainClass")
    private String Field15768;
    @SerializedName(value="mixinConfig")
    private String Field15769;
    private int Field15770;

    public String Method6438() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return null;
    }

    public String Method6439() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return ((String)null).replaceAll("&", "\u00a7");
    }

    public String Method6440() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return null;
    }

    public String Method6441() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return null;
    }

    public String Method6442() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return null;
    }

    public String Method6443() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return null;
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29 : LDC - null : trying to set 1 previously set to 3
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
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

    public int hashCode() {
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = this;
        return ((String)null).hashCode();
    }

    private static String Method6444(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)379430595 ^ (long)379430595);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1767100112L ^ 0x96AC31CF);
            int n2 = (int)-608654937L ^ 0xDBB8A94A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-225439575 ^ (long)-225441992) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

