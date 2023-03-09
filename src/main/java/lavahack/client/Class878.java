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
import lavahack.client.Class1264;
import lavahack.client.Class1535;
import lavahack.client.Class1980;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.MetadataSerializer;

public class Class878
implements Class1535 {
    private final Class1264 Field11702;
    private final MetadataSerializer Field11703;
    private final ClassLoader Field11704;
    private String Field11705 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class878(Class1264 class1264, MetadataSerializer metadataSerializer, ClassLoader classLoader) {
        this.Field11704 = Objects.requireNonNull(classLoader);
        this.Field11703 = Objects.requireNonNull(metadataSerializer);
        this.Field11702 = class1264;
    }

    @Override
    public IResource Method3676() throws Class1980 {
        String string = String.format("%s/%s/%s", "assets", this.Field11702.getNamespace(), this.Field11702.getPath());
        InputStream inputStream = this.Field11704.getResourceAsStream(string);
        if (inputStream != null) return this.Field11702.toResource(this.Field11702.getResourcePack(), this.Field11702, inputStream, inputStream, this.Field11703);
        throw new Class1980("PluginResource: " + (Object)((Object)this.Field11702) + " had no InputStream!");
    }

    private static String Method3677(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 50;
            cArray2[n] = (char)(cArray[n] ^ (0x408 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

