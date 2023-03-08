//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.*;
import io.netty.buffer.*;
import java.util.*;

public class Class2082 extends ViaAPIBase
{
    private String Field17512 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void sendRawPacket(final Object o, final ByteBuf byteBuf) {
        super.sendRawPacket((UUID)o, byteBuf);
    }
    
    public int getPlayerVersion(final Object o) {
        return super.getPlayerVersion((UUID)o);
    }
}
