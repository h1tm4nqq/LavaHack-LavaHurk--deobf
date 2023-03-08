//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0004" }, d2 = { "Lcom/kisman/cc/util/AccountData;", "", "()V", "Companion", "kisman.cc" })
public final class AccountData
{
    @Nullable
    private static String Field8156;
    @Nullable
    private static String Field8157;
    private static int Field8158;
    @NotNull
    private static String Field8159;
    @NotNull
    private static byte[] Field8160;
    public static final Companion Field8161;
    
    static {
        Field8161 = new Companion(null);
        AccountData.Field8158 = -1;
        AccountData.Field8159 = "";
        AccountData.Field8160 = new byte[0];
    }
    
    public static final /* synthetic */ String Method463() {
        return AccountData.Field8156;
    }
    
    public static final /* synthetic */ void Method464(final String field8156) {
        AccountData.Field8156 = field8156;
    }
    
    public static final /* synthetic */ String Method465() {
        return AccountData.Field8157;
    }
    
    public static final /* synthetic */ void Method466(final String field8157) {
        AccountData.Field8157 = field8157;
    }
    
    public static final /* synthetic */ int Method467() {
        return AccountData.Field8158;
    }
    
    public static final /* synthetic */ void Method468(final int field8158) {
        AccountData.Field8158 = field8158;
    }
    
    public static final /* synthetic */ String Method469() {
        return AccountData.Field8159;
    }
    
    public static final /* synthetic */ void Method470(final String field8159) {
        AccountData.Field8159 = field8159;
    }
    
    public static final /* synthetic */ byte[] Method471() {
        return AccountData.Field8160;
    }
    
    public static final /* synthetic */ void Method472(final byte[] field8160) {
        AccountData.Field8160 = field8160;
    }
    
    @Nullable
    @Nullable
    public static final String Method473() {
        AccountData.Field8161;
        return AccountData.Field8156;
    }
    
    public static final void Method474(@Nullable @Nullable final String field8156) {
        AccountData.Field8161;
        AccountData.Field8156 = field8156;
    }
    
    @Nullable
    @Nullable
    public static final String Method475() {
        AccountData.Field8161;
        return AccountData.Field8157;
    }
    
    public static final void Method476(@Nullable @Nullable final String field8157) {
        AccountData.Field8161;
        AccountData.Field8157 = field8157;
    }
    
    public static final int Method477() {
        AccountData.Field8161;
        return AccountData.Field8158;
    }
    
    public static final void Method478(final int field8158) {
        AccountData.Field8161;
        AccountData.Field8158 = field8158;
    }
    
    @NotNull
    @NotNull
    public static final String Method479() {
        AccountData.Field8161;
        return AccountData.Field8159;
    }
    
    public static final void Method480(@NotNull @NotNull final String field8159) {
        AccountData.Field8161;
        AccountData.Field8159 = field8159;
    }
    
    @NotNull
    @NotNull
    public static final byte[] Method481() {
        AccountData.Field8161;
        return AccountData.Field8160;
    }
    
    public static final void Method482(@NotNull @NotNull final byte[] field8160) {
        AccountData.Field8161;
        AccountData.Field8160 = field8160;
    }
    
    @Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e?\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e?\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e?\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e?\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010?\u0006 " }, d2 = { "Lcom/kisman/cc/util/AccountData$Companion;", "", "()V", "firstLoadedClassBytes", "", "firstLoadedClassBytes$annotations", "getFirstLoadedClassBytes", "()[B", "setFirstLoadedClassBytes", "([B)V", "firstLoadedClassName", "", "firstLoadedClassName$annotations", "getFirstLoadedClassName", "()Ljava/lang/String;", "setFirstLoadedClassName", "(Ljava/lang/String;)V", "key", "key$annotations", "getKey", "setKey", "processors", "", "processors$annotations", "getProcessors", "()I", "setProcessors", "(I)V", "properties", "properties$annotations", "getProperties", "setProperties", "kisman.cc" })
    public static final class Companion
    {
        @Nullable
        @Nullable
        public final String Method2220() {
            return AccountData.Method463();
        }
        
        public final void Method2221(@Nullable @Nullable final String s) {
            AccountData.Method464(s);
        }
        
        @Nullable
        @Nullable
        public final String Method2222() {
            return AccountData.Method465();
        }
        
        public final void Method2223(@Nullable @Nullable final String s) {
            AccountData.Method466(s);
        }
        
        public final int Method2224() {
            return AccountData.Method467();
        }
        
        public final void Method2225(final int n) {
            AccountData.Method468(n);
        }
        
        @NotNull
        @NotNull
        public final String Method2226() {
            return AccountData.Method469();
        }
        
        public final void Method2227(@NotNull @NotNull final String s) {
            Intrinsics.checkParameterIsNotNull((Object)s, "<set-?>");
            AccountData.Method470(s);
        }
        
        @NotNull
        @NotNull
        public final byte[] Method2228() {
            return AccountData.Method471();
        }
        
        public final void Method2229(@NotNull @NotNull final byte[] array) {
            Intrinsics.checkParameterIsNotNull((Object)array, "<set-?>");
            AccountData.Method472(array);
        }
        
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
