//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.util.*;
import net.minecraft.client.resources.*;
import java.util.*;
import net.minecraft.client.resources.data.*;
import java.util.function.*;
import java.util.concurrent.*;

public class Class1376 implements Class2142
{
    private static final Map Field14242;
    private String Field14243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class1535 Method5473(final ResourceLocation resourceLocation) {
        final List<Class1535> list = Class1376.Field14242.get(resourceLocation);
        return (list == null || list.size() != 1) ? null : list.get(0);
    }
    
    public static List Method5474(final ResourceLocation obj) {
        final List<Class1535> list = Class1376.Field14242.get(obj);
        List<IResource> emptyList;
        if (list != null) {
            Class1796.Field16243.info("Found " + list.size() + " custom ResourceLocation" + ((list.size() == 1) ? "" : "s") + " for " + obj);
            emptyList = new ArrayList<IResource>(list.size());
            for (final Class1535 class1535 : list) {
                if (class1535 != null) {
                    final IResource method3676 = class1535.Method3676();
                    if (method3676 == null) {
                        continue;
                    }
                    emptyList.add(method3676);
                }
            }
        }
        else {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public static void Method5475(final Class1264 class1264) {
        Method5476(new ResourceLocation(class1264.getNamespace(), class1264.getPath()), class1264);
    }
    
    public static void Method5476(final ResourceLocation obj, final Class1264 obj2) {
        Class1796.Field16243.info("Adding custom ResourceLocation: " + obj + " for: " + obj2);
        final ClassLoader method1852 = Class379.Method1845().Method1852();
        if (method1852 == null) {
            throw new IllegalStateException("Plugin ClassLoader was null!");
        }
        final MetadataSerializer metadataSerializer = Class1376.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.metadataSerializer;
        if (metadataSerializer == null) {
            throw new IllegalStateException("MetadataSerializer was null!");
        }
        Method5477(obj, new Class878(obj2, metadataSerializer, method1852));
    }
    
    public static void Method5477(final ResourceLocation key, final Class1535... array) {
        final List<Class1535> list = Class1376.Field14242.computeIfAbsent(key, Class1376::Method5478);
        for (final Class1535 class1535 : array) {
            if (class1535 != null) {
                list.add(class1535);
            }
        }
    }
    
    private static List Method5478(final ResourceLocation resourceLocation) {
        return new ArrayList();
    }
    
    static {
        Field14242 = new ConcurrentHashMap();
    }
    
    private static String Method5479(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47BE ^ 0x2B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
