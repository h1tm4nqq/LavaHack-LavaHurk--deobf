//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.protocols.base.*;
import com.viaversion.viaversion.api.connection.*;

class Class2009 extends BaseVersionProvider
{
    final Class1788 Field17229;
    private String Field17230 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class2009(final Class1788 field17229) {
        this.Field17229 = field17229;
    }
    
    public int getClosestServerProtocol(final UserConnection userConnection) throws Exception {
        if (userConnection.isClientSide()) {
            return Class1979.Method7320().Method7330();
        }
        return super.getClosestServerProtocol(userConnection);
    }
}
