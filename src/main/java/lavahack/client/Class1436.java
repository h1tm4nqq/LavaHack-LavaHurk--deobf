//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;

class Class1436 implements Class628
{
    final Class168 Field14727;
    private String Field14728 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1436(final Class168 field14727) {
        this.Field14727 = field14727;
    }
    
    @Override
    public InetAddress Method2724(final URI uri) throws UnknownHostException {
        return InetAddress.getByName(uri.getHost());
    }
}
