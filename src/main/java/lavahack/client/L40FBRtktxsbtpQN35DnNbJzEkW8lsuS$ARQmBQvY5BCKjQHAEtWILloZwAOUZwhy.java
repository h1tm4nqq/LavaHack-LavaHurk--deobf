//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy Field17635 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy();
    private String Field17636 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method7653((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method7653(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982();
        if (!(packet instanceof CPacketPlayerTryUseItemOnBlock)) return;
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.GOLDEN_APPLE)) {
            EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemMainhand().item, (Object)Items.CHORUS_FRUIT)) return;
        }
        KeyBinding keyBinding = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindUseItem");
        if (!keyBinding.isKeyDown()) return;
        IBlockState iBlockState = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getBlockState(((CPacketPlayerTryUseItemOnBlock)packet).getPos());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(packet.pos)");
        if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.ENDER_CHEST)) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy() {
    }

    private static String Method7654(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1981842307 ^ (long)1981842307);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1530375773 ^ (long)1530375842);
            int n2 = (int)1071470883L ^ 0x3FDD5978;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1581510579L ^ 0xA1BC2A3E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

