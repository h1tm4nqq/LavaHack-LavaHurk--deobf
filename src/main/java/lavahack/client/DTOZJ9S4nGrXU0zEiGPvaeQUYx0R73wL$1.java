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
import lavahack.client.DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL;
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;

class DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL$1
extends BaseVersionProvider {
    final DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL Field17229;
    private String Field17230 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL$1(DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL dTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL) {
        this.Field17229 = dTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL;
    }

    public int getClosestServerProtocol(UserConnection userConnection) throws Exception {
        if (!userConnection.isClientSide()) return super.getClosestServerProtocol(userConnection);
        return FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330();
    }
}

