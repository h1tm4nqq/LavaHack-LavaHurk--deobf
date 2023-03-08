//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.net.ssl.*;

class Class1503
{
    static final int[] Field15046;
    static final int[] Field15047;
    private String Field15048 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        (Field15047 = new int[SSLEngineResult.HandshakeStatus.values().length])[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
        Class1503.Field15047[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
        Class1503.Field15047[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
        Class1503.Field15047[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
        Class1503.Field15047[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
        (Field15046 = new int[SSLEngineResult.Status.values().length])[SSLEngineResult.Status.OK.ordinal()] = 1;
        Class1503.Field15046[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
        Class1503.Field15046[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
        Class1503.Field15046[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
    }
}
