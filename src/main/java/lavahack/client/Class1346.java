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

import com.kisman.cc.util.Class2142;
import lavahack.client.Class1568;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class Class1346
implements Class2142 {
    private int Field14128;

    boolean Method5401() {
        if (Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null) return true;
        if (Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) return true;
        return false;
    }

    public void Method5402(float f, float f2) {
        if (!this.Method5401()) return;
        Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationYaw = f;
        Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationPitch = f2;
    }

    public void Method5403(float f, float f2, boolean bl) {
        Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f, f2, bl));
    }

    public void Method5404(float f, float f2) {
        this.Method5403(f, f2, Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.onGround);
    }

    public float[] Method5405(Entity entity) {
        return Class1568.Method6179(entity);
    }
}

