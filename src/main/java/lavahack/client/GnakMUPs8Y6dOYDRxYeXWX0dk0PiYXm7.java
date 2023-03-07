/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.HQv69u03MmDc5JddqhzH80Lj7sen5Y1g;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010!J\r\u0010\"\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J\r\u0010$\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010%J\"\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00010'\"\u0004\b\u0001\u0010\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00010'H\u0004J*\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00010*\"\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00010*H\u0004J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u0010\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0004J\u001b\u0010\u001a\u001a\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016\u00a2\u0006\u0002\u0010/R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00060"}, d2={"Lcom/kisman/cc/settings/util/AbstractPattern;", "T", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "allSettings", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/ArrayList;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "setGroup", "(Lcom/kisman/cc/settings/types/SettingGroup;)V", "groups", "getModule", "()Lcom/kisman/cc/features/module/Module;", "prefix", "", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "settings", "visible", "Ljava/util/function/Supplier;", "", "getVisible", "()Ljava/util/function/Supplier;", "setVisible", "(Ljava/util/function/Supplier;)V", "(Lcom/kisman/cc/settings/types/SettingGroup;)Ljava/lang/Object;", "init", "()Ljava/lang/Object;", "preInit", "(Ljava/lang/String;)Ljava/lang/Object;", "setupArray", "Lcom/kisman/cc/settings/types/SettingArray;", "array", "setupEnum", "Lcom/kisman/cc/settings/types/SettingEnum;", "", "setting", "setupGroup", "setupSetting", "(Ljava/util/function/Supplier;)Ljava/lang/Object;", "kisman.cc"})
public abstract class GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7 {
    @NotNull
    private Supplier Field8304;
    @Nullable
    private String Field8305;
    @Nullable
    private xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8306;
    private final ArrayList Field8307;
    private final ArrayList Field8308;
    private final ArrayList Field8309;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field8310;
    private String Field8311 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Supplier Method765() {
        return this.Field8304;
    }

    public final void Method766(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"<set-?>");
        this.Field8304 = supplier;
    }

    @Nullable
    @Nullable
    public final String Method767() {
        return this.Field8305;
    }

    public final void Method768(@Nullable @Nullable String string) {
        this.Field8305 = string;
    }

    @Nullable
    @Nullable
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method769() {
        return this.Field8306;
    }

    public final void Method770(@Nullable @Nullable xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        this.Field8306 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2;
    }

    public Object Method771(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        this.Field8304 = supplier;
        Iterator iterator = this.Field8308.iterator();
        while (iterator.hasNext()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method313(supplier);
        }
        return this;
    }

    public Object Method772(@NotNull @NotNull xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        Intrinsics.checkParameterIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        this.Field8306 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2;
        return this;
    }

    public Object Method773(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        this.Field8305 = string;
        Iterator iterator = this.Field8308.iterator();
        while (iterator.hasNext()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"setting");
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method357(string + ((int)((long)1255853560 ^ (long)1255853561) << 5) + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method356());
        }
        return this;
    }

    @NotNull
    @NotNull
    protected final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Method774(@NotNull @NotNull M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk) {
        Intrinsics.checkParameterIsNotNull((Object)m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk, (String)"setting");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method775(m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk);
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 != null) return (M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    @NotNull
    @NotNull
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method775(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        int n = (int)-360670792L ^ 0xEA8099B8;
        int n2 = (int)-1038453591L ^ 0xC21A74A9;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3;
        int n3 = (int)((long)-1652801201 ^ (long)-1652801201);
        this.Field8308.add(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4);
        this.Field8307.add(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4);
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3;
    }

    @NotNull
    @NotNull
    protected final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method776(@NotNull @NotNull xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        Intrinsics.checkParameterIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method313(this.Field8304);
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        int n = (int)((long)-977873661 ^ (long)-977873661);
        int n2 = (int)((long)1608789696 ^ (long)1608789696);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3;
        int n3 = (int)((long)-153518935 ^ (long)-153518935);
        this.Field8309.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4);
        this.Field8307.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4);
        return xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3;
    }

    @NotNull
    @NotNull
    protected final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Method777(@NotNull @NotNull HQv69u03MmDc5JddqhzH80Lj7sen5Y1g hQv69u03MmDc5JddqhzH80Lj7sen5Y1g) {
        Intrinsics.checkParameterIsNotNull((Object)hQv69u03MmDc5JddqhzH80Lj7sen5Y1g, (String)"array");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method775(hQv69u03MmDc5JddqhzH80Lj7sen5Y1g);
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 != null) return (HQv69u03MmDc5JddqhzH80Lj7sen5Y1g)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
    }

    public abstract Object Method778();

    public abstract Object Method779();

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method780() {
        return this.Field8310;
    }

    public GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field8310 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field8304 = GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16704;
        this.Field8307 = new ArrayList();
        this.Field8308 = new ArrayList();
        this.Field8309 = new ArrayList();
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)290759570L ^ 0x1154A392;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1064557921L ^ 0x3F73DD9E);
            int n2 = (int)550388090L ^ 0x20CE41F3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1103729383L ^ 0xBE3669EE) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

