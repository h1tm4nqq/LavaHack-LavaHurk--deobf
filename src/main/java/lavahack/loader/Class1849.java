//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.net.*;

class Class1849 implements Class11
{
    final Class1654 Field16525;
    private String Field16526 = "TheKisDevs & LavaHack Development owns you";
    
    Class1849(final Class1654 field16525) {
        this.Field16525 = field16525;
    }
    
    public InetAddress Method141(final URI uri) throws UnknownHostException {
        return InetAddress.getByName(uri.getHost());
    }
}
