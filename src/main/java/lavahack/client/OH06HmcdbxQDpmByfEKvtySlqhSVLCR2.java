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
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.eXIEwpfsveJ6FwbLoefTKstatmuKRSOh;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/command/commands/ConfigCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "kisman.cc"})
public final class OH06HmcdbxQDpmByfEKvtySlqhSVLCR2
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
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
                            if (!Intrinsics.areEqual((Object)stringArray[(int)590375597L ^ 0x23306AAD], (Object)"save")) break block12;
                            if (stringArray.length == ((int)893013236L ^ 0x353A4CF5) << 1) break block13;
                            arrayList2 = new ArrayList();
                            String[] stringArray2 = new String[(int)1823303737L ^ 0x6CAD6838];
                            stringArray2[(int)((long)-449599019 ^ (long)-449599019)] = ",";
                            iterator = StringsKt.split$default((CharSequence)stringArray[(int)((long)-74496882 ^ (long)-74496883)], (String[])stringArray2, ((int)-1198996134L ^ 0xB888C55A) != 0, (int)((int)((long)-134438798 ^ (long)-134438798)), (int)((int)((long)-685916447 ^ (long)-685916446) << 1), null).iterator();
                            break block14;
                        }
                        new wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz(stringArray[(int)1710265154L ^ 0x65F09343]).Method3997().Method7717();
                        break block15;
                    }
                    if (Intrinsics.areEqual((Object)stringArray[(int)((long)1128146311 ^ (long)1128146311)], (Object)"load")) {
                        new wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz(stringArray[(int)((long)-1305865534 ^ (long)-1305865533)]).Method3998().Method1420();
                        this.Method437("Config \"" + stringArray[(int)((long)1255331301 ^ (long)1255331300)] + "\" was loaded!");
                        return;
                    }
                    if (Intrinsics.areEqual((Object)stringArray[(int)((long)-627588418 ^ (long)-627588418)], (Object)"list")) {
                        arrayList = new ArrayList<String>();
                        File[] fileArray = new File("kisman.cc/").listFiles();
                        if (fileArray == null) throw (Throwable)new IllegalArgumentException("meow");
                        File[] fileArray2 = fileArray;
                        int n2 = fileArray2.length;
                        for (n = (int)1970118218L ^ 0x756D9E4A; n < n2; ++n) {
                            Object object2 = object = fileArray2[n];
                            Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"file");
                            String string2 = ((File)object2).getName();
                            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"file.name");
                            if (!StringsKt.endsWith$default((String)string2, (String)".kis", ((int)492397842L ^ 0x1D596512) != 0, (int)((int)((long)-1804135848 ^ (long)-1804135847) << 1), null)) continue;
                            arrayList.add(((File)object).getName());
                        }
                        break block11;
                    } else {
                        if (!Intrinsics.areEqual((Object)stringArray[(int)756931360L ^ 0x2D1DDB20], (Object)"reset")) throw (Throwable)new Exception();
                        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854) {
                            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
                            Intrinsics.checkExpressionValueIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
                            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method21((boolean)((long)-1818915362 ^ (long)-1818915362));
                        }
                        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235) {
                            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
                            Intrinsics.checkExpressionValueIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
                            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method21((boolean)((long)10347753 ^ (long)10347753));
                        }
                        eXIEwpfsveJ6FwbLoefTKstatmuKRSOh eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258;
                        Intrinsics.checkExpressionValueIsNotNull((Object)eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2, (String)"Kisman.instance.settingsManager");
                        Iterator iterator2 = eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2.Method7570().iterator();
                        while (iterator2.hasNext()) {
                            U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
                            u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator2.next();
                            ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method302();
                        }
                        return;
                    }
                }
                while (iterator.hasNext()) {
                    int n3;
                    WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
                    String string3 = (String)iterator.next();
                    if (Intrinsics.areEqual((Object)stringArray[((int)599754521L ^ 0x23BF8718) << 1], (Object)"module")) {
                        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(string3) == null) continue;
                        Collection collection = arrayList2;
                        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(string3);
                        n3 = (int)((long)-1396398613 ^ (long)-1396398613);
                        collection.add(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
                        continue;
                    }
                    if (!Intrinsics.areEqual((Object)stringArray[((int)-785357683L ^ 0xD130648C) << 1], (Object)"hud_module") || leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Method1523(string3) == null) continue;
                    Collection collection = arrayList2;
                    wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Method1523(string3);
                    n3 = (int)-1616683995L ^ 0x9FA35C25;
                    collection.add(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
                }
                new wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz(stringArray[(int)-182167754L ^ 0xF5245737]).Method3999().Method3141(arrayList2);
            }
            this.Method437("Config \"" + stringArray[(int)-1065346597L ^ 0xC08019DA] + "\" was saved!");
            return;
        }
        object = "Configs: ";
        n = (int)((long)-1333767386 ^ (long)-1333767386);
        Iterator iterator = ((Iterable)arrayList).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method437((String)object);
                return;
            }
            String string4 = (String)iterator.next();
            String[] stringArray3 = new String[(int)-224398233L ^ 0xF29FF466];
            stringArray3[(int)((long)-996063410 ^ (long)-996063410)] = ".";
            String[] stringArray4 = new String[(int)-1605922794L ^ 0xA0479017];
            stringArray4[(int)((long)14576635 ^ (long)14576635)] = ".";
            object = (String)object + (Intrinsics.areEqual((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16250, (Object)((String)StringsKt.split$default((CharSequence)string4, (String[])stringArray3, (boolean)((long)-2003272209 ^ (long)-2003272209), (int)((int)((long)592523117 ^ (long)592523117)), (int)(((int)561725739L ^ 0x217B4128) << 1), null).get((int)((long)-548763803 ^ (long)-548763803)))) ? TextFormatting.GREEN : TextFormatting.RED) + (String)StringsKt.split$default((CharSequence)string4, (String[])stringArray4, ((int)1271604851L ^ 0x4BCB2673) != 0, (int)((int)-483744452L ^ 0xE32AA53C), (int)(((int)1034504827L ^ 0x3DA94A78) << 1), null).get((int)((long)541587512 ^ (long)541587512)) + TextFormatting.GRAY + (n != arrayList.size() - ((int)684056307L ^ 0x28C5DEF2) ? ", " : "");
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

    public OH06HmcdbxQDpmByfEKvtySlqhSVLCR2() {
        super("config");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1435294436L ^ 0xAA73251C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1338037831 ^ (long)1338037944);
            int n2 = ((int)-1428999802L ^ 0xAAD331E3) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)386369972 ^ (long)386375571) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

