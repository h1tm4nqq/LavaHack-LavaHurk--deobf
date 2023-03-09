/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResource
 *  net.minecraft.client.resources.data.MetadataSerializer
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import java.io.InputStream;
import lavahack.client.Class455;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;

public class Class1264
extends ResourceLocation {
    private final String Field13716;
    private String Field13717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    protected Class1264(int n, String string, String ... stringArray) {
        super(n, stringArray);
        this.Field13716 = string;
    }

    public Class1264(String string, String string2) {
        super(string);
        this.Field13716 = string2;
    }

    public Class1264(String string, String string2, String string3) {
        super(string, string2);
        this.Field13716 = string3;
    }

    public String getResourcePack() {
        return this.Field13716;
    }

    public IResource toResource(String string, ResourceLocation resourceLocation, InputStream inputStream, InputStream inputStream2, MetadataSerializer metadataSerializer) {
        return new Class455(string, resourceLocation, inputStream, inputStream2, metadataSerializer);
    }
}

