/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.protocols.base.BaseVersionProvider
 */
package lavahack.client;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocols.base.BaseVersionProvider;
import lavahack.client.Class1788;
import lavahack.client.Class1979;

class Class2009
extends BaseVersionProvider {
    final Class1788 Field17229;
    private String Field17230 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class2009(Class1788 class1788) {
        this.Field17229 = class1788;
    }

    public int getClosestServerProtocol(UserConnection userConnection) throws Exception {
        if (!userConnection.isClientSide()) return super.getClosestServerProtocol(userConnection);
        return Class1979.Method7320().Method7330();
    }
}

