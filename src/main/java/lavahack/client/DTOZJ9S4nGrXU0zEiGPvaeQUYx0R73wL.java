/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 *  com.viaversion.viaversion.bungee.providers.BungeeMovementTransmitter
 *  com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider
 */
package lavahack.client;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.bungee.providers.BungeeMovementTransmitter;
import com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider;
import lavahack.client.DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL$1;

public class DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL
implements ViaPlatformLoader {
    private int Field16205;

    public void load() {
        Via.getManager().getProviders().use(MovementTransmitterProvider.class, (Provider)new BungeeMovementTransmitter());
        Via.getManager().getProviders().use(VersionProvider.class, (Provider)new DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL$1(this));
    }

    public void unload() {
    }
}

