//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.api.platform.*;
import com.viaversion.viaversion.api.*;
import com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.*;
import com.viaversion.viaversion.bungee.providers.*;
import com.viaversion.viaversion.api.platform.providers.*;
import com.viaversion.viaversion.api.protocol.version.*;

public class Class1788 implements ViaPlatformLoader
{
    private int Field16205;
    
    public void load() {
        Via.getManager().getProviders().use((Class)MovementTransmitterProvider.class, (Provider)new BungeeMovementTransmitter());
        Via.getManager().getProviders().use((Class)VersionProvider.class, (Provider)new Class2009(this));
    }
    
    public void unload() {
    }
}
