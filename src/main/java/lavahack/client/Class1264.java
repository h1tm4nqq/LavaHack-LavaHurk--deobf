//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import java.io.*;
import net.minecraft.client.resources.data.*;
import net.minecraft.client.resources.*;

public class Class1264 extends ResourceLocation
{
    private final String Field13716;
    private String Field13717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    protected Class1264(final int n, final String field13716, final String... array) {
        super(n, array);
        this.Field13716 = field13716;
    }
    
    public Class1264(final String s, final String field13716) {
        super(s);
        this.Field13716 = field13716;
    }
    
    public Class1264(final String s, final String s2, final String field13716) {
        super(s, s2);
        this.Field13716 = field13716;
    }
    
    public String getResourcePack() {
        return this.Field13716;
    }
    
    public IResource toResource(final String s, final ResourceLocation resourceLocation, final InputStream inputStream, final InputStream inputStream2, final MetadataSerializer metadataSerializer) {
        return (IResource)new Class455(s, resourceLocation, inputStream, inputStream2, metadataSerializer);
    }
}
