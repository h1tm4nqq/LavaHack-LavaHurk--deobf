//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResource
 *  net.minecraft.client.resources.data.MetadataSerializer
 */
package lavahack.client;

import java.io.InputStream;
import java.util.Objects;
import lavahack.client.Csi3zhdVbG2hwuonRwuIPTdK5alKV1HC;
import lavahack.client.agQKyViUt0LwuNez9RWHVabw1B33135o;
import lavahack.client.cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.MetadataSerializer;

public class k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv
implements agQKyViUt0LwuNez9RWHVabw1B33135o {
    private final cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh Field11702;
    private final MetadataSerializer Field11703;
    private final ClassLoader Field11704;
    private String Field11705 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv(cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2, MetadataSerializer metadataSerializer, ClassLoader classLoader) {
        this.Field11704 = Objects.requireNonNull(classLoader);
        this.Field11703 = Objects.requireNonNull(metadataSerializer);
        this.Field11702 = cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh2;
    }

    @Override
    public IResource Method3676() throws Csi3zhdVbG2hwuonRwuIPTdK5alKV1HC {
        Object[] objectArray = new Object[(int)((long)12726875 ^ (long)12726872)];
        objectArray[(int)-119636360L ^ 0xF8DE7E78] = "assets";
        objectArray[(int)-454102559L ^ 0xE4EEF1E0] = this.Field11702.getNamespace();
        objectArray[(int)((long)-1783491509 ^ (long)-1783491510) << 1] = this.Field11702.getPath();
        String string = String.format("%s/%s/%s", objectArray);
        InputStream inputStream = this.Field11704.getResourceAsStream(string);
        if (inputStream != null) return this.Field11702.toResource(this.Field11702.getResourcePack(), this.Field11702, inputStream, inputStream, this.Field11703);
        throw new Csi3zhdVbG2hwuonRwuIPTdK5alKV1HC("PluginResource: " + (Object)((Object)this.Field11702) + " had no InputStream!");
    }

    private static String Method3677(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1219117043 ^ (long)-1219117043);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-340096179 ^ (long)-340096078);
            int n2 = (int)((long)1943024633 ^ (long)1943024608) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)2083950478L ^ 0x7C368F0F) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

