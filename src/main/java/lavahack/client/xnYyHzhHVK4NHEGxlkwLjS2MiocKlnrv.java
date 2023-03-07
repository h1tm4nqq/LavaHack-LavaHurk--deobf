//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private int Field14128;

    boolean Method5401() {
        int n;
        if (xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player != null && xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) {
            n = (int)((long)278135100 ^ (long)278135100);
            return n != 0;
        }
        n = (int)((long)729818331 ^ (long)729818330);
        return n != 0;
    }

    public void Method5402(float f, float f2) {
        if (!this.Method5401()) return;
        xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationYaw = f;
        xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationPitch = f2;
    }

    public void Method5403(float f, float f2, boolean bl) {
        xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f, f2, bl));
    }

    public void Method5404(float f, float f2) {
        this.Method5403(f, f2, xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.onGround);
    }

    public float[] Method5405(Entity entity) {
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6179(entity);
    }
}

