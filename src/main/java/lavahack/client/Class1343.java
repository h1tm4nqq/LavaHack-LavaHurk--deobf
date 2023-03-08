//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.io.*;
import net.minecraft.util.text.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016?\u0006\u0002\u0010\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/command/commands/ConfigCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "kisman.cc" })
public final class Class1343 extends Class158
{
    private String Field14123 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        if (Intrinsics.areEqual((Object)array[0], (Object)"save")) {
            if (array.length != 2) {
                final ArrayList<Class42> list = new ArrayList<Class42>();
                for (final String s2 : StringsKt.split$default((CharSequence)array[3], new String[] { "," }, false, 0, 6, (Object)null)) {
                    if (Intrinsics.areEqual((Object)array[2], (Object)"module")) {
                        if (Class1796.Field16241.Field16254.Method1162(s2) == null) {
                            continue;
                        }
                        list.add(Class1796.Field16241.Field16254.Method1162(s2));
                    }
                    else {
                        if (!Intrinsics.areEqual((Object)array[2], (Object)"hud_module") || Class1796.Field16241.Field16257.Method1523(s2) == null) {
                            continue;
                        }
                        list.add(Class1796.Field16241.Field16257.Method1523(s2));
                    }
                }
                new Class985(array[1]).Method3999().Method3141(list);
            }
            else {
                new Class985(array[1]).Method3997().Method7717();
            }
            this.Method437("Config \"" + array[1] + "\" was saved!");
        }
        else if (Intrinsics.areEqual((Object)array[0], (Object)"load")) {
            new Class985(array[1]).Method3998().Method1420();
            this.Method437("Config \"" + array[1] + "\" was loaded!");
        }
        else if (Intrinsics.areEqual((Object)array[0], (Object)"list")) {
            final ArrayList<String> list2 = new ArrayList<String>();
            final File[] listFiles = new File("kisman.cc/").listFiles();
            if (listFiles == null) {
                throw new IllegalArgumentException("meow");
            }
            for (final File file2 : listFiles) {
                final File file = file2;
                Intrinsics.checkExpressionValueIsNotNull((Object)file2, "file");
                final String name = file2.getName();
                Intrinsics.checkExpressionValueIsNotNull((Object)name, "file.name");
                if (StringsKt.endsWith$default(name, ".kis", false, 2, (Object)null)) {
                    list2.add(file.getName());
                }
            }
            String string = "Configs: ";
            int n = 0;
            for (final String s3 : list2) {
                string = string + (Intrinsics.areEqual((Object)Class1796.Field16250, (Object)StringsKt.split$default((CharSequence)s3, new String[] { "." }, false, 0, 6, (Object)null).get(0)) ? TextFormatting.GREEN : TextFormatting.RED) + (String)StringsKt.split$default((CharSequence)s3, new String[] { "." }, false, 0, 6, (Object)null).get(0) + TextFormatting.GRAY + ((n != list2.size() - 1) ? ", " : "");
                ++n;
            }
            this.Method437(string);
        }
        else {
            if (!Intrinsics.areEqual((Object)array[0], (Object)"reset")) {
                throw new Exception();
            }
            for (final Class42 class42 : Class1796.Field16241.Field16254.Field8854) {
                Intrinsics.checkExpressionValueIsNotNull((Object)class42, "module");
                class42.Method21(false);
            }
            for (final Class1249 class43 : Class1796.Field16241.Field16257.Field9235) {
                Intrinsics.checkExpressionValueIsNotNull((Object)class43, "module");
                class43.Method21(false);
            }
            final Class2047 field16258 = Class1796.Field16241.Field16258;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16258, "Kisman.instance.settingsManager");
            final Iterator iterator5 = field16258.Method7570().iterator();
            while (iterator5.hasNext()) {
                iterator5.next().Method302();
            }
        }
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method447() {
        return "cfg maker btw";
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method448() {
        return "config save/load <name>\nconfig list\nconfig save <name> module <module>\nconfig save <name> module <module1>,<module2>\nconfig save <name> hud_module <hud_module1>,<hud_module2>\nconfig reset";
    }
    
    public Class1343() {
        super("config");
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C4E ^ 0xCA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
