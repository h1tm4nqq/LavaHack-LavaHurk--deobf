/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class2047;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class985;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/command/commands/ConfigCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "kisman.cc"})
public final class Class1343
extends Class158 {
    private String Field14123 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Object object;
        int n;
        ArrayList<String> arrayList;
        block11: {
            block15: {
                Iterator iterator;
                ArrayList arrayList2;
                block14: {
                    block12: {
                        block13: {
                            Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
                            Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
                            if (!Intrinsics.areEqual((Object)stringArray[0], (Object)"save")) break block12;
                            if (stringArray.length == 2) break block13;
                            arrayList2 = new ArrayList();
                            iterator = StringsKt.split$default((CharSequence)stringArray[3], (String[])new String[]{","}, (boolean)false, (int)0, (int)6, null).iterator();
                            break block14;
                        }
                        new Class985(stringArray[1]).Method3997().Method7717();
                        break block15;
                    }
                    if (Intrinsics.areEqual((Object)stringArray[0], (Object)"load")) {
                        new Class985(stringArray[1]).Method3998().Method1420();
                        this.Method437("Config \"" + stringArray[1] + "\" was loaded!");
                        return;
                    }
                    if (Intrinsics.areEqual((Object)stringArray[0], (Object)"list")) {
                        arrayList = new ArrayList<String>();
                        File[] fileArray = new File("kisman.cc/").listFiles();
                        if (fileArray == null) throw (Throwable)new IllegalArgumentException("meow");
                        File[] fileArray2 = fileArray;
                        int n2 = fileArray2.length;
                        for (n = 0; n < n2; ++n) {
                            Object object2 = object = fileArray2[n];
                            Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"file");
                            String string2 = ((File)object2).getName();
                            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"file.name");
                            if (!StringsKt.endsWith$default((String)string2, (String)".kis", (boolean)false, (int)2, null)) continue;
                            arrayList.add(((File)object).getName());
                        }
                        break block11;
                    } else {
                        if (!Intrinsics.areEqual((Object)stringArray[0], (Object)"reset")) throw (Throwable)new Exception();
                        for (Class695 class695 : Class1796.Field16241.Field16254.Field8854) {
                            Class42 class42 = class695;
                            Intrinsics.checkExpressionValueIsNotNull((Object)class42, (String)"module");
                            class42.Method21(false);
                        }
                        for (Class695 class695 : Class1796.Field16241.Field16257.Field9235) {
                            Class42 class42 = class695;
                            Intrinsics.checkExpressionValueIsNotNull((Object)class42, (String)"module");
                            class42.Method21(false);
                        }
                        Class2047 class2047 = Class1796.Field16241.Field16258;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class2047, (String)"Kisman.instance.settingsManager");
                        Iterator iterator2 = class2047.Method7570().iterator();
                        while (iterator2.hasNext()) {
                            Class695 class695;
                            class695 = (Class44)iterator2.next();
                            ((Class44)class695).Method302();
                        }
                        return;
                    }
                }
                while (iterator.hasNext()) {
                    boolean bl;
                    Class42 class42;
                    String string3 = (String)iterator.next();
                    if (Intrinsics.areEqual((Object)stringArray[2], (Object)"module")) {
                        if (Class1796.Field16241.Field16254.Method1162(string3) == null) continue;
                        Collection collection = arrayList2;
                        class42 = Class1796.Field16241.Field16254.Method1162(string3);
                        bl = false;
                        collection.add(class42);
                        continue;
                    }
                    if (!Intrinsics.areEqual((Object)stringArray[2], (Object)"hud_module") || Class1796.Field16241.Field16257.Method1523(string3) == null) continue;
                    Collection collection = arrayList2;
                    class42 = Class1796.Field16241.Field16257.Method1523(string3);
                    bl = false;
                    collection.add(class42);
                }
                new Class985(stringArray[1]).Method3999().Method3141(arrayList2);
            }
            this.Method437("Config \"" + stringArray[1] + "\" was saved!");
            return;
        }
        object = "Configs: ";
        n = 0;
        Iterator iterator = ((Iterable)arrayList).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method437((String)object);
                return;
            }
            String string4 = (String)iterator.next();
            object = (String)object + (Intrinsics.areEqual((Object)Class1796.Field16250, (Object)((String)StringsKt.split$default((CharSequence)string4, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(0))) ? TextFormatting.GREEN : TextFormatting.RED) + (String)StringsKt.split$default((CharSequence)string4, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(0) + TextFormatting.GRAY + (n != arrayList.size() - 1 ? ", " : "");
            ++n;
        }
    }

    @Override
    @NotNull
    @NotNull
    public String Method447() {
        return "cfg maker btw";
    }

    @Override
    @NotNull
    @NotNull
    public String Method448() {
        return "config save/load <name>\nconfig list\nconfig save <name> module <module>\nconfig save <name> module <module1>,<module2>\nconfig save <name> hud_module <hud_module1>,<hud_module2>\nconfig reset";
    }

    public Class1343() {
        super("config");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 202;
            cArray2[n] = (char)(cArray[n] ^ (0x2C4E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

