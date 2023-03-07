/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import lavahack.client.DkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE;
import lavahack.client.b45Mx8d77l0xSiwkvE7eDz1SRLhprWcR;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;

public interface C9MSz32V0EKndBPfEqNcwAnfZSHg376Q
extends b45Mx8d77l0xSiwkvE7eDz1SRLhprWcR {
    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF Method1314(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE var1, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC var2);

    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF Method1315(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE var1, List var2);

    public ByteChannel Method1316(SocketChannel var1, SelectionKey var2) throws IOException;

    public void Method1317();

    @Override
    default public ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA Method1313(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, List list) {
        return this.Method1315(zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, list);
    }

    @Override
    default public ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA Method1312(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC) {
        return this.Method1314(zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC);
    }
}

