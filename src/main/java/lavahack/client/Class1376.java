//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResource
 *  net.minecraft.client.resources.data.MetadataSerializer
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1264;
import lavahack.client.Class1535;
import lavahack.client.Class1796;
import lavahack.client.Class379;
import lavahack.client.Class878;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;

public class Class1376
implements Class2142 {
    private static final Map Field14242 = new ConcurrentHashMap();
    private String Field14243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1535 Method5473(ResourceLocation resourceLocation) {
        List list = (List)Field14242.get(resourceLocation);
        if (list == null) return null;
        if (list.size() != 1) return null;
        Class1535 class1535 = (Class1535)list.get(0);
        return class1535;
    }

    public static List Method5474(ResourceLocation resourceLocation) {
        List list = (List)Field14242.get(resourceLocation);
        if (list == null) {
            return Collections.emptyList();
        }
        Class1796.Field16243.info("Found " + list.size() + " custom ResourceLocation" + (list.size() == 1 ? "" : "s") + " for " + resourceLocation);
        List list2 = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            IResource iResource;
            Class1535 class1535 = (Class1535)iterator.next();
            if (class1535 == null || (iResource = class1535.Method3676()) == null) continue;
            list2.add(iResource);
        }
        return list2;
    }

    public static void Method5475(Class1264 class1264) {
        Class1376.Method5476(new ResourceLocation(class1264.getNamespace(), class1264.getPath()), class1264);
    }

    public static void Method5476(ResourceLocation resourceLocation, Class1264 class1264) {
        Class1796.Field16243.info("Adding custom ResourceLocation: " + resourceLocation + " for: " + (Object)((Object)class1264));
        ClassLoader classLoader = Class379.Method1845().Method1852();
        if (classLoader == null) {
            throw new IllegalStateException("Plugin ClassLoader was null!");
        }
        MetadataSerializer metadataSerializer = Class1376.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.metadataSerializer;
        if (metadataSerializer == null) {
            throw new IllegalStateException("MetadataSerializer was null!");
        }
        Class878 class878 = new Class878(class1264, metadataSerializer, classLoader);
        Class1376.Method5477(resourceLocation, class878);
    }

    public static void Method5477(ResourceLocation resourceLocation, Class1535 ... class1535Array) {
        List list = Field14242.computeIfAbsent(resourceLocation, Class1376::Method5478);
        Class1535[] class1535Array2 = class1535Array;
        int n = class1535Array2.length;
        int n2 = 0;
        while (n2 < n) {
            Class1535 class1535 = class1535Array2[n2];
            if (class1535 != null) {
                list.add(class1535);
            }
            ++n2;
        }
    }

    private static List Method5478(ResourceLocation resourceLocation) {
        return new ArrayList();
    }

    private static String Method5479(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 43;
            cArray2[n] = (char)(cArray[n] ^ (0x47BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

