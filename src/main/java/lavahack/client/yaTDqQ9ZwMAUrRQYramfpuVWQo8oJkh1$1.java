/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import javax.net.ssl.SSLEngineResult;

class yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1 {
    static final int[] Field15046;
    static final int[] Field15047;
    private String Field15048 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field15047 = new int[SSLEngineResult.HandshakeStatus.values().length];
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = (int)-1754782028L ^ 0x976826B5;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = ((int)-1097642084L ^ 0xBE934F9D) << 1;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = (int)((long)-1037620135 ^ (long)-1037620134);
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = (int)((long)753825977 ^ (long)753825976) << 2;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = (int)((long)-1748182600 ^ (long)-1748182595);
        Field15046 = new int[SSLEngineResult.Status.values().length];
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[SSLEngineResult.Status.OK.ordinal()] = (int)121548187L ^ 0x73EAD9A;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = (int)((long)206515567 ^ (long)206515566) << 1;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = (int)305404983L ^ 0x12341C34;
        yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[SSLEngineResult.Status.CLOSED.ordinal()] = (int)((long)510374428 ^ (long)510374429) << 2;
    }
}

