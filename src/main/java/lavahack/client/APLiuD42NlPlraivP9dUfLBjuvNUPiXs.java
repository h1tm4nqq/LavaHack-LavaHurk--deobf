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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a;
import lavahack.client.agQKyViUt0LwuNez9RWHVabw1B33135o;
import lavahack.client.cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
import lavahack.client.k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;

public class APLiuD42NlPlraivP9dUfLBjuvNUPiXs
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private static final Map Field14242 = new ConcurrentHashMap();
    private String Field14243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static agQKyViUt0LwuNez9RWHVabw1B33135o Method5473(ResourceLocation resourceLocation) {
        List list = (List)Field14242.get(resourceLocation);
        if (list == null) return null;
        if (list.size() != ((int)-1115784708L ^ 0xBD7E79FD)) return null;
        agQKyViUt0LwuNez9RWHVabw1B33135o agQKyViUt0LwuNez9RWHVabw1B33135o2 = (agQKyViUt0LwuNez9RWHVabw1B33135o)list.get((int)((long)-1325223060 ^ (long)-1325223060));
        return agQKyViUt0LwuNez9RWHVabw1B33135o2;
    }

    public static List Method5474(ResourceLocation resourceLocation) {
        List list = (List)Field14242.get(resourceLocation);
        if (list == null) {
            return Collections.emptyList();
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Found " + list.size() + " custom ResourceLocation" + (list.size() == ((int)1722531694L ^ 0x66ABBF6F) ? "" : "s") + " for " + resourceLocation);
        List list2 = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            IResource iResource;
            agQKyViUt0LwuNez9RWHVabw1B33135o agQKyViUt0LwuNez9RWHVabw1B33135o2 = (agQKyViUt0LwuNez9RWHVabw1B33135o)iterator.next();
            if (agQKyViUt0LwuNez9RWHVabw1B33135o2 == null || (iResource = agQKyViUt0LwuNez9RWHVabw1B33135o2.Method3676()) == null) continue;
            list2.add(iResource);
        }
        return list2;
    }

    public static void Method5475(cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2) {
        APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5476(new ResourceLocation(cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2.getNamespace(), cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2.getPath()), cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2);
    }

    public static void Method5476(ResourceLocation resourceLocation, cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Adding custom ResourceLocation: " + resourceLocation + " for: " + (Object)((Object)cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2));
        ClassLoader classLoader = S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845().Method1852();
        if (classLoader == null) {
            throw new IllegalStateException("Plugin ClassLoader was null!");
        }
        MetadataSerializer metadataSerializer = APLiuD42NlPlraivP9dUfLBjuvNUPiXs.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.metadataSerializer;
        if (metadataSerializer == null) {
            throw new IllegalStateException("MetadataSerializer was null!");
        }
        k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv2 = new k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv(cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2, metadataSerializer, classLoader);
        agQKyViUt0LwuNez9RWHVabw1B33135o[] agQKyViUt0LwuNez9RWHVabw1B33135oArray = new agQKyViUt0LwuNez9RWHVabw1B33135o[(int)((long)2130515207 ^ (long)2130515206)];
        agQKyViUt0LwuNez9RWHVabw1B33135oArray[(int)-1798281735L ^ 0x94D065F9] = k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv2;
        APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5477(resourceLocation, agQKyViUt0LwuNez9RWHVabw1B33135oArray);
    }

    public static void Method5477(ResourceLocation resourceLocation, agQKyViUt0LwuNez9RWHVabw1B33135o ... agQKyViUt0LwuNez9RWHVabw1B33135oArray) {
        List list = Field14242.computeIfAbsent(resourceLocation, APLiuD42NlPlraivP9dUfLBjuvNUPiXs::Method5478);
        agQKyViUt0LwuNez9RWHVabw1B33135o[] agQKyViUt0LwuNez9RWHVabw1B33135oArray2 = agQKyViUt0LwuNez9RWHVabw1B33135oArray;
        int n = agQKyViUt0LwuNez9RWHVabw1B33135oArray2.length;
        int n2 = (int)((long)-953575904 ^ (long)-953575904);
        while (n2 < n) {
            agQKyViUt0LwuNez9RWHVabw1B33135o agQKyViUt0LwuNez9RWHVabw1B33135o2 = agQKyViUt0LwuNez9RWHVabw1B33135oArray2[n2];
            if (agQKyViUt0LwuNez9RWHVabw1B33135o2 != null) {
                list.add(agQKyViUt0LwuNez9RWHVabw1B33135o2);
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
        int n = (int)((long)64087164 ^ (long)64087164);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-486057419 ^ (long)-486057270);
            int n2 = (int)((long)-1798199335 ^ (long)-1798199310);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1212289780L ^ 0xB7BDCED3) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

