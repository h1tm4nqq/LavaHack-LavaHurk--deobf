//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.resources.data.*;
import java.util.*;
import net.minecraft.client.resources.*;
import net.minecraft.util.*;
import java.io.*;

public class Class878 implements Class1535
{
    private final Class1264 Field11702;
    private final MetadataSerializer Field11703;
    private final ClassLoader Field11704;
    private String Field11705 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class878(final Class1264 field11702, final MetadataSerializer obj, final ClassLoader obj2) {
        this.Field11704 = Objects.requireNonNull(obj2);
        this.Field11703 = Objects.requireNonNull(obj);
        this.Field11702 = field11702;
    }
    
    public IResource Method3676() throws Class1980 {
        final InputStream resourceAsStream = this.Field11704.getResourceAsStream(String.format("%s/%s/%s", "assets", this.Field11702.getNamespace(), this.Field11702.getPath()));
        if (resourceAsStream == null) {
            throw new Class1980("PluginResource: " + this.Field11702 + " had no InputStream!");
        }
        return this.Field11702.toResource(this.Field11702.getResourcePack(), (ResourceLocation)this.Field11702, resourceAsStream, resourceAsStream, this.Field11703);
    }
    
    private static String Method3677(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x408 ^ 0x32));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
